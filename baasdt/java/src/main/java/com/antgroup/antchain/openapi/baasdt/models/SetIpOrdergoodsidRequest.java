// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class SetIpOrdergoodsidRequest extends TeaModel {
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

    // 要绑定的商品信息
    @NameInMap("goods_info_list")
    @Validation(required = true)
    public java.util.List<IPOrderGoods> goodsInfoList;

    public static SetIpOrdergoodsidRequest build(java.util.Map<String, ?> map) throws Exception {
        SetIpOrdergoodsidRequest self = new SetIpOrdergoodsidRequest();
        return TeaModel.build(map, self);
    }

    public SetIpOrdergoodsidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetIpOrdergoodsidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetIpOrdergoodsidRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public SetIpOrdergoodsidRequest setIpOrderId(String ipOrderId) {
        this.ipOrderId = ipOrderId;
        return this;
    }
    public String getIpOrderId() {
        return this.ipOrderId;
    }

    public SetIpOrdergoodsidRequest setGoodsInfoList(java.util.List<IPOrderGoods> goodsInfoList) {
        this.goodsInfoList = goodsInfoList;
        return this;
    }
    public java.util.List<IPOrderGoods> getGoodsInfoList() {
        return this.goodsInfoList;
    }

}
