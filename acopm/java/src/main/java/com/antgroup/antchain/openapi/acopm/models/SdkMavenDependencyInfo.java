// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class SdkMavenDependencyInfo extends TeaModel {
    // client端依赖
    /**
     * <strong>example:</strong>
     * <p>&lt;&gt;</p>
     */
    @NameInMap("reference_client")
    @Validation(required = true)
    public String referenceClient;

    // server端依赖
    /**
     * <strong>example:</strong>
     * <p>&lt;&gt;</p>
     */
    @NameInMap("referenc_server")
    @Validation(required = true)
    public String referencServer;

    // client端maven仓库地址
    /**
     * <strong>example:</strong>
     * <p><a href="http://mvn.dev.alipay.net/artifactory/xxx">http://mvn.dev.alipay.net/artifactory/xxx</a></p>
     */
    @NameInMap("maven_link_client")
    @Validation(required = true)
    public String mavenLinkClient;

    // server端maven仓库地址
    /**
     * <strong>example:</strong>
     * <p><a href="http://mvn.dev.alipay.net/artifactory/xxx">http://mvn.dev.alipay.net/artifactory/xxx</a></p>
     */
    @NameInMap("maven_link_server")
    @Validation(required = true)
    public String mavenLinkServer;

    public static SdkMavenDependencyInfo build(java.util.Map<String, ?> map) throws Exception {
        SdkMavenDependencyInfo self = new SdkMavenDependencyInfo();
        return TeaModel.build(map, self);
    }

    public SdkMavenDependencyInfo setReferenceClient(String referenceClient) {
        this.referenceClient = referenceClient;
        return this;
    }
    public String getReferenceClient() {
        return this.referenceClient;
    }

    public SdkMavenDependencyInfo setReferencServer(String referencServer) {
        this.referencServer = referencServer;
        return this;
    }
    public String getReferencServer() {
        return this.referencServer;
    }

    public SdkMavenDependencyInfo setMavenLinkClient(String mavenLinkClient) {
        this.mavenLinkClient = mavenLinkClient;
        return this;
    }
    public String getMavenLinkClient() {
        return this.mavenLinkClient;
    }

    public SdkMavenDependencyInfo setMavenLinkServer(String mavenLinkServer) {
        this.mavenLinkServer = mavenLinkServer;
        return this;
    }
    public String getMavenLinkServer() {
        return this.mavenLinkServer;
    }

}
