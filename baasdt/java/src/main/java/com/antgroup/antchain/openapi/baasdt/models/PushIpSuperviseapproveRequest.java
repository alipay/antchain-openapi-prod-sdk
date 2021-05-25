// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class PushIpSuperviseapproveRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础字段
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 关联的订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 当前期望的阶段（用于校验，若是重新提交，则阶段值相等，若推进下一阶段，则阶段值+1）
    @NameInMap("stage")
    @Validation(required = true)
    public Long stage;

    // 监修报审的阶段具体内容，组织成json保存
    @NameInMap("ext_info")
    @Validation(required = true)
    public String extInfo;

    public static PushIpSuperviseapproveRequest build(java.util.Map<String, ?> map) throws Exception {
        PushIpSuperviseapproveRequest self = new PushIpSuperviseapproveRequest();
        return TeaModel.build(map, self);
    }

    public PushIpSuperviseapproveRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushIpSuperviseapproveRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushIpSuperviseapproveRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public PushIpSuperviseapproveRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public PushIpSuperviseapproveRequest setStage(Long stage) {
        this.stage = stage;
        return this;
    }
    public Long getStage() {
        return this.stage;
    }

    public PushIpSuperviseapproveRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
