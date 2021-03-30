// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UpdateShippingEblbatchstatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 电子提单批次号
    @NameInMap("batch_no")
    @Validation(required = true)
    public String batchNo;

    // 批次下的提单状态变更明细
    @NameInMap("ebl_status_details")
    @Validation(required = true)
    public java.util.List<EblStatusDetail> eblStatusDetails;

    public static UpdateShippingEblbatchstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateShippingEblbatchstatusRequest self = new UpdateShippingEblbatchstatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateShippingEblbatchstatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateShippingEblbatchstatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateShippingEblbatchstatusRequest setBatchNo(String batchNo) {
        this.batchNo = batchNo;
        return this;
    }
    public String getBatchNo() {
        return this.batchNo;
    }

    public UpdateShippingEblbatchstatusRequest setEblStatusDetails(java.util.List<EblStatusDetail> eblStatusDetails) {
        this.eblStatusDetails = eblStatusDetails;
        return this;
    }
    public java.util.List<EblStatusDetail> getEblStatusDetails() {
        return this.eblStatusDetails;
    }

}
