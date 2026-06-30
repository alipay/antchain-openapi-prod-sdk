// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytechpoi.models;

import com.aliyun.tea.*;

public class RechargeAntsecuritytechGatewayPoiMallpointRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 积分充值列表
    @NameInMap("point_recharge_info_list")
    @Validation(required = true)
    public java.util.List<PoiMallPointRechargeInfo> pointRechargeInfoList;

    public static RechargeAntsecuritytechGatewayPoiMallpointRequest build(java.util.Map<String, ?> map) throws Exception {
        RechargeAntsecuritytechGatewayPoiMallpointRequest self = new RechargeAntsecuritytechGatewayPoiMallpointRequest();
        return TeaModel.build(map, self);
    }

    public RechargeAntsecuritytechGatewayPoiMallpointRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RechargeAntsecuritytechGatewayPoiMallpointRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RechargeAntsecuritytechGatewayPoiMallpointRequest setPointRechargeInfoList(java.util.List<PoiMallPointRechargeInfo> pointRechargeInfoList) {
        this.pointRechargeInfoList = pointRechargeInfoList;
        return this;
    }
    public java.util.List<PoiMallPointRechargeInfo> getPointRechargeInfoList() {
        return this.pointRechargeInfoList;
    }

}
