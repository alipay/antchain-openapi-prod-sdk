// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class Agreement extends TeaModel {
    // 电子合同pdf文件存储路径
    @NameInMap("ar_archive_oss_path")
    public String arArchiveOssPath;

    // 合同编号
    @NameInMap("ar_no")
    public String arNo;

    // 合同模版
    @NameInMap("ar_template")
    public ArTemplate arTemplate;

    // 合同类型，比如：房屋查询授权合同
    @NameInMap("ar_type")
    public String arType;

    // 需要签署合同的角色列表，如：BANK,HOUSE_OWNER,BORROWER
    @NameInMap("ar_signer_roles")
    public java.util.List<String> arSignerRoles;

    // 合同模版需要的变量和值集合,Map<String,String>的json格式
    @NameInMap("ar_var_value_json")
    public String arVarValueJson;

    // 区块链智能合同合同文件号
    @NameInMap("myc_file_no")
    public String mycFileNo;

    // 外部合同编号(银行生成)
    @NameInMap("out_ar_no")
    public String outArNo;

    // 合同签署流程编号
    @NameInMap("proc_no")
    public String procNo;

    // 合同签署时间
    @NameInMap("sign_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String signTime;

    // 签署状态，比如：SUCC=签署完成
    @NameInMap("status")
    public String status;

    // 待签署的合同文档oss存储路径，仅当不动产合同才有
    @NameInMap("un_sign_ar_archive_oss_path")
    public String unSignArArchiveOssPath;

    // 合同生成方式，AR_TP=模版
    @NameInMap("ar_generate_type")
    public String arGenerateType;

    // 智能合同部分的签署区设置
    @NameInMap("ct_sign_configs")
    public java.util.List<ArSignConfig> ctSignConfigs;

    // 机构自主签署部分的签署区设置
    @NameInMap("org_sign_configs")
    public java.util.List<ArSignConfig> orgSignConfigs;

    // 机构签署状态，SUCC=签署完成
    @NameInMap("org_sign_status")
    public String orgSignStatus;

    // 机构签署完成时间
    @NameInMap("org_sign_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String orgSignTime;

    // 机构签署完成后的合同存储路径
    @NameInMap("org_ar_archive_oss_path")
    public String orgArArchiveOssPath;

    // 最终签署完成的合同存储路径
    @NameInMap("final_ar_archive_oss_path")
    public String finalArArchiveOssPath;

    public static Agreement build(java.util.Map<String, ?> map) throws Exception {
        Agreement self = new Agreement();
        return TeaModel.build(map, self);
    }

    public Agreement setArArchiveOssPath(String arArchiveOssPath) {
        this.arArchiveOssPath = arArchiveOssPath;
        return this;
    }
    public String getArArchiveOssPath() {
        return this.arArchiveOssPath;
    }

    public Agreement setArNo(String arNo) {
        this.arNo = arNo;
        return this;
    }
    public String getArNo() {
        return this.arNo;
    }

    public Agreement setArTemplate(ArTemplate arTemplate) {
        this.arTemplate = arTemplate;
        return this;
    }
    public ArTemplate getArTemplate() {
        return this.arTemplate;
    }

    public Agreement setArType(String arType) {
        this.arType = arType;
        return this;
    }
    public String getArType() {
        return this.arType;
    }

    public Agreement setArSignerRoles(java.util.List<String> arSignerRoles) {
        this.arSignerRoles = arSignerRoles;
        return this;
    }
    public java.util.List<String> getArSignerRoles() {
        return this.arSignerRoles;
    }

    public Agreement setArVarValueJson(String arVarValueJson) {
        this.arVarValueJson = arVarValueJson;
        return this;
    }
    public String getArVarValueJson() {
        return this.arVarValueJson;
    }

    public Agreement setMycFileNo(String mycFileNo) {
        this.mycFileNo = mycFileNo;
        return this;
    }
    public String getMycFileNo() {
        return this.mycFileNo;
    }

    public Agreement setOutArNo(String outArNo) {
        this.outArNo = outArNo;
        return this;
    }
    public String getOutArNo() {
        return this.outArNo;
    }

    public Agreement setProcNo(String procNo) {
        this.procNo = procNo;
        return this;
    }
    public String getProcNo() {
        return this.procNo;
    }

    public Agreement setSignTime(String signTime) {
        this.signTime = signTime;
        return this;
    }
    public String getSignTime() {
        return this.signTime;
    }

    public Agreement setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Agreement setUnSignArArchiveOssPath(String unSignArArchiveOssPath) {
        this.unSignArArchiveOssPath = unSignArArchiveOssPath;
        return this;
    }
    public String getUnSignArArchiveOssPath() {
        return this.unSignArArchiveOssPath;
    }

    public Agreement setArGenerateType(String arGenerateType) {
        this.arGenerateType = arGenerateType;
        return this;
    }
    public String getArGenerateType() {
        return this.arGenerateType;
    }

    public Agreement setCtSignConfigs(java.util.List<ArSignConfig> ctSignConfigs) {
        this.ctSignConfigs = ctSignConfigs;
        return this;
    }
    public java.util.List<ArSignConfig> getCtSignConfigs() {
        return this.ctSignConfigs;
    }

    public Agreement setOrgSignConfigs(java.util.List<ArSignConfig> orgSignConfigs) {
        this.orgSignConfigs = orgSignConfigs;
        return this;
    }
    public java.util.List<ArSignConfig> getOrgSignConfigs() {
        return this.orgSignConfigs;
    }

    public Agreement setOrgSignStatus(String orgSignStatus) {
        this.orgSignStatus = orgSignStatus;
        return this;
    }
    public String getOrgSignStatus() {
        return this.orgSignStatus;
    }

    public Agreement setOrgSignTime(String orgSignTime) {
        this.orgSignTime = orgSignTime;
        return this;
    }
    public String getOrgSignTime() {
        return this.orgSignTime;
    }

    public Agreement setOrgArArchiveOssPath(String orgArArchiveOssPath) {
        this.orgArArchiveOssPath = orgArArchiveOssPath;
        return this;
    }
    public String getOrgArArchiveOssPath() {
        return this.orgArArchiveOssPath;
    }

    public Agreement setFinalArArchiveOssPath(String finalArArchiveOssPath) {
        this.finalArArchiveOssPath = finalArArchiveOssPath;
        return this;
    }
    public String getFinalArArchiveOssPath() {
        return this.finalArArchiveOssPath;
    }

}
