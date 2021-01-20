// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class TopologyNode extends TeaModel {
    // 应用名
    @NameInMap("app")
    public String app;

    // 节点类型: APP DB MQ CACHE
    @NameInMap("type")
    public String type;

    // 节点id
    @NameInMap("id")
    public String id;

    public static TopologyNode build(java.util.Map<String, ?> map) throws Exception {
        TopologyNode self = new TopologyNode();
        return TeaModel.build(map, self);
    }

    public TopologyNode setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public TopologyNode setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public TopologyNode setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
