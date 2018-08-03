package com.blueskykong.lottor.samples.user.rest;

import com.blueskykong.lottor.common.holder.LogUtil;
import com.blueskykong.lottor.samples.user.domain.UserEntity;
import com.blueskykong.lottor.samples.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @data 2018/3/19.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String test() {
        LogUtil.info(LOGGER, () -> "！");
        userService.createUser(new UserEntity(0L, "test", "test", "test"));
        return "this is ok!";
    }
}