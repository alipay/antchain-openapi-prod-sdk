// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sp.models;

import com.aliyun.tea.*;

public class SyncAcpartnerProjectResultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("product_access_code")
    public String productAccessCode;

    // 租户code：用于数据和功能隔离
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 项目id
    @NameInMap("project_id")
    @Validation(required = true)
    public Long projectId;

    // 外部业务单据号
    @NameInMap("out_business_no")
    @Validation(required = true)
    public String outBusinessNo;

    // 支出配置单结果列表
    @NameInMap("expenditure_quotation_items")
    @Validation(required = true)
    public java.util.List<ExpenditureQuotationItemResult> expenditureQuotationItems;

    // 结果码
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    public static SyncAcpartnerProjectResultRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncAcpartnerProjectResultRequest self = new SyncAcpartnerProjectResultRequest();
        return TeaModel.build(map, self);
    }

    public SyncAcpartnerProjectResultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncAcpartnerProjectResultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncAcpartnerProjectResultRequest setProductAccessCode(String productAccessCode) {
        this.productAccessCode = productAccessCode;
        return this;
    }
    public String getProductAccessCode() {
        return this.productAccessCode;
    }

    public SyncAcpartnerProjectResultRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public SyncAcpartnerProjectResultRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public SyncAcpartnerProjectResultRequest setOutBusinessNo(String outBusinessNo) {
        this.outBusinessNo = outBusinessNo;
        return this;
    }
    public String getOutBusinessNo() {
        return this.outBusinessNo;
    }

    public SyncAcpartnerProjectResultRequest setExpenditureQuotationItems(java.util.List<ExpenditureQuotationItemResult> expenditureQuotationItems) {
        this.expenditureQuotationItems = expenditureQuotationItems;
        return this;
    }
    public java.util.List<ExpenditureQuotationItemResult> getExpenditureQuotationItems() {
        return this.expenditureQuotationItems;
    }

    public SyncAcpartnerProjectResultRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
