// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class StatisticalDataDTO extends TeaModel {
    // 项目标识
    /**
     * <strong>example:</strong>
     * <p>2026072000000138312001</p>
     */
    @NameInMap("project")
    @Validation(required = true)
    public String project;

    // 统计维度id
    /**
     * <strong>example:</strong>
     * <p>2026072000000138312001</p>
     */
    @NameInMap("dimension_id")
    @Validation(required = true)
    public String dimensionId;

    // 时间维度
    /**
     * <strong>example:</strong>
     * <p>hour</p>
     */
    @NameInMap("time_period")
    @Validation(required = true)
    public String timePeriod;

    // 开始时间
    /**
     * <strong>example:</strong>
     * <p>yyyy-MM-dd HH:mm</p>
     */
    @NameInMap("start_time")
    @Validation(required = true)
    public String startTime;

    // 结束时间
    /**
     * <strong>example:</strong>
     * <p>yyyy-MM-dd HH:mm</p>
     */
    @NameInMap("end_time")
    @Validation(required = true)
    public String endTime;

    // 花费金额
    /**
     * <strong>example:</strong>
     * <p>6666.66</p>
     */
    @NameInMap("cost_money")
    @Validation(required = true)
    public String costMoney;

    // 曝光量
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("media_impression_count")
    @Validation(required = true)
    public Long mediaImpressionCount;

    // 点击量
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("media_click_count")
    @Validation(required = true)
    public Long mediaClickCount;

    // 目标转化量相关数据
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("conversion_data_list")
    @Validation(required = true)
    public ConversionDataDTO conversionDataList;

    public static StatisticalDataDTO build(java.util.Map<String, ?> map) throws Exception {
        StatisticalDataDTO self = new StatisticalDataDTO();
        return TeaModel.build(map, self);
    }

    public StatisticalDataDTO setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public StatisticalDataDTO setDimensionId(String dimensionId) {
        this.dimensionId = dimensionId;
        return this;
    }
    public String getDimensionId() {
        return this.dimensionId;
    }

    public StatisticalDataDTO setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }
    public String getTimePeriod() {
        return this.timePeriod;
    }

    public StatisticalDataDTO setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public StatisticalDataDTO setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public StatisticalDataDTO setCostMoney(String costMoney) {
        this.costMoney = costMoney;
        return this;
    }
    public String getCostMoney() {
        return this.costMoney;
    }

    public StatisticalDataDTO setMediaImpressionCount(Long mediaImpressionCount) {
        this.mediaImpressionCount = mediaImpressionCount;
        return this;
    }
    public Long getMediaImpressionCount() {
        return this.mediaImpressionCount;
    }

    public StatisticalDataDTO setMediaClickCount(Long mediaClickCount) {
        this.mediaClickCount = mediaClickCount;
        return this;
    }
    public Long getMediaClickCount() {
        return this.mediaClickCount;
    }

    public StatisticalDataDTO setConversionDataList(ConversionDataDTO conversionDataList) {
        this.conversionDataList = conversionDataList;
        return this;
    }
    public ConversionDataDTO getConversionDataList() {
        return this.conversionDataList;
    }

}
