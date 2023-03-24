// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commonrcsmart.models;

import com.aliyun.tea.*;

public class ImageApprovalResultVO extends TeaModel {
    // 机审结果
    @NameInMap("result")
    @Validation(required = true)
    public String result;

    // 图片审核结果的url
    @NameInMap("result_url")
    public String resultUrl;

    // 审核结果详情
    @NameInMap("risk_detail_vo_list")
    public java.util.List<ContentRiskDetailVO> riskDetailVoList;

    public static ImageApprovalResultVO build(java.util.Map<String, ?> map) throws Exception {
        ImageApprovalResultVO self = new ImageApprovalResultVO();
        return TeaModel.build(map, self);
    }

    public ImageApprovalResultVO setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public ImageApprovalResultVO setResultUrl(String resultUrl) {
        this.resultUrl = resultUrl;
        return this;
    }
    public String getResultUrl() {
        return this.resultUrl;
    }

    public ImageApprovalResultVO setRiskDetailVoList(java.util.List<ContentRiskDetailVO> riskDetailVoList) {
        this.riskDetailVoList = riskDetailVoList;
        return this;
    }
    public java.util.List<ContentRiskDetailVO> getRiskDetailVoList() {
        return this.riskDetailVoList;
    }

}
