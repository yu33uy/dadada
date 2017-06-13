package dadada.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yu3 on 2017/6/13.
 */
@RestController
public class Controller {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    String hello () { return "hello"; }

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    String dadada () { return "dadada."; }
}
