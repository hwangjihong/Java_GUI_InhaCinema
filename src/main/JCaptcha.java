package main;

import java.awt.image.BufferedImage;
import nl.captcha.Captcha;
import nl.captcha.backgrounds.GradiatedBackgroundProducer;

public class JCaptcha {
    private Captcha captcha;
    
    public BufferedImage JCaptcha() {
        captcha = new Captcha.Builder(250, 45)
                .addBackground(new GradiatedBackgroundProducer())
                .addText()
                .build();
        BufferedImage captchaImage = captcha.getImage();
        return captchaImage;
    }
    
    // lblCaptcha와 captcha정답 비교
    public boolean captchaAnswer(String answer){
        boolean correct = false;
        if(answer.equals(captcha.getAnswer())) correct = true;
        
        return correct;
    }
    
}
