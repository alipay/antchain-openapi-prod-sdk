// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gatewayx.models;

import com.aliyun.tea.*;

public class XInvokerInfo extends TeaModel {
    // 调用渠道
    @NameInMap("invoke_channel")
    @Validation(required = true)
    public String invokeChannel;

    // 渠道的用户id
    @NameInMap("invoke_channel_uid")
    @Validation(required = true)
    public String invokeChannelUid;

    // 8位金融云租户ID
    @NameInMap("invoke_tenant")
    @Validation(required = true)
    public String invokeTenant;

    // 调用者用户金融云id
    @NameInMap("invoke_user_id")
    @Validation(required = true)
    public String invokeUserId;

    public static XInvokerInfo build(java.util.Map<String, ?> map) throws Exception {
        XInvokerInfo self = new XInvokerInfo();
        return TeaModel.build(map, self);
    }

    public XInvokerInfo setInvokeChannel(String invokeChannel) {
        this.invokeChannel = invokeChannel;
        return this;
    }
    public String getInvokeChannel() {
        return this.invokeChannel;
    }

    public XInvokerInfo setInvokeChannelUid(String invokeChannelUid) {
        this.invokeChannelUid = invokeChannelUid;
        return this;
    }
    public String getInvokeChannelUid() {
        return this.invokeChannelUid;
    }

    public XInvokerInfo setInvokeTenant(String invokeTenant) {
        this.invokeTenant = invokeTenant;
        return this;
    }
    public String getInvokeTenant() {
        return this.invokeTenant;
    }

    public XInvokerInfo setInvokeUserId(String invokeUserId) {
        this.invokeUserId = invokeUserId;
        return this;
    }
    public String getInvokeUserId() {
        return this.invokeUserId;
    }

}
