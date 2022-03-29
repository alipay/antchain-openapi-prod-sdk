// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class DeleteAlarmDingdingrobotRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作区名
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 要删除的机器人列表
    @NameInMap("robots")
    @Validation(required = true)
    public java.util.List<DingDingRobot> robots;

    public static DeleteAlarmDingdingrobotRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlarmDingdingrobotRequest self = new DeleteAlarmDingdingrobotRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlarmDingdingrobotRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteAlarmDingdingrobotRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public DeleteAlarmDingdingrobotRequest setRobots(java.util.List<DingDingRobot> robots) {
        this.robots = robots;
        return this;
    }
    public java.util.List<DingDingRobot> getRobots() {
        return this.robots;
    }

}
