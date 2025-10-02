

@RestController
public class HelloController {
    
    @Get
    public String hello() {
        return "Hello, World!";
    }
}
