// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class WitnessFlowConfig extends TeaModel {
    // 企业实名认证方式,对公打款：1；企业芝麻认证：3；法定代表授权：4；
    @NameInMap("organ_realname_types")
    public java.util.List<Long> organRealnameTypes;

    // 个人实名认证方式, 银行四要素：2；芝麻认证-人脸识别：3；微众-人脸识别：4；
    @NameInMap("person_realname_types")
    public java.util.List<Long> personRealnameTypes;

    // 是否需要实名认证
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("real_name_cert")
    public Boolean realNameCert;

    // 意愿认证方式, 芝麻认证-人脸识别：2；短信验证码：3；微众-人脸识别：4；ukey认证：5；签署密码认证：6；
    @NameInMap("willingness_types")
    public java.util.List<Long> willingnessTypes;

    public static WitnessFlowConfig build(java.util.Map<String, ?> map) throws Exception {
        WitnessFlowConfig self = new WitnessFlowConfig();
        return TeaModel.build(map, self);
    }

    public WitnessFlowConfig setOrganRealnameTypes(java.util.List<Long> organRealnameTypes) {
        this.organRealnameTypes = organRealnameTypes;
        return this;
    }
    public java.util.List<Long> getOrganRealnameTypes() {
        return this.organRealnameTypes;
    }

    public WitnessFlowConfig setPersonRealnameTypes(java.util.List<Long> personRealnameTypes) {
        this.personRealnameTypes = personRealnameTypes;
        return this;
    }
    public java.util.List<Long> getPersonRealnameTypes() {
        return this.personRealnameTypes;
    }

    public WitnessFlowConfig setRealNameCert(Boolean realNameCert) {
        this.realNameCert = realNameCert;
        return this;
    }
    public Boolean getRealNameCert() {
        return this.realNameCert;
    }

    public WitnessFlowConfig setWillingnessTypes(java.util.List<Long> willingnessTypes) {
        this.willingnessTypes = willingnessTypes;
        return this;
    }
    public java.util.List<Long> getWillingnessTypes() {
        return this.willingnessTypes;
    }

}
