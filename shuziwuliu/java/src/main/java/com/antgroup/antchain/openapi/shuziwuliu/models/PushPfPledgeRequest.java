// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class PushPfPledgeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 项目标识，可联系对接同学提供
    @NameInMap("project_id")
    @Validation(required = true, maxLength = 64)
    public String projectId;

    // 账单标识
    @NameInMap("bill_id")
    @Validation(required = true, maxLength = 128, minLength = 1)
    public String billId;

    // 融资主体did
    @NameInMap("financing_subject_did")
    @Validation(required = true, maxLength = 128, minLength = 1)
    public String financingSubjectDid;

    // 请求号；以yyyyMMdd 时间串开头的32位字符串；该字符串需要保持请求系统内唯一，系统会以该请求号作为幂等处理
    @NameInMap("request_no")
    @Validation(required = true, maxLength = 32, minLength = 16)
    public String requestNo;

    // 质押发票号码列表
    @NameInMap("invoice_nos")
    public java.util.List<String> invoiceNos;

    public static PushPfPledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        PushPfPledgeRequest self = new PushPfPledgeRequest();
        return TeaModel.build(map, self);
    }

    public PushPfPledgeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushPfPledgeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushPfPledgeRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public PushPfPledgeRequest setBillId(String billId) {
        this.billId = billId;
        return this;
    }
    public String getBillId() {
        return this.billId;
    }

    public PushPfPledgeRequest setFinancingSubjectDid(String financingSubjectDid) {
        this.financingSubjectDid = financingSubjectDid;
        return this;
    }
    public String getFinancingSubjectDid() {
        return this.financingSubjectDid;
    }

    public PushPfPledgeRequest setRequestNo(String requestNo) {
        this.requestNo = requestNo;
        return this;
    }
    public String getRequestNo() {
        return this.requestNo;
    }

    public PushPfPledgeRequest setInvoiceNos(java.util.List<String> invoiceNos) {
        this.invoiceNos = invoiceNos;
        return this;
    }
    public java.util.List<String> getInvoiceNos() {
        return this.invoiceNos;
    }

}
