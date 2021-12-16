// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class SpecVO extends TeaModel {
    // 规格code
    @NameInMap("spec_code")
    @Validation(required = true)
    public String specCode;

    // 规格名称
    @NameInMap("spec_name")
    @Validation(required = true)
    public String specName;

    // 主要付款方式
    @NameInMap("main_pay_method")
    @Validation(required = true)
    public String mainPayMethod;

    // 售卖模式
    @NameInMap("sales_mode")
    @Validation(required = true)
    public String salesMode;

    // 规格状态
    @NameInMap("spec_status")
    @Validation(required = true)
    public String specStatus;

    // 规格描述
    @NameInMap("desc")
    @Validation(required = true)
    public String desc;

    public static SpecVO build(java.util.Map<String, ?> map) throws Exception {
        SpecVO self = new SpecVO();
        return TeaModel.build(map, self);
    }

    public SpecVO setSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }
    public String getSpecCode() {
        return this.specCode;
    }

    public SpecVO setSpecName(String specName) {
        this.specName = specName;
        return this;
    }
    public String getSpecName() {
        return this.specName;
    }

    public SpecVO setMainPayMethod(String mainPayMethod) {
        this.mainPayMethod = mainPayMethod;
        return this;
    }
    public String getMainPayMethod() {
        return this.mainPayMethod;
    }

    public SpecVO setSalesMode(String salesMode) {
        this.salesMode = salesMode;
        return this;
    }
    public String getSalesMode() {
        return this.salesMode;
    }

    public SpecVO setSpecStatus(String specStatus) {
        this.specStatus = specStatus;
        return this;
    }
    public String getSpecStatus() {
        return this.specStatus;
    }

    public SpecVO setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}
