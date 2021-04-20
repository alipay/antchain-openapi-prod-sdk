// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class QueryTppAllinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支付宝UID
    @NameInMap("alipay_uid")
    @Validation(required = true)
    public String alipayUid;

    // 排序方式，默认降序
    @NameInMap("order_by")
    public String orderBy;

    // 页码
    @NameInMap("page_id")
    @Validation(required = true)
    public Long pageId;

    // 页面大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static QueryTppAllinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTppAllinfoRequest self = new QueryTppAllinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryTppAllinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTppAllinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTppAllinfoRequest setAlipayUid(String alipayUid) {
        this.alipayUid = alipayUid;
        return this;
    }
    public String getAlipayUid() {
        return this.alipayUid;
    }

    public QueryTppAllinfoRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public QueryTppAllinfoRequest setPageId(Long pageId) {
        this.pageId = pageId;
        return this;
    }
    public Long getPageId() {
        return this.pageId;
    }

    public QueryTppAllinfoRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
