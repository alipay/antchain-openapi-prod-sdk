// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UploadIotsuccessProductSkillResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // createSkillPlugin返回插件ID
    @NameInMap("plugin_id")
    @Validation(required = true)
    public String pluginId;

    // 已解析文件名
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 已保存包版本摘要
    @NameInMap("revision")
    @Validation(required = true)
    public String revision;

    @NameInMap("skill_count")
    @Validation(required = true)
    public Long skillCount;

    @NameInMap("skills")
    @Validation(required = true)
    public java.util.List<OpenApiSkillInfo> skills;

    public static UploadIotsuccessProductSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadIotsuccessProductSkillResponse self = new UploadIotsuccessProductSkillResponse();
        return TeaModel.build(map, self);
    }

    public UploadIotsuccessProductSkillResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadIotsuccessProductSkillResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadIotsuccessProductSkillResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadIotsuccessProductSkillResponse setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public UploadIotsuccessProductSkillResponse setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadIotsuccessProductSkillResponse setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

    public UploadIotsuccessProductSkillResponse setSkillCount(Long skillCount) {
        this.skillCount = skillCount;
        return this;
    }
    public Long getSkillCount() {
        return this.skillCount;
    }

    public UploadIotsuccessProductSkillResponse setSkills(java.util.List<OpenApiSkillInfo> skills) {
        this.skills = skills;
        return this;
    }
    public java.util.List<OpenApiSkillInfo> getSkills() {
        return this.skills;
    }

}
