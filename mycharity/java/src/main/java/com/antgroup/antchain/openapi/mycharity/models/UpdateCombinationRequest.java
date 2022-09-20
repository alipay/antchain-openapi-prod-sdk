// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class UpdateCombinationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实施内容id
    @NameInMap("id")
    @Validation(required = true, maxLength = 50)
    public String id;

    // 名称
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

    // 单位分，预估单价
    @NameInMap("price")
    public Long price;

    // 预估发放数量
    @NameInMap("total_num")
    public Long totalNum;

    public static UpdateCombinationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCombinationRequest self = new UpdateCombinationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCombinationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateCombinationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateCombinationRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateCombinationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCombinationRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public UpdateCombinationRequest setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public UpdateCombinationRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public UpdateCombinationRequest setPriceDeterminedFlag(Long priceDeterminedFlag) {
        this.priceDeterminedFlag = priceDeterminedFlag;
        return this;
    }
    public Long getPriceDeterminedFlag() {
        return this.priceDeterminedFlag;
    }

    public UpdateCombinationRequest setPrice(Long price) {
        this.price = price;
        return this;
    }
    public Long getPrice() {
        return this.price;
    }

    public UpdateCombinationRequest setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

}
