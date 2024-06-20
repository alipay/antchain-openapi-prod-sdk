// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class Alarm extends TeaModel {
    // 人工打的标签
    @NameInMap("tags")
    public java.util.List<String> tags;

    // 预警内容摘要
    @NameInMap("content")
    public String content;

    // 预警时间戳
    @NameInMap("alarm_timestamp")
    public Long alarmTimestamp;

    // 舆情项目id
    @NameInMap("project_id")
    public Long projectId;

    // 修改人
    @NameInMap("modifier_name")
    public String modifierName;

    // 消息标题
    @NameInMap("title")
    public String title;

    // 消息id
    @NameInMap("id")
    public Long id;

    // 作者名称
    @NameInMap("author_name")
    public String authorName;

    // 预警规则id
    @NameInMap("alarm_rule_id")
    public Long alarmRuleId;

    // 预警规则类型
    @NameInMap("type")
    public String type;

    // 修改时间戳
    @NameInMap("gmt_modified_timestamp")
    public Long gmtModifiedTimestamp;

    // 完整消息
    @NameInMap("message")
    public YuqingMessage message;

    // project
    @NameInMap("project_name")
    public String projectName;

    // alarm_rule_name
    @NameInMap("alarm_rule_name")
    public String alarmRuleName;

    // alarm_level
    @NameInMap("alarm_level")
    public String alarmLevel;

    // doc_media_type
    @NameInMap("doc_media_type")
    public String docMediaType;

    // status
    @NameInMap("status")
    public String status;

    public static Alarm build(java.util.Map<String, ?> map) throws Exception {
        Alarm self = new Alarm();
        return TeaModel.build(map, self);
    }

    public Alarm setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public Alarm setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public Alarm setAlarmTimestamp(Long alarmTimestamp) {
        this.alarmTimestamp = alarmTimestamp;
        return this;
    }
    public Long getAlarmTimestamp() {
        return this.alarmTimestamp;
    }

    public Alarm setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public Alarm setModifierName(String modifierName) {
        this.modifierName = modifierName;
        return this;
    }
    public String getModifierName() {
        return this.modifierName;
    }

    public Alarm setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public Alarm setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public Alarm setAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }
    public String getAuthorName() {
        return this.authorName;
    }

    public Alarm setAlarmRuleId(Long alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
        return this;
    }
    public Long getAlarmRuleId() {
        return this.alarmRuleId;
    }

    public Alarm setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Alarm setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
        this.gmtModifiedTimestamp = gmtModifiedTimestamp;
        return this;
    }
    public Long getGmtModifiedTimestamp() {
        return this.gmtModifiedTimestamp;
    }

    public Alarm setMessage(YuqingMessage message) {
        this.message = message;
        return this;
    }
    public YuqingMessage getMessage() {
        return this.message;
    }

    public Alarm setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public Alarm setAlarmRuleName(String alarmRuleName) {
        this.alarmRuleName = alarmRuleName;
        return this;
    }
    public String getAlarmRuleName() {
        return this.alarmRuleName;
    }

    public Alarm setAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }
    public String getAlarmLevel() {
        return this.alarmLevel;
    }

    public Alarm setDocMediaType(String docMediaType) {
        this.docMediaType = docMediaType;
        return this;
    }
    public String getDocMediaType() {
        return this.docMediaType;
    }

    public Alarm setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
