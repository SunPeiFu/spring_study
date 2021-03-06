package com.sunpeifu.demo.controller;

import com.ms.user.api.domain.dto.ChannelDTO;
import com.ms.user.provider.service.IChannelService;
import com.ms.user.provider.service.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Date 2020/1/9 6:28 下午
 * @Author daike
 * @Description
 */
@RestController
public class TestController {
//    @Resource
//    private FeginService feginService;

    @Resource
    private IChannelService iChannelService;

    @Resource
    private IUserService iUserService;

//    @GetMapping("testMapping")
//    public Object testMapping(){
//        ChannelDTO channelDTO = new ChannelDTO();
//        channelDTO.setCid("1Lk9GRT43ii");
//        return feginService.getChannelInfo(channelDTO);
//    }

    @GetMapping("testProvider")
    public Object testProvider(){
        ChannelDTO channelDTO = new ChannelDTO();
        channelDTO.setCid("1Lk9GRT43ii");
        return iChannelService.getChannelInfo(channelDTO);
    }
}
