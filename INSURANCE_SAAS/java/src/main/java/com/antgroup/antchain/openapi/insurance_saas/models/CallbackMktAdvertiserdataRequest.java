// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class CallbackMktAdvertiserdataRequest extends TeaModel {
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

    // 来源
    @NameInMap("media_source")
    @Validation(required = true)
    public String mediaSource;

    // 统计维度，区分账号 、广告计划 、 素材
    @NameInMap("dimension")
    @Validation(required = true)
    public String dimension;

    // 批次数据
    @NameInMap("advertiser_data_list")
    @Validation(required = true)
    public String advertiserDataList;

    public static CallbackMktAdvertiserdataRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackMktAdvertiserdataRequest self = new CallbackMktAdvertiserdataRequest();
        return TeaModel.build(map, self);
    }

    public CallbackMktAdvertiserdataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackMktAdvertiserdataRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CallbackMktAdvertiserdataRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CallbackMktAdvertiserdataRequest setMediaSource(String mediaSource) {
        this.mediaSource = mediaSource;
        return this;
    }
    public String getMediaSource() {
        return this.mediaSource;
    }

    public CallbackMktAdvertiserdataRequest setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }
    public String getDimension() {
        return this.dimension;
    }

    public CallbackMktAdvertiserdataRequest setAdvertiserDataList(String advertiserDataList) {
        this.advertiserDataList = advertiserDataList;
        return this;
    }
    public String getAdvertiserDataList() {
        return this.advertiserDataList;
    }

}
