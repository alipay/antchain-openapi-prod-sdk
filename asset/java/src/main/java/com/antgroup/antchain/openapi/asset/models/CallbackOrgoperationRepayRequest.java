// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.asset.models;

import com.aliyun.tea.*;

public class CallbackOrgoperationRepayRequest extends TeaModel {
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

    // 状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 扩展属性
    @NameInMap("ext_info")
    public String extInfo;

    // 请求唯一id，最长32字符
    @NameInMap("request_unique_id")
    @Validation(required = true)
    public String requestUniqueId;

    public static CallbackOrgoperationRepayRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackOrgoperationRepayRequest self = new CallbackOrgoperationRepayRequest();
        return TeaModel.build(map, self);
    }

    public CallbackOrgoperationRepayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackOrgoperationRepayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackOrgoperationRepayRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CallbackOrgoperationRepayRequest setRepayRecordNo(String repayRecordNo) {
        this.repayRecordNo = repayRecordNo;
        return this;
    }
    public String getRepayRecordNo() {
        return this.repayRecordNo;
    }

    public CallbackOrgoperationRepayRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CallbackOrgoperationRepayRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public CallbackOrgoperationRepayRequest setRequestUniqueId(String requestUniqueId) {
        this.requestUniqueId = requestUniqueId;
        return this;
    }
    public String getRequestUniqueId() {
        return this.requestUniqueId;
    }

}
