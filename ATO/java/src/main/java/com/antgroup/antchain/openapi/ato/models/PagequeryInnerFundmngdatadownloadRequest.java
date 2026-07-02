// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerFundmngdatadownloadRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资方租户id
    @NameInMap("fund_tenant_id")
    @Validation(required = true)
    public String fundTenantId;

    // 状态
    // TODO("TODO", "待处理"),
    // FINISH("FINISH", "已完成"),
    // FAILURE("FAILURE", "处理失败")
    @NameInMap("status")
    public String status;

    // 分页查询参数
    @NameInMap("page_info")
    @Validation(required = true)
    public PageQuery pageInfo;

    // 数据类型
    @NameInMap("type")
    public java.util.List<String> type;

    // traceid
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    public static PagequeryInnerFundmngdatadownloadRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerFundmngdatadownloadRequest self = new PagequeryInnerFundmngdatadownloadRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerFundmngdatadownloadRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryInnerFundmngdatadownloadRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryInnerFundmngdatadownloadRequest setFundTenantId(String fundTenantId) {
        this.fundTenantId = fundTenantId;
        return this;
    }
    public String getFundTenantId() {
        return this.fundTenantId;
    }

    public PagequeryInnerFundmngdatadownloadRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PagequeryInnerFundmngdatadownloadRequest setPageInfo(PageQuery pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageQuery getPageInfo() {
        return this.pageInfo;
    }

    public PagequeryInnerFundmngdatadownloadRequest setType(java.util.List<String> type) {
        this.type = type;
        return this;
    }
    public java.util.List<String> getType() {
        return this.type;
    }

    public PagequeryInnerFundmngdatadownloadRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
