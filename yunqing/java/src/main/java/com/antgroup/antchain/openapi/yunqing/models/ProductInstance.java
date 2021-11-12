// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ProductInstance extends TeaModel {
    // 单元ID
    @NameInMap("cell_id")
    public String cellId;

    // 产品实例所在的环境唯一标识。
    @NameInMap("env_id")
    public String envId;

    // 产品码。
    @NameInMap("product_code")
    public String productCode;

    // 产品版本。
    @NameInMap("product_version")
    public String productVersion;

    // 产品基线状态
    @NameInMap("status")
    public String status;

    // 产品创建时间
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcCreate;

    // 产品修改时间
    @NameInMap("utc_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcModified;

    // 产品拓扑id
    @NameInMap("deploy_topology_identity")
    public String deployTopologyIdentity;

    // 部署规格id
    @NameInMap("deploy_spec_identity")
    public String deploySpecIdentity;

    public static ProductInstance build(java.util.Map<String, ?> map) throws Exception {
        ProductInstance self = new ProductInstance();
        return TeaModel.build(map, self);
    }

    public ProductInstance setCellId(String cellId) {
        this.cellId = cellId;
        return this;
    }
    public String getCellId() {
        return this.cellId;
    }

    public ProductInstance setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public ProductInstance setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ProductInstance setProductVersion(String productVersion) {
        this.productVersion = productVersion;
        return this;
    }
    public String getProductVersion() {
        return this.productVersion;
    }

    public ProductInstance setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ProductInstance setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public ProductInstance setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

    public ProductInstance setDeployTopologyIdentity(String deployTopologyIdentity) {
        this.deployTopologyIdentity = deployTopologyIdentity;
        return this;
    }
    public String getDeployTopologyIdentity() {
        return this.deployTopologyIdentity;
    }

    public ProductInstance setDeploySpecIdentity(String deploySpecIdentity) {
        this.deploySpecIdentity = deploySpecIdentity;
        return this;
    }
    public String getDeploySpecIdentity() {
        return this.deploySpecIdentity;
    }

}
