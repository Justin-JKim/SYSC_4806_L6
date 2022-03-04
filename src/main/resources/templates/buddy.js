$(document).ready(function() {
    $("form").submit(function(event){
        var formData = {
            name: $("#name").val(),
            address: $("#address").val(),
            phoneNumber: $("#phoneNumber").val(),
        };

        $.ajax({
            type: "POST",
            url: "http://localhost:8080/add-buddy",
            data: formData,
            encode: true,
        }).then(function(data){
            $('.buddy-name').append(data.name);
            $('.buddy-address').append(data.address);
            $('.buddy-phoneNumber').append(data.phoneNumber);
        });
    });
});