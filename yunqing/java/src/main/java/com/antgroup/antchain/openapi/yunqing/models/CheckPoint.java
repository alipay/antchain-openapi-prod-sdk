// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class CheckPoint extends TeaModel {
    // 检查结果
    @NameInMap("check_result")
    @Validation(required = true)
    public String checkResult;

    // 检查点, 例如参数检查
    @NameInMap("check_point")
    @Validation(required = true)
    public String checkPoint;

    // 非法原因
    @NameInMap("invalid_reason")
    public String invalidReason;

    public static CheckPoint build(java.util.Map<String, ?> map) throws Exception {
        CheckPoint self = new CheckPoint();
        return TeaModel.build(map, self);
    }

    public CheckPoint setCheckResult(String checkResult) {
        this.checkResult = checkResult;
        return this;
    }
    public String getCheckResult() {
        return this.checkResult;
    }

    public CheckPoint setCheckPoint(String checkPoint) {
        this.checkPoint = checkPoint;
        return this;
    }
    public String getCheckPoint() {
        return this.checkPoint;
    }

    public CheckPoint setInvalidReason(String invalidReason) {
        this.invalidReason = invalidReason;
        return this;
    }
    public String getInvalidReason() {
        return this.invalidReason;
    }

}
