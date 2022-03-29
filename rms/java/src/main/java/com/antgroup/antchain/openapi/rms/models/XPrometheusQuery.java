// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XPrometheusQuery extends TeaModel {
    //  
    @NameInMap("port")
    @Validation(required = true)
    public Long port;

    //  
    @NameInMap("ip")
    public String ip;

    //  
    @NameInMap("path")
    @Validation(required = true)
    public String path;

    //  
    @NameInMap("target")
    public XTarget target;

    public static XPrometheusQuery build(java.util.Map<String, ?> map) throws Exception {
        XPrometheusQuery self = new XPrometheusQuery();
        return TeaModel.build(map, self);
    }

    public XPrometheusQuery setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public XPrometheusQuery setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public XPrometheusQuery setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public XPrometheusQuery setTarget(XTarget target) {
        this.target = target;
        return this;
    }
    public XTarget getTarget() {
        return this.target;
    }

}
