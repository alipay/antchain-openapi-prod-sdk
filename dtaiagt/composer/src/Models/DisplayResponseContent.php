<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class DisplayResponseContent extends Model
{
    // 【对话历史展示专用】对话历史展示类型，枚举值：QUERY("用户输入"), RESPONSE("回复")
    //
    /**
     * @example QUERY
     *
     * @var string
     */
    public $chatHistoryDisplayTypeEnum;

    // 展示类型，前端根据此类型读取相关字段进行展示，枚举值：TEXT("文本"), CARD("卡片"), TEMPLATE("模版"), MARKDOWN("Markdown模版"), KNOWLEDGE("知识点"), DOCUMENT("文档"), PLUGIN("插件"), DEFAULT("兜底"), ERROR("异常")
    //
    /**
     * @example TEXT
     *
     * @var string
     */
    public $displayResponseType;

    // content 日志原文
    /**
     * @example {}
     *
     * @var string
     */
    public $rawContent;

    // Map<String, Object> 元数据kv对
    //
    /**
     * @example {}
     *
     * @var string
     */
    public $kvMap;

    // 关联节点id
    //
    /**
     * @example "node123"
     *
     * @var string
     */
    public $refNodeId;

    // 关联节点信息
    //
    /**
     * @example "spmInfo"
     *
     * @var string
     */
    public $spmData;

    // 关联意图domain+intent
    //
    /**
     * @example "intentA"
     *
     * @var string
     */
    public $domainIntent;

    // 文本回复内容，非文本类型的机器人回复展现也使用该字段
    //
    /**
     * @example "Hello!"
     *
     * @var string
     */
    public $textResponse;

    // 卡片/模版类型：行动点列表
    //
    /**
     * @example []
     *
     * @var TemplateAction[]
     */
    public $templateActionList;

    // 模版/卡片类型: 序号
    //
    /**
     * @example 1
     *
     * @var int
     */
    public $order;

    // 模版类型：模版id
    //
    /**
     * @example 1
     *
     * @var string
     */
    public $templateId;

    // 模版类型：模版名称
    //
    /**
     * @example 1
     *
     * @var string
     */
    public $templateName;

    // 模版类型：模版 responseId
    //
    /**
     * @example resp999
     *
     * @var string
     */
    public $templateResponseId;

    // 模版类型：模版预览图地址
    //
    /**
     * @example "http://..."
     *
     * @var string
     */
    public $templatePictureUrl;

    // 卡片类型：卡片 responseId
    //
    /**
     * @example card888
     *
     * @var string
     */
    public $cardResponseId;

    // 卡片类型：卡片ID
    //
    /**
     * @example 123
     *
     * @var string
     */
    public $cardId;

    // 卡片类型：卡片版本
    //
    /**
     * @example 1
     *
     * @var string
     */
    public $cardVersion;

    // Markdown 类型：消息标题
    //
    /**
     * @example "标题"
     *
     * @var string
     */
    public $msgTitle;

    // Markdown 类型：消息内容
    //
    /**
     * @example "# 内容"
     *
     * @var string
     */
    public $msgContent;

    // 知识类型：知识点列表
    //
    /**
     * @example []
     *
     * @var KnowledgeTitleInfo[]
     */
    public $knowledgeTitleList;

    // 文档类型：文档参考片段列表
    //
    /**
     * @example []
     *
     * @var DocumentReferenceInfo[]
     */
    public $documentReferenceList;

    // 建议/关联问题列表
    //
    /**
     * @example ["问题1"]
     *
     * @var string[]
     */
    public $suggestions;

    // 响应单元id
    //
    /**
     * @example 响应单元id
     *
     * @var string
     */
    public $unitId;

    // 响应序号
    //
    /**
     * @example 1
     *
     * @var int
     */
    public $index;

    // 是还在加载
    //
    /**
     * @example true, false
     *
     * @var bool
     */
    public $loading;

    // 运行时间戳，用于计算耗时
    //
    /**
     * @example 1712000000
     *
     * @var int
     */
    public $timestamp;

    // 运行时间戳，展示格式（已废弃）
    //
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $timestampDisplay;

    // 响应控制码，用于标识是否被安全拦截或者正常生成
    //
    /**
     * @example 1
     *
     * @var string
     */
    public $replyCmd;

    // 附件列表
    //
    /**
     * @example []
     *
     * @var AttachFile[]
     */
    public $files;

    // Agent 运行思维链
    /**
     * @example {}
     *
     * @var ThoughtChainInfo
     */
    public $thoughtChain;

    // AgentChatLogInfo. Agent 运行相关信息
    //
    /**
     * @example {}
     *
     * @var AgentChatLogInfo
     */
    public $agentChatLogInfo;

    // chat_id
    /**
     * @example chat_id
     *
     * @var string
     */
    public $chatId;

    // session_id
    /**
     * @example session_id
     *
     * @var string
     */
    public $sessionId;
    protected $_name = [
        'chatHistoryDisplayTypeEnum' => 'chat_history_display_type_enum',
        'displayResponseType'        => 'display_response_type',
        'rawContent'                 => 'raw_content',
        'kvMap'                      => 'kv_map',
        'refNodeId'                  => 'ref_node_id',
        'spmData'                    => 'spm_data',
        'domainIntent'               => 'domain_intent',
        'textResponse'               => 'text_response',
        'templateActionList'         => 'template_action_list',
        'order'                      => 'order',
        'templateId'                 => 'template_id',
        'templateName'               => 'template_name',
        'templateResponseId'         => 'template_response_id',
        'templatePictureUrl'         => 'template_picture_url',
        'cardResponseId'             => 'card_response_id',
        'cardId'                     => 'card_id',
        'cardVersion'                => 'card_version',
        'msgTitle'                   => 'msg_title',
        'msgContent'                 => 'msg_content',
        'knowledgeTitleList'         => 'knowledge_title_list',
        'documentReferenceList'      => 'document_reference_list',
        'suggestions'                => 'suggestions',
        'unitId'                     => 'unit_id',
        'index'                      => 'index',
        'loading'                    => 'loading',
        'timestamp'                  => 'timestamp',
        'timestampDisplay'           => 'timestamp_display',
        'replyCmd'                   => 'reply_cmd',
        'files'                      => 'files',
        'thoughtChain'               => 'thought_chain',
        'agentChatLogInfo'           => 'agent_chat_log_info',
        'chatId'                     => 'chat_id',
        'sessionId'                  => 'session_id',
    ];

    public function validate()
    {
        Model::validateRequired('chatHistoryDisplayTypeEnum', $this->chatHistoryDisplayTypeEnum, true);
        Model::validateRequired('displayResponseType', $this->displayResponseType, true);
        Model::validateRequired('rawContent', $this->rawContent, true);
        Model::validateRequired('kvMap', $this->kvMap, true);
        Model::validateRequired('refNodeId', $this->refNodeId, true);
        Model::validateRequired('spmData', $this->spmData, true);
        Model::validateRequired('domainIntent', $this->domainIntent, true);
        Model::validateRequired('textResponse', $this->textResponse, true);
        Model::validateRequired('templateActionList', $this->templateActionList, true);
        Model::validateRequired('order', $this->order, true);
        Model::validateRequired('templateId', $this->templateId, true);
        Model::validateRequired('templateName', $this->templateName, true);
        Model::validateRequired('templateResponseId', $this->templateResponseId, true);
        Model::validateRequired('templatePictureUrl', $this->templatePictureUrl, true);
        Model::validateRequired('cardResponseId', $this->cardResponseId, true);
        Model::validateRequired('cardId', $this->cardId, true);
        Model::validateRequired('cardVersion', $this->cardVersion, true);
        Model::validateRequired('msgTitle', $this->msgTitle, true);
        Model::validateRequired('msgContent', $this->msgContent, true);
        Model::validateRequired('knowledgeTitleList', $this->knowledgeTitleList, true);
        Model::validateRequired('documentReferenceList', $this->documentReferenceList, true);
        Model::validateRequired('suggestions', $this->suggestions, true);
        Model::validateRequired('unitId', $this->unitId, true);
        Model::validateRequired('index', $this->index, true);
        Model::validateRequired('loading', $this->loading, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
        Model::validateRequired('timestampDisplay', $this->timestampDisplay, true);
        Model::validateRequired('replyCmd', $this->replyCmd, true);
        Model::validateRequired('files', $this->files, true);
        Model::validateRequired('thoughtChain', $this->thoughtChain, true);
        Model::validateRequired('agentChatLogInfo', $this->agentChatLogInfo, true);
        Model::validateRequired('chatId', $this->chatId, true);
        Model::validateRequired('sessionId', $this->sessionId, true);
        Model::validatePattern('timestampDisplay', $this->timestampDisplay, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->chatHistoryDisplayTypeEnum) {
            $res['chat_history_display_type_enum'] = $this->chatHistoryDisplayTypeEnum;
        }
        if (null !== $this->displayResponseType) {
            $res['display_response_type'] = $this->displayResponseType;
        }
        if (null !== $this->rawContent) {
            $res['raw_content'] = $this->rawContent;
        }
        if (null !== $this->kvMap) {
            $res['kv_map'] = $this->kvMap;
        }
        if (null !== $this->refNodeId) {
            $res['ref_node_id'] = $this->refNodeId;
        }
        if (null !== $this->spmData) {
            $res['spm_data'] = $this->spmData;
        }
        if (null !== $this->domainIntent) {
            $res['domain_intent'] = $this->domainIntent;
        }
        if (null !== $this->textResponse) {
            $res['text_response'] = $this->textResponse;
        }
        if (null !== $this->templateActionList) {
            $res['template_action_list'] = [];
            if (null !== $this->templateActionList && \is_array($this->templateActionList)) {
                $n = 0;
                foreach ($this->templateActionList as $item) {
                    $res['template_action_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->order) {
            $res['order'] = $this->order;
        }
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->templateName) {
            $res['template_name'] = $this->templateName;
        }
        if (null !== $this->templateResponseId) {
            $res['template_response_id'] = $this->templateResponseId;
        }
        if (null !== $this->templatePictureUrl) {
            $res['template_picture_url'] = $this->templatePictureUrl;
        }
        if (null !== $this->cardResponseId) {
            $res['card_response_id'] = $this->cardResponseId;
        }
        if (null !== $this->cardId) {
            $res['card_id'] = $this->cardId;
        }
        if (null !== $this->cardVersion) {
            $res['card_version'] = $this->cardVersion;
        }
        if (null !== $this->msgTitle) {
            $res['msg_title'] = $this->msgTitle;
        }
        if (null !== $this->msgContent) {
            $res['msg_content'] = $this->msgContent;
        }
        if (null !== $this->knowledgeTitleList) {
            $res['knowledge_title_list'] = [];
            if (null !== $this->knowledgeTitleList && \is_array($this->knowledgeTitleList)) {
                $n = 0;
                foreach ($this->knowledgeTitleList as $item) {
                    $res['knowledge_title_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->documentReferenceList) {
            $res['document_reference_list'] = [];
            if (null !== $this->documentReferenceList && \is_array($this->documentReferenceList)) {
                $n = 0;
                foreach ($this->documentReferenceList as $item) {
                    $res['document_reference_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->suggestions) {
            $res['suggestions'] = $this->suggestions;
        }
        if (null !== $this->unitId) {
            $res['unit_id'] = $this->unitId;
        }
        if (null !== $this->index) {
            $res['index'] = $this->index;
        }
        if (null !== $this->loading) {
            $res['loading'] = $this->loading;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->timestampDisplay) {
            $res['timestamp_display'] = $this->timestampDisplay;
        }
        if (null !== $this->replyCmd) {
            $res['reply_cmd'] = $this->replyCmd;
        }
        if (null !== $this->files) {
            $res['files'] = [];
            if (null !== $this->files && \is_array($this->files)) {
                $n = 0;
                foreach ($this->files as $item) {
                    $res['files'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->thoughtChain) {
            $res['thought_chain'] = null !== $this->thoughtChain ? $this->thoughtChain->toMap() : null;
        }
        if (null !== $this->agentChatLogInfo) {
            $res['agent_chat_log_info'] = null !== $this->agentChatLogInfo ? $this->agentChatLogInfo->toMap() : null;
        }
        if (null !== $this->chatId) {
            $res['chat_id'] = $this->chatId;
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DisplayResponseContent
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['chat_history_display_type_enum'])) {
            $model->chatHistoryDisplayTypeEnum = $map['chat_history_display_type_enum'];
        }
        if (isset($map['display_response_type'])) {
            $model->displayResponseType = $map['display_response_type'];
        }
        if (isset($map['raw_content'])) {
            $model->rawContent = $map['raw_content'];
        }
        if (isset($map['kv_map'])) {
            $model->kvMap = $map['kv_map'];
        }
        if (isset($map['ref_node_id'])) {
            $model->refNodeId = $map['ref_node_id'];
        }
        if (isset($map['spm_data'])) {
            $model->spmData = $map['spm_data'];
        }
        if (isset($map['domain_intent'])) {
            $model->domainIntent = $map['domain_intent'];
        }
        if (isset($map['text_response'])) {
            $model->textResponse = $map['text_response'];
        }
        if (isset($map['template_action_list'])) {
            if (!empty($map['template_action_list'])) {
                $model->templateActionList = [];
                $n                         = 0;
                foreach ($map['template_action_list'] as $item) {
                    $model->templateActionList[$n++] = null !== $item ? TemplateAction::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['order'])) {
            $model->order = $map['order'];
        }
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['template_name'])) {
            $model->templateName = $map['template_name'];
        }
        if (isset($map['template_response_id'])) {
            $model->templateResponseId = $map['template_response_id'];
        }
        if (isset($map['template_picture_url'])) {
            $model->templatePictureUrl = $map['template_picture_url'];
        }
        if (isset($map['card_response_id'])) {
            $model->cardResponseId = $map['card_response_id'];
        }
        if (isset($map['card_id'])) {
            $model->cardId = $map['card_id'];
        }
        if (isset($map['card_version'])) {
            $model->cardVersion = $map['card_version'];
        }
        if (isset($map['msg_title'])) {
            $model->msgTitle = $map['msg_title'];
        }
        if (isset($map['msg_content'])) {
            $model->msgContent = $map['msg_content'];
        }
        if (isset($map['knowledge_title_list'])) {
            if (!empty($map['knowledge_title_list'])) {
                $model->knowledgeTitleList = [];
                $n                         = 0;
                foreach ($map['knowledge_title_list'] as $item) {
                    $model->knowledgeTitleList[$n++] = null !== $item ? KnowledgeTitleInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['document_reference_list'])) {
            if (!empty($map['document_reference_list'])) {
                $model->documentReferenceList = [];
                $n                            = 0;
                foreach ($map['document_reference_list'] as $item) {
                    $model->documentReferenceList[$n++] = null !== $item ? DocumentReferenceInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['suggestions'])) {
            if (!empty($map['suggestions'])) {
                $model->suggestions = $map['suggestions'];
            }
        }
        if (isset($map['unit_id'])) {
            $model->unitId = $map['unit_id'];
        }
        if (isset($map['index'])) {
            $model->index = $map['index'];
        }
        if (isset($map['loading'])) {
            $model->loading = $map['loading'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['timestamp_display'])) {
            $model->timestampDisplay = $map['timestamp_display'];
        }
        if (isset($map['reply_cmd'])) {
            $model->replyCmd = $map['reply_cmd'];
        }
        if (isset($map['files'])) {
            if (!empty($map['files'])) {
                $model->files = [];
                $n            = 0;
                foreach ($map['files'] as $item) {
                    $model->files[$n++] = null !== $item ? AttachFile::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['thought_chain'])) {
            $model->thoughtChain = ThoughtChainInfo::fromMap($map['thought_chain']);
        }
        if (isset($map['agent_chat_log_info'])) {
            $model->agentChatLogInfo = AgentChatLogInfo::fromMap($map['agent_chat_log_info']);
        }
        if (isset($map['chat_id'])) {
            $model->chatId = $map['chat_id'];
        }
        if (isset($map['session_id'])) {
            $model->sessionId = $map['session_id'];
        }

        return $model;
    }
}
