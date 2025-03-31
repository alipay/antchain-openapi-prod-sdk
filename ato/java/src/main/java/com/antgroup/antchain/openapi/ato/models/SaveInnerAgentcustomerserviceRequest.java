// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SaveInnerAgentcustomerserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 客诉问题
    @NameInMap("customer_complaint_issues")
    @Validation(required = true)
    public String customerComplaintIssues;

    // 客诉处理人员信息
    @NameInMap("customer_person_info_list")
    @Validation(required = true)
    public java.util.List<CustomerPersonInfo> customerPersonInfoList;

    public static SaveInnerAgentcustomerserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveInnerAgentcustomerserviceRequest self = new SaveInnerAgentcustomerserviceRequest();
        return TeaModel.build(map, self);
    }

    public SaveInnerAgentcustomerserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveInnerAgentcustomerserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveInnerAgentcustomerserviceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SaveInnerAgentcustomerserviceRequest setCustomerComplaintIssues(String customerComplaintIssues) {
        this.customerComplaintIssues = customerComplaintIssues;
        return this;
    }
    public String getCustomerComplaintIssues() {
        return this.customerComplaintIssues;
    }

    public SaveInnerAgentcustomerserviceRequest setCustomerPersonInfoList(java.util.List<CustomerPersonInfo> customerPersonInfoList) {
        this.customerPersonInfoList = customerPersonInfoList;
        return this;
    }
    public java.util.List<CustomerPersonInfo> getCustomerPersonInfoList() {
        return this.customerPersonInfoList;
    }

}
