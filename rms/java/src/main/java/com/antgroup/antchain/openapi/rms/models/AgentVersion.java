// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AgentVersion extends TeaModel {
    // 版本号
    @NameInMap("version")
    @Validation(required = true)
    public String version;

    // 存储url
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    public static AgentVersion build(java.util.Map<String, ?> map) throws Exception {
        AgentVersion self = new AgentVersion();
        return TeaModel.build(map, self);
    }

    public AgentVersion setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public AgentVersion setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
