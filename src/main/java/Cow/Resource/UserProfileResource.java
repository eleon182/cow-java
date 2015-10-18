package cow.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by steve on 10/17/15.
 */
@RequestMapping("/userprofile")
@RestController
public class UserProfileResource extends MainResource {

    @RequestMapping("/getdetails")
    ResponseEntity<?> getDetails(@RequestHeader(value="x-customerid") String customerid) {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
