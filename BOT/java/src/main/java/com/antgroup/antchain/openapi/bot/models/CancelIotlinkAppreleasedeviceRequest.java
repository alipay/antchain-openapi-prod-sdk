// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CancelIotlinkAppreleasedeviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备升级任务唯一id列表
    @NameInMap("order_detail_id_list")
    @Validation(required = true)
    public java.util.List<String> orderDetailIdList;

    public static CancelIotlinkAppreleasedeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelIotlinkAppreleasedeviceRequest self = new CancelIotlinkAppreleasedeviceRequest();
        return TeaModel.build(map, self);
    }

    public CancelIotlinkAppreleasedeviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelIotlinkAppreleasedeviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelIotlinkAppreleasedeviceRequest setOrderDetailIdList(java.util.List<String> orderDetailIdList) {
        this.orderDetailIdList = orderDetailIdList;
        return this;
    }
    public java.util.List<String> getOrderDetailIdList() {
        return this.orderDetailIdList;
    }

}
