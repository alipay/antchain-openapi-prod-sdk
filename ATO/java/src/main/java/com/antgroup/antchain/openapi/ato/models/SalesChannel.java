// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SalesChannel extends TeaModel {
    // 渠道码
    /**
     * <strong>example:</strong>
     * <p>RYQUWEOS</p>
     */
    @NameInMap("channel_code")
    @Validation(required = true)
    public String channelCode;

    // 渠道名称
    /**
     * <strong>example:</strong>
     * <p>华东大区</p>
     */
    @NameInMap("channel_name")
    @Validation(required = true)
    public String channelName;

    // 渠道级别，从小到大代表级别由高到低
    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("channel_level")
    @Validation(required = true)
    public Long channelLevel;

    public static SalesChannel build(java.util.Map<String, ?> map) throws Exception {
        SalesChannel self = new SalesChannel();
        return TeaModel.build(map, self);
    }

    public SalesChannel setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public SalesChannel setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public SalesChannel setChannelLevel(Long channelLevel) {
        this.channelLevel = channelLevel;
        return this;
    }
    public Long getChannelLevel() {
        return this.channelLevel;
    }

}
