// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UpdateInsuranceMaterialRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 交易流水号，调用方生成的唯一编码，格式
    // 为 yyyyMMdd_身份标识_其他编码，系统会根据该流水号做防重、幂等判断逻辑。
    @NameInMap("trade_no")
    @Validation(required = true)
    public String tradeNo;

    // 保司编码，PAIC---平安、CPIC---太保
    @NameInMap("external_channel_code")
    @Validation(required = true)
    public String externalChannelCode;

    // 险种编码：05-驿站宝
    @NameInMap("external_product_code")
    @Validation(required = true)
    public String externalProductCode;

    // 保司报案所返回的案件号
    @NameInMap("report_no")
    @Validation(required = true)
    public String reportNo;

    // 案件所关联的保单号信息
    @NameInMap("policy_no")
    public String policyNo;

    // 客诉材料-更新状态集 UPDATE-更新/覆盖、INCREASE-增加
    @NameInMap("document_update_mode")
    @Validation(required = true)
    public String documentUpdateMode;

    // 案件材料
    @NameInMap("documents")
    @Validation(required = true)
    public java.util.List<Document> documents;

    // 收款人账户信息
    @NameInMap("payment_info")
    public PaymentInfo paymentInfo;

    public static UpdateInsuranceMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInsuranceMaterialRequest self = new UpdateInsuranceMaterialRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInsuranceMaterialRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateInsuranceMaterialRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateInsuranceMaterialRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public UpdateInsuranceMaterialRequest setExternalChannelCode(String externalChannelCode) {
        this.externalChannelCode = externalChannelCode;
        return this;
    }
    public String getExternalChannelCode() {
        return this.externalChannelCode;
    }

    public UpdateInsuranceMaterialRequest setExternalProductCode(String externalProductCode) {
        this.externalProductCode = externalProductCode;
        return this;
    }
    public String getExternalProductCode() {
        return this.externalProductCode;
    }

    public UpdateInsuranceMaterialRequest setReportNo(String reportNo) {
        this.reportNo = reportNo;
        return this;
    }
    public String getReportNo() {
        return this.reportNo;
    }

    public UpdateInsuranceMaterialRequest setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

    public UpdateInsuranceMaterialRequest setDocumentUpdateMode(String documentUpdateMode) {
        this.documentUpdateMode = documentUpdateMode;
        return this;
    }
    public String getDocumentUpdateMode() {
        return this.documentUpdateMode;
    }

    public UpdateInsuranceMaterialRequest setDocuments(java.util.List<Document> documents) {
        this.documents = documents;
        return this;
    }
    public java.util.List<Document> getDocuments() {
        return this.documents;
    }

    public UpdateInsuranceMaterialRequest setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
        return this;
    }
    public PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

}
