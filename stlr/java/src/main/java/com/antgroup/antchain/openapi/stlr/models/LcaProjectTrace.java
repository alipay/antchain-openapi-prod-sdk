// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class LcaProjectTrace extends TeaModel {
    // 碳足迹编码
    /**
     * <strong>example:</strong>
     * <p>project_no</p>
     */
    @NameInMap("project_no")
    @Validation(required = true)
    public String projectNo;

    // 碳足迹生命周期边界
    /**
     * <strong>example:</strong>
     * <p>life_cycle_boundary</p>
     */
    @NameInMap("life_cycle_boundary")
    @Validation(required = true)
    public String lifeCycleBoundary;

    // 产品编码
    /**
     * <strong>example:</strong>
     * <p>product_no</p>
     */
    @NameInMap("product_no")
    @Validation(required = true)
    public String productNo;

    // 碳足迹项目排放量
    /**
     * <strong>example:</strong>
     * <p>lca_carbon_amount</p>
     */
    @NameInMap("lca_carbon_amount")
    @Validation(required = true)
    public String lcaCarbonAmount;

    // 产品名称
    /**
     * <strong>example:</strong>
     * <p>product_name</p>
     */
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    // 产品规格型号
    /**
     * <strong>example:</strong>
     * <p>specification</p>
     */
    @NameInMap("specification")
    @Validation(required = true)
    public String specification;

    // 碳足迹开始时间
    /**
     * <strong>example:</strong>
     * <p>lca_start_date</p>
     */
    @NameInMap("lca_start_date")
    @Validation(required = true)
    public String lcaStartDate;

    // 碳足迹结束时间
    /**
     * <strong>example:</strong>
     * <p>lca_end_date</p>
     */
    @NameInMap("lca_end_date")
    @Validation(required = true)
    public String lcaEndDate;

    // 溯源状态
    /**
     * <strong>example:</strong>
     * <p>trace_status</p>
     */
    @NameInMap("trace_status")
    @Validation(required = true)
    public String traceStatus;

    public static LcaProjectTrace build(java.util.Map<String, ?> map) throws Exception {
        LcaProjectTrace self = new LcaProjectTrace();
        return TeaModel.build(map, self);
    }

    public LcaProjectTrace setProjectNo(String projectNo) {
        this.projectNo = projectNo;
        return this;
    }
    public String getProjectNo() {
        return this.projectNo;
    }

    public LcaProjectTrace setLifeCycleBoundary(String lifeCycleBoundary) {
        this.lifeCycleBoundary = lifeCycleBoundary;
        return this;
    }
    public String getLifeCycleBoundary() {
        return this.lifeCycleBoundary;
    }

    public LcaProjectTrace setProductNo(String productNo) {
        this.productNo = productNo;
        return this;
    }
    public String getProductNo() {
        return this.productNo;
    }

    public LcaProjectTrace setLcaCarbonAmount(String lcaCarbonAmount) {
        this.lcaCarbonAmount = lcaCarbonAmount;
        return this;
    }
    public String getLcaCarbonAmount() {
        return this.lcaCarbonAmount;
    }

    public LcaProjectTrace setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public LcaProjectTrace setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public LcaProjectTrace setLcaStartDate(String lcaStartDate) {
        this.lcaStartDate = lcaStartDate;
        return this;
    }
    public String getLcaStartDate() {
        return this.lcaStartDate;
    }

    public LcaProjectTrace setLcaEndDate(String lcaEndDate) {
        this.lcaEndDate = lcaEndDate;
        return this;
    }
    public String getLcaEndDate() {
        return this.lcaEndDate;
    }

    public LcaProjectTrace setTraceStatus(String traceStatus) {
        this.traceStatus = traceStatus;
        return this;
    }
    public String getTraceStatus() {
        return this.traceStatus;
    }

}
