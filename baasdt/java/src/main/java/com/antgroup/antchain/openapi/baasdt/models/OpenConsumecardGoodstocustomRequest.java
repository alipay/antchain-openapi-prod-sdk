// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class OpenConsumecardGoodstocustomRequest extends TeaModel {
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

    // 开放权限的账户id
    @NameInMap("open_account_id")
    @Validation(required = true)
    public String openAccountId;

    // true授权，false解除授权
    @NameInMap("open")
    @Validation(required = true)
    public Boolean open;

    public static OpenConsumecardGoodstocustomRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenConsumecardGoodstocustomRequest self = new OpenConsumecardGoodstocustomRequest();
        return TeaModel.build(map, self);
    }

    public OpenConsumecardGoodstocustomRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OpenConsumecardGoodstocustomRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OpenConsumecardGoodstocustomRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public OpenConsumecardGoodstocustomRequest setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }
    public String getGoodsId() {
        return this.goodsId;
    }

    public OpenConsumecardGoodstocustomRequest setOpenAccountId(String openAccountId) {
        this.openAccountId = openAccountId;
        return this;
    }
    public String getOpenAccountId() {
        return this.openAccountId;
    }

    public OpenConsumecardGoodstocustomRequest setOpen(Boolean open) {
        this.open = open;
        return this;
    }
    public Boolean getOpen() {
        return this.open;
    }

}
