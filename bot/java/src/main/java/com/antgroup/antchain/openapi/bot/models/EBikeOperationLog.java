// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class EBikeOperationLog extends TeaModel {
    // 日志时间
    @NameInMap("time")
    @Validation(required = true)
    public String time;

    // 租户
    @NameInMap("tenant")
    @Validation(required = true)
    public String tenant;

    // 小程序应用Id
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 设备id
    @NameInMap("device_id")
    public String deviceId;

    // 操作时间
    @NameInMap("operate_time")
    @Validation(required = true)
    public String operateTime;

    // 操作描述
    @NameInMap("operate_desc")
    @Validation(required = true)
    public String operateDesc;

    // 操作是否成功
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    // 日志等级(info、warn、error)
    @NameInMap("level")
    public String level;

    public static EBikeOperationLog build(java.util.Map<String, ?> map) throws Exception {
        EBikeOperationLog self = new EBikeOperationLog();
        return TeaModel.build(map, self);
    }

    public EBikeOperationLog setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public EBikeOperationLog setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public EBikeOperationLog setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public EBikeOperationLog setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public EBikeOperationLog setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public EBikeOperationLog setOperateTime(String operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    public String getOperateTime() {
        return this.operateTime;
    }

    public EBikeOperationLog setOperateDesc(String operateDesc) {
        this.operateDesc = operateDesc;
        return this;
    }
    public String getOperateDesc() {
        return this.operateDesc;
    }

    public EBikeOperationLog setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public EBikeOperationLog setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

}
