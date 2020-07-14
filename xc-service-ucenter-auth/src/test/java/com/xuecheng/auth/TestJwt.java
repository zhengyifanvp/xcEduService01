package com.xuecheng.auth;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.security.jwt.Jwt;
import org.springframework.security.jwt.JwtHelper;
import org.springframework.security.jwt.crypto.sign.RsaSigner;
import org.springframework.security.jwt.crypto.sign.RsaVerifier;
import org.springframework.security.oauth2.provider.token.store.KeyStoreKeyFactory;
import org.springframework.test.context.junit4.SpringRunner;

import java.security.KeyPair;
import java.security.interfaces.RSAPrivateKey;
import java.util.HashMap;
import java.util.Map;

/**
* @name: TestJwt
*
* @description: 测试jwt令牌
*
* @author: Yifan Zheng
*
* @Date: 2020/3/16
*
* @Version：1.0
**/
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestJwt {

    //创建jwt令牌
    @Test
    public void testCreateJwt(){
        //密钥库文件
        String keystore = "xc.keystore";
        //密钥库的密码
        String keystore_password = "xuechengkeystore";

        //密钥库文件路径
        ClassPathResource classPathResource = new ClassPathResource(keystore);
        //密钥别名
        String alias  = "xckey";
        //密钥的访问密码
        String key_password = "xuecheng";
        //密钥工厂
        KeyStoreKeyFactory keyStoreKeyFactory = new KeyStoreKeyFactory(classPathResource,keystore_password.toCharArray());
        //密钥对（公钥和私钥）
        KeyPair keyPair = keyStoreKeyFactory.getKeyPair(alias, key_password.toCharArray());
        //获取私钥
        RSAPrivateKey aPrivate = (RSAPrivateKey) keyPair.getPrivate();
        //jwt令牌的内容
        Map<String,String> body = new HashMap<>();
        body.put("name","itcast");
        String bodyString = JSON.toJSONString(body);
        //生成jwt令牌
        Jwt jwt = JwtHelper.encode(bodyString, new RsaSigner(aPrivate));
        //生成jwt令牌编码
        String encoded = jwt.getEncoded();
        System.out.println(encoded);

    }

    //校验jwt令牌
    @Test
    public void testVerify(){
        //公钥
        String publickey = "-----BEGIN PUBLIC KEY-----MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnASXh9oSvLRLxk901HANYM6KcYMzX8vFPnH/To2R+SrUVw1O9rEX6m1+rIaMzrEKPm12qPjVq3HMXDbRdUaJEXsB7NgGrAhepYAdJnYMizdltLdGsbfyjITUCOvzZ/QgM1M4INPMD+Ce859xse06jnOkCUzinZmasxrmgNV3Db1GtpyHIiGVUY0lSO1Frr9m5dpemylaT0BV3UwTQWVW9ljm6yR3dBncOdDENumT5tGbaDVyClV0FEB1XdSKd7VjiDCDbUAUbDTG1fm3K9sx7kO1uMGElbXLgMfboJ963HEJcU01km7BmFntqI5liyKheX+HBUCD4zbYNPw236U+7QIDAQAB-----END PUBLIC KEY-----";
        //jwt令牌
        String jwtString = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJjb21wYW55SWQiOm51bGwsInVzZXJwaWMiOm51bGwsInVzZXJfbmFtZSI6IjExMTExMSIsInNjb3BlIjpbImFwcCJdLCJuYW1lIjoiMTExMTExIiwidXR5cGUiOiIwMDAwMCIsImlkIjoiNDAyOGZlODE3MWJhMmZmOTAxNzFiYTMwYjYyYjAwMDAiLCJleHAiOjE1ODgxODYyNjAsImp0aSI6IjljMzYxM2RlLWY0ZWYtNGQ3MC1hN2UxLTNhZWE4MTQwYzFmYiIsImNsaWVudF9pZCI6IlhjV2ViQXBwIn0.ewUtJODCMKvzky3w6ls-eNbwP86u08x_jCwPMck_rfu0xArpuC_eVz2dfO4xvXsSxSr1maQmnGFomoR5jFTd6BXT5Y7VaJBcDYJfkeELkp7evsX_3d_Vtr_ZDlzit2x8u_QghlhOottfKoQdhhjAVvwswykOqrnSBxPjyEMSqdUsSE-hMCBCQb7skx1g7qEsKZqMGHTHLfcxc7ZoGKlUMORSfAEgu4tHvtM2C0cV3gAH6I-0Fma7b2cdYzM2pVM3NAxTAergD-Ugtfzc932mGM6LhPKTXsw3Vf4ttvO4-B9x6-hoDPO2CvAu13UG10ruAQK6bLYpYwSHbPKD2RkRCA";
        //String jwtString = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJjb21wYW55SWQiOm51bGwsInVzZXJwaWMiOm51bGwsInVzZXJfbmFtZSI6IjExMTExMSIsInNjb3BlIjpbImFwcCJdLCJuYW1lIjoiMTExMTExIiwidXR5cGUiOiIwMDAwMCIsImlkIjoiNDAyOGZlODE3MWJhMmZmOTAxNzFiYTMwYjYyYjAwMDAiLCJleHAiOjE1ODgxODQwMDcsImp0aSI6IjFmNGZlYmQwLTk1NDctNGI1Zi05NzkwLTk0NGY5MmZkNmUzMiIsImNsaWVudF9pZCI6IlhjV2ViQXBwIn0.DnpdBYTcta5zJA5WpOo6dDFdNyHlKh2efvrCwu0KOEUjp976NsP7P4XPKvk6RWmXM2Hdu04NshsG6kNEVHXBPnUBm4HixWN8ymRd9TIrp1b9DbuujVhX4H5n8BfzLVXXGMeBuc4Wkqu16UYpyt8CDK8MKcyRIRaWXAA9hfusgUa5gUen3aOP4SsNV3HHVZlJeIj9aY-HasUaxjVrpTKOkOcekcY---VT62428mbzYMRbWkddq5rmno-MgqGCS_sYk3eONDsmnBhNrqORj-he9vkjIrQbMdsAZbaLqgQkYNtPhCI7eF4kHD6rnvKVd7lSx3yDqtCpjNpAQXFUkSS9xQ";
        //String jwtString = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJjb21wYW55SWQiOiIxIiwidXNlcnBpYyI6bnVsbCwidXNlcl9uYW1lIjoiaXRjYXN0Iiwic2NvcGUiOlsiYXBwIl0sIm5hbWUiOiJ0ZXN0MDIiLCJ1dHlwZSI6IjEwMTAwMiIsImlkIjoiNDkiLCJleHAiOjE1ODUzNTYzNTUsImF1dGhvcml0aWVzIjpbImNvdXJzZV9maW5kX3BpYyIsImNvdXJzZV9nZXRfYmFzZWluZm8iXSwianRpIjoiMzk3MTYzMDctMzQzNy00ZjAwLTgyZTEtMGE4MzllYTE2Y2RkIiwiY2xpZW50X2lkIjoiWGNXZWJBcHAifQ.fzTfk6Ckl-8e2E5V6relGkOxlpgxC98puGIGgWdQVHzfmjThCvgoG3odN7vnDUQ0XS29CthEEeF_NCrWOlDPERtOqd7kXhSLixuGPAUtsiAbikmUiQ9v7ifnsHYX6zpLiprBCNKOgT5zJ2HnwuXY2b7EMDsMxpuZQUFqBx0-EojwO2d_HsJf-2aENKwTaSReokb1ZEmLO9Tr3Dv0lKwOZqJCh4BMtv7RGRmctZbFxcoBY4qfwk7WZDhA_9ZSKIsHRuj4EjQTeFKN6XYInJwsQnXALYLdtxc6cm4tnlGZ-gkMG1aiFca5cVIo8dIhRN86x7wMNacLQC_zDVGk0nIk-g";
        //校验jwt令牌
        Jwt jwt = JwtHelper.decodeAndVerify(jwtString, new RsaVerifier(publickey));
        //拿到jwt令牌中自定义的内容
        String claims = jwt.getClaims();
        System.out.println(claims);
    }
}
