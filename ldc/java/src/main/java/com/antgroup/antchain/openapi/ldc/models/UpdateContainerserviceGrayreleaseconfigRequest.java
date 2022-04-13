// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateContainerserviceGrayreleaseconfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 发布单的time series id
    @NameInMap("time_series_id")
    public String timeSeriesId;

    // lks service id，与plan_id同时传时前者生效。
    @NameInMap("lks_service_id")
    public String lksServiceId;

    // 灰度规则
    @NameInMap("gray_release_config")
    @Validation(required = true)
    public GrayReleaseConfig grayReleaseConfig;

    public static UpdateContainerserviceGrayreleaseconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContainerserviceGrayreleaseconfigRequest self = new UpdateContainerserviceGrayreleaseconfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContainerserviceGrayreleaseconfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateContainerserviceGrayreleaseconfigRequest setTimeSeriesId(String timeSeriesId) {
        this.timeSeriesId = timeSeriesId;
        return this;
    }
    public String getTimeSeriesId() {
        return this.timeSeriesId;
    }

    public UpdateContainerserviceGrayreleaseconfigRequest setLksServiceId(String lksServiceId) {
        this.lksServiceId = lksServiceId;
        return this;
    }
    public String getLksServiceId() {
        return this.lksServiceId;
    }

    public UpdateContainerserviceGrayreleaseconfigRequest setGrayReleaseConfig(GrayReleaseConfig grayReleaseConfig) {
        this.grayReleaseConfig = grayReleaseConfig;
        return this;
    }
    public GrayReleaseConfig getGrayReleaseConfig() {
        return this.grayReleaseConfig;
    }

}
