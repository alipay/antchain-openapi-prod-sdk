// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ListIotagentKbRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 目标 Agent ID
    @NameInMap("agent_id")
    @Validation(required = true)
    public String agentId;

    // 页码，从 1 开始，默认 1
    @NameInMap("page_index")
    public Long pageIndex;

    // 每页数量，默认 20，最大 100
    @NameInMap("page_size")
    public Long pageSize;

    public static ListIotagentKbRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIotagentKbRequest self = new ListIotagentKbRequest();
        return TeaModel.build(map, self);
    }

    public ListIotagentKbRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListIotagentKbRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListIotagentKbRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public ListIotagentKbRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public ListIotagentKbRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
