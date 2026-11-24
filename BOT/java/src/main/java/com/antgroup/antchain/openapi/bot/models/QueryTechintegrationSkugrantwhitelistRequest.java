// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryTechintegrationSkugrantwhitelistRequest extends TeaModel {
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

    public static QueryTechintegrationSkugrantwhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTechintegrationSkugrantwhitelistRequest self = new QueryTechintegrationSkugrantwhitelistRequest();
        return TeaModel.build(map, self);
    }

    public QueryTechintegrationSkugrantwhitelistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTechintegrationSkugrantwhitelistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTechintegrationSkugrantwhitelistRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public QueryTechintegrationSkugrantwhitelistRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public QueryTechintegrationSkugrantwhitelistRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
