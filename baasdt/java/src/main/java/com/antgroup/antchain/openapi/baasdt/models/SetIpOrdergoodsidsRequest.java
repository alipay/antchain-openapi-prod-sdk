// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class SetIpOrdergoodsidsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 订单ID
    @NameInMap("ip_order_id")
    @Validation(required = true)
    public String ipOrderId;

    // 商品ID列表
    @NameInMap("goods_id_list")
    @Validation(required = true)
    public java.util.List<String> goodsIdList;

    public static SetIpOrdergoodsidsRequest build(java.util.Map<String, ?> map) throws Exception {
        SetIpOrdergoodsidsRequest self = new SetIpOrdergoodsidsRequest();
        return TeaModel.build(map, self);
    }

    public SetIpOrdergoodsidsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetIpOrdergoodsidsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetIpOrdergoodsidsRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public SetIpOrdergoodsidsRequest setIpOrderId(String ipOrderId) {
        this.ipOrderId = ipOrderId;
        return this;
    }
    public String getIpOrderId() {
        return this.ipOrderId;
    }

    public SetIpOrdergoodsidsRequest setGoodsIdList(java.util.List<String> goodsIdList) {
        this.goodsIdList = goodsIdList;
        return this;
    }
    public java.util.List<String> getGoodsIdList() {
        return this.goodsIdList;
    }

}
