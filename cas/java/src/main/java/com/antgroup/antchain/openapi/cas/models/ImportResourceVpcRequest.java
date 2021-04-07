// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ImportResourceVpcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // region identity
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // vpc iaas id
    @NameInMap("vpc_id")
    @Validation(required = true)
    public String vpcId;

    // workspace identity
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    // vrouter id
    @NameInMap("vrouter_id")
    @Validation(required = true)
    public String vrouterId;

    // vpc name
    @NameInMap("vpc_name")
    @Validation(required = true)
    public String vpcName;

    // cidr block
    @NameInMap("cidr_block")
    @Validation(required = true)
    public String cidrBlock;

    public static ImportResourceVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportResourceVpcRequest self = new ImportResourceVpcRequest();
        return TeaModel.build(map, self);
    }

    public ImportResourceVpcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportResourceVpcRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ImportResourceVpcRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public ImportResourceVpcRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public ImportResourceVpcRequest setVrouterId(String vrouterId) {
        this.vrouterId = vrouterId;
        return this;
    }
    public String getVrouterId() {
        return this.vrouterId;
    }

    public ImportResourceVpcRequest setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }
    public String getVpcName() {
        return this.vpcName;
    }

    public ImportResourceVpcRequest setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

}
