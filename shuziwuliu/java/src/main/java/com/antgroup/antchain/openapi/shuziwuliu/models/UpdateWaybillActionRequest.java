// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UpdateWaybillActionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 操作类型，以下二选一填写：运单起运、运输完成
    @NameInMap("operate_action")
    @Validation(required = true)
    public String operateAction;

    // 运单起运或运输完成的时间，要求为13位毫秒级时间戳
    @NameInMap("operate_action_time")
    @Validation(required = true)
    public Long operateActionTime;

    // 客户系统内运单编号
    @NameInMap("tax_waybill_id")
    @Validation(required = true)
    public String taxWaybillId;

    // 3plDid，一般为合同乙方的链上数字身份
    @NameInMap("third_party_logistics_did")
    @Validation(required = true)
    public String thirdPartyLogisticsDid;

    public static UpdateWaybillActionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWaybillActionRequest self = new UpdateWaybillActionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWaybillActionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateWaybillActionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateWaybillActionRequest setOperateAction(String operateAction) {
        this.operateAction = operateAction;
        return this;
    }
    public String getOperateAction() {
        return this.operateAction;
    }

    public UpdateWaybillActionRequest setOperateActionTime(Long operateActionTime) {
        this.operateActionTime = operateActionTime;
        return this;
    }
    public Long getOperateActionTime() {
        return this.operateActionTime;
    }

    public UpdateWaybillActionRequest setTaxWaybillId(String taxWaybillId) {
        this.taxWaybillId = taxWaybillId;
        return this;
    }
    public String getTaxWaybillId() {
        return this.taxWaybillId;
    }

    public UpdateWaybillActionRequest setThirdPartyLogisticsDid(String thirdPartyLogisticsDid) {
        this.thirdPartyLogisticsDid = thirdPartyLogisticsDid;
        return this;
    }
    public String getThirdPartyLogisticsDid() {
        return this.thirdPartyLogisticsDid;
    }

}
