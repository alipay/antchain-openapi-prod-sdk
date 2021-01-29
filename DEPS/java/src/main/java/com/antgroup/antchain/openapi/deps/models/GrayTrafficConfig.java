// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GrayTrafficConfig extends TeaModel {
    // 灰度流量类型
    @NameInMap("gray_traffic_type")
    @Validation(required = true)
    public String grayTrafficType;

    // 主机名
    @NameInMap("hostname")
    @Validation(required = true)
    public String hostname;

    // 匹配规则
    @NameInMap("match_patterns")
    @Validation(required = true)
    public String matchPatterns;

    // 端口号
    @NameInMap("port")
    @Validation(required = true)
    public Long port;

    // 比例
    @NameInMap("proportion")
    @Validation(required = true)
    public String proportion;

    // 目标 uri
    @NameInMap("target_uri")
    @Validation(required = true)
    public String targetUri;

    public static GrayTrafficConfig build(java.util.Map<String, ?> map) throws Exception {
        GrayTrafficConfig self = new GrayTrafficConfig();
        return TeaModel.build(map, self);
    }

    public GrayTrafficConfig setGrayTrafficType(String grayTrafficType) {
        this.grayTrafficType = grayTrafficType;
        return this;
    }
    public String getGrayTrafficType() {
        return this.grayTrafficType;
    }

    public GrayTrafficConfig setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public GrayTrafficConfig setMatchPatterns(String matchPatterns) {
        this.matchPatterns = matchPatterns;
        return this;
    }
    public String getMatchPatterns() {
        return this.matchPatterns;
    }

    public GrayTrafficConfig setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public GrayTrafficConfig setProportion(String proportion) {
        this.proportion = proportion;
        return this;
    }
    public String getProportion() {
        return this.proportion;
    }

    public GrayTrafficConfig setTargetUri(String targetUri) {
        this.targetUri = targetUri;
        return this;
    }
    public String getTargetUri() {
        return this.targetUri;
    }

}
