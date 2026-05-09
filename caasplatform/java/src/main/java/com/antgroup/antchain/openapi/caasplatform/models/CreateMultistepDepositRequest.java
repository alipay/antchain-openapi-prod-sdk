// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class CreateMultistepDepositRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 操作主体信息
    @NameInMap("subject")
    @Validation(required = true)
    public OperateSubject subject;

    // 业务类型，如：CONTRACT、ORDER...
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 业务流水ID（如：合同编号）
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 环节编号，需要按照字母表/数字顺序，能够进行排序处理
    @NameInMap("step_no")
    @Validation(required = true)
    public String stepNo;

    // 环节名称
    @NameInMap("step_name")
    @Validation(required = true)
    public String stepName;

    // 交易时间，yyyyMMddh24miss格式
    @NameInMap("tx_time")
    @Validation(required = true)
    public String txTime;

    // 业务详细信息，json格式，具体内容由调用方自行确定
    @NameInMap("biz_info")
    @Validation(required = true)
    public String bizInfo;

    public static CreateMultistepDepositRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMultistepDepositRequest self = new CreateMultistepDepositRequest();
        return TeaModel.build(map, self);
    }

    public CreateMultistepDepositRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateMultistepDepositRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateMultistepDepositRequest setSubject(OperateSubject subject) {
        this.subject = subject;
        return this;
    }
    public OperateSubject getSubject() {
        return this.subject;
    }

    public CreateMultistepDepositRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateMultistepDepositRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateMultistepDepositRequest setStepNo(String stepNo) {
        this.stepNo = stepNo;
        return this;
    }
    public String getStepNo() {
        return this.stepNo;
    }

    public CreateMultistepDepositRequest setStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }
    public String getStepName() {
        return this.stepName;
    }

    public CreateMultistepDepositRequest setTxTime(String txTime) {
        this.txTime = txTime;
        return this;
    }
    public String getTxTime() {
        return this.txTime;
    }

    public CreateMultistepDepositRequest setBizInfo(String bizInfo) {
        this.bizInfo = bizInfo;
        return this;
    }
    public String getBizInfo() {
        return this.bizInfo;
    }

}
