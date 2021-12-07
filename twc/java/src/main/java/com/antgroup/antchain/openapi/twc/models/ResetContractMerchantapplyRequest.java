// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ResetContractMerchantapplyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 进件或进件修改申请订单id，从进件申请接口的返回字段中获取
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 进件类型,1 创建、2 修改、3 申请创建、4 申请修改
    @NameInMap("apply_type")
    @Validation(required = true)
    public Long applyType;

    public static ResetContractMerchantapplyRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetContractMerchantapplyRequest self = new ResetContractMerchantapplyRequest();
        return TeaModel.build(map, self);
    }

    public ResetContractMerchantapplyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ResetContractMerchantapplyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ResetContractMerchantapplyRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ResetContractMerchantapplyRequest setApplyType(Long applyType) {
        this.applyType = applyType;
        return this;
    }
    public Long getApplyType() {
        return this.applyType;
    }

}
