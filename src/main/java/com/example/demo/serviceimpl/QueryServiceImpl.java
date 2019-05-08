/**
 * FileName: QueryServiceImpl
 * Author:   zcc
 * Date:     2019/5/8 22:14
 * Description: 查询实现层
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.serviceimpl;

import com.example.demo.mapper.WhiteBoardProblemMapper;
import com.example.demo.model.WhiteBoardProblem;
import com.example.demo.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *〈查询实现层〉
 *
 * @author zcc
 * @create 2019/5/8
 * @since 1.0.0
 */
@Service
public class QueryServiceImpl implements QueryService {

    @Autowired
    private WhiteBoardProblemMapper whiteBoardProblemMapper;

    @Override
    public List<WhiteBoardProblem> findWhiteBoardProblem(String machineType) {
        return whiteBoardProblemMapper.findWhiteBoardProblem(machineType);
    }
}

