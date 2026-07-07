// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class SubmitEcarLcaassementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单编号，碳矩阵关联的订单编号，业务主键
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // LCA产品评估状态，返回约定的状态编码
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 项目摘要信息，包括有关产品详情和报告时间等，JSON格式，按照约定的格式解析成碳矩阵对应的碳足迹项目和产品信息
    @NameInMap("project_summary")
    public String projectSummary;

    // 产品工序数据，JSON格式，按照约定的格式解析成碳矩阵对应的工序信息
    @NameInMap("process_datum")
    public String processDatum;

    // 碳足迹评估结果数据，JSON格式，按照约定的格式解析成碳矩阵对应的评估结果
    @NameInMap("assement_result")
    public String assementResult;

    // 碳足迹评估报告，包括一些报告文件地址等，JSON格式，碳矩阵下载保存对应的报告文件
    @NameInMap("assement_report")
    public String assementReport;

    // 扩展信息，JSON格式，预留需提交的数据
    @NameInMap("extra_datum")
    public String extraDatum;

    public static SubmitEcarLcaassementRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitEcarLcaassementRequest self = new SubmitEcarLcaassementRequest();
        return TeaModel.build(map, self);
    }

    public SubmitEcarLcaassementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitEcarLcaassementRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitEcarLcaassementRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public SubmitEcarLcaassementRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SubmitEcarLcaassementRequest setProjectSummary(String projectSummary) {
        this.projectSummary = projectSummary;
        return this;
    }
    public String getProjectSummary() {
        return this.projectSummary;
    }

    public SubmitEcarLcaassementRequest setProcessDatum(String processDatum) {
        this.processDatum = processDatum;
        return this;
    }
    public String getProcessDatum() {
        return this.processDatum;
    }

    public SubmitEcarLcaassementRequest setAssementResult(String assementResult) {
        this.assementResult = assementResult;
        return this;
    }
    public String getAssementResult() {
        return this.assementResult;
    }

    public SubmitEcarLcaassementRequest setAssementReport(String assementReport) {
        this.assementReport = assementReport;
        return this;
    }
    public String getAssementReport() {
        return this.assementReport;
    }

    public SubmitEcarLcaassementRequest setExtraDatum(String extraDatum) {
        this.extraDatum = extraDatum;
        return this;
    }
    public String getExtraDatum() {
        return this.extraDatum;
    }

}
