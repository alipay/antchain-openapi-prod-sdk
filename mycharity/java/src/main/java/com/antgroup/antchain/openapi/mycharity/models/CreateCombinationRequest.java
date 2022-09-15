// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class CreateCombinationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实施内容id
    @NameInMap("id")
    @Validation(required = true, maxLength = 50)
    public String id;

    // 分期id
    @NameInMap("stages_id")
    @Validation(required = true, maxLength = 50)
    public String stagesId;

    // 名称
    @NameInMap("name")
    @Validation(required = true, maxLength = 20)
    public String name;

    // 实施内容类型：0善款类，1实物类、2服务类
    @NameInMap("type")
    @Validation(required = true)
    public Long type;

    // 单位
    @NameInMap("unit")
    @Validation(required = true, maxLength = 10)
    public String unit;

    // 说明
    @NameInMap("note")
    @Validation(maxLength = 1000)
    public String note;

    // 单价是否固定，0:不固定，1:固定
    @NameInMap("price_determined_flag")
    @Validation(required = true)
    public Long priceDeterminedFlag;

    // 单位分，预估单价
    @NameInMap("price")
    @Validation(required = true)
    public Long price;

    // 预估发放数量
    @NameInMap("total_num")
    @Validation(required = true)
    public Long totalNum;

    public static CreateCombinationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCombinationRequest self = new CreateCombinationRequest();
        return TeaModel.build(map, self);
    }

    public CreateCombinationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateCombinationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateCombinationRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateCombinationRequest setStagesId(String stagesId) {
        this.stagesId = stagesId;
        return this;
    }
    public String getStagesId() {
        return this.stagesId;
    }

    public CreateCombinationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCombinationRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public CreateCombinationRequest setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public CreateCombinationRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public CreateCombinationRequest setPriceDeterminedFlag(Long priceDeterminedFlag) {
        this.priceDeterminedFlag = priceDeterminedFlag;
        return this;
    }
    public Long getPriceDeterminedFlag() {
        return this.priceDeterminedFlag;
    }

    public CreateCombinationRequest setPrice(Long price) {
        this.price = price;
        return this;
    }
    public Long getPrice() {
        return this.price;
    }

    public CreateCombinationRequest setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

}
