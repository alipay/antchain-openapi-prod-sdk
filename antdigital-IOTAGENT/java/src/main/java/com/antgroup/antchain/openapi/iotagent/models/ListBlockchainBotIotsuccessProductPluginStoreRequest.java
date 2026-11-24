// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class ListBlockchainBotIotsuccessProductPluginStoreRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("page_index")
    public Long pageIndex;

    @NameInMap("page_size")
    public Long pageSize;

    // 枚举:DEVICE,CLOUD,KNOWLEDGE_BASE,MCP,SKILL
    @NameInMap("type")
    public String type;

    public static ListBlockchainBotIotsuccessProductPluginStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBlockchainBotIotsuccessProductPluginStoreRequest self = new ListBlockchainBotIotsuccessProductPluginStoreRequest();
        return TeaModel.build(map, self);
    }

    public ListBlockchainBotIotsuccessProductPluginStoreRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListBlockchainBotIotsuccessProductPluginStoreRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListBlockchainBotIotsuccessProductPluginStoreRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public ListBlockchainBotIotsuccessProductPluginStoreRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListBlockchainBotIotsuccessProductPluginStoreRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
