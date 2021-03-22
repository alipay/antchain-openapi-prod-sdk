// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPMCC extends TeaModel {
    // MCC编码
    @NameInMap("mcc_code")
    @Validation(required = true)
    public String mccCode;

    // 经营类目一级
    @NameInMap("category_level1")
    @Validation(required = true)
    public String categoryLevel1;

    // 经营类目二级
    @NameInMap("category_level2")
    @Validation(required = true)
    public String categoryLevel2;

    // 经营类目三级
    @NameInMap("category_level3")
    @Validation(required = true)
    public String categoryLevel3;

    public static IPMCC build(java.util.Map<String, ?> map) throws Exception {
        IPMCC self = new IPMCC();
        return TeaModel.build(map, self);
    }

    public IPMCC setMccCode(String mccCode) {
        this.mccCode = mccCode;
        return this;
    }
    public String getMccCode() {
        return this.mccCode;
    }

    public IPMCC setCategoryLevel1(String categoryLevel1) {
        this.categoryLevel1 = categoryLevel1;
        return this;
    }
    public String getCategoryLevel1() {
        return this.categoryLevel1;
    }

    public IPMCC setCategoryLevel2(String categoryLevel2) {
        this.categoryLevel2 = categoryLevel2;
        return this;
    }
    public String getCategoryLevel2() {
        return this.categoryLevel2;
    }

    public IPMCC setCategoryLevel3(String categoryLevel3) {
        this.categoryLevel3 = categoryLevel3;
        return this;
    }
    public String getCategoryLevel3() {
        return this.categoryLevel3;
    }

}
