// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class StaticData extends TeaModel {
    // 商户类型
    /**
     * <strong>example:</strong>
     * <p>merchantType</p>
     */
    @NameInMap("module_name")
    @Validation(required = true)
    public String moduleName;

    // 静态数据详情
    @NameInMap("module_detail_list")
    @Validation(required = true)
    public java.util.List<StaticDataModuleDetail> moduleDetailList;

    public static StaticData build(java.util.Map<String, ?> map) throws Exception {
        StaticData self = new StaticData();
        return TeaModel.build(map, self);
    }

    public StaticData setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public StaticData setModuleDetailList(java.util.List<StaticDataModuleDetail> moduleDetailList) {
        this.moduleDetailList = moduleDetailList;
        return this;
    }
    public java.util.List<StaticDataModuleDetail> getModuleDetailList() {
        return this.moduleDetailList;
    }

}
