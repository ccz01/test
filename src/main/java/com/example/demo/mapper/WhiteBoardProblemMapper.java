/**
 * FileName: WhiteBoardProblemMapper
 * Author:   zcc
 * Date:     2019/5/8 22:46
 * Description: mapper
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.mapper;

import com.example.demo.model.WhiteBoardProblem;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *〈mapper〉
 *
 * @author zcc
 * @create 2019/5/8
 * @since 1.0.0
 */
@Repository
public interface WhiteBoardProblemMapper {

    @Select("select * from white_board_problem where machine_type = #{machineType}")
    List<WhiteBoardProblem> findWhiteBoardProblem(String  machineType);
}

