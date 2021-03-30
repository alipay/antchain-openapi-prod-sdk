// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class AddGoodRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商品一级分类
    @NameInMap("classification")
    @Validation(required = true, maxLength = 20, minLength = 1)
    public String classification;

    // 幂等
    @NameInMap("client_token")
    public String clientToken;

    // 商品名称
    @NameInMap("good_name")
    @Validation(required = true, maxLength = 200, minLength = 1)
    public String goodName;

    // 权利内容id，权利申明获得
    @NameInMap("right_id")
    @Validation(required = true)
    public String rightId;

    // 是否直接上架   Y 上架  N 不上架  默认：Y
    @NameInMap("selling")
    public String selling;

    // 商品标签，英文逗号分割
    @NameInMap("tags")
    @Validation(maxLength = 200)
    public String tags;

    // 授权规格列表（数量1-3）
    @NameInMap("sku_lists")
    @Validation(required = true)
    public java.util.List<GoodSkuInfo> skuLists;

    public static AddGoodRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGoodRequest self = new AddGoodRequest();
        return TeaModel.build(map, self);
    }

    public AddGoodRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddGoodRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddGoodRequest setClassification(String classification) {
        this.classification = classification;
        return this;
    }
    public String getClassification() {
        return this.classification;
    }

    public AddGoodRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddGoodRequest setGoodName(String goodName) {
        this.goodName = goodName;
        return this;
    }
    public String getGoodName() {
        return this.goodName;
    }

    public AddGoodRequest setRightId(String rightId) {
        this.rightId = rightId;
        return this;
    }
    public String getRightId() {
        return this.rightId;
    }

    public AddGoodRequest setSelling(String selling) {
        this.selling = selling;
        return this;
    }
    public String getSelling() {
        return this.selling;
    }

    public AddGoodRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public AddGoodRequest setSkuLists(java.util.List<GoodSkuInfo> skuLists) {
        this.skuLists = skuLists;
        return this;
    }
    public java.util.List<GoodSkuInfo> getSkuLists() {
        return this.skuLists;
    }

}
