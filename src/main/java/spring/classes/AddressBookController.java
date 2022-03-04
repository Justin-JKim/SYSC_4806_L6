package spring.classes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.BuddyInfoRepository;

@Controller
public class AddressBookController {

    private BuddyInfoRepository repository;

    AddressBookController(BuddyInfoRepository repository){
        this.repository = repository;
    }

    @GetMapping("/addressBook")
    public String addressBook(Model model) {
        model.addAttribute("buddies", repository.findAll());
        return "addressBook";
    }

    @GetMapping("/buddyForm")
    public String buddyInfoForm(Model model) {
        model.addAttribute("buddy", new BuddyInfo());
        return "buddyForm";
    }

    @PostMapping("/buddyForm")
    public String buddyInfoSubmit(@ModelAttribute BuddyInfo buddy, Model model) {
        model.addAttribute("buddy", buddy);
        repository.save(buddy);
        return "result";
    }

}