package framework.demo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class HelloWorldController {
    @GetMapping(value="howya")
    public String getHelloWorld() {
        return "Many silly clowns look like they know everything";
    }
    @GetMapping(value="muck/{thisString}")
    public String getAKnownPicture(@PathVariable String thisString){
        return "Many silly clowns look like " + thisString;
    }
    @PostMapping(value="silly")
    public String postMethodName(@RequestBody Thing thing){
        return "The " + thing.getRobot() + "robot ate " + String.valueOf(thing.getGrape())
        + " grapes and ran from a " + thing.getShark() + "shark.\n";
    }
}