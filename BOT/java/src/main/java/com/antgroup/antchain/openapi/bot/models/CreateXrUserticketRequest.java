// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateXrUserticketRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 所属业务
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 购买的通行证列表详情
    @NameInMap("xr_user_ticket_list")
    @Validation(required = true)
    public java.util.List<XrUserTicketInfo> xrUserTicketList;

    public static CreateXrUserticketRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateXrUserticketRequest self = new CreateXrUserticketRequest();
        return TeaModel.build(map, self);
    }

    public CreateXrUserticketRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateXrUserticketRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateXrUserticketRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public CreateXrUserticketRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateXrUserticketRequest setXrUserTicketList(java.util.List<XrUserTicketInfo> xrUserTicketList) {
        this.xrUserTicketList = xrUserTicketList;
        return this;
    }
    public java.util.List<XrUserTicketInfo> getXrUserTicketList() {
        return this.xrUserTicketList;
    }

}
