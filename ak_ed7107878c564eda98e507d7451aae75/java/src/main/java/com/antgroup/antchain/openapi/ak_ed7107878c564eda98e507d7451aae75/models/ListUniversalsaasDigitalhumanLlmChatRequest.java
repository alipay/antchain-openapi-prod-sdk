// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class ListUniversalsaasDigitalhumanLlmChatRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户编码
    @NameInMap("tenant_code")
    @Validation(required = true)
    public String tenantCode;

    // 页码
    @NameInMap("page_num")
    public Long pageNum;

    // 页面大小
    @NameInMap("page_sizr")
    public Long pageSizr;

    // 页面大小
    @NameInMap("page_size")
    public Long pageSize;

    public static ListUniversalsaasDigitalhumanLlmChatRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUniversalsaasDigitalhumanLlmChatRequest self = new ListUniversalsaasDigitalhumanLlmChatRequest();
        return TeaModel.build(map, self);
    }

    public ListUniversalsaasDigitalhumanLlmChatRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListUniversalsaasDigitalhumanLlmChatRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListUniversalsaasDigitalhumanLlmChatRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public ListUniversalsaasDigitalhumanLlmChatRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListUniversalsaasDigitalhumanLlmChatRequest setPageSizr(Long pageSizr) {
        this.pageSizr = pageSizr;
        return this;
    }
    public Long getPageSizr() {
        return this.pageSizr;
    }

    public ListUniversalsaasDigitalhumanLlmChatRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
