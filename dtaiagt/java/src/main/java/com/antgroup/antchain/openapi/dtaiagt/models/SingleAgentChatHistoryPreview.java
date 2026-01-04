// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class SingleAgentChatHistoryPreview extends TeaModel {
    // 数据库id
    // 
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 会话id
    // 
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    // 会话开始时间
    // 
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("ask_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String askTime;

    // 前端展示的时间
    // 
    /**
     * <strong>example:</strong>
     * <p>&quot;2024-01-01 10:00:00&quot; </p>
     */
    @NameInMap("display_time")
    @Validation(required = true)
    public String displayTime;

    // 会话在列表中的显示内容
    // 
    /**
     * <strong>example:</strong>
     * <p>&quot;会话标题&quot; </p>
     */
    @NameInMap("session_identifier")
    @Validation(required = true)
    public String sessionIdentifier;

    // 消息类型（chat/pushMessage）
    // 
    /**
     * <strong>example:</strong>
     * <p>chat</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 推送的消息内容
    // 
    /**
     * <strong>example:</strong>
     * <p>推送的消息内容</p>
     */
    @NameInMap("text_response")
    @Validation(required = true)
    public String textResponse;

    // 推送时间
    // 
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("timestamp_display")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String timestampDisplay;

    // 返回类型
    // 
    /**
     * <strong>example:</strong>
     * <p>文本</p>
     */
    @NameInMap("display_response_type")
    @Validation(required = true)
    public String displayResponseType;

    // 附件文件
    // 
    @NameInMap("files")
    @Validation(required = true)
    public java.util.List<AttachFile> files;

    public static SingleAgentChatHistoryPreview build(java.util.Map<String, ?> map) throws Exception {
        SingleAgentChatHistoryPreview self = new SingleAgentChatHistoryPreview();
        return TeaModel.build(map, self);
    }

    public SingleAgentChatHistoryPreview setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SingleAgentChatHistoryPreview setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SingleAgentChatHistoryPreview setAskTime(String askTime) {
        this.askTime = askTime;
        return this;
    }
    public String getAskTime() {
        return this.askTime;
    }

    public SingleAgentChatHistoryPreview setDisplayTime(String displayTime) {
        this.displayTime = displayTime;
        return this;
    }
    public String getDisplayTime() {
        return this.displayTime;
    }

    public SingleAgentChatHistoryPreview setSessionIdentifier(String sessionIdentifier) {
        this.sessionIdentifier = sessionIdentifier;
        return this;
    }
    public String getSessionIdentifier() {
        return this.sessionIdentifier;
    }

    public SingleAgentChatHistoryPreview setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SingleAgentChatHistoryPreview setTextResponse(String textResponse) {
        this.textResponse = textResponse;
        return this;
    }
    public String getTextResponse() {
        return this.textResponse;
    }

    public SingleAgentChatHistoryPreview setTimestampDisplay(String timestampDisplay) {
        this.timestampDisplay = timestampDisplay;
        return this;
    }
    public String getTimestampDisplay() {
        return this.timestampDisplay;
    }

    public SingleAgentChatHistoryPreview setDisplayResponseType(String displayResponseType) {
        this.displayResponseType = displayResponseType;
        return this;
    }
    public String getDisplayResponseType() {
        return this.displayResponseType;
    }

    public SingleAgentChatHistoryPreview setFiles(java.util.List<AttachFile> files) {
        this.files = files;
        return this;
    }
    public java.util.List<AttachFile> getFiles() {
        return this.files;
    }

}
