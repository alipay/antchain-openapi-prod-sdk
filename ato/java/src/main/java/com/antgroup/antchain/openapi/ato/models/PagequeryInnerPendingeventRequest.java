// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerPendingeventRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 待办状态
    @NameInMap("status_list")
    public java.util.List<String> statusList;

    // 事件类型
    // 通知:NOTIFICATION 
    // 确认函:CONFIRMATION
    @NameInMap("type")
    public String type;

    // 分页
    @NameInMap("page_info")
    @Validation(required = true)
    public PageQuery pageInfo;

    // traceid
    @NameInMap("trace_id")
    public String traceId;

    public static PagequeryInnerPendingeventRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerPendingeventRequest self = new PagequeryInnerPendingeventRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerPendingeventRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryInnerPendingeventRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryInnerPendingeventRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PagequeryInnerPendingeventRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    public PagequeryInnerPendingeventRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PagequeryInnerPendingeventRequest setPageInfo(PageQuery pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageQuery getPageInfo() {
        return this.pageInfo;
    }

    public PagequeryInnerPendingeventRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
