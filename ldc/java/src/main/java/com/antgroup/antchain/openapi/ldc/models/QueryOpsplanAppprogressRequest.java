// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryOpsplanAppprogressRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 应用id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 运维单id
    @NameInMap("time_series_id")
    public String timeSeriesId;

    // 批次stage的id
    @NameInMap("stage_id")
    public String stageId;

    // [huanyu场景使用] 是否需要返回affected_cell_pods
    @NameInMap("need_export_cell_pods")
    public Boolean needExportCellPods;

    // [huanyu场景使用] 返回给opscloud的变更对象类型。如果为NONE，则不返回变更对象信息
    @NameInMap("opscloud_change_target_type")
    public String opscloudChangeTargetType;

    public static QueryOpsplanAppprogressRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOpsplanAppprogressRequest self = new QueryOpsplanAppprogressRequest();
        return TeaModel.build(map, self);
    }

    public QueryOpsplanAppprogressRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryOpsplanAppprogressRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryOpsplanAppprogressRequest setTimeSeriesId(String timeSeriesId) {
        this.timeSeriesId = timeSeriesId;
        return this;
    }
    public String getTimeSeriesId() {
        return this.timeSeriesId;
    }

    public QueryOpsplanAppprogressRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

    public QueryOpsplanAppprogressRequest setNeedExportCellPods(Boolean needExportCellPods) {
        this.needExportCellPods = needExportCellPods;
        return this;
    }
    public Boolean getNeedExportCellPods() {
        return this.needExportCellPods;
    }

    public QueryOpsplanAppprogressRequest setOpscloudChangeTargetType(String opscloudChangeTargetType) {
        this.opscloudChangeTargetType = opscloudChangeTargetType;
        return this;
    }
    public String getOpscloudChangeTargetType() {
        return this.opscloudChangeTargetType;
    }

}
