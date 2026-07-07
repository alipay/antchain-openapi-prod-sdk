// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class PushProductDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 产品产量填报
    @NameInMap("item_list")
    @Validation(required = true)
    public java.util.List<GclProductionItem> itemList;

    public static PushProductDataRequest build(java.util.Map<String, ?> map) throws Exception {
        PushProductDataRequest self = new PushProductDataRequest();
        return TeaModel.build(map, self);
    }

    public PushProductDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushProductDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushProductDataRequest setItemList(java.util.List<GclProductionItem> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<GclProductionItem> getItemList() {
        return this.itemList;
    }

}
