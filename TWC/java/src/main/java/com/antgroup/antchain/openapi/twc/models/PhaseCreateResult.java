// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class PhaseCreateResult extends TeaModel {
    // 阶段编号，与模板阶段编号保持一致，不同阶段阶段编号不一样，要与阶段存证内容保持一致
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("phase_no")
    @Validation(required = true)
    public Long phaseNo;

    // 阶段ID，阶段存证的唯一标记
    /**
     * <strong>example:</strong>
     * <p>4a605f04-ae9f-48d3-88ba-05c073ad5484</p>
     */
    @NameInMap("phase_id")
    @Validation(required = true)
    public String phaseId;

    // 业务方原始数据ID，方便与业务方进行数据核对使用，并且如果同一个阶段多次存证，则需要根据业务方原始数据ID识别不同的阶段存证响应
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("origin_data_id")
    @Validation(required = true)
    public String originDataId;

    public static PhaseCreateResult build(java.util.Map<String, ?> map) throws Exception {
        PhaseCreateResult self = new PhaseCreateResult();
        return TeaModel.build(map, self);
    }

    public PhaseCreateResult setPhaseNo(Long phaseNo) {
        this.phaseNo = phaseNo;
        return this;
    }
    public Long getPhaseNo() {
        return this.phaseNo;
    }

    public PhaseCreateResult setPhaseId(String phaseId) {
        this.phaseId = phaseId;
        return this;
    }
    public String getPhaseId() {
        return this.phaseId;
    }

    public PhaseCreateResult setOriginDataId(String originDataId) {
        this.originDataId = originDataId;
        return this;
    }
    public String getOriginDataId() {
        return this.originDataId;
    }

}
