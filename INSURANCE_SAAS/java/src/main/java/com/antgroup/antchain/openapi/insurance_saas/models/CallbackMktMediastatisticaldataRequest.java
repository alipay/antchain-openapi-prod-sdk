// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class CallbackMktMediastatisticaldataRequest extends TeaModel {
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
    public String statisticalDataList;

    public static CallbackMktMediastatisticaldataRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackMktMediastatisticaldataRequest self = new CallbackMktMediastatisticaldataRequest();
        return TeaModel.build(map, self);
    }

    public CallbackMktMediastatisticaldataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackMktMediastatisticaldataRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CallbackMktMediastatisticaldataRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CallbackMktMediastatisticaldataRequest setMediaSource(String mediaSource) {
        this.mediaSource = mediaSource;
        return this;
    }
    public String getMediaSource() {
        return this.mediaSource;
    }

    public CallbackMktMediastatisticaldataRequest setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }
    public String getDimension() {
        return this.dimension;
    }

    public CallbackMktMediastatisticaldataRequest setStatisticalDataList(String statisticalDataList) {
        this.statisticalDataList = statisticalDataList;
        return this;
    }
    public String getStatisticalDataList() {
        return this.statisticalDataList;
    }

}
