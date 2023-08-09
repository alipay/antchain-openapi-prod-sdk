// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas.models;

import com.aliyun.tea.*;

public class SdkMavenDependencyInfo extends TeaModel {
    // client端maven依赖，包含蚂蚁链版本和金融云版本依赖信息
    @NameInMap("reference_client")
    @Validation(required = true)
    public String referenceClient;

    // 客户端server端依赖，产品api基于技术产品纬度使用技术客户端sdk构建，此处依赖基本使用不到
    @NameInMap("referenc_server")
    public String referencServer;

    // client端maven仓库地址
    @NameInMap("maven_link_client")
    @Validation(required = true)
    public String mavenLinkClient;

    // server端maven仓库地址
    @NameInMap("maven_link_server")
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
