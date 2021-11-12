// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class DeployUnit extends TeaModel {
    // 单元ID
    @NameInMap("cell_id")
    @Validation(required = true)
    public String cellId;

    // 环境唯一标识。
    @NameInMap("env_id")
    @Validation(required = true)
    public String envId;

    // 部署单元id，产品实例下唯一。
    @NameInMap("identity")
    @Validation(required = true)
    public String identity;

    // 部署单元名称。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 产品码。
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 用户传入部署单元标识，如果没有传入，则为deployment_unit_identity
    @NameInMap("unit_ig")
    @Validation(required = true)
    public String unitIg;

    public static DeployUnit build(java.util.Map<String, ?> map) throws Exception {
        DeployUnit self = new DeployUnit();
        return TeaModel.build(map, self);
    }

    public DeployUnit setCellId(String cellId) {
        this.cellId = cellId;
        return this;
    }
    public String getCellId() {
        return this.cellId;
    }

    public DeployUnit setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public DeployUnit setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public DeployUnit setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeployUnit setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DeployUnit setUnitIg(String unitIg) {
        this.unitIg = unitIg;
        return this;
    }
    public String getUnitIg() {
        return this.unitIg;
    }

}
