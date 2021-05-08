package pl.pjatk.DamKij;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/test")
public class RestController {

    //@GetMapping("/hello")
    //public ResponseEntity<String> welcome() {
    //    return ResponseEntity.ok("Hello world");
    //}
    @GetMapping("/hello")
    public ResponseEntity<String> something(@RequestParam("reqParam") String reqParam) {
        return ResponseEntity.ok(reqParam);
    }

}
