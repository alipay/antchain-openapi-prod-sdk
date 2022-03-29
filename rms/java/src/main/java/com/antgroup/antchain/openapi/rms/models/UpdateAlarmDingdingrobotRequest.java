// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UpdateAlarmDingdingrobotRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作区名
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 更新的机器人清单
    @NameInMap("robots")
    @Validation(required = true)
    public java.util.List<DingDingRobot> robots;

    public static UpdateAlarmDingdingrobotRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlarmDingdingrobotRequest self = new UpdateAlarmDingdingrobotRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlarmDingdingrobotRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAlarmDingdingrobotRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public UpdateAlarmDingdingrobotRequest setRobots(java.util.List<DingDingRobot> robots) {
        this.robots = robots;
        return this;
    }
    public java.util.List<DingDingRobot> getRobots() {
        return this.robots;
    }

}
