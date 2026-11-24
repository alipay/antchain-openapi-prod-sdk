// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiotdatalink.models;

import com.aliyun.tea.*;

public class QueryBlockchainBotTechintegrationSkugrantwhitelistRequest extends TeaModel {
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

    public static QueryBlockchainBotTechintegrationSkugrantwhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainBotTechintegrationSkugrantwhitelistRequest self = new QueryBlockchainBotTechintegrationSkugrantwhitelistRequest();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainBotTechintegrationSkugrantwhitelistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBlockchainBotTechintegrationSkugrantwhitelistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBlockchainBotTechintegrationSkugrantwhitelistRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public QueryBlockchainBotTechintegrationSkugrantwhitelistRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public QueryBlockchainBotTechintegrationSkugrantwhitelistRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
