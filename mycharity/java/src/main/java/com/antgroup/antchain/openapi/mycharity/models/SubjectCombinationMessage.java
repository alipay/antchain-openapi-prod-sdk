// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class SubjectCombinationMessage extends TeaModel {
    // 实施内容id
    @NameInMap("id")
    @Validation(required = true, maxLength = 50)
    public String id;

    // 实施内容名称
    @NameInMap("name")
    @Validation(maxLength = 20)
    public String name;

    // 实施内容类型：0善款类，1实物类、2服务类
    @NameInMap("type")
    public Long type;

    // 单位
    @NameInMap("unit")
    @Validation(maxLength = 10)
    public String unit;

    // 说明
    @NameInMap("note")
    @Validation(maxLength = 1000)
    public String note;

    // 单价是否固定，0:不固定，1:固定
    @NameInMap("price_determined_flag")
    public Long priceDeterminedFlag;

    // 单价
    @NameInMap("price")
    public Long price;

    // 预估发放数量
    @NameInMap("total_num")
    public Long totalNum;

    // 操作类型0-新增，1-修改，2-删除
    @NameInMap("operate")
    @Validation(required = true)
    public Long operate;

    public static SubjectCombinationMessage build(java.util.Map<String, ?> map) throws Exception {
        SubjectCombinationMessage self = new SubjectCombinationMessage();
        return TeaModel.build(map, self);
    }

    public SubjectCombinationMessage setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SubjectCombinationMessage setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubjectCombinationMessage setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public SubjectCombinationMessage setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public SubjectCombinationMessage setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public SubjectCombinationMessage setPriceDeterminedFlag(Long priceDeterminedFlag) {
        this.priceDeterminedFlag = priceDeterminedFlag;
        return this;
    }
    public Long getPriceDeterminedFlag() {
        return this.priceDeterminedFlag;
    }

    public SubjectCombinationMessage setPrice(Long price) {
        this.price = price;
        return this;
    }
    public Long getPrice() {
        return this.price;
    }

    public SubjectCombinationMessage setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public SubjectCombinationMessage setOperate(Long operate) {
        this.operate = operate;
        return this;
    }
    public Long getOperate() {
        return this.operate;
    }

}
