// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DeviceCollectResult extends TeaModel {
    // 上链数据采集ID
    /**
     * <strong>example:</strong>
     * <p>j8o12u38</p>
     */
    @NameInMap("collect_id")
    @Validation(required = true)
    public String collectId;

    // 上链id
    /**
     * <strong>example:</strong>
     * <p>auit98</p>
     */
    @NameInMap("antchain_id")
    public String antchainId;

    public static DeviceCollectResult build(java.util.Map<String, ?> map) throws Exception {
        DeviceCollectResult self = new DeviceCollectResult();
        return TeaModel.build(map, self);
    }

    public DeviceCollectResult setCollectId(String collectId) {
        this.collectId = collectId;
        return this;
    }
    public String getCollectId() {
        return this.collectId;
    }

    public DeviceCollectResult setAntchainId(String antchainId) {
        this.antchainId = antchainId;
        return this;
    }
    public String getAntchainId() {
        return this.antchainId;
    }

}
