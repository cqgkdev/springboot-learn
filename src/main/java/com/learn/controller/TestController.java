package com.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.internet.MimeMessage;

@RestController
public class TestController {
    @Autowired
    JavaMailSender mailSender;

    @GetMapping("helloworld")
    public String helloworld(){
        return  "hello54654";
    }

    @GetMapping("helloworld2")
    public String helloworld2(){
        System.out.println(51344);
        return  "helloworld211";
    }

    @RequestMapping("/send")
    public Object sendEmail() {
        try {
            final MimeMessage mimeMessage = this.mailSender.createMimeMessage();
            final MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
            message.setFrom("1151654564@qq.com");
            message.setTo("865386512@qq.com");
            message.setSubject("测试邮件主题");
            message.setText("测试邮件内容");
            this.mailSender.send(mimeMessage);

            return "sucesss";
        } catch (Exception ex) {
            ex.printStackTrace();
            return "error";
        }
    }
}
