// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commonrcsmart.models;

import com.aliyun.tea.*;

public class MessageApprovalResultVO extends TeaModel {
    // 机审结果
    @NameInMap("result")
    @Validation(required = true)
    public String result;

    // 审核结果详情
    @NameInMap("risk_detail_vo_list")
    @Validation(required = true)
    public java.util.List<ContentRiskDetailVO> riskDetailVoList;

    public static MessageApprovalResultVO build(java.util.Map<String, ?> map) throws Exception {
        MessageApprovalResultVO self = new MessageApprovalResultVO();
        return TeaModel.build(map, self);
    }

    public MessageApprovalResultVO setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public MessageApprovalResultVO setRiskDetailVoList(java.util.List<ContentRiskDetailVO> riskDetailVoList) {
        this.riskDetailVoList = riskDetailVoList;
        return this;
    }
    public java.util.List<ContentRiskDetailVO> getRiskDetailVoList() {
        return this.riskDetailVoList;
    }

}
