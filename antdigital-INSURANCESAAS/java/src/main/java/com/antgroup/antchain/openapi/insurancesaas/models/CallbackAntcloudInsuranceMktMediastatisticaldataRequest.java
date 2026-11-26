// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurancesaas.models;

import com.aliyun.tea.*;

public class CallbackAntcloudInsuranceMktMediastatisticaldataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求id
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 项目id
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 数据渠道来源，广点通(gdt) / 巨量引擎(oceanengine) / 快手(kuaishou) / 百度(baidu)
    @NameInMap("media_source")
    @Validation(required = true)
    public String mediaSource;

    // 统计维度，区分账号（ACCOUNT） 、广告计划(ADVERTISEMENT) 、 素材（MATERIAL）
    @NameInMap("dimension")
    @Validation(required = true)
    public String dimension;

    // 统计数据
    @NameInMap("statistical_data_list")
    @Validation(required = true)
    public java.util.List<StatisticalDataDTO> statisticalDataList;

    public static CallbackAntcloudInsuranceMktMediastatisticaldataRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackAntcloudInsuranceMktMediastatisticaldataRequest self = new CallbackAntcloudInsuranceMktMediastatisticaldataRequest();
        return TeaModel.build(map, self);
    }

    public CallbackAntcloudInsuranceMktMediastatisticaldataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackAntcloudInsuranceMktMediastatisticaldataRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CallbackAntcloudInsuranceMktMediastatisticaldataRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CallbackAntcloudInsuranceMktMediastatisticaldataRequest setMediaSource(String mediaSource) {
        this.mediaSource = mediaSource;
        return this;
    }
    public String getMediaSource() {
        return this.mediaSource;
    }

    public CallbackAntcloudInsuranceMktMediastatisticaldataRequest setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }
    public String getDimension() {
        return this.dimension;
    }

    public CallbackAntcloudInsuranceMktMediastatisticaldataRequest setStatisticalDataList(java.util.List<StatisticalDataDTO> statisticalDataList) {
        this.statisticalDataList = statisticalDataList;
        return this;
    }
    public java.util.List<StatisticalDataDTO> getStatisticalDataList() {
        return this.statisticalDataList;
    }

}
