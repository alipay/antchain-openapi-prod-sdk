// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryProductDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 产品产量明细列表
    @NameInMap("item_list")
    @Validation(required = true)
    public java.util.List<GclProductionItem> itemList;

    public static QueryProductDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryProductDataRequest self = new QueryProductDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryProductDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryProductDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryProductDataRequest setItemList(java.util.List<GclProductionItem> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<GclProductionItem> getItemList() {
        return this.itemList;
    }

}
