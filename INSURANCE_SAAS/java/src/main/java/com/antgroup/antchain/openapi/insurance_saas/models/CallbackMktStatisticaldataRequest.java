// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class CallbackMktStatisticaldataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求id
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 项目ID，待蚂蚁分配
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 数据来源
    @NameInMap("media_source")
    @Validation(required = true)
    public String mediaSource;

    // 统计维度：账号（ACCOUNT） 、广告计划(ADVERTISEMENT) 、 素材（MATERIAL）
    @NameInMap("dimension")
    @Validation(required = true)
    public String dimension;

    // 统计数据
    @NameInMap("statistical_data_list")
    @Validation(required = true)
    public String statisticalDataList;

    public static CallbackMktStatisticaldataRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackMktStatisticaldataRequest self = new CallbackMktStatisticaldataRequest();
        return TeaModel.build(map, self);
    }

    public CallbackMktStatisticaldataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackMktStatisticaldataRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CallbackMktStatisticaldataRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CallbackMktStatisticaldataRequest setMediaSource(String mediaSource) {
        this.mediaSource = mediaSource;
        return this;
    }
    public String getMediaSource() {
        return this.mediaSource;
    }

    public CallbackMktStatisticaldataRequest setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }
    public String getDimension() {
        return this.dimension;
    }

    public CallbackMktStatisticaldataRequest setStatisticalDataList(String statisticalDataList) {
        this.statisticalDataList = statisticalDataList;
        return this;
    }
    public String getStatisticalDataList() {
        return this.statisticalDataList;
    }

}
