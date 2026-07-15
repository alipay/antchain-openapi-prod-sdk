// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class List extends TeaModel {
    // 记录ID
    /**
     * <strong>example:</strong>
     * <p>1100034</p>
     */
    @NameInMap("id")
    public Long id;

    // 活动ID
    /**
     * <strong>example:</strong>
     * <p>1100001911234</p>
     */
    @NameInMap("activity_id")
    public String activityId;

    // 活动名称
    /**
     * <strong>example:</strong>
     * <p>xx面馆活动</p>
     */
    @NameInMap("activity_name")
    public String activityName;

    // 用户ID
    /**
     * <strong>example:</strong>
     * <p>2088000098761234</p>
     */
    @NameInMap("user_id")
    public String userId;

    // 业务ID
    /**
     * <strong>example:</strong>
     * <p>110001011234</p>
     */
    @NameInMap("biz_id")
    public String bizId;

    // 记录来源：NORMAL（正常发券）/ HAITUN_SYNC（上游补录）
    /**
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("record_source")
    public String recordSource;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>yyyy-MM-dd HH:mm:ss</p>
     */
    @NameInMap("gmt_create")
    public String gmtCreate;

    // 更新时间
    /**
     * <strong>example:</strong>
     * <p>yyyy-MM-dd HH:mm:ss</p>
     */
    @NameInMap("gmt_modified")
    public String gmtModified;

    public static List build(java.util.Map<String, ?> map) throws Exception {
        List self = new List();
        return TeaModel.build(map, self);
    }

    public List setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public List setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

    public List setActivityName(String activityName) {
        this.activityName = activityName;
        return this;
    }
    public String getActivityName() {
        return this.activityName;
    }

    public List setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public List setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public List setRecordSource(String recordSource) {
        this.recordSource = recordSource;
        return this;
    }
    public String getRecordSource() {
        return this.recordSource;
    }

    public List setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public List setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

}
