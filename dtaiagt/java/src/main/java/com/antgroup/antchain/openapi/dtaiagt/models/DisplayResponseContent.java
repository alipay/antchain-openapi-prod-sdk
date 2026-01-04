// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class DisplayResponseContent extends TeaModel {
    // 【对话历史展示专用】对话历史展示类型，枚举值：QUERY("用户输入"), RESPONSE("回复")
    // 
    /**
     * <strong>example:</strong>
     * <p>QUERY</p>
     */
    @NameInMap("chat_history_display_type_enum")
    @Validation(required = true)
    public String chatHistoryDisplayTypeEnum;

    // 展示类型，前端根据此类型读取相关字段进行展示，枚举值：TEXT("文本"), CARD("卡片"), TEMPLATE("模版"), MARKDOWN("Markdown模版"), KNOWLEDGE("知识点"), DOCUMENT("文档"), PLUGIN("插件"), DEFAULT("兜底"), ERROR("异常")
    // 
    /**
     * <strong>example:</strong>
     * <p>TEXT</p>
     */
    @NameInMap("display_response_type")
    @Validation(required = true)
    public String displayResponseType;

    // content 日志原文
    /**
     * <strong>example:</strong>
     * <p>{} </p>
     */
    @NameInMap("raw_content")
    @Validation(required = true)
    public String rawContent;

    // Map<String, Object> 元数据kv对
    // 
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("kv_map")
    @Validation(required = true)
    public String kvMap;

    // 关联节点id
    // 
    /**
     * <strong>example:</strong>
     * <p>&quot;node123&quot; </p>
     */
    @NameInMap("ref_node_id")
    @Validation(required = true)
    public String refNodeId;

    // 关联节点信息
    // 
    /**
     * <strong>example:</strong>
     * <p>&quot;spmInfo&quot; </p>
     */
    @NameInMap("spm_data")
    @Validation(required = true)
    public String spmData;

    // 关联意图domain+intent
    // 
    /**
     * <strong>example:</strong>
     * <p>&quot;intentA&quot; </p>
     */
    @NameInMap("domain_intent")
    @Validation(required = true)
    public String domainIntent;

    // 文本回复内容，非文本类型的机器人回复展现也使用该字段
    // 
    /**
     * <strong>example:</strong>
     * <p>&quot;Hello!&quot; </p>
     */
    @NameInMap("text_response")
    @Validation(required = true)
    public String textResponse;

    // 卡片/模版类型：行动点列表
    // 
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("template_action_list")
    @Validation(required = true)
    public java.util.List<TemplateAction> templateActionList;

    // 模版/卡片类型: 序号
    // 
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("order")
    @Validation(required = true)
    public Long order;

    // 模版类型：模版id
    // 
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 模版类型：模版名称
    // 
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("template_name")
    @Validation(required = true)
    public String templateName;

    // 模版类型：模版 responseId
    // 
    /**
     * <strong>example:</strong>
     * <p>resp999</p>
     */
    @NameInMap("template_response_id")
    @Validation(required = true)
    public String templateResponseId;

    // 模版类型：模版预览图地址
    // 
    /**
     * <strong>example:</strong>
     * <p>&quot;http://...&quot; </p>
     */
    @NameInMap("template_picture_url")
    @Validation(required = true)
    public String templatePictureUrl;

    // 卡片类型：卡片 responseId
    // 
    /**
     * <strong>example:</strong>
     * <p>card888</p>
     */
    @NameInMap("card_response_id")
    @Validation(required = true)
    public String cardResponseId;

    // 卡片类型：卡片ID
    // 
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("card_id")
    @Validation(required = true)
    public String cardId;

    // 卡片类型：卡片版本
    // 
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("card_version")
    @Validation(required = true)
    public String cardVersion;

    // Markdown 类型：消息标题
    // 
    /**
     * <strong>example:</strong>
     * <p>&quot;标题&quot; </p>
     */
    @NameInMap("msg_title")
    @Validation(required = true)
    public String msgTitle;

    // Markdown 类型：消息内容
    // 
    /**
     * <strong>example:</strong>
     * <p>&quot;# 内容&quot; </p>
     */
    @NameInMap("msg_content")
    @Validation(required = true)
    public String msgContent;

    // 知识类型：知识点列表
    // 
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("knowledge_title_list")
    @Validation(required = true)
    public java.util.List<KnowledgeTitleInfo> knowledgeTitleList;

    // 文档类型：文档参考片段列表
    // 
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("document_reference_list")
    @Validation(required = true)
    public java.util.List<DocumentReferenceInfo> documentReferenceList;

    // 建议/关联问题列表
    // 
    /**
     * <strong>example:</strong>
     * <p>[&quot;问题1&quot;] </p>
     */
    @NameInMap("suggestions")
    @Validation(required = true)
    public java.util.List<String> suggestions;

    // 响应单元id
    // 
    /**
     * <strong>example:</strong>
     * <p>响应单元id</p>
     */
    @NameInMap("unit_id")
    @Validation(required = true)
    public String unitId;

    // 响应序号
    // 
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("index")
    @Validation(required = true)
    public Long index;

    // 是还在加载
    // 
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("loading")
    @Validation(required = true)
    public Boolean loading;

    // 运行时间戳，用于计算耗时
    // 
    /**
     * <strong>example:</strong>
     * <p>1712000000</p>
     */
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    // 运行时间戳，展示格式（已废弃）
    // 
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("timestamp_display")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String timestampDisplay;

    // 响应控制码，用于标识是否被安全拦截或者正常生成
    // 
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("reply_cmd")
    @Validation(required = true)
    public String replyCmd;

    // 附件列表
    // 
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("files")
    @Validation(required = true)
    public java.util.List<AttachFile> files;

    // Agent 运行思维链
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("thought_chain")
    @Validation(required = true)
    public ThoughtChainInfo thoughtChain;

    // AgentChatLogInfo. Agent 运行相关信息
    // 
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("agent_chat_log_info")
    @Validation(required = true)
    public AgentChatLogInfo agentChatLogInfo;

    public static DisplayResponseContent build(java.util.Map<String, ?> map) throws Exception {
        DisplayResponseContent self = new DisplayResponseContent();
        return TeaModel.build(map, self);
    }

    public DisplayResponseContent setChatHistoryDisplayTypeEnum(String chatHistoryDisplayTypeEnum) {
        this.chatHistoryDisplayTypeEnum = chatHistoryDisplayTypeEnum;
        return this;
    }
    public String getChatHistoryDisplayTypeEnum() {
        return this.chatHistoryDisplayTypeEnum;
    }

    public DisplayResponseContent setDisplayResponseType(String displayResponseType) {
        this.displayResponseType = displayResponseType;
        return this;
    }
    public String getDisplayResponseType() {
        return this.displayResponseType;
    }

    public DisplayResponseContent setRawContent(String rawContent) {
        this.rawContent = rawContent;
        return this;
    }
    public String getRawContent() {
        return this.rawContent;
    }

    public DisplayResponseContent setKvMap(String kvMap) {
        this.kvMap = kvMap;
        return this;
    }
    public String getKvMap() {
        return this.kvMap;
    }

    public DisplayResponseContent setRefNodeId(String refNodeId) {
        this.refNodeId = refNodeId;
        return this;
    }
    public String getRefNodeId() {
        return this.refNodeId;
    }

    public DisplayResponseContent setSpmData(String spmData) {
        this.spmData = spmData;
        return this;
    }
    public String getSpmData() {
        return this.spmData;
    }

    public DisplayResponseContent setDomainIntent(String domainIntent) {
        this.domainIntent = domainIntent;
        return this;
    }
    public String getDomainIntent() {
        return this.domainIntent;
    }

    public DisplayResponseContent setTextResponse(String textResponse) {
        this.textResponse = textResponse;
        return this;
    }
    public String getTextResponse() {
        return this.textResponse;
    }

    public DisplayResponseContent setTemplateActionList(java.util.List<TemplateAction> templateActionList) {
        this.templateActionList = templateActionList;
        return this;
    }
    public java.util.List<TemplateAction> getTemplateActionList() {
        return this.templateActionList;
    }

    public DisplayResponseContent setOrder(Long order) {
        this.order = order;
        return this;
    }
    public Long getOrder() {
        return this.order;
    }

    public DisplayResponseContent setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public DisplayResponseContent setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public DisplayResponseContent setTemplateResponseId(String templateResponseId) {
        this.templateResponseId = templateResponseId;
        return this;
    }
    public String getTemplateResponseId() {
        return this.templateResponseId;
    }

    public DisplayResponseContent setTemplatePictureUrl(String templatePictureUrl) {
        this.templatePictureUrl = templatePictureUrl;
        return this;
    }
    public String getTemplatePictureUrl() {
        return this.templatePictureUrl;
    }

    public DisplayResponseContent setCardResponseId(String cardResponseId) {
        this.cardResponseId = cardResponseId;
        return this;
    }
    public String getCardResponseId() {
        return this.cardResponseId;
    }

    public DisplayResponseContent setCardId(String cardId) {
        this.cardId = cardId;
        return this;
    }
    public String getCardId() {
        return this.cardId;
    }

    public DisplayResponseContent setCardVersion(String cardVersion) {
        this.cardVersion = cardVersion;
        return this;
    }
    public String getCardVersion() {
        return this.cardVersion;
    }

    public DisplayResponseContent setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle;
        return this;
    }
    public String getMsgTitle() {
        return this.msgTitle;
    }

    public DisplayResponseContent setMsgContent(String msgContent) {
        this.msgContent = msgContent;
        return this;
    }
    public String getMsgContent() {
        return this.msgContent;
    }

    public DisplayResponseContent setKnowledgeTitleList(java.util.List<KnowledgeTitleInfo> knowledgeTitleList) {
        this.knowledgeTitleList = knowledgeTitleList;
        return this;
    }
    public java.util.List<KnowledgeTitleInfo> getKnowledgeTitleList() {
        return this.knowledgeTitleList;
    }

    public DisplayResponseContent setDocumentReferenceList(java.util.List<DocumentReferenceInfo> documentReferenceList) {
        this.documentReferenceList = documentReferenceList;
        return this;
    }
    public java.util.List<DocumentReferenceInfo> getDocumentReferenceList() {
        return this.documentReferenceList;
    }

    public DisplayResponseContent setSuggestions(java.util.List<String> suggestions) {
        this.suggestions = suggestions;
        return this;
    }
    public java.util.List<String> getSuggestions() {
        return this.suggestions;
    }

    public DisplayResponseContent setUnitId(String unitId) {
        this.unitId = unitId;
        return this;
    }
    public String getUnitId() {
        return this.unitId;
    }

    public DisplayResponseContent setIndex(Long index) {
        this.index = index;
        return this;
    }
    public Long getIndex() {
        return this.index;
    }

    public DisplayResponseContent setLoading(Boolean loading) {
        this.loading = loading;
        return this;
    }
    public Boolean getLoading() {
        return this.loading;
    }

    public DisplayResponseContent setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public DisplayResponseContent setTimestampDisplay(String timestampDisplay) {
        this.timestampDisplay = timestampDisplay;
        return this;
    }
    public String getTimestampDisplay() {
        return this.timestampDisplay;
    }

    public DisplayResponseContent setReplyCmd(String replyCmd) {
        this.replyCmd = replyCmd;
        return this;
    }
    public String getReplyCmd() {
        return this.replyCmd;
    }

    public DisplayResponseContent setFiles(java.util.List<AttachFile> files) {
        this.files = files;
        return this;
    }
    public java.util.List<AttachFile> getFiles() {
        return this.files;
    }

    public DisplayResponseContent setThoughtChain(ThoughtChainInfo thoughtChain) {
        this.thoughtChain = thoughtChain;
        return this;
    }
    public ThoughtChainInfo getThoughtChain() {
        return this.thoughtChain;
    }

    public DisplayResponseContent setAgentChatLogInfo(AgentChatLogInfo agentChatLogInfo) {
        this.agentChatLogInfo = agentChatLogInfo;
        return this;
    }
    public AgentChatLogInfo getAgentChatLogInfo() {
        return this.agentChatLogInfo;
    }

}
