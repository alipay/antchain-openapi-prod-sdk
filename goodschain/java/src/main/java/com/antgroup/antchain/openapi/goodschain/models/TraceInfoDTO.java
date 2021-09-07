// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.goodschain.models;

import com.aliyun.tea.*;

public class TraceInfoDTO extends TeaModel {
    // 操作描述
    @NameInMap("operate_type_desc")
    @Validation(required = true)
    public String operateTypeDesc;

    // 操作时间，时间戳
    @NameInMap("operate_time")
    @Validation(required = true)
    public Long operateTime;

    // 操作人id
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // 操作人名称
    @NameInMap("operator_name")
    @Validation(required = true)
    public String operatorName;

    // 操作内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    public static TraceInfoDTO build(java.util.Map<String, ?> map) throws Exception {
        TraceInfoDTO self = new TraceInfoDTO();
        return TeaModel.build(map, self);
    }

    public TraceInfoDTO setOperateTypeDesc(String operateTypeDesc) {
        this.operateTypeDesc = operateTypeDesc;
        return this;
    }
    public String getOperateTypeDesc() {
        return this.operateTypeDesc;
    }

    public TraceInfoDTO setOperateTime(Long operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    public Long getOperateTime() {
        return this.operateTime;
    }

    public TraceInfoDTO setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public TraceInfoDTO setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public TraceInfoDTO setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
