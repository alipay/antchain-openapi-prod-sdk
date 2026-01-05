// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtts.models;

import com.aliyun.tea.*;

public class PagequeryDacWhitelistRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 当前第几个分页，默认为1
    @NameInMap("current")
    @Validation(required = true)
    public Long current;

    // 每页展示条数，默认为10
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 外部用户唯一id
    @NameInMap("external_customer_id")
    @Validation(required = true)
    public String externalCustomerId;

    public static PagequeryDacWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryDacWhitelistRequest self = new PagequeryDacWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryDacWhitelistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryDacWhitelistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryDacWhitelistRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public PagequeryDacWhitelistRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryDacWhitelistRequest setExternalCustomerId(String externalCustomerId) {
        this.externalCustomerId = externalCustomerId;
        return this;
    }
    public String getExternalCustomerId() {
        return this.externalCustomerId;
    }

}
