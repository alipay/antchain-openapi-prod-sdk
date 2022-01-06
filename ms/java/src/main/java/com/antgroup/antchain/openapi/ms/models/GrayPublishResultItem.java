// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class GrayPublishResultItem extends TeaModel {
    // 推送目标 host
    @NameInMap("host")
    public String host;

    // 是否推送成功
    @NameInMap("success")
    public Boolean success;

    public static GrayPublishResultItem build(java.util.Map<String, ?> map) throws Exception {
        GrayPublishResultItem self = new GrayPublishResultItem();
        return TeaModel.build(map, self);
    }

    public GrayPublishResultItem setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public GrayPublishResultItem setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
