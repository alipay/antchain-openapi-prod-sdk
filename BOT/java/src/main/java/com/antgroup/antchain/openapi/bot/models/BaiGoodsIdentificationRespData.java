// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BaiGoodsIdentificationRespData extends TeaModel {
    // 鉴定结果
    // REAL：鉴定为真
    // FAKE：鉴定为假
    // UNABLE_IDENTIFY：无法鉴定
    /**
     * <strong>example:</strong>
     * <p>REAL</p>
     */
    @NameInMap("identification_result")
    @Validation(required = true)
    public String identificationResult;

    // 整体鉴定分数
    /**
     * <strong>example:</strong>
     * <p>0.99</p>
     */
    @NameInMap("grade")
    @Validation(required = true)
    public String grade;

    // 整体鉴定报告描述
    /**
     * <strong>example:</strong>
     * <p>AI鉴定成功</p>
     */
    @NameInMap("description")
    public String description;

    // 鉴定点鉴定结果列表
    @NameInMap("point_identification_results")
    @Validation(required = true)
    public java.util.List<BaiGoodsPointIdentificationResult> pointIdentificationResults;

    // 鉴定评价
    /**
     * <strong>example:</strong>
     * <p>完全同一，趋于同一，和不同一</p>
     */
    @NameInMap("appraise_message")
    public String appraiseMessage;

    // 用户自定义字符串，系统不做处理，会在响应体中带回
    /**
     * <strong>example:</strong>
     * <p>state</p>
     */
    @NameInMap("out_state")
    public String outState;

    public static BaiGoodsIdentificationRespData build(java.util.Map<String, ?> map) throws Exception {
        BaiGoodsIdentificationRespData self = new BaiGoodsIdentificationRespData();
        return TeaModel.build(map, self);
    }

    public BaiGoodsIdentificationRespData setIdentificationResult(String identificationResult) {
        this.identificationResult = identificationResult;
        return this;
    }
    public String getIdentificationResult() {
        return this.identificationResult;
    }

    public BaiGoodsIdentificationRespData setGrade(String grade) {
        this.grade = grade;
        return this;
    }
    public String getGrade() {
        return this.grade;
    }

    public BaiGoodsIdentificationRespData setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public BaiGoodsIdentificationRespData setPointIdentificationResults(java.util.List<BaiGoodsPointIdentificationResult> pointIdentificationResults) {
        this.pointIdentificationResults = pointIdentificationResults;
        return this;
    }
    public java.util.List<BaiGoodsPointIdentificationResult> getPointIdentificationResults() {
        return this.pointIdentificationResults;
    }

    public BaiGoodsIdentificationRespData setAppraiseMessage(String appraiseMessage) {
        this.appraiseMessage = appraiseMessage;
        return this;
    }
    public String getAppraiseMessage() {
        return this.appraiseMessage;
    }

    public BaiGoodsIdentificationRespData setOutState(String outState) {
        this.outState = outState;
        return this;
    }
    public String getOutState() {
        return this.outState;
    }

}
