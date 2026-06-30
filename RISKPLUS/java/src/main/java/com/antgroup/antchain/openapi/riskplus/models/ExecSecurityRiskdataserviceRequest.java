// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ExecSecurityRiskdataserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 风险数据服务请求事件属性详情
    @NameInMap("event_info")
    @Validation(required = true)
    public String eventInfo;

    // 反欺诈数据服务查询请求唯一凭证，为申请成功后得到，当请求类型是query时必填
    @NameInMap("risk_data_serviace_apply_id")
    public String riskDataServiaceApplyId;

    // 反欺诈风险数据服务请求类型（query or apply）
    @NameInMap("risk_data_service_type")
    @Validation(required = true)
    public String riskDataServiceType;

    public static ExecSecurityRiskdataserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecSecurityRiskdataserviceRequest self = new ExecSecurityRiskdataserviceRequest();
        return TeaModel.build(map, self);
    }

    public ExecSecurityRiskdataserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecSecurityRiskdataserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecSecurityRiskdataserviceRequest setEventInfo(String eventInfo) {
        this.eventInfo = eventInfo;
        return this;
    }
    public String getEventInfo() {
        return this.eventInfo;
    }

    public ExecSecurityRiskdataserviceRequest setRiskDataServiaceApplyId(String riskDataServiaceApplyId) {
        this.riskDataServiaceApplyId = riskDataServiaceApplyId;
        return this;
    }
    public String getRiskDataServiaceApplyId() {
        return this.riskDataServiaceApplyId;
    }

    public ExecSecurityRiskdataserviceRequest setRiskDataServiceType(String riskDataServiceType) {
        this.riskDataServiceType = riskDataServiceType;
        return this;
    }
    public String getRiskDataServiceType() {
        return this.riskDataServiceType;
    }

}
