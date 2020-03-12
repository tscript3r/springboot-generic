package k1.favnotebackend.controllers;

import k1.favnotebackend.dto.AbstractDto;
import k1.favnotebackend.model.Twitter;
import k1.favnotebackend.services.TwitterService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TwitterController {

    private TwitterService twitterService;

    @GetMapping("/twitters")
    public ResponseEntity getAllTwitters(){
        List<? extends AbstractDto> twitters = twitterService.getAllEntities();
        return ResponseEntity.ok(twitters);
    }
}
