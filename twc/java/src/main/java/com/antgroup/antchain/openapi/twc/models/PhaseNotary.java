// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class PhaseNotary extends TeaModel {
    // 阶段编号，与模板阶段编号保持一致，不同阶段阶段编号不一样，要与阶段存证内容保持一致
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("phase_no")
    @Validation(required = true)
    public Long phaseNo;

    // 阶段存证内容，如果模板数据类型定义是Hash(哈希)则填入Hash即可，如果定义是Structure(结构化)，则填入模板所有字段json对象的字符串Base64后的值
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("notary_content")
    @Validation(required = true)
    public String notaryContent;

    // 业务方原始数据ID，业务方确保唯一，方便与业务方进行数据核对使用
    // 
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("origin_data_id")
    @Validation(required = true)
    public String originDataId;

    public static PhaseNotary build(java.util.Map<String, ?> map) throws Exception {
        PhaseNotary self = new PhaseNotary();
        return TeaModel.build(map, self);
    }

    public PhaseNotary setPhaseNo(Long phaseNo) {
        this.phaseNo = phaseNo;
        return this;
    }
    public Long getPhaseNo() {
        return this.phaseNo;
    }

    public PhaseNotary setNotaryContent(String notaryContent) {
        this.notaryContent = notaryContent;
        return this;
    }
    public String getNotaryContent() {
        return this.notaryContent;
    }

    public PhaseNotary setOriginDataId(String originDataId) {
        this.originDataId = originDataId;
        return this;
    }
    public String getOriginDataId() {
        return this.originDataId;
    }

}
