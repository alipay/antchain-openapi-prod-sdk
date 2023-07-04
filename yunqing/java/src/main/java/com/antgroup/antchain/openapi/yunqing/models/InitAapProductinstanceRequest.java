// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class InitAapProductinstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 命名空间，命名格式：siteCode-prodCode （小写）
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 产品实例名称，推荐产品code的小写字母
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 产品code
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // 产品版本
    @NameInMap("prod_version")
    @Validation(required = true)
    public String prodVersion;

    // 产品部署的拓扑名称，部署时会根据该信息进行部署
    @NameInMap("topology_code")
    @Validation(required = true)
    public String topologyCode;

    // 站点code
    @NameInMap("site_code")
    @Validation(required = true)
    public String siteCode;

    public static InitAapProductinstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        InitAapProductinstanceRequest self = new InitAapProductinstanceRequest();
        return TeaModel.build(map, self);
    }

    public InitAapProductinstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitAapProductinstanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitAapProductinstanceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public InitAapProductinstanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public InitAapProductinstanceRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public InitAapProductinstanceRequest setProdVersion(String prodVersion) {
        this.prodVersion = prodVersion;
        return this;
    }
    public String getProdVersion() {
        return this.prodVersion;
    }

    public InitAapProductinstanceRequest setTopologyCode(String topologyCode) {
        this.topologyCode = topologyCode;
        return this;
    }
    public String getTopologyCode() {
        return this.topologyCode;
    }

    public InitAapProductinstanceRequest setSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }
    public String getSiteCode() {
        return this.siteCode;
    }

}
