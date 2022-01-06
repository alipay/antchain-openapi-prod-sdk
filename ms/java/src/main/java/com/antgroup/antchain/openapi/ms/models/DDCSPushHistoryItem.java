// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class DDCSPushHistoryItem extends TeaModel {
    // 推送记录的id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 变更平台，固定值 ddcs
    @NameInMap("platform")
    public String platform;

    // 变更类型，固定值
    @NameInMap("change_type")
    public String changeType;

    // 推送标题
    @NameInMap("title")
    public String title;

    // 变更影响的应用名
    @NameInMap("influence_app")
    public String influenceApp;

    // 变更的 dataId
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 推送类型，Cluster 表示集群推送，IP 表示按机器灰度推送
    @NameInMap("push_type")
    @Validation(required = true)
    public String pushType;

    // 推送的目标。按集群推送时，AllCells 表示向所用的 cell 推送，多个Cell之间逗号隔开。
    // 按机器推送时，值为 IP列表，逗号隔开
    @NameInMap("target")
    @Validation(required = true)
    public String target;

    // 固定为 dataId 所属的 instanceId
    @NameInMap("env")
    public String env;

    // 操作人。如果是系统调用，则值为调用应用名
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 变更的起始时间，值为  1970年到现在的毫秒数，主要是为了屏蔽时区的问题。
    @NameInMap("gmt_start")
    @Validation(required = true)
    public Long gmtStart;

    // 变更的结束时间，值为  1970年到现在的毫秒数，主要是为了屏蔽时区的问题。
    @NameInMap("gmt_end")
    @Validation(required = true)
    public Long gmtEnd;

    // 推送结果
    @NameInMap("push_result")
    @Validation(required = true)
    public String pushResult;

    // 推送值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static DDCSPushHistoryItem build(java.util.Map<String, ?> map) throws Exception {
        DDCSPushHistoryItem self = new DDCSPushHistoryItem();
        return TeaModel.build(map, self);
    }

    public DDCSPushHistoryItem setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DDCSPushHistoryItem setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public DDCSPushHistoryItem setChangeType(String changeType) {
        this.changeType = changeType;
        return this;
    }
    public String getChangeType() {
        return this.changeType;
    }

    public DDCSPushHistoryItem setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public DDCSPushHistoryItem setInfluenceApp(String influenceApp) {
        this.influenceApp = influenceApp;
        return this;
    }
    public String getInfluenceApp() {
        return this.influenceApp;
    }

    public DDCSPushHistoryItem setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public DDCSPushHistoryItem setPushType(String pushType) {
        this.pushType = pushType;
        return this;
    }
    public String getPushType() {
        return this.pushType;
    }

    public DDCSPushHistoryItem setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public DDCSPushHistoryItem setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public DDCSPushHistoryItem setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public DDCSPushHistoryItem setGmtStart(Long gmtStart) {
        this.gmtStart = gmtStart;
        return this;
    }
    public Long getGmtStart() {
        return this.gmtStart;
    }

    public DDCSPushHistoryItem setGmtEnd(Long gmtEnd) {
        this.gmtEnd = gmtEnd;
        return this;
    }
    public Long getGmtEnd() {
        return this.gmtEnd;
    }

    public DDCSPushHistoryItem setPushResult(String pushResult) {
        this.pushResult = pushResult;
        return this;
    }
    public String getPushResult() {
        return this.pushResult;
    }

    public DDCSPushHistoryItem setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
