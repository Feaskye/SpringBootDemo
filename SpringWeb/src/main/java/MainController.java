


@Controller
@RequestMapping(value = "/main")
public class MainController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String welcome(){
        return "test Web";
    }

}