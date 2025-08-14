// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class ProjectPerformance extends TeaModel {
    // 项目ID
    /**
     * <strong>example:</strong>
     * <p>7757b03c0ed947409bdf142e572df93f</p>
     */
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 项目净值
    /**
     * <strong>example:</strong>
     * <p>3.14</p>
     */
    @NameInMap("net_value")
    @Validation(required = true)
    public String netValue;

    // 币种(目前支持USD、HKD)
    /**
     * <strong>example:</strong>
     * <p>HKD</p>
     */
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    // 净值更新时间戳
    /**
     * <strong>example:</strong>
     * <p>1726024364000</p>
     */
    @NameInMap("update_time")
    @Validation(required = true)
    public Long updateTime;

    public static ProjectPerformance build(java.util.Map<String, ?> map) throws Exception {
        ProjectPerformance self = new ProjectPerformance();
        return TeaModel.build(map, self);
    }

    public ProjectPerformance setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ProjectPerformance setNetValue(String netValue) {
        this.netValue = netValue;
        return this;
    }
    public String getNetValue() {
        return this.netValue;
    }

    public ProjectPerformance setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public ProjectPerformance setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

}
