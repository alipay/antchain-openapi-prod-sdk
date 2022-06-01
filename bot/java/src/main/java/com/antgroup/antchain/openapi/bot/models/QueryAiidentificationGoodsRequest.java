// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryAiidentificationGoodsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户身份标识
    @NameInMap("app_key")
    @Validation(required = true)
    public String appKey;

    // 鉴定商品信息
    @NameInMap("goods_info")
    @Validation(required = true)
    public BaiGoodsComparisonReqData goodsInfo;

    public static QueryAiidentificationGoodsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAiidentificationGoodsRequest self = new QueryAiidentificationGoodsRequest();
        return TeaModel.build(map, self);
    }

    public QueryAiidentificationGoodsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAiidentificationGoodsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAiidentificationGoodsRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public QueryAiidentificationGoodsRequest setGoodsInfo(BaiGoodsComparisonReqData goodsInfo) {
        this.goodsInfo = goodsInfo;
        return this;
    }
    public BaiGoodsComparisonReqData getGoodsInfo() {
        return this.goodsInfo;
    }

}
