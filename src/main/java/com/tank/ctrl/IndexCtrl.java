package com.tank.ctrl;

import cn.hutool.core.date.DateUtil;
import com.tank.anno.Router;
import com.tank.protocol.res.WelcomeRes;
import lombok.val;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author tank198435163.com
 */
@Router
public class IndexCtrl {

  @GetMapping("/welcome")
  public ResponseEntity<WelcomeRes> sayWelcome() {
    val res = new WelcomeRes();
    val dateTime = DateUtil.now();
    res.setDateTime(dateTime);
    res.setWords("welcome to shading sphere");
    return ResponseEntity.ok(res);
  }

}
