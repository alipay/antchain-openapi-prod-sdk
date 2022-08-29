// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class OperateJusticeEventRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 案件Id,创建案件返回的id
    @NameInMap("case_id")
    @Validation(required = true)
    public Long caseId;

    // 维权记录id,发起维权返回的Id
    @NameInMap("record_id")
    @Validation(required = true)
    public Long recordId;

    // 事件类型(目前仅支持司法调解类):
    // 司法调解-JUDICIAL_MEDIATION
    // 仲裁-ARBITRATION
    // 执行-CARRIED_OUT
    // 补证-SUPPLEMENT
    @NameInMap("event_type")
    @Validation(required = true)
    public String eventType;

    // 针对事件响应的信息
    @NameInMap("operate_info")
    @Validation(required = true)
    public JudicialEventOperateInfo operateInfo;

    public static OperateJusticeEventRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateJusticeEventRequest self = new OperateJusticeEventRequest();
        return TeaModel.build(map, self);
    }

    public OperateJusticeEventRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateJusticeEventRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateJusticeEventRequest setCaseId(Long caseId) {
        this.caseId = caseId;
        return this;
    }
    public Long getCaseId() {
        return this.caseId;
    }

    public OperateJusticeEventRequest setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

    public OperateJusticeEventRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public OperateJusticeEventRequest setOperateInfo(JudicialEventOperateInfo operateInfo) {
        this.operateInfo = operateInfo;
        return this;
    }
    public JudicialEventOperateInfo getOperateInfo() {
        return this.operateInfo;
    }

}
