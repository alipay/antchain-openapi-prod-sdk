// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_c175eb6e902d4839bce77e1b7a390162.models;

import com.aliyun.tea.*;

public class WANJIE extends TeaModel {
    // code
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // abilityAttribute
    @NameInMap("ability_attribute")
    @Validation(required = true)
    public String abilityAttribute;

    // pastAttribute
    @NameInMap("past_attribute")
    public String pastAttribute;

    // stabilityAttribute
    @NameInMap("stability_attribute")
    public String stabilityAttribute;

    public static WANJIE build(java.util.Map<String, ?> map) throws Exception {
        WANJIE self = new WANJIE();
        return TeaModel.build(map, self);
    }

    public WANJIE setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public WANJIE setAbilityAttribute(String abilityAttribute) {
        this.abilityAttribute = abilityAttribute;
        return this;
    }
    public String getAbilityAttribute() {
        return this.abilityAttribute;
    }

    public WANJIE setPastAttribute(String pastAttribute) {
        this.pastAttribute = pastAttribute;
        return this;
    }
    public String getPastAttribute() {
        return this.pastAttribute;
    }

    public WANJIE setStabilityAttribute(String stabilityAttribute) {
        this.stabilityAttribute = stabilityAttribute;
        return this;
    }
    public String getStabilityAttribute() {
        return this.stabilityAttribute;
    }

}
