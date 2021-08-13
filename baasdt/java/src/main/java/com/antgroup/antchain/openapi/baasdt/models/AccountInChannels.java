// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class AccountInChannels extends TeaModel {
    // 天猫渠道
    @NameInMap("channel_name")
    @Validation(required = true)
    public String channelName;

    // 是否入驻
    @NameInMap("is_settled")
    @Validation(required = true)
    public Boolean isSettled;

    // WAIT_CHECK:渠道已申请开通但未审核，SUCCESS:渠道开通审核成功，渠道开通
    @NameInMap("settled_status")
    public String settledStatus;

    public static AccountInChannels build(java.util.Map<String, ?> map) throws Exception {
        AccountInChannels self = new AccountInChannels();
        return TeaModel.build(map, self);
    }

    public AccountInChannels setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public AccountInChannels setIsSettled(Boolean isSettled) {
        this.isSettled = isSettled;
        return this;
    }
    public Boolean getIsSettled() {
        return this.isSettled;
    }

    public AccountInChannels setSettledStatus(String settledStatus) {
        this.settledStatus = settledStatus;
        return this;
    }
    public String getSettledStatus() {
        return this.settledStatus;
    }

}
