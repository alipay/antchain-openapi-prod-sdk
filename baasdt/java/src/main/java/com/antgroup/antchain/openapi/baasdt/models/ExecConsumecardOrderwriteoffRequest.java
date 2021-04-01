// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecConsumecardOrderwriteoffRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequest baseRequest;

    // 交易类型(0: 商品兑换单, 1: 账单兑换单)
    @NameInMap("instruction_type")
    @Validation(required = true)
    public Long instructionType;

    // 账单ID
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 附言(长度不要超过500个字符)
    @NameInMap("remark")
    public String remark;

    public static ExecConsumecardOrderwriteoffRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecConsumecardOrderwriteoffRequest self = new ExecConsumecardOrderwriteoffRequest();
        return TeaModel.build(map, self);
    }

    public ExecConsumecardOrderwriteoffRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecConsumecardOrderwriteoffRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecConsumecardOrderwriteoffRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public ExecConsumecardOrderwriteoffRequest setInstructionType(Long instructionType) {
        this.instructionType = instructionType;
        return this;
    }
    public Long getInstructionType() {
        return this.instructionType;
    }

    public ExecConsumecardOrderwriteoffRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ExecConsumecardOrderwriteoffRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
