// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XDashboardCRULResponseCURequest extends TeaModel {
    // API版本
    @NameInMap("api_version")
    public String apiVersion;

    // Dashboard元数据信息
    @NameInMap("metadata")
    @Validation(required = true)
    public XResource metadata;

    // Dashboard配置JSON字符串。
    // Dashboard目录不需要填写
    @NameInMap("config")
    public String config;

    public static XDashboardCRULResponseCURequest build(java.util.Map<String, ?> map) throws Exception {
        XDashboardCRULResponseCURequest self = new XDashboardCRULResponseCURequest();
        return TeaModel.build(map, self);
    }

    public XDashboardCRULResponseCURequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public XDashboardCRULResponseCURequest setMetadata(XResource metadata) {
        this.metadata = metadata;
        return this;
    }
    public XResource getMetadata() {
        return this.metadata;
    }

    public XDashboardCRULResponseCURequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

}
