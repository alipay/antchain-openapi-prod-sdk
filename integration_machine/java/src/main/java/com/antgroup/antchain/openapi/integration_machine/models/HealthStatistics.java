// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class HealthStatistics extends TeaModel {
    // 统计日期
    @NameInMap("statistics_date")
    @Validation(required = true)
    public String statisticsDate;

    // 通行总数
    @NameInMap("total_count")
    @Validation(required = true)
    public Long totalCount;

    // 刷证数
    @NameInMap("cert_count")
    @Validation(required = true)
    public Long certCount;

    // 刷脸数
    @NameInMap("face_count")
    @Validation(required = true)
    public Long faceCount;

    // 二维码反扫数
    @NameInMap("inverse_count")
    @Validation(required = true)
    public Long inverseCount;

    // 正常通行数
    @NameInMap("pass_count")
    @Validation(required = true)
    public Long passCount;

    // 禁止通行数
    @NameInMap("stop_count")
    @Validation(required = true)
    public Long stopCount;

    public static HealthStatistics build(java.util.Map<String, ?> map) throws Exception {
        HealthStatistics self = new HealthStatistics();
        return TeaModel.build(map, self);
    }

    public HealthStatistics setStatisticsDate(String statisticsDate) {
        this.statisticsDate = statisticsDate;
        return this;
    }
    public String getStatisticsDate() {
        return this.statisticsDate;
    }

    public HealthStatistics setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public HealthStatistics setCertCount(Long certCount) {
        this.certCount = certCount;
        return this;
    }
    public Long getCertCount() {
        return this.certCount;
    }

    public HealthStatistics setFaceCount(Long faceCount) {
        this.faceCount = faceCount;
        return this;
    }
    public Long getFaceCount() {
        return this.faceCount;
    }

    public HealthStatistics setInverseCount(Long inverseCount) {
        this.inverseCount = inverseCount;
        return this;
    }
    public Long getInverseCount() {
        return this.inverseCount;
    }

    public HealthStatistics setPassCount(Long passCount) {
        this.passCount = passCount;
        return this;
    }
    public Long getPassCount() {
        return this.passCount;
    }

    public HealthStatistics setStopCount(Long stopCount) {
        this.stopCount = stopCount;
        return this;
    }
    public Long getStopCount() {
        return this.stopCount;
    }

}
