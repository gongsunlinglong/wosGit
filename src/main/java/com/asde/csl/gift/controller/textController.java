package com.asde.csl.gift.controller;


import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/test")
public class textController {

    @GetMapping("/test.do")
    @ApiOperation(value = "新增用户信息", notes = "注意没有返回值类型，需要传递用户信息")
    public String test() {
        return "do";
    }

    //处理文件上传
    @PostMapping("/uploadimg.do")
    public String uploadImg(@RequestParam("uploadFile")MultipartFile uploadFile) {
        System.out.println(uploadFile.isEmpty());
       /* System.out.println(uploadFile);
        if (!uploadFile.isEmpty()) {
            if (uploadFile.getSize() < 1024 * 100) {
                //realPath==绝对路径名
                HttpSession session=null;
                String realPath =session.getServletContext().getRealPath("static" + File.separator + "image");
                System.out.println("-------绝对路径-realPath--:" + realPath);
                //hz==文件名后缀
                String hz = FilenameUtils.getExtension(uploadFile.getOriginalFilename());
                System.out.println("-------hz-后缀--：" + hz);
                if (Arrays.asList("jpg", "png", "bmp", "gif").contains(hz)) {
                    //文件名
                    String fileName = UUID.randomUUID() + "." + hz;
                    System.out.println("-------" + UUID.randomUUID() + "-------");
                    System.out.println(fileName);
                    File file = new File(realPath, fileName);
                    session.setAttribute("fname", fileName);
                    try {
                        uploadFile.transferTo(file);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }*/
        return "ok";
    }


}
