// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerFundmngpendingeventRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资方租户id
    @NameInMap("fund_tenant_id")
    @Validation(required = true)
    public String fundTenantId;

    // ("PENDING","待办中"), 
    //  ("CONFIRMED","确认"),  
    // 
    @NameInMap("status_list")
    @Validation(required = true)
    public java.util.List<String> statusList;

    // 事件code 
    // 用户履约离线数据下载完成
    // DATAPHIN_FUND_MNG_DOWNLOAD_USER_PROMISE_FINISH
    @NameInMap("pending_code")
    @Validation(required = true)
    public String pendingCode;

    // 分页参数
    @NameInMap("page_info")
    @Validation(required = true)
    public PageQuery pageInfo;

    // 页面traceId
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    public static PagequeryInnerFundmngpendingeventRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerFundmngpendingeventRequest self = new PagequeryInnerFundmngpendingeventRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerFundmngpendingeventRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryInnerFundmngpendingeventRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryInnerFundmngpendingeventRequest setFundTenantId(String fundTenantId) {
        this.fundTenantId = fundTenantId;
        return this;
    }
    public String getFundTenantId() {
        return this.fundTenantId;
    }

    public PagequeryInnerFundmngpendingeventRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    public PagequeryInnerFundmngpendingeventRequest setPendingCode(String pendingCode) {
        this.pendingCode = pendingCode;
        return this;
    }
    public String getPendingCode() {
        return this.pendingCode;
    }

    public PagequeryInnerFundmngpendingeventRequest setPageInfo(PageQuery pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageQuery getPageInfo() {
        return this.pageInfo;
    }

    public PagequeryInnerFundmngpendingeventRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
