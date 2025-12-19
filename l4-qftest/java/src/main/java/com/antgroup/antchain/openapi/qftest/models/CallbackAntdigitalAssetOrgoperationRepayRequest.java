// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qftest.models;

import com.aliyun.tea.*;

public class CallbackAntdigitalAssetOrgoperationRepayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 还款编号
    @NameInMap("repay_record_no")
    @Validation(required = true)
    public String repayRecordNo;

    // 还款处理状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 额外的信息
    @NameInMap("ext_info")
    public String extInfo;

    // 请求唯一id，最长32字符	
    // 
    @NameInMap("request_unique_id")
    @Validation(required = true)
    public String requestUniqueId;

    public static CallbackAntdigitalAssetOrgoperationRepayRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackAntdigitalAssetOrgoperationRepayRequest self = new CallbackAntdigitalAssetOrgoperationRepayRequest();
        return TeaModel.build(map, self);
    }

    public CallbackAntdigitalAssetOrgoperationRepayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackAntdigitalAssetOrgoperationRepayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackAntdigitalAssetOrgoperationRepayRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CallbackAntdigitalAssetOrgoperationRepayRequest setRepayRecordNo(String repayRecordNo) {
        this.repayRecordNo = repayRecordNo;
        return this;
    }
    public String getRepayRecordNo() {
        return this.repayRecordNo;
    }

    public CallbackAntdigitalAssetOrgoperationRepayRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CallbackAntdigitalAssetOrgoperationRepayRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public CallbackAntdigitalAssetOrgoperationRepayRequest setRequestUniqueId(String requestUniqueId) {
        this.requestUniqueId = requestUniqueId;
        return this;
    }
    public String getRequestUniqueId() {
        return this.requestUniqueId;
    }

}
