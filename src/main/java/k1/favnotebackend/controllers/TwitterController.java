package k1.favnotebackend.controllers;

import k1.favnotebackend.services.TwitterService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TwitterController {

    private TwitterService twitterService;

    @GetMapping("/twitters")
    public ResponseEntity<?> getAllTwitters() {
        var twitters = twitterService.getAllEntities();
        return ResponseEntity.ok(twitters);
    }

}
