// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ResemblePositionData extends TeaModel {
    // 起始位置
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("start_position")
    @Validation(required = true)
    public Long startPosition;

    // 结束位置
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("end_position")
    @Validation(required = true)
    public Long endPosition;

    public static ResemblePositionData build(java.util.Map<String, ?> map) throws Exception {
        ResemblePositionData self = new ResemblePositionData();
        return TeaModel.build(map, self);
    }

    public ResemblePositionData setStartPosition(Long startPosition) {
        this.startPosition = startPosition;
        return this;
    }
    public Long getStartPosition() {
        return this.startPosition;
    }

    public ResemblePositionData setEndPosition(Long endPosition) {
        this.endPosition = endPosition;
        return this;
    }
    public Long getEndPosition() {
        return this.endPosition;
    }

}
