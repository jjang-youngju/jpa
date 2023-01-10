package com.dw.member.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UploadService {
    
    @Autowired
    private AwsService awsService;

    public boolean uploadImageToAwsS3(MultipartFile[] locationFile){
        String today = new SimpleDateFormat("yyMMdd").format(new Date());
        String imageBasePath = "https://maetalteam.dev.s3.ap-northeast-2.amazonaws.com";//디비에 저장할 때 사용
        String imagePath = "/upload/" + today; //이미지를 저장할 폴더
        //실무에서는 사진이름을 현재시각(초까지) 혹은 pk이름으로 저장한다.
        //사진용량도 코딩으로 줄여서 저장한다.(image resize)
        String imageName = "jjangyoung"+locationFile[0].getName()+".jpg";
        try{
            awsService.uploadObject(locationFile[0], imagePath, imageName);
            String s3Url = imageBasePath + imagePath + "/" + imageName;
            //DB에 저장하는 로직을 구현하면 끝
        }catch(Exception e){
            return false;
        }

        return true;
    }
}