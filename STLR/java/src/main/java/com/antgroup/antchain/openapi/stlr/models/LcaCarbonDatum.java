// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class LcaCarbonDatum extends TeaModel {
    // LCA碳排放总量
    /**
     * <strong>example:</strong>
     * <p>2323.22</p>
     */
    @NameInMap("lca_carbon_amount")
    @Validation(required = true)
    public String lcaCarbonAmount;

    // 足迹报告pdf文件下载地址（30分钟内下载有效）
    /**
     * <strong>example:</strong>
     * <p><a href="http://oss.com/lca/lca_report.pdf">http://oss.com/lca/lca_report.pdf</a></p>
     */
    @NameInMap("lca_report_file_url")
    @Validation(required = true)
    public String lcaReportFileUrl;

    // 足迹分析结果详情文件地址（30分钟内下载有效）
    /**
     * <strong>example:</strong>
     * <p><a href="http://oss.com/lca/lca_detail.pdf">http://oss.com/lca/lca_detail.pdf</a></p>
     */
    @NameInMap("lca_detail_file_url")
    @Validation(required = true)
    public String lcaDetailFileUrl;

    // B2B-从摇篮到大门，B2C-从摇篮到坟墓
    /**
     * <strong>example:</strong>
     * <p>B2B</p>
     */
    @NameInMap("life_cycle_boundary")
    @Validation(required = true)
    public String lifeCycleBoundary;

    // 足迹开始时间，格式：yyyyMMdd
    /**
     * <strong>example:</strong>
     * <p>20231223</p>
     */
    @NameInMap("lca_start_date")
    @Validation(required = true)
    public String lcaStartDate;

    // 足迹结束时间 格式：yyyyMMdd
    /**
     * <strong>example:</strong>
     * <p>20231202</p>
     */
    @NameInMap("lca_end_date")
    @Validation(required = true)
    public String lcaEndDate;

    // 分阶段碳排放量列表
    @NameInMap("lca_stage_carbon_datum")
    @Validation(required = true)
    public java.util.List<LcaStageCarbonItem> lcaStageCarbonDatum;

    public static LcaCarbonDatum build(java.util.Map<String, ?> map) throws Exception {
        LcaCarbonDatum self = new LcaCarbonDatum();
        return TeaModel.build(map, self);
    }

    public LcaCarbonDatum setLcaCarbonAmount(String lcaCarbonAmount) {
        this.lcaCarbonAmount = lcaCarbonAmount;
        return this;
    }
    public String getLcaCarbonAmount() {
        return this.lcaCarbonAmount;
    }

    public LcaCarbonDatum setLcaReportFileUrl(String lcaReportFileUrl) {
        this.lcaReportFileUrl = lcaReportFileUrl;
        return this;
    }
    public String getLcaReportFileUrl() {
        return this.lcaReportFileUrl;
    }

    public LcaCarbonDatum setLcaDetailFileUrl(String lcaDetailFileUrl) {
        this.lcaDetailFileUrl = lcaDetailFileUrl;
        return this;
    }
    public String getLcaDetailFileUrl() {
        return this.lcaDetailFileUrl;
    }

    public LcaCarbonDatum setLifeCycleBoundary(String lifeCycleBoundary) {
        this.lifeCycleBoundary = lifeCycleBoundary;
        return this;
    }
    public String getLifeCycleBoundary() {
        return this.lifeCycleBoundary;
    }

    public LcaCarbonDatum setLcaStartDate(String lcaStartDate) {
        this.lcaStartDate = lcaStartDate;
        return this;
    }
    public String getLcaStartDate() {
        return this.lcaStartDate;
    }

    public LcaCarbonDatum setLcaEndDate(String lcaEndDate) {
        this.lcaEndDate = lcaEndDate;
        return this;
    }
    public String getLcaEndDate() {
        return this.lcaEndDate;
    }

    public LcaCarbonDatum setLcaStageCarbonDatum(java.util.List<LcaStageCarbonItem> lcaStageCarbonDatum) {
        this.lcaStageCarbonDatum = lcaStageCarbonDatum;
        return this;
    }
    public java.util.List<LcaStageCarbonItem> getLcaStageCarbonDatum() {
        return this.lcaStageCarbonDatum;
    }

}
