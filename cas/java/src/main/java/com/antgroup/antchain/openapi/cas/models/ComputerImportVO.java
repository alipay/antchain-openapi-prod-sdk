// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ComputerImportVO extends TeaModel {
    // computer iaaas id
    @NameInMap("iaas_id")
    public String iaasId;

    // name
    @NameInMap("name")
    public String name;

    // zone identity
    @NameInMap("zone_iaas_id")
    public String zoneIaasId;

    // zone name
    @NameInMap("zone_name")
    public String zoneName;

    // description
    @NameInMap("description")
    public String description;

    // private ip
    @NameInMap("private_ip")
    public String privateIp;

    // public ip
    @NameInMap("public_ip")
    public String publicIp;

    // elasticIp
    @NameInMap("elastic_ip")
    public String elasticIp;

    // vpcIaasId
    @NameInMap("vpc_iaas_id")
    public String vpcIaasId;

    // joined security group infos
    @NameInMap("joined_security_group")
    public java.util.List<JoinedSecurityGroupVO> joinedSecurityGroup;

    // creation time
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcCreate;

    // import info
    @NameInMap("import_info")
    public ImportVO importInfo;

    public static ComputerImportVO build(java.util.Map<String, ?> map) throws Exception {
        ComputerImportVO self = new ComputerImportVO();
        return TeaModel.build(map, self);
    }

    public ComputerImportVO setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public ComputerImportVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ComputerImportVO setZoneIaasId(String zoneIaasId) {
        this.zoneIaasId = zoneIaasId;
        return this;
    }
    public String getZoneIaasId() {
        return this.zoneIaasId;
    }

    public ComputerImportVO setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

    public ComputerImportVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ComputerImportVO setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }
    public String getPrivateIp() {
        return this.privateIp;
    }

    public ComputerImportVO setPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }
    public String getPublicIp() {
        return this.publicIp;
    }

    public ComputerImportVO setElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
        return this;
    }
    public String getElasticIp() {
        return this.elasticIp;
    }

    public ComputerImportVO setVpcIaasId(String vpcIaasId) {
        this.vpcIaasId = vpcIaasId;
        return this;
    }
    public String getVpcIaasId() {
        return this.vpcIaasId;
    }

    public ComputerImportVO setJoinedSecurityGroup(java.util.List<JoinedSecurityGroupVO> joinedSecurityGroup) {
        this.joinedSecurityGroup = joinedSecurityGroup;
        return this;
    }
    public java.util.List<JoinedSecurityGroupVO> getJoinedSecurityGroup() {
        return this.joinedSecurityGroup;
    }

    public ComputerImportVO setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public ComputerImportVO setImportInfo(ImportVO importInfo) {
        this.importInfo = importInfo;
        return this;
    }
    public ImportVO getImportInfo() {
        return this.importInfo;
    }

}
