// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class Cloud extends TeaModel {
    // 云的ID
    @NameInMap("cloud_id")
    @Validation(required = true)
    public String cloudId;

    // 云的名字
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static Cloud build(java.util.Map<String, ?> map) throws Exception {
        Cloud self = new Cloud();
        return TeaModel.build(map, self);
    }

    public Cloud setCloudId(String cloudId) {
        this.cloudId = cloudId;
        return this;
    }
    public String getCloudId() {
        return this.cloudId;
    }

    public Cloud setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
