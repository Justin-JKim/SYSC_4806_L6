package spring.classes;

import org.springframework.web.bind.annotation.*;
import spring.BuddyInfoRepository;

@RestController
public class BuddyInfoController {

    private  BuddyInfoRepository repository;

    BuddyInfoController(BuddyInfoRepository repository){
        this.repository = repository;
    }



    @PostMapping("/add-buddy")
    public BuddyInfo addBuddy(@RequestParam(value = "name", defaultValue = "Buddy") String name,
                           @RequestParam(value = "address", defaultValue = "Address") String address,
                           @RequestParam(value = "phoneNumber", defaultValue = "1234567890") String phoneNumber) {
        BuddyInfo buddy = new BuddyInfo(name, address, phoneNumber);
        return repository.save(buddy) ;
    }

    @DeleteMapping("/remove-buddy/{name}")
    void deleteBuddy(@PathVariable String name) {
        repository.deleteByName(name);
    }

    @GetMapping("/getBuddies")
    public Iterable<BuddyInfo> getBuddies(){
        return repository.findAll();
    }
}
