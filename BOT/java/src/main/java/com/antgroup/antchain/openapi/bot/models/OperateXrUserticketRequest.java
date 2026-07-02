// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class OperateXrUserticketRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 所属业务
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    // 用户通行证编码
    @NameInMap("xr_ticket_code")
    @Validation(required = true)
    public String xrTicketCode;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 核销动作
    // open_screen（设备开屏）
    @NameInMap("xr_verification_operate")
    public String xrVerificationOperate;

    public static OperateXrUserticketRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateXrUserticketRequest self = new OperateXrUserticketRequest();
        return TeaModel.build(map, self);
    }

    public OperateXrUserticketRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateXrUserticketRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateXrUserticketRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public OperateXrUserticketRequest setXrTicketCode(String xrTicketCode) {
        this.xrTicketCode = xrTicketCode;
        return this;
    }
    public String getXrTicketCode() {
        return this.xrTicketCode;
    }

    public OperateXrUserticketRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public OperateXrUserticketRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OperateXrUserticketRequest setXrVerificationOperate(String xrVerificationOperate) {
        this.xrVerificationOperate = xrVerificationOperate;
        return this;
    }
    public String getXrVerificationOperate() {
        return this.xrVerificationOperate;
    }

}
