/**
 * FileName: WhiteBoardProblem
 * Author:   zcc
 * Date:     2019/3/30 19:13
 * Description: 白板问题记录
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.model;

import com.example.demo.model.type.GenerationType;
import com.example.demo.model.type.WarrantyType;
import lombok.Data;

import java.util.Date;

/**
 *〈白板问题记录〉
 *
 * @author zcc
 * @create 2019/3/30
 * @since 1.0.0
 */
@Data
public class WhiteBoardProblem {

    private Long id;

   /**
    * 服务工单
    */
    private String serviceNum;

    /**
     * 接听日期
     */
    private Date answerDate;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 客户地址
     */
    private String customerAddress;

    /**
     * 联系人
     */
    private String contactName;

    /**
     * 联系电话
     */
    private String contactPhoneNum;

    /**
     * 信息来源
     */
    private String messageSource;

    /**
     * 属性
     */
    private WarrantyType warrantyType;

    /**
     * 保修期
     */
    private Integer warrantyPeriod;

    /**
     * 机器型号
     */
    private String machineType;

    /**
     * 购买日期
     */
    private Date buyDate;

    /**
     * 序列号
     */
/*    private String serialNumber;

    *//**
     * 生产日期
     *//*
    private Date ProductionDate;

    *//**
     * 数量
     *//*
    private Integer quantity;

    *//**
     * 产品料号
     *//*
    private String productPartNo;

    *//**
     * 产品代数
     *//*
    private GenerationType generationType;

    *//**
     * 机型分类
     *//*
    private String machineClassification;

    *//**
     * 故障及咨询描述
     *//*
    private String description;

    *//**
     * 故障分类
     *//*
    private String problemType;

    *//**
     * 第三方服务工单
     *//*
    private String thirdPartyServiceNum;

    *//**
     * 技术对接人
     *//*
    private String technicianName;

    *//**
     * 服务方式
     *//*
    private String serviceType;

    *//**
     * 技术对策
     *//*
    private String solution;

    *//**
     * 客户满意度
     *//*
    private Integer customerSatisfaction;

    *//**
     * 解决日期
     *//*
    private Date solveDate;

    *//**
     * 实际更换物料料号
     *//*
    private String actualReplaceMaterialsNo;

    *//**
     * 实际更换物料名称
     *//*
    private String actualReplaceMaterialsName;

    *//**
     * 责任判定
     *//*
    private String responsibilityDetermination;*/
}

