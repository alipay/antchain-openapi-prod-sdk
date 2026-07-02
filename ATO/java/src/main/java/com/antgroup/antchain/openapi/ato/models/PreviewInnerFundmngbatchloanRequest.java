// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PreviewInnerFundmngbatchloanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资方租户id
    @NameInMap("fund_tenant_id")
    @Validation(required = true)
    public String fundTenantId;

    // 批量放款文件
    @NameInMap("file_info")
    @Validation(required = true)
    public FileInfo fileInfo;

    // 页面调用traceid
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    // 融资模式
    // 供应链金融：
    // SUPPLY_CHAIN_FINANCE
    // 自定义还款：
    // DEFAULT
    @NameInMap("fund_mode")
    public String fundMode;

    // 放款渠道
    // ALIPAY
    // BANK
    @NameInMap("loan_channel")
    public String loanChannel;

    public static PreviewInnerFundmngbatchloanRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewInnerFundmngbatchloanRequest self = new PreviewInnerFundmngbatchloanRequest();
        return TeaModel.build(map, self);
    }

    public PreviewInnerFundmngbatchloanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PreviewInnerFundmngbatchloanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PreviewInnerFundmngbatchloanRequest setFundTenantId(String fundTenantId) {
        this.fundTenantId = fundTenantId;
        return this;
    }
    public String getFundTenantId() {
        return this.fundTenantId;
    }

    public PreviewInnerFundmngbatchloanRequest setFileInfo(FileInfo fileInfo) {
        this.fileInfo = fileInfo;
        return this;
    }
    public FileInfo getFileInfo() {
        return this.fileInfo;
    }

    public PreviewInnerFundmngbatchloanRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public PreviewInnerFundmngbatchloanRequest setFundMode(String fundMode) {
        this.fundMode = fundMode;
        return this;
    }
    public String getFundMode() {
        return this.fundMode;
    }

    public PreviewInnerFundmngbatchloanRequest setLoanChannel(String loanChannel) {
        this.loanChannel = loanChannel;
        return this;
    }
    public String getLoanChannel() {
        return this.loanChannel;
    }

}
