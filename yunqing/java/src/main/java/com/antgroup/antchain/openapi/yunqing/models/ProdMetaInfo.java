// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ProdMetaInfo extends TeaModel {
    // 环境id
    @NameInMap("env_id")
    @Validation(required = true)
    public String envId;

    // 产品码
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // 产品版本
    @NameInMap("prod_version")
    @Validation(required = true)
    public String prodVersion;

    // 产品部署拓扑标识id
    @NameInMap("deploy_topology_identity")
    @Validation(required = true)
    public String deployTopologyIdentity;

    // 产品部署规格标识id
    @NameInMap("deploy_spec_identity")
    @Validation(required = true)
    public String deploySpecIdentity;

    // 产品基线状态：AVTIVE、FAILED、UPGRADING
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static ProdMetaInfo build(java.util.Map<String, ?> map) throws Exception {
        ProdMetaInfo self = new ProdMetaInfo();
        return TeaModel.build(map, self);
    }

    public ProdMetaInfo setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public ProdMetaInfo setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public ProdMetaInfo setProdVersion(String prodVersion) {
        this.prodVersion = prodVersion;
        return this;
    }
    public String getProdVersion() {
        return this.prodVersion;
    }

    public ProdMetaInfo setDeployTopologyIdentity(String deployTopologyIdentity) {
        this.deployTopologyIdentity = deployTopologyIdentity;
        return this;
    }
    public String getDeployTopologyIdentity() {
        return this.deployTopologyIdentity;
    }

    public ProdMetaInfo setDeploySpecIdentity(String deploySpecIdentity) {
        this.deploySpecIdentity = deploySpecIdentity;
        return this;
    }
    public String getDeploySpecIdentity() {
        return this.deploySpecIdentity;
    }

    public ProdMetaInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
