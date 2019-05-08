/**
 * FileName: QueryProblemController
 * Author:   zcc
 * Date:     2019/5/8 21:56
 * Description: 问题查询
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.controller;


import com.example.demo.model.WhiteBoardProblem;
import com.example.demo.service.QueryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *〈问题查询〉
 *
 * @author zcc
 * @create 2019/5/8
 * @since 1.0.0
 */
@Controller
@RequestMapping("/problem")
@Slf4j
public class QueryProblemController {

    @Autowired
    private QueryService queryService;

    @RequestMapping(value = "/query/{machine-type}", method = RequestMethod.GET)
    @ResponseBody
    public List<WhiteBoardProblem> queryWhiteBoardProblem(@PathVariable("machine-type") String  machineType) {
        List<WhiteBoardProblem> whiteBoardProblemList = queryService.findWhiteBoardProblem(machineType);
        log.info("whiteBoardProblemList: {}", whiteBoardProblemList);
        return whiteBoardProblemList;
    }
}

