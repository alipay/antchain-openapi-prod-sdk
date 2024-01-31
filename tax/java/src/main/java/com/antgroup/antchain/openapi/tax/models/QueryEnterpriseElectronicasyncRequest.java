// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class QueryEnterpriseElectronicasyncRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权类型，401
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // 调用机构编码
    @NameInMap("inst_code")
    @Validation(required = true)
    public String instCode;

    // 本次调用id
    @NameInMap("biz_unique_id")
    @Validation(required = true)
    public String bizUniqueId;

    // 身份id，统一社会信用编码or其他
    @NameInMap("identity_id")
    @Validation(required = true)
    public String identityId;

    // 授权单号，使用授权接口返回的orderNo
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 地区行政编码
    @NameInMap("area_code")
    @Validation(required = true)
    public String areaCode;

    public static QueryEnterpriseElectronicasyncRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEnterpriseElectronicasyncRequest self = new QueryEnterpriseElectronicasyncRequest();
        return TeaModel.build(map, self);
    }

    public QueryEnterpriseElectronicasyncRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEnterpriseElectronicasyncRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEnterpriseElectronicasyncRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public QueryEnterpriseElectronicasyncRequest setInstCode(String instCode) {
        this.instCode = instCode;
        return this;
    }
    public String getInstCode() {
        return this.instCode;
    }

    public QueryEnterpriseElectronicasyncRequest setBizUniqueId(String bizUniqueId) {
        this.bizUniqueId = bizUniqueId;
        return this;
    }
    public String getBizUniqueId() {
        return this.bizUniqueId;
    }

    public QueryEnterpriseElectronicasyncRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public QueryEnterpriseElectronicasyncRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryEnterpriseElectronicasyncRequest setAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }
    public String getAreaCode() {
        return this.areaCode;
    }

}
