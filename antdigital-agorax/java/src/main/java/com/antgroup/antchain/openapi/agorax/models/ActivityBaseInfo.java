// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class ActivityBaseInfo extends TeaModel {
    // 活动ID
    /**
     * <strong>example:</strong>
     * <p>110000199001011234</p>
     */
    @NameInMap("activity_id")
    @Validation(required = true)
    public String activityId;

    // 活动名称
    /**
     * <strong>example:</strong>
     * <p>xx面馆活动</p>
     */
    @NameInMap("activity_name")
    public String activityName;

    // 活动状态
    /**
     * <strong>example:</strong>
     * <p>CAMP_CREATED</p>
     */
    @NameInMap("activity_status")
    public String activityStatus;

    // 平台类型
    /**
     * <strong>example:</strong>
     * <p>PLATFORM</p>
     */
    @NameInMap("platform_type")
    public String platformType;

    // 活动开始时间
    /**
     * <strong>example:</strong>
     * <p>yyyy-MM-dd HH:mm:ss</p>
     */
    @NameInMap("publish_start_time")
    public String publishStartTime;

    // 活动结束时间
    /**
     * <strong>example:</strong>
     * <p>yyyy-MM-dd HH:mm:ss</p>
     */
    @NameInMap("publish_end_time")
    public String publishEndTime;

    public static ActivityBaseInfo build(java.util.Map<String, ?> map) throws Exception {
        ActivityBaseInfo self = new ActivityBaseInfo();
        return TeaModel.build(map, self);
    }

    public ActivityBaseInfo setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

    public ActivityBaseInfo setActivityName(String activityName) {
        this.activityName = activityName;
        return this;
    }
    public String getActivityName() {
        return this.activityName;
    }

    public ActivityBaseInfo setActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus;
        return this;
    }
    public String getActivityStatus() {
        return this.activityStatus;
    }

    public ActivityBaseInfo setPlatformType(String platformType) {
        this.platformType = platformType;
        return this;
    }
    public String getPlatformType() {
        return this.platformType;
    }

    public ActivityBaseInfo setPublishStartTime(String publishStartTime) {
        this.publishStartTime = publishStartTime;
        return this;
    }
    public String getPublishStartTime() {
        return this.publishStartTime;
    }

    public ActivityBaseInfo setPublishEndTime(String publishEndTime) {
        this.publishEndTime = publishEndTime;
        return this;
    }
    public String getPublishEndTime() {
        return this.publishEndTime;
    }

}
