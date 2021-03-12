// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class InitOcpProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 加载业务的场景
    @NameInMap("business_action")
    @Validation(required = true)
    public String businessAction;

    // 用于加载对应场景数据的上下文（JSON格式具体同产品方定义）
    @NameInMap("business_context")
    @Validation(required = true)
    public String businessContext;

    // 流水号用于业务串联，以及幂等
    @NameInMap("order_no")
    public String orderNo;

    // 产品码 全局唯一
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 区域
    @NameInMap("region")
    public String region;

    public static InitOcpProductRequest build(java.util.Map<String, ?> map) throws Exception {
        InitOcpProductRequest self = new InitOcpProductRequest();
        return TeaModel.build(map, self);
    }

    public InitOcpProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitOcpProductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitOcpProductRequest setBusinessAction(String businessAction) {
        this.businessAction = businessAction;
        return this;
    }
    public String getBusinessAction() {
        return this.businessAction;
    }

    public InitOcpProductRequest setBusinessContext(String businessContext) {
        this.businessContext = businessContext;
        return this;
    }
    public String getBusinessContext() {
        return this.businessContext;
    }

    public InitOcpProductRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public InitOcpProductRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public InitOcpProductRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
