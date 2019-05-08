/**
 * FileName: QueryService
 * Author:   zcc
 * Date:     2019/5/8 22:13
 * Description: 查询service层
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.service;

import com.example.demo.model.WhiteBoardProblem;

import java.util.List;

/**
 *〈查询service层〉
 *
 * @author zcc
 * @create 2019/5/8
 * @since 1.0.0
 */
public interface QueryService {

    /**
     * description: 查询白板问题
     * @author zcc
     * @date 2019/5/8
     * @param  * @param machineType
     * @return java.util.List<com.example.demo.model.WhiteBoardProblem>
     */
    List<WhiteBoardProblem> findWhiteBoardProblem(String machineType);
}

