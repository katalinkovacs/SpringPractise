package soundsystem;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class SebastianBach implements CD{

    public String play(){
        return "Sebastian Bach";
    }
}
