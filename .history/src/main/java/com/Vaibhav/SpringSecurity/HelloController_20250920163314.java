

@RestController
public class HelloController {
    
    @GetMapping("/he")
    public String hello() {
        return "Hello, World!";
    }
}
