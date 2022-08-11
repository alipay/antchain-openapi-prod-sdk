// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_4b3196fa612148cd8407b20f4e5ed132.models;

import com.aliyun.tea.*;

public class ArTemplate extends TeaModel {
    // 合同模版号
    @NameInMap("ar_tp_no")
    public String arTpNo;

    // 合同版本
    @NameInMap("ar_tp_version")
    public Long arTpVersion;

    // 合同模版类型，比如：CT_AUTH_HOUSE_QUERY=房屋查询授权合同
    @NameInMap("ar_type")
    public String arType;

    // 区块链智能合同的合同模版号
    @NameInMap("myc_tp_id")
    public String mycTpId;

    // 合同名称
    @NameInMap("name")
    public String name;

    // 合同模版归属机构编号
    @NameInMap("org_no")
    public String orgNo;

    // 合同模版归属机构类型，比如：BANK=银行
    @NameInMap("org_type")
    public String orgType;

    // 合同模版OSS存储路径
    @NameInMap("pdf_oss_key")
    public String pdfOssKey;

    // 合同变量,Map<String,String>的json格式
    @NameInMap("var_json")
    public String varJson;

    // 签署区设置
    @NameInMap("sign_area_json")
    public String signAreaJson;

    public static ArTemplate build(java.util.Map<String, ?> map) throws Exception {
        ArTemplate self = new ArTemplate();
        return TeaModel.build(map, self);
    }

    public ArTemplate setArTpNo(String arTpNo) {
        this.arTpNo = arTpNo;
        return this;
    }
    public String getArTpNo() {
        return this.arTpNo;
    }

    public ArTemplate setArTpVersion(Long arTpVersion) {
        this.arTpVersion = arTpVersion;
        return this;
    }
    public Long getArTpVersion() {
        return this.arTpVersion;
    }

    public ArTemplate setArType(String arType) {
        this.arType = arType;
        return this;
    }
    public String getArType() {
        return this.arType;
    }

    public ArTemplate setMycTpId(String mycTpId) {
        this.mycTpId = mycTpId;
        return this;
    }
    public String getMycTpId() {
        return this.mycTpId;
    }

    public ArTemplate setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ArTemplate setOrgNo(String orgNo) {
        this.orgNo = orgNo;
        return this;
    }
    public String getOrgNo() {
        return this.orgNo;
    }

    public ArTemplate setOrgType(String orgType) {
        this.orgType = orgType;
        return this;
    }
    public String getOrgType() {
        return this.orgType;
    }

    public ArTemplate setPdfOssKey(String pdfOssKey) {
        this.pdfOssKey = pdfOssKey;
        return this;
    }
    public String getPdfOssKey() {
        return this.pdfOssKey;
    }

    public ArTemplate setVarJson(String varJson) {
        this.varJson = varJson;
        return this;
    }
    public String getVarJson() {
        return this.varJson;
    }

    public ArTemplate setSignAreaJson(String signAreaJson) {
        this.signAreaJson = signAreaJson;
        return this;
    }
    public String getSignAreaJson() {
        return this.signAreaJson;
    }

}
