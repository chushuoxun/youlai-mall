package com.fly4j.shop.goods.pojo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fly4j.common.core.bean.BaseEntity;
import lombok.Data;

@Data
@TableName("goods_attribute_type")
public class GoodsAttributeType extends BaseEntity {

    @TableId(type = IdType.AUTO)
    private Integer attributeTypeId;

    private String attributeTypeName;

    private Integer attributeCount;

    private Integer paramCount;

}
