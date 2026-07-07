// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class AddEcarGreenoperationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 绿色行为类型，目前支持包括：
    // ElectronicInvoice(电子发票), 
    // LowCarbonCommodity(低碳商品), 
    // ReusableBag(环保减塑)
    // OfflinePayment(线下支付)
    // GreenOrder(绿色订单，可以同时解析出低碳商品、环保减塑、线下支付等多种绿色行为)
    @NameInMap("green_operation_type")
    @Validation(required = true)
    public String greenOperationType;

    // 绿色行为相关的业务单号
    @NameInMap("enterprise_biz_no")
    @Validation(required = true)
    public String enterpriseBizNo;

    // 发生时间，格式应如：2021-07-21 12:11:11
    @NameInMap("occurrence_time")
    @Validation(required = true)
    public String occurrenceTime;

    // 绿色行为数据扩展信息，必须为JSON格式，碳矩阵将分析解析数据检查获取相关的绿色行为数据
    @NameInMap("ext_info")
    public String extInfo;

    public static AddEcarGreenoperationRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEcarGreenoperationRequest self = new AddEcarGreenoperationRequest();
        return TeaModel.build(map, self);
    }

    public AddEcarGreenoperationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddEcarGreenoperationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddEcarGreenoperationRequest setGreenOperationType(String greenOperationType) {
        this.greenOperationType = greenOperationType;
        return this;
    }
    public String getGreenOperationType() {
        return this.greenOperationType;
    }

    public AddEcarGreenoperationRequest setEnterpriseBizNo(String enterpriseBizNo) {
        this.enterpriseBizNo = enterpriseBizNo;
        return this;
    }
    public String getEnterpriseBizNo() {
        return this.enterpriseBizNo;
    }

    public AddEcarGreenoperationRequest setOccurrenceTime(String occurrenceTime) {
        this.occurrenceTime = occurrenceTime;
        return this;
    }
    public String getOccurrenceTime() {
        return this.occurrenceTime;
    }

    public AddEcarGreenoperationRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
