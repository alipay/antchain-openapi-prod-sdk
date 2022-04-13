// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryOpsplanAppprogressResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 应用发布进度详情
    @NameInMap("app_deploy_progress")
    public AppDeployProgress appDeployProgress;

    // [huanyu场景使用] 查询涉及的部署单元及pod详情列表
    @NameInMap("affected_cell_pods")
    public java.util.List<AppDeployCell> affectedCellPods;

    // [huanyu场景使用] json格式的变更对象信息列表
    @NameInMap("opscloud_change_target_json_str")
    public String opscloudChangeTargetJsonStr;

    public static QueryOpsplanAppprogressResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOpsplanAppprogressResponse self = new QueryOpsplanAppprogressResponse();
        return TeaModel.build(map, self);
    }

    public QueryOpsplanAppprogressResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryOpsplanAppprogressResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOpsplanAppprogressResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryOpsplanAppprogressResponse setAppDeployProgress(AppDeployProgress appDeployProgress) {
        this.appDeployProgress = appDeployProgress;
        return this;
    }
    public AppDeployProgress getAppDeployProgress() {
        return this.appDeployProgress;
    }

    public QueryOpsplanAppprogressResponse setAffectedCellPods(java.util.List<AppDeployCell> affectedCellPods) {
        this.affectedCellPods = affectedCellPods;
        return this;
    }
    public java.util.List<AppDeployCell> getAffectedCellPods() {
        return this.affectedCellPods;
    }

    public QueryOpsplanAppprogressResponse setOpscloudChangeTargetJsonStr(String opscloudChangeTargetJsonStr) {
        this.opscloudChangeTargetJsonStr = opscloudChangeTargetJsonStr;
        return this;
    }
    public String getOpscloudChangeTargetJsonStr() {
        return this.opscloudChangeTargetJsonStr;
    }

}
