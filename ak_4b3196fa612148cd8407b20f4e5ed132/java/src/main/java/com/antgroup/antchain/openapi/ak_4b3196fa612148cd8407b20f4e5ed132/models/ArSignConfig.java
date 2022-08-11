// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_4b3196fa612148cd8407b20f4e5ed132.models;

import com.aliyun.tea.*;

public class ArSignConfig extends TeaModel {
    // 签约者类型，比如：BANK=银行
    @NameInMap("ar_signer_type")
    public String arSignerType;

    // 签署区列表
    @NameInMap("ar_sign_fields")
    public java.util.List<ArSignField> arSignFields;

    // 签署人
    @NameInMap("signer")
    public Person signer;

    public static ArSignConfig build(java.util.Map<String, ?> map) throws Exception {
        ArSignConfig self = new ArSignConfig();
        return TeaModel.build(map, self);
    }

    public ArSignConfig setArSignerType(String arSignerType) {
        this.arSignerType = arSignerType;
        return this;
    }
    public String getArSignerType() {
        return this.arSignerType;
    }

    public ArSignConfig setArSignFields(java.util.List<ArSignField> arSignFields) {
        this.arSignFields = arSignFields;
        return this;
    }
    public java.util.List<ArSignField> getArSignFields() {
        return this.arSignFields;
    }

    public ArSignConfig setSigner(Person signer) {
        this.signer = signer;
        return this;
    }
    public Person getSigner() {
        return this.signer;
    }

}
