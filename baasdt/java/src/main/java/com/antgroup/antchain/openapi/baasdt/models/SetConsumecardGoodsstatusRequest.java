// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class SetConsumecardGoodsstatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequest baseRequest;

    // 商品ID
    @NameInMap("goods_id")
    @Validation(required = true)
    public String goodsId;

    // 商品状态：0上线，1下线
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    public static SetConsumecardGoodsstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetConsumecardGoodsstatusRequest self = new SetConsumecardGoodsstatusRequest();
        return TeaModel.build(map, self);
    }

    public SetConsumecardGoodsstatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetConsumecardGoodsstatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetConsumecardGoodsstatusRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public SetConsumecardGoodsstatusRequest setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }
    public String getGoodsId() {
        return this.goodsId;
    }

    public SetConsumecardGoodsstatusRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
