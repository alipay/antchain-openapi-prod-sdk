// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class GclLcaModel extends TeaModel {
    // 模型名称
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("model_name")
    public String modelName;

    // 过程信息
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("process_list")
    public java.util.List<ProcessDetail> processList;

    public static GclLcaModel build(java.util.Map<String, ?> map) throws Exception {
        GclLcaModel self = new GclLcaModel();
        return TeaModel.build(map, self);
    }

    public GclLcaModel setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public GclLcaModel setProcessList(java.util.List<ProcessDetail> processList) {
        this.processList = processList;
        return this;
    }
    public java.util.List<ProcessDetail> getProcessList() {
        return this.processList;
    }

}
