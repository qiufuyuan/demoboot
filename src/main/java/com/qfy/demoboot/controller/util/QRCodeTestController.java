package com.qfy.demoboot.controller.util;

import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.qfy.demoboot.util.QRUtil;
import com.qfy.demoboot.util.ShortNetAddressUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "/QRCode")
public class QRCodeTestController {

    @GetMapping(value = "/getCode")
    public void generateQRCode4Product(HttpServletRequest request, HttpServletResponse response) {
        String longUrl;
        try {
            longUrl = "www.baidu.com";
            // 转换成短url
            String shortUrl = ShortNetAddressUtil.generateShortUrl(longUrl);
            // 生成二维码
            BitMatrix qRcodeImg = QRUtil.generateQRCodeStream(shortUrl, response);
            // 将二维码输出到页面中
            MatrixToImageWriter.writeToStream(qRcodeImg, "png", response.getOutputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
