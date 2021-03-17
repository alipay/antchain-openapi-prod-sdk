// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class ContractSigning extends TeaModel {
    // 本合同文件的名称
    @NameInMap("contract_name")
    @Validation(required = true)
    public String contractName;

    // 待签署文件存放在的可读取路径，参数具体内容根据调用方约定，比如内容为OSS路径时，数字房产访问OSS下载文件。
    @NameInMap("file_path")
    @Validation(required = true)
    public String filePath;

    // 机构签署记录列表，可设置多个机构的签署区
    @NameInMap("org_sign_list")
    @Validation(required = true)
    public java.util.List<OrgSigning> orgSignList;

    // 个人签署记录的列表形式，可设置多个个人的签署区
    @NameInMap("personal_sign_list")
    @Validation(required = true)
    public java.util.List<PersonalSigning> personalSignList;

    public static ContractSigning build(java.util.Map<String, ?> map) throws Exception {
        ContractSigning self = new ContractSigning();
        return TeaModel.build(map, self);
    }

    public ContractSigning setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public ContractSigning setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public ContractSigning setOrgSignList(java.util.List<OrgSigning> orgSignList) {
        this.orgSignList = orgSignList;
        return this;
    }
    public java.util.List<OrgSigning> getOrgSignList() {
        return this.orgSignList;
    }

    public ContractSigning setPersonalSignList(java.util.List<PersonalSigning> personalSignList) {
        this.personalSignList = personalSignList;
        return this;
    }
    public java.util.List<PersonalSigning> getPersonalSignList() {
        return this.personalSignList;
    }

}
