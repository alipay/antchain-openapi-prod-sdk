// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class RouteCondition extends TeaModel {
    // 渠道编号
    @NameInMap("channel_id")
    @Validation(required = true)
    public String channelId;

    public static RouteCondition build(java.util.Map<String, ?> map) throws Exception {
        RouteCondition self = new RouteCondition();
        return TeaModel.build(map, self);
    }

    public RouteCondition setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

}
