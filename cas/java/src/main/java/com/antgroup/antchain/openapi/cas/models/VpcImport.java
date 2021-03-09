// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class VpcImport extends TeaModel {
    // cidr block
    @NameInMap("cidr_block")
    public String cidrBlock;

    // vpc描述信息
    @NameInMap("description")
    public String description;

    // vpc iaas id
    @NameInMap("iaas_id")
    @Validation(required = true)
    public String iaasId;

    // import workspace info
    @NameInMap("import_info")
    @Validation(required = true)
    public ImportInfo importInfo;

    // vpc name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // vpc status
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static VpcImport build(java.util.Map<String, ?> map) throws Exception {
        VpcImport self = new VpcImport();
        return TeaModel.build(map, self);
    }

    public VpcImport setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public VpcImport setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public VpcImport setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public VpcImport setImportInfo(ImportInfo importInfo) {
        this.importInfo = importInfo;
        return this;
    }
    public ImportInfo getImportInfo() {
        return this.importInfo;
    }

    public VpcImport setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public VpcImport setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
