// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BaiGoodsIdentificationRespData extends TeaModel {
    // 鉴定结果
    // REAL：鉴定为真
    // FAKE：鉴定为假
    // UNABLE_IDENTIFY：无法鉴定
    @NameInMap("identification_result")
    @Validation(required = true)
    public String identificationResult;

    // 整体鉴定分数
    @NameInMap("grade")
    @Validation(required = true)
    public String grade;

    // 整体鉴定报告描述
    @NameInMap("description")
    public String description;

    // 鉴定点鉴定结果列表
    @NameInMap("point_identification_results")
    @Validation(required = true)
    public java.util.List<BaiGoodsPointIdentificationResult> pointIdentificationResults;

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

}
