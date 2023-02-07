// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppPortraitActionTrailQuery extends TeaModel {
    // 操作时间
    @NameInMap("actiontrail_timestamp")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String actiontrailTimestamp;

    // 状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 发布单id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 应用服务
    @NameInMap("app_service")
    @Validation(required = true)
    public String appService;

    // 操作内容
    @NameInMap("operate_type")
    @Validation(required = true)
    public String operateType;

    // 执行人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    public static AppPortraitActionTrailQuery build(java.util.Map<String, ?> map) throws Exception {
        AppPortraitActionTrailQuery self = new AppPortraitActionTrailQuery();
        return TeaModel.build(map, self);
    }

    public AppPortraitActionTrailQuery setActiontrailTimestamp(String actiontrailTimestamp) {
        this.actiontrailTimestamp = actiontrailTimestamp;
        return this;
    }
    public String getActiontrailTimestamp() {
        return this.actiontrailTimestamp;
    }

    public AppPortraitActionTrailQuery setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AppPortraitActionTrailQuery setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AppPortraitActionTrailQuery setAppService(String appService) {
        this.appService = appService;
        return this;
    }
    public String getAppService() {
        return this.appService;
    }

    public AppPortraitActionTrailQuery setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public AppPortraitActionTrailQuery setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
