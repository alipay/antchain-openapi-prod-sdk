// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetPlanBasicRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // show_basic
    @NameInMap("show_basic")
    public Boolean showBasic;

    // time_series_id
    @NameInMap("time_series_id")
    public String timeSeriesId;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static GetPlanBasicRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPlanBasicRequest self = new GetPlanBasicRequest();
        return TeaModel.build(map, self);
    }

    public GetPlanBasicRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetPlanBasicRequest setShowBasic(Boolean showBasic) {
        this.showBasic = showBasic;
        return this;
    }
    public Boolean getShowBasic() {
        return this.showBasic;
    }

    public GetPlanBasicRequest setTimeSeriesId(String timeSeriesId) {
        this.timeSeriesId = timeSeriesId;
        return this;
    }
    public String getTimeSeriesId() {
        return this.timeSeriesId;
    }

    public GetPlanBasicRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
