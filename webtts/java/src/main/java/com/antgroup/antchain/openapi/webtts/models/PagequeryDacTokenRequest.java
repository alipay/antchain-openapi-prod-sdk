// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtts.models;

import com.aliyun.tea.*;

public class PagequeryDacTokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 当前页
    @NameInMap("current")
    @Validation(required = true)
    public Long current;

    // 每页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 链名称
    @NameInMap("blockchain")
    public String blockchain;

    public static PagequeryDacTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryDacTokenRequest self = new PagequeryDacTokenRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryDacTokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryDacTokenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryDacTokenRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public PagequeryDacTokenRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryDacTokenRequest setBlockchain(String blockchain) {
        this.blockchain = blockchain;
        return this;
    }
    public String getBlockchain() {
        return this.blockchain;
    }

}
