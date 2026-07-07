// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class ProcessDetail extends TeaModel {
    // 单元过程名称
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("process_name")
    public String processName;

    // 物料详情列表
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("material_type_list")
    public java.util.List<MaterialTypeDetail> materialTypeList;

    public static ProcessDetail build(java.util.Map<String, ?> map) throws Exception {
        ProcessDetail self = new ProcessDetail();
        return TeaModel.build(map, self);
    }

    public ProcessDetail setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public ProcessDetail setMaterialTypeList(java.util.List<MaterialTypeDetail> materialTypeList) {
        this.materialTypeList = materialTypeList;
        return this;
    }
    public java.util.List<MaterialTypeDetail> getMaterialTypeList() {
        return this.materialTypeList;
    }

}
