package nathan.darcy.sb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nathan.darcy.sb.service.WebsiteUserProvider;
import nathan.darcy.sb.validation.ApplicationExists;

@Validated
@RestController
@RequestMapping("{app}/user")
public class WebsiteUserRestController {

    @Autowired
    private WebsiteUserProvider websiteUserProvider;

    @GetMapping("/{name}")
    public ResponseEntity<String> createUser(@PathVariable("app") @ApplicationExists String applicationName, @PathVariable("name") String username) throws Exception {
        boolean userExists = websiteUserProvider.userExists(username, applicationName);
        if (userExists) {
            return new ResponseEntity<>(username + " is an existing user for: " + applicationName, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(username + " can be created for: " + applicationName, HttpStatus.OK);
    }
}
