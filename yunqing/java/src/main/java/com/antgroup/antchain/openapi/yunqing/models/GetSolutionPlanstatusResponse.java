// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class GetSolutionPlanstatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否完成规划
    @NameInMap("all_plan_confirmed")
    public Boolean allPlanConfirmed;

    // sidecar规划状态
    @NameInMap("sidecar_plan_status")
    public String sidecarPlanStatus;

    // 持久化存储规划状态
    @NameInMap("persistent_volume_plan_status")
    public String persistentVolumePlanStatus;

    // 数据库规划状态
    // 
    @NameInMap("db_plan_status")
    public String dbPlanStatus;

    // 负载均衡规划
    @NameInMap("lb_plan_status")
    public String lbPlanStatus;

    // 应用配置规划状态
    @NameInMap("app_deploy_spec_status")
    public String appDeploySpecStatus;

    // 解决方案检查项结果
    @NameInMap("check_point")
    public java.util.List<CheckPoint> checkPoint;

    public static GetSolutionPlanstatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSolutionPlanstatusResponse self = new GetSolutionPlanstatusResponse();
        return TeaModel.build(map, self);
    }

    public GetSolutionPlanstatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetSolutionPlanstatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetSolutionPlanstatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetSolutionPlanstatusResponse setAllPlanConfirmed(Boolean allPlanConfirmed) {
        this.allPlanConfirmed = allPlanConfirmed;
        return this;
    }
    public Boolean getAllPlanConfirmed() {
        return this.allPlanConfirmed;
    }

    public GetSolutionPlanstatusResponse setSidecarPlanStatus(String sidecarPlanStatus) {
        this.sidecarPlanStatus = sidecarPlanStatus;
        return this;
    }
    public String getSidecarPlanStatus() {
        return this.sidecarPlanStatus;
    }

    public GetSolutionPlanstatusResponse setPersistentVolumePlanStatus(String persistentVolumePlanStatus) {
        this.persistentVolumePlanStatus = persistentVolumePlanStatus;
        return this;
    }
    public String getPersistentVolumePlanStatus() {
        return this.persistentVolumePlanStatus;
    }

    public GetSolutionPlanstatusResponse setDbPlanStatus(String dbPlanStatus) {
        this.dbPlanStatus = dbPlanStatus;
        return this;
    }
    public String getDbPlanStatus() {
        return this.dbPlanStatus;
    }

    public GetSolutionPlanstatusResponse setLbPlanStatus(String lbPlanStatus) {
        this.lbPlanStatus = lbPlanStatus;
        return this;
    }
    public String getLbPlanStatus() {
        return this.lbPlanStatus;
    }

    public GetSolutionPlanstatusResponse setAppDeploySpecStatus(String appDeploySpecStatus) {
        this.appDeploySpecStatus = appDeploySpecStatus;
        return this;
    }
    public String getAppDeploySpecStatus() {
        return this.appDeploySpecStatus;
    }

    public GetSolutionPlanstatusResponse setCheckPoint(java.util.List<CheckPoint> checkPoint) {
        this.checkPoint = checkPoint;
        return this;
    }
    public java.util.List<CheckPoint> getCheckPoint() {
        return this.checkPoint;
    }

}
