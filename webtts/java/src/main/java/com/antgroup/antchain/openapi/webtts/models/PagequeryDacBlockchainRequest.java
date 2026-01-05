// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtts.models;

import com.aliyun.tea.*;

public class PagequeryDacBlockchainRequest extends TeaModel {
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

    public static PagequeryDacBlockchainRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryDacBlockchainRequest self = new PagequeryDacBlockchainRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryDacBlockchainRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryDacBlockchainRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryDacBlockchainRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public PagequeryDacBlockchainRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
