// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ApplicationServiceSpec extends TeaModel {
    // 服务域名
    @NameInMap("domain")
    public java.util.List<String> domain;

    // 服务名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 服务端口
    @NameInMap("port")
    @Validation(required = true)
    public Long port;

    // 服务协议，http，tcp
    @NameInMap("protocol")
    @Validation(required = true)
    public String protocol;

    public static ApplicationServiceSpec build(java.util.Map<String, ?> map) throws Exception {
        ApplicationServiceSpec self = new ApplicationServiceSpec();
        return TeaModel.build(map, self);
    }

    public ApplicationServiceSpec setDomain(java.util.List<String> domain) {
        this.domain = domain;
        return this;
    }
    public java.util.List<String> getDomain() {
        return this.domain;
    }

    public ApplicationServiceSpec setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ApplicationServiceSpec setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public ApplicationServiceSpec setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

}
