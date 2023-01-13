// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ListDataexportTriggerlogRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // tenant_id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // biz_id
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 导出任务ID
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 状态过滤条件
    @NameInMap("action")
    public String action;

    // -
    @NameInMap("page_no")
    public Long pageNo;

    // -
    @NameInMap("page_size")
    public Long pageSize;

    public static ListDataexportTriggerlogRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataexportTriggerlogRequest self = new ListDataexportTriggerlogRequest();
        return TeaModel.build(map, self);
    }

    public ListDataexportTriggerlogRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListDataexportTriggerlogRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListDataexportTriggerlogRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListDataexportTriggerlogRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListDataexportTriggerlogRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDataexportTriggerlogRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ListDataexportTriggerlogRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListDataexportTriggerlogRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
