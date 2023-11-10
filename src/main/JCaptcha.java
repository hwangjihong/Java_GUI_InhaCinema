package main;

import java.awt.image.BufferedImage;
import nl.captcha.Captcha;

public class JCaptcha {

    public BufferedImage JCaptcha() {
        Captcha captcha = new Captcha.Builder(200, 40)
                .addText()
                .build();
        BufferedImage captchaImage = captcha.getImage();
        return captchaImage;
    }
    
}
