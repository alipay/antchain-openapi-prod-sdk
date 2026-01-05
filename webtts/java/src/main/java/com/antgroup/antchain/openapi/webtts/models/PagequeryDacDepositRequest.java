// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtts.models;

import com.aliyun.tea.*;

public class PagequeryDacDepositRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询第几页，从1开始
    @NameInMap("current")
    @Validation(required = true)
    public Long current;

    // 每页展示多少条，默认10
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 外部用户唯一id
    @NameInMap("external_customer_id")
    @Validation(required = true)
    public String externalCustomerId;

    public static PagequeryDacDepositRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryDacDepositRequest self = new PagequeryDacDepositRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryDacDepositRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryDacDepositRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryDacDepositRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public PagequeryDacDepositRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryDacDepositRequest setExternalCustomerId(String externalCustomerId) {
        this.externalCustomerId = externalCustomerId;
        return this;
    }
    public String getExternalCustomerId() {
        return this.externalCustomerId;
    }

}
