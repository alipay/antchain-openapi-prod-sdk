// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class LcaStageActiveData extends TeaModel {
    // LCA阶段
    /**
     * <strong>example:</strong>
     * <p>ProductManufacture</p>
     */
    @NameInMap("lca_stage")
    @Validation(required = true)
    public String lcaStage;

    // 输入流活动数据列表
    @NameInMap("input_stream_list")
    @Validation(required = true)
    public java.util.List<InputStreamActiveData> inputStreamList;

    // 输出流活动数据列表
    @NameInMap("output_stream_list")
    @Validation(required = true)
    public java.util.List<OutputStreamActiveData> outputStreamList;

    public static LcaStageActiveData build(java.util.Map<String, ?> map) throws Exception {
        LcaStageActiveData self = new LcaStageActiveData();
        return TeaModel.build(map, self);
    }

    public LcaStageActiveData setLcaStage(String lcaStage) {
        this.lcaStage = lcaStage;
        return this;
    }
    public String getLcaStage() {
        return this.lcaStage;
    }

    public LcaStageActiveData setInputStreamList(java.util.List<InputStreamActiveData> inputStreamList) {
        this.inputStreamList = inputStreamList;
        return this;
    }
    public java.util.List<InputStreamActiveData> getInputStreamList() {
        return this.inputStreamList;
    }

    public LcaStageActiveData setOutputStreamList(java.util.List<OutputStreamActiveData> outputStreamList) {
        this.outputStreamList = outputStreamList;
        return this;
    }
    public java.util.List<OutputStreamActiveData> getOutputStreamList() {
        return this.outputStreamList;
    }

}
