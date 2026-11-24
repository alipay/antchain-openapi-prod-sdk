// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiotdatalink.models;

import com.aliyun.tea.*;

public class QueryBlockchainBotTrustiotSkugrantwhitelistRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码（APPID）
    @NameInMap("scene")
    public String scene;

    // 页码
    @NameInMap("page_index")
    @Validation(required = true)
    public Long pageIndex;

    // 每页条数，只支持1到2000
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static QueryBlockchainBotTrustiotSkugrantwhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainBotTrustiotSkugrantwhitelistRequest self = new QueryBlockchainBotTrustiotSkugrantwhitelistRequest();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainBotTrustiotSkugrantwhitelistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBlockchainBotTrustiotSkugrantwhitelistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBlockchainBotTrustiotSkugrantwhitelistRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public QueryBlockchainBotTrustiotSkugrantwhitelistRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public QueryBlockchainBotTrustiotSkugrantwhitelistRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
