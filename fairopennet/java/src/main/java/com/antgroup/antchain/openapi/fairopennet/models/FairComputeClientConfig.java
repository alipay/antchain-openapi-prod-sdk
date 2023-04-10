// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class FairComputeClientConfig extends TeaModel {
    // 服务host
    @NameInMap("host")
    @Validation(required = true)
    public String host;

    // 服务端口
    @NameInMap("port")
    @Validation(required = true)
    public Long port;

    // TLS连接配置【暂不支持】
    @NameInMap("ssl_cert_chain")
    public String sslCertChain;

    // TLS连接配置【暂不支持】
    @NameInMap("ssl_private_key")
    public String sslPrivateKey;

    // TLS连接配置【暂不支持】
    @NameInMap("ssl_trust_cert_collection")
    public String sslTrustCertCollection;

    // TLS连接配置【暂不支持】
    @NameInMap("ssl_authority")
    public String sslAuthority;

    public static FairComputeClientConfig build(java.util.Map<String, ?> map) throws Exception {
        FairComputeClientConfig self = new FairComputeClientConfig();
        return TeaModel.build(map, self);
    }

    public FairComputeClientConfig setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public FairComputeClientConfig setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public FairComputeClientConfig setSslCertChain(String sslCertChain) {
        this.sslCertChain = sslCertChain;
        return this;
    }
    public String getSslCertChain() {
        return this.sslCertChain;
    }

    public FairComputeClientConfig setSslPrivateKey(String sslPrivateKey) {
        this.sslPrivateKey = sslPrivateKey;
        return this;
    }
    public String getSslPrivateKey() {
        return this.sslPrivateKey;
    }

    public FairComputeClientConfig setSslTrustCertCollection(String sslTrustCertCollection) {
        this.sslTrustCertCollection = sslTrustCertCollection;
        return this;
    }
    public String getSslTrustCertCollection() {
        return this.sslTrustCertCollection;
    }

    public FairComputeClientConfig setSslAuthority(String sslAuthority) {
        this.sslAuthority = sslAuthority;
        return this;
    }
    public String getSslAuthority() {
        return this.sslAuthority;
    }

}
