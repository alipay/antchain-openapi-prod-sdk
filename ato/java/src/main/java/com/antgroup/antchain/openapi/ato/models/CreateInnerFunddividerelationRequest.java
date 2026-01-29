// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateInnerFunddividerelationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户8位id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 第一次暂存或提交可以不传，由后端生成
    @NameInMap("relation_id")
    public String relationId;

    // 分账公司名称
    @NameInMap("company_name")
    public String companyName;

    // 分账公司社会信用代码
    @NameInMap("merchant_id")
    public String merchantId;

    // 分账合同或协议
    @NameInMap("contract_files")
    public java.util.List<FileInfo> contractFiles;

    // 分账关系说明
    @NameInMap("desc")
    public String desc;

    // 分账方企业pid
    @NameInMap("alipay_pid")
    public String alipayPid;

    // 分账方企业支付宝账号
    @NameInMap("alipay_account")
    public String alipayAccount;

    // 是否直接提交
    // SUBMITTED 直接提交
    // STAGE 暂存
    @NameInMap("submit")
    @Validation(required = true)
    public String submit;

    // 操作人名称
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 商户公司社会统一信用代码, 
    // 如果expandMode=AGENT, 非空，长度不超过32位
    @NameInMap("subject_merchant_id")
    public String subjectMerchantId;

    // 进件模式	:DIRECT(直连进件) ,AGENT(代理进件)
    // 默认值：DIRECT
    @NameInMap("expand_mode")
    public String expandMode;

    // 分账公司租户id
    @NameInMap("divide_tenant_id")
    public String divideTenantId;

    // 支付渠道
    // ALIPAY（默认）
    // JDPAY
    @NameInMap("pay_channel")
    public String payChannel;

    // traceid
    @NameInMap("trace_id")
    public String traceId;

    public static CreateInnerFunddividerelationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInnerFunddividerelationRequest self = new CreateInnerFunddividerelationRequest();
        return TeaModel.build(map, self);
    }

    public CreateInnerFunddividerelationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateInnerFunddividerelationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateInnerFunddividerelationRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateInnerFunddividerelationRequest setRelationId(String relationId) {
        this.relationId = relationId;
        return this;
    }
    public String getRelationId() {
        return this.relationId;
    }

    public CreateInnerFunddividerelationRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public CreateInnerFunddividerelationRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public CreateInnerFunddividerelationRequest setContractFiles(java.util.List<FileInfo> contractFiles) {
        this.contractFiles = contractFiles;
        return this;
    }
    public java.util.List<FileInfo> getContractFiles() {
        return this.contractFiles;
    }

    public CreateInnerFunddividerelationRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateInnerFunddividerelationRequest setAlipayPid(String alipayPid) {
        this.alipayPid = alipayPid;
        return this;
    }
    public String getAlipayPid() {
        return this.alipayPid;
    }

    public CreateInnerFunddividerelationRequest setAlipayAccount(String alipayAccount) {
        this.alipayAccount = alipayAccount;
        return this;
    }
    public String getAlipayAccount() {
        return this.alipayAccount;
    }

    public CreateInnerFunddividerelationRequest setSubmit(String submit) {
        this.submit = submit;
        return this;
    }
    public String getSubmit() {
        return this.submit;
    }

    public CreateInnerFunddividerelationRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateInnerFunddividerelationRequest setSubjectMerchantId(String subjectMerchantId) {
        this.subjectMerchantId = subjectMerchantId;
        return this;
    }
    public String getSubjectMerchantId() {
        return this.subjectMerchantId;
    }

    public CreateInnerFunddividerelationRequest setExpandMode(String expandMode) {
        this.expandMode = expandMode;
        return this;
    }
    public String getExpandMode() {
        return this.expandMode;
    }

    public CreateInnerFunddividerelationRequest setDivideTenantId(String divideTenantId) {
        this.divideTenantId = divideTenantId;
        return this;
    }
    public String getDivideTenantId() {
        return this.divideTenantId;
    }

    public CreateInnerFunddividerelationRequest setPayChannel(String payChannel) {
        this.payChannel = payChannel;
        return this;
    }
    public String getPayChannel() {
        return this.payChannel;
    }

    public CreateInnerFunddividerelationRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
