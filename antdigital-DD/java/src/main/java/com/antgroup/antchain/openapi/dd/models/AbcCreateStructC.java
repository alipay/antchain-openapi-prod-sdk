// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class AbcCreateStructC extends TeaModel {
    // 【个人信息】
    /**
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;张三&quot;,&quot;age&quot;:&quot;18&quot;}</p>
     */
    @NameInMap("personal_information")
    public AbcCreateStructA personalInformation;

    // 【地区信息】
    /**
     * <strong>example:</strong>
     * <p>{&quot;info&quot;:&quot;xxxxx&quot;,&quot;region&quot;:&quot;浙江省杭州市西湖区xx街道xxx-xx幢-xx号&quot;}</p>
     */
    @NameInMap("regional_information")
    public AbcCreateStructB regionalInformation;

    // 【用例类型】
    /**
     * <strong>example:</strong>
     * <p>caseType</p>
     */
    @NameInMap("case_name")
    public String caseName;

    public static AbcCreateStructC build(java.util.Map<String, ?> map) throws Exception {
        AbcCreateStructC self = new AbcCreateStructC();
        return TeaModel.build(map, self);
    }

    public AbcCreateStructC setPersonalInformation(AbcCreateStructA personalInformation) {
        this.personalInformation = personalInformation;
        return this;
    }
    public AbcCreateStructA getPersonalInformation() {
        return this.personalInformation;
    }

    public AbcCreateStructC setRegionalInformation(AbcCreateStructB regionalInformation) {
        this.regionalInformation = regionalInformation;
        return this;
    }
    public AbcCreateStructB getRegionalInformation() {
        return this.regionalInformation;
    }

    public AbcCreateStructC setCaseName(String caseName) {
        this.caseName = caseName;
        return this;
    }
    public String getCaseName() {
        return this.caseName;
    }

}
