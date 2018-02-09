package com.qing.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2010-2017 Sanfangda team All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>@description : com.qing.web</li>
 * <li>@version     : 1.0</li>
 * <li>@creation    : 2018年02月09日</li>
 * <li>@author     : fanrenqing</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "select";
    }
}
