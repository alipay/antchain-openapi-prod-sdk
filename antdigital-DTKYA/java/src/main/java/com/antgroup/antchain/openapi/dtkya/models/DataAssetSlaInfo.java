// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class DataAssetSlaInfo extends TeaModel {
    // 可用性等级 
    // NONE
    // TWO_NINES基础级,
    // THREE_NINES标准级,
    // THREE_NINES_FIVE高可用级,
    //  FOUR_NINES企业级,
    //  FIVE_NINES电信级
    // SIX_NINES超高可用级
    // 
    /**
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("availability_level")
    public String availabilityLevel;

    // 超时时间，单位毫秒
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("timeout_ms")
    public Long timeoutMs;

    // 服务窗口，如7x24、5x8等
    /**
     * <strong>example:</strong>
     * <p>7x24</p>
     */
    @NameInMap("service_window")
    public String serviceWindow;

    // 数据更新频率
    /**
     * <strong>example:</strong>
     * <p>数据更新频率</p>
     */
    @NameInMap("update_frequency_info")
    public DataAssetUpdateFrequencyInfo updateFrequencyInfo;

    // 平均响应时间，单位毫秒
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("avg_response_time_ms")
    public Long avgResponseTimeMs;

    // 最大响应时间，单位毫秒
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("max_response_time_ms")
    public Long maxResponseTimeMs;

    // 吞吐量，单位QPS 此处为最大支持QPS
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("support_qps")
    public String supportQps;

    // 成功率，0-1
    /**
     * <strong>example:</strong>
     * <p>0.99</p>
     */
    @NameInMap("success_rate")
    public String successRate;

    // 查得率，0-1
    /**
     * <strong>example:</strong>
     * <p>0.99</p>
     */
    @NameInMap("find_rate")
    public String findRate;

    // 关联文档列表
    /**
     * <strong>example:</strong>
     * <p>关联文档列表</p>
     */
    @NameInMap("related_document_list")
    public java.util.List<DataAssetDocumentInfo> relatedDocumentList;

    // 扩展信息，json格式
    /**
     * <strong>example:</strong>
     * <p>扩展信息，json格式</p>
     */
    @NameInMap("extend_info")
    public String extendInfo;

    public static DataAssetSlaInfo build(java.util.Map<String, ?> map) throws Exception {
        DataAssetSlaInfo self = new DataAssetSlaInfo();
        return TeaModel.build(map, self);
    }

    public DataAssetSlaInfo setAvailabilityLevel(String availabilityLevel) {
        this.availabilityLevel = availabilityLevel;
        return this;
    }
    public String getAvailabilityLevel() {
        return this.availabilityLevel;
    }

    public DataAssetSlaInfo setTimeoutMs(Long timeoutMs) {
        this.timeoutMs = timeoutMs;
        return this;
    }
    public Long getTimeoutMs() {
        return this.timeoutMs;
    }

    public DataAssetSlaInfo setServiceWindow(String serviceWindow) {
        this.serviceWindow = serviceWindow;
        return this;
    }
    public String getServiceWindow() {
        return this.serviceWindow;
    }

    public DataAssetSlaInfo setUpdateFrequencyInfo(DataAssetUpdateFrequencyInfo updateFrequencyInfo) {
        this.updateFrequencyInfo = updateFrequencyInfo;
        return this;
    }
    public DataAssetUpdateFrequencyInfo getUpdateFrequencyInfo() {
        return this.updateFrequencyInfo;
    }

    public DataAssetSlaInfo setAvgResponseTimeMs(Long avgResponseTimeMs) {
        this.avgResponseTimeMs = avgResponseTimeMs;
        return this;
    }
    public Long getAvgResponseTimeMs() {
        return this.avgResponseTimeMs;
    }

    public DataAssetSlaInfo setMaxResponseTimeMs(Long maxResponseTimeMs) {
        this.maxResponseTimeMs = maxResponseTimeMs;
        return this;
    }
    public Long getMaxResponseTimeMs() {
        return this.maxResponseTimeMs;
    }

    public DataAssetSlaInfo setSupportQps(String supportQps) {
        this.supportQps = supportQps;
        return this;
    }
    public String getSupportQps() {
        return this.supportQps;
    }

    public DataAssetSlaInfo setSuccessRate(String successRate) {
        this.successRate = successRate;
        return this;
    }
    public String getSuccessRate() {
        return this.successRate;
    }

    public DataAssetSlaInfo setFindRate(String findRate) {
        this.findRate = findRate;
        return this;
    }
    public String getFindRate() {
        return this.findRate;
    }

    public DataAssetSlaInfo setRelatedDocumentList(java.util.List<DataAssetDocumentInfo> relatedDocumentList) {
        this.relatedDocumentList = relatedDocumentList;
        return this;
    }
    public java.util.List<DataAssetDocumentInfo> getRelatedDocumentList() {
        return this.relatedDocumentList;
    }

    public DataAssetSlaInfo setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

}
