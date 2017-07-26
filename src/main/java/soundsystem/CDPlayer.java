package soundsystem;

import org.springframework.stereotype.Component;

@Component
public class CDPlayer {


    private CD cd;

    public CDPlayer(CD cd){
        this.cd = cd;
    }

    public String play(){
        return cd.play();
    }

}
