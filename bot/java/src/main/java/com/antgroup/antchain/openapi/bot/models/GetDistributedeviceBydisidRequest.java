// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GetDistributedeviceBydisidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 发行设备id列表
    @NameInMap("distribute_device_id_list")
    @Validation(required = true)
    public java.util.List<String> distributeDeviceIdList;

    public static GetDistributedeviceBydisidRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDistributedeviceBydisidRequest self = new GetDistributedeviceBydisidRequest();
        return TeaModel.build(map, self);
    }

    public GetDistributedeviceBydisidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDistributedeviceBydisidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetDistributedeviceBydisidRequest setDistributeDeviceIdList(java.util.List<String> distributeDeviceIdList) {
        this.distributeDeviceIdList = distributeDeviceIdList;
        return this;
    }
    public java.util.List<String> getDistributeDeviceIdList() {
        return this.distributeDeviceIdList;
    }

}
