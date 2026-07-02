// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UpdateOnlinepressuretestCustomerreportRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 联调项目ID
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 客户侧的压测报告
    @NameInMap("customer_pt_report")
    @Validation(required = true)
    public String customerPtReport;

    public static UpdateOnlinepressuretestCustomerreportRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOnlinepressuretestCustomerreportRequest self = new UpdateOnlinepressuretestCustomerreportRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOnlinepressuretestCustomerreportRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateOnlinepressuretestCustomerreportRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateOnlinepressuretestCustomerreportRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateOnlinepressuretestCustomerreportRequest setCustomerPtReport(String customerPtReport) {
        this.customerPtReport = customerPtReport;
        return this;
    }
    public String getCustomerPtReport() {
        return this.customerPtReport;
    }

}
