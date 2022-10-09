// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class WorksInfo extends TeaModel {
    // 作品名称
    @NameInMap("works_name")
    @Validation(required = true)
    public String worksName;

    // 作品类型
    @NameInMap("works_type")
    @Validation(required = true)
    public String worksType;

    // 作品类型英文标识
    @NameInMap("works_type_en")
    public String worksTypeEn;

    public static WorksInfo build(java.util.Map<String, ?> map) throws Exception {
        WorksInfo self = new WorksInfo();
        return TeaModel.build(map, self);
    }

    public WorksInfo setWorksName(String worksName) {
        this.worksName = worksName;
        return this;
    }
    public String getWorksName() {
        return this.worksName;
    }

    public WorksInfo setWorksType(String worksType) {
        this.worksType = worksType;
        return this;
    }
    public String getWorksType() {
        return this.worksType;
    }

    public WorksInfo setWorksTypeEn(String worksTypeEn) {
        this.worksTypeEn = worksTypeEn;
        return this;
    }
    public String getWorksTypeEn() {
        return this.worksTypeEn;
    }

}
