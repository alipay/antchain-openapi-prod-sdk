// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // 对话详细信息
    public class DisplayResponseContent : TeaModel {
        // 【对话历史展示专用】对话历史展示类型，枚举值：QUERY("用户输入"), RESPONSE("回复")
        // 
        [NameInMap("chat_history_display_type_enum")]
        [Validation(Required=true)]
        public string ChatHistoryDisplayTypeEnum { get; set; }

        // 展示类型，前端根据此类型读取相关字段进行展示，枚举值：TEXT("文本"), CARD("卡片"), TEMPLATE("模版"), MARKDOWN("Markdown模版"), KNOWLEDGE("知识点"), DOCUMENT("文档"), PLUGIN("插件"), DEFAULT("兜底"), ERROR("异常")
        // 
        [NameInMap("display_response_type")]
        [Validation(Required=true)]
        public string DisplayResponseType { get; set; }

        // content 日志原文
        [NameInMap("raw_content")]
        [Validation(Required=true)]
        public string RawContent { get; set; }

        // Map<String, Object> 元数据kv对
        // 
        [NameInMap("kv_map")]
        [Validation(Required=true)]
        public string KvMap { get; set; }

        // 关联节点id
        // 
        [NameInMap("ref_node_id")]
        [Validation(Required=true)]
        public string RefNodeId { get; set; }

        // 关联节点信息
        // 
        [NameInMap("spm_data")]
        [Validation(Required=true)]
        public string SpmData { get; set; }

        // 关联意图domain+intent
        // 
        [NameInMap("domain_intent")]
        [Validation(Required=true)]
        public string DomainIntent { get; set; }

        // 文本回复内容，非文本类型的机器人回复展现也使用该字段
        // 
        [NameInMap("text_response")]
        [Validation(Required=true)]
        public string TextResponse { get; set; }

        // 卡片/模版类型：行动点列表
        // 
        [NameInMap("template_action_list")]
        [Validation(Required=true)]
        public List<TemplateAction> TemplateActionList { get; set; }

        // 模版/卡片类型: 序号
        // 
        [NameInMap("order")]
        [Validation(Required=true)]
        public long? Order { get; set; }

        // 模版类型：模版id
        // 
        [NameInMap("template_id")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

        // 模版类型：模版名称
        // 
        [NameInMap("template_name")]
        [Validation(Required=true)]
        public string TemplateName { get; set; }

        // 模版类型：模版 responseId
        // 
        [NameInMap("template_response_id")]
        [Validation(Required=true)]
        public string TemplateResponseId { get; set; }

        // 模版类型：模版预览图地址
        // 
        [NameInMap("template_picture_url")]
        [Validation(Required=true)]
        public string TemplatePictureUrl { get; set; }

        // 卡片类型：卡片 responseId
        // 
        [NameInMap("card_response_id")]
        [Validation(Required=true)]
        public string CardResponseId { get; set; }

        // 卡片类型：卡片ID
        // 
        [NameInMap("card_id")]
        [Validation(Required=true)]
        public string CardId { get; set; }

        // 卡片类型：卡片版本
        // 
        [NameInMap("card_version")]
        [Validation(Required=true)]
        public string CardVersion { get; set; }

        // Markdown 类型：消息标题
        // 
        [NameInMap("msg_title")]
        [Validation(Required=true)]
        public string MsgTitle { get; set; }

        // Markdown 类型：消息内容
        // 
        [NameInMap("msg_content")]
        [Validation(Required=true)]
        public string MsgContent { get; set; }

        // 知识类型：知识点列表
        // 
        [NameInMap("knowledge_title_list")]
        [Validation(Required=true)]
        public List<KnowledgeTitleInfo> KnowledgeTitleList { get; set; }

        // 文档类型：文档参考片段列表
        // 
        [NameInMap("document_reference_list")]
        [Validation(Required=true)]
        public List<DocumentReferenceInfo> DocumentReferenceList { get; set; }

        // 建议/关联问题列表
        // 
        [NameInMap("suggestions")]
        [Validation(Required=true)]
        public List<string> Suggestions { get; set; }

        // 响应单元id
        // 
        [NameInMap("unit_id")]
        [Validation(Required=true)]
        public string UnitId { get; set; }

        // 响应序号
        // 
        [NameInMap("index")]
        [Validation(Required=true)]
        public long? Index { get; set; }

        // 是还在加载
        // 
        [NameInMap("loading")]
        [Validation(Required=true)]
        public bool? Loading { get; set; }

        // 运行时间戳，用于计算耗时
        // 
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

        // 运行时间戳，展示格式（已废弃）
        // 
        [NameInMap("timestamp_display")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string TimestampDisplay { get; set; }

        // 响应控制码，用于标识是否被安全拦截或者正常生成
        // 
        [NameInMap("reply_cmd")]
        [Validation(Required=true)]
        public string ReplyCmd { get; set; }

        // 附件列表
        // 
        [NameInMap("files")]
        [Validation(Required=true)]
        public List<AttachFile> Files { get; set; }

        // Agent 运行思维链
        [NameInMap("thought_chain")]
        [Validation(Required=true)]
        public ThoughtChainInfo ThoughtChain { get; set; }

        // AgentChatLogInfo. Agent 运行相关信息
        // 
        [NameInMap("agent_chat_log_info")]
        [Validation(Required=true)]
        public AgentChatLogInfo AgentChatLogInfo { get; set; }

        // chat_id
        [NameInMap("chat_id")]
        [Validation(Required=true)]
        public string ChatId { get; set; }

        // session_id
        [NameInMap("session_id")]
        [Validation(Required=true)]
        public string SessionId { get; set; }

    }

}
