// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class PushAuthSigninfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 签署流程id
    @NameInMap("sign_process_id")
    @Validation(required = true)
    public String signProcessId;

    // 授权关系类型id
    @NameInMap("auth_rel_type_id")
    @Validation(required = true)
    public String authRelTypeId;

    // 某某主题
    @NameInMap("sign_theme")
    public String signTheme;

    // 发起方名称
    @NameInMap("initiator_name")
    @Validation(required = true)
    public String initiatorName;

    // 发起方证件类型，可以填写的枚举类型：UNIFIED_SOCIAL_CREDIT_CODE,  BUSINESS_LICENSE_NUMBER。分别表示统一社会信用代码和工商注册号
    @NameInMap("initiator_cert_type")
    @Validation(required = true)
    public String initiatorCertType;

    // 发起方证件号码
    @NameInMap("initiator_cert_num")
    @Validation(required = true)
    public String initiatorCertNum;

    // 合同模板hash
    @NameInMap("cont_tmpl_hash")
    @Validation(required = true)
    public String contTmplHash;

    // 签署方信息列表
    @NameInMap("auth_partys")
    @Validation(required = true)
    public java.util.List<AuthParty> authPartys;

    // 上链文件信息列表
    @NameInMap("auth_chain_files")
    @Validation(required = true)
    public java.util.List<AuthChainFile> authChainFiles;

    // 动态字段1
    @NameInMap("dyna_field1")
    public String dynaField1;

    // 动态字段2
    @NameInMap("dyna_field2")
    public String dynaField2;

    // 动态字段3
    @NameInMap("dyna_field3")
    public String dynaField3;

    // 动态字段4
    @NameInMap("dyna_field4")
    public String dynaField4;

    // 动态字段5
    @NameInMap("dyna_field5")
    public String dynaField5;

    // 动态字段6
    @NameInMap("dyna_field6")
    public String dynaField6;

    // 动态字段7
    @NameInMap("dyna_field7")
    public String dynaField7;

    // 动态字段8
    @NameInMap("dyna_field8")
    public String dynaField8;

    // 动态字段9
    @NameInMap("dyna_field9")
    public String dynaField9;

    // 动态字段10
    @NameInMap("dyna_field10")
    public String dynaField10;

    // 动态字段11
    @NameInMap("dyna_field11")
    public String dynaField11;

    // 动态字段12
    @NameInMap("dyna_field12")
    public String dynaField12;

    // 动态字段13
    @NameInMap("dyna_field13")
    public String dynaField13;

    // 动态字段14
    @NameInMap("dyna_field14")
    public String dynaField14;

    // 动态字段15
    @NameInMap("dyna_field15")
    public String dynaField15;

    // 动态字段16
    @NameInMap("dyna_field16")
    public String dynaField16;

    // 动态字段17
    @NameInMap("dyna_field17")
    public String dynaField17;

    // 动态字段18
    @NameInMap("dyna_field18")
    public String dynaField18;

    // 动态字段19
    @NameInMap("dyna_field19")
    public String dynaField19;

    // 动态字段20
    @NameInMap("dyna_field20")
    public String dynaField20;

    public static PushAuthSigninfoRequest build(java.util.Map<String, ?> map) throws Exception {
        PushAuthSigninfoRequest self = new PushAuthSigninfoRequest();
        return TeaModel.build(map, self);
    }

    public PushAuthSigninfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushAuthSigninfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushAuthSigninfoRequest setSignProcessId(String signProcessId) {
        this.signProcessId = signProcessId;
        return this;
    }
    public String getSignProcessId() {
        return this.signProcessId;
    }

    public PushAuthSigninfoRequest setAuthRelTypeId(String authRelTypeId) {
        this.authRelTypeId = authRelTypeId;
        return this;
    }
    public String getAuthRelTypeId() {
        return this.authRelTypeId;
    }

    public PushAuthSigninfoRequest setSignTheme(String signTheme) {
        this.signTheme = signTheme;
        return this;
    }
    public String getSignTheme() {
        return this.signTheme;
    }

    public PushAuthSigninfoRequest setInitiatorName(String initiatorName) {
        this.initiatorName = initiatorName;
        return this;
    }
    public String getInitiatorName() {
        return this.initiatorName;
    }

    public PushAuthSigninfoRequest setInitiatorCertType(String initiatorCertType) {
        this.initiatorCertType = initiatorCertType;
        return this;
    }
    public String getInitiatorCertType() {
        return this.initiatorCertType;
    }

    public PushAuthSigninfoRequest setInitiatorCertNum(String initiatorCertNum) {
        this.initiatorCertNum = initiatorCertNum;
        return this;
    }
    public String getInitiatorCertNum() {
        return this.initiatorCertNum;
    }

    public PushAuthSigninfoRequest setContTmplHash(String contTmplHash) {
        this.contTmplHash = contTmplHash;
        return this;
    }
    public String getContTmplHash() {
        return this.contTmplHash;
    }

    public PushAuthSigninfoRequest setAuthPartys(java.util.List<AuthParty> authPartys) {
        this.authPartys = authPartys;
        return this;
    }
    public java.util.List<AuthParty> getAuthPartys() {
        return this.authPartys;
    }

    public PushAuthSigninfoRequest setAuthChainFiles(java.util.List<AuthChainFile> authChainFiles) {
        this.authChainFiles = authChainFiles;
        return this;
    }
    public java.util.List<AuthChainFile> getAuthChainFiles() {
        return this.authChainFiles;
    }

    public PushAuthSigninfoRequest setDynaField1(String dynaField1) {
        this.dynaField1 = dynaField1;
        return this;
    }
    public String getDynaField1() {
        return this.dynaField1;
    }

    public PushAuthSigninfoRequest setDynaField2(String dynaField2) {
        this.dynaField2 = dynaField2;
        return this;
    }
    public String getDynaField2() {
        return this.dynaField2;
    }

    public PushAuthSigninfoRequest setDynaField3(String dynaField3) {
        this.dynaField3 = dynaField3;
        return this;
    }
    public String getDynaField3() {
        return this.dynaField3;
    }

    public PushAuthSigninfoRequest setDynaField4(String dynaField4) {
        this.dynaField4 = dynaField4;
        return this;
    }
    public String getDynaField4() {
        return this.dynaField4;
    }

    public PushAuthSigninfoRequest setDynaField5(String dynaField5) {
        this.dynaField5 = dynaField5;
        return this;
    }
    public String getDynaField5() {
        return this.dynaField5;
    }

    public PushAuthSigninfoRequest setDynaField6(String dynaField6) {
        this.dynaField6 = dynaField6;
        return this;
    }
    public String getDynaField6() {
        return this.dynaField6;
    }

    public PushAuthSigninfoRequest setDynaField7(String dynaField7) {
        this.dynaField7 = dynaField7;
        return this;
    }
    public String getDynaField7() {
        return this.dynaField7;
    }

    public PushAuthSigninfoRequest setDynaField8(String dynaField8) {
        this.dynaField8 = dynaField8;
        return this;
    }
    public String getDynaField8() {
        return this.dynaField8;
    }

    public PushAuthSigninfoRequest setDynaField9(String dynaField9) {
        this.dynaField9 = dynaField9;
        return this;
    }
    public String getDynaField9() {
        return this.dynaField9;
    }

    public PushAuthSigninfoRequest setDynaField10(String dynaField10) {
        this.dynaField10 = dynaField10;
        return this;
    }
    public String getDynaField10() {
        return this.dynaField10;
    }

    public PushAuthSigninfoRequest setDynaField11(String dynaField11) {
        this.dynaField11 = dynaField11;
        return this;
    }
    public String getDynaField11() {
        return this.dynaField11;
    }

    public PushAuthSigninfoRequest setDynaField12(String dynaField12) {
        this.dynaField12 = dynaField12;
        return this;
    }
    public String getDynaField12() {
        return this.dynaField12;
    }

    public PushAuthSigninfoRequest setDynaField13(String dynaField13) {
        this.dynaField13 = dynaField13;
        return this;
    }
    public String getDynaField13() {
        return this.dynaField13;
    }

    public PushAuthSigninfoRequest setDynaField14(String dynaField14) {
        this.dynaField14 = dynaField14;
        return this;
    }
    public String getDynaField14() {
        return this.dynaField14;
    }

    public PushAuthSigninfoRequest setDynaField15(String dynaField15) {
        this.dynaField15 = dynaField15;
        return this;
    }
    public String getDynaField15() {
        return this.dynaField15;
    }

    public PushAuthSigninfoRequest setDynaField16(String dynaField16) {
        this.dynaField16 = dynaField16;
        return this;
    }
    public String getDynaField16() {
        return this.dynaField16;
    }

    public PushAuthSigninfoRequest setDynaField17(String dynaField17) {
        this.dynaField17 = dynaField17;
        return this;
    }
    public String getDynaField17() {
        return this.dynaField17;
    }

    public PushAuthSigninfoRequest setDynaField18(String dynaField18) {
        this.dynaField18 = dynaField18;
        return this;
    }
    public String getDynaField18() {
        return this.dynaField18;
    }

    public PushAuthSigninfoRequest setDynaField19(String dynaField19) {
        this.dynaField19 = dynaField19;
        return this;
    }
    public String getDynaField19() {
        return this.dynaField19;
    }

    public PushAuthSigninfoRequest setDynaField20(String dynaField20) {
        this.dynaField20 = dynaField20;
        return this;
    }
    public String getDynaField20() {
        return this.dynaField20;
    }

}
