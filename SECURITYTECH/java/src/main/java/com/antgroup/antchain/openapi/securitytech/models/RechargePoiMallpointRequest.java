// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class RechargePoiMallpointRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 积分充值列表
    @NameInMap("point_recharge_info_list")
    @Validation(required = true)
    public java.util.List<PoiMallPointRechargeInfo> pointRechargeInfoList;

    public static RechargePoiMallpointRequest build(java.util.Map<String, ?> map) throws Exception {
        RechargePoiMallpointRequest self = new RechargePoiMallpointRequest();
        return TeaModel.build(map, self);
    }

    public RechargePoiMallpointRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RechargePoiMallpointRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RechargePoiMallpointRequest setPointRechargeInfoList(java.util.List<PoiMallPointRechargeInfo> pointRechargeInfoList) {
        this.pointRechargeInfoList = pointRechargeInfoList;
        return this;
    }
    public java.util.List<PoiMallPointRechargeInfo> getPointRechargeInfoList() {
        return this.pointRechargeInfoList;
    }

}
