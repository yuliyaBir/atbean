package be.vdab.atbean.woord;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("woord")
public class WoordController {
    private final WoordService woordService;

    public WoordController(WoordService woordService) {
        this.woordService = woordService;
    }
    @GetMapping("{woord}")
    @Operation(summary = "Is het woord Palindroom?")
    Boolean isPalindroom(@PathVariable String woord){
        return woordService.isPalindroom(woord);
    }
}
