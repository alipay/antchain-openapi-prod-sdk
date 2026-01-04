<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class AgentVO extends Model
{
    // Agent的唯一标识符
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // Agent唯一uid
    //
    /**
     * @example 1
     *
     * @var string
     */
    public $uniqueCode;

    // Agent名称
    //
    /**
     * @example 1
     *
     * @var string
     */
    public $name;

    // Agent 版本
    //
    /**
     * @example 1
     *
     * @var string
     */
    public $agentVersion;

    // Agent类型 "multi", "多智能体应用" "workflow", "工作流应用""lite", "轻量应用"  "external", "外部应用"
    /**
     * @example lite
     *
     * @var string
     */
    public $type;

    // Agent描述
    //
    /**
     * @example "这是一个智能助手"
     *
     * @var string
     */
    public $description;

    // Agent创建人
    //
    /**
     * @example 1
     *
     * @var string
     */
    public $creator;

    // Agent创建时间
    //
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // Agent编辑时间
    //
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // Agent安全审核配置
    //
    /**
     * @example
     *
     * @var AgentSecConfig
     */
    public $secConfig;

    // 欢迎语
    //
    /**
     * @example "欢迎使用智能助手"
     *
     * @var string
     */
    public $welcome;

    // 是否展示关联问题
    //
    /**
     * @example true, false
     *
     * @var bool
     */
    public $showRelatedQuestions;

    // 关联问题自定义prompt
    //
    /**
     * @example "请推荐相关问题"
     *
     * @var string
     */
    public $relatedQuestionPrompt;

    // 额外信息 ，Map<String, Object>
    /**
     * @example {}
     *
     * @var string
     */
    public $extraInfo;

    // extra_info (额外信息) 字段的json形式，格式为：Map<String, Object>
    /**
     * @example {}
     *
     * @var string
     */
    public $extraInfoJson;

    // 交互类型 VOICE / AVATAR / VIDEO
    //
    /**
     * @example VOICE
     *
     * @var string
     */
    public $interactionType;

    // 音色
    //
    /**
     * @example 1
     *
     * @var string
     */
    public $voice;

    // agent模型版本 {model}/{version}#{adapter} (deprecated)
    //
    /**
     * @example "gpt-3.5-turbo"
     *
     * @var string
     */
    public $model;

    // Agent模型配置表
    //
    /**
     * @example
     *
     * @var AgentModelParams[]
     */
    public $modelList;

    // Agent关联知识库ID列表
    //
    /**
     * @example
     *
     * @var string[]
     */
    public $refLibraryIds;

    // Agent关联插件信息表, key为插件主键id, value为信息
    //
    /**
     * @example
     *
     * @var AgentRefPluginInfo[]
     */
    public $refPlugins;

    // 关联的mcpServer
    //
    /**
     * @example
     *
     * @var AgentRefPluginInfo[]
     */
    public $refMcpServers;

    // 隶属multi-agent的sub agents
    //
    /**
     * @example []
     *
     * @var SubAgentInfo[]
     */
    public $subAgents;

    // Agent关联workflow信息表, key为intent wutong id, value为信息
    //
    /**
     * @example
     *
     * @var AgentRefPluginInfo[]
     */
    public $refWorkflows;

    // 关联卡片id列表
    //
    /**
     * @example
     *
     * @var string[]
     */
    public $refCardIds;
    protected $_name = [
        'id'                    => 'id',
        'uniqueCode'            => 'unique_code',
        'name'                  => 'name',
        'agentVersion'          => 'agent_version',
        'type'                  => 'type',
        'description'           => 'description',
        'creator'               => 'creator',
        'gmtCreate'             => 'gmt_create',
        'gmtModified'           => 'gmt_modified',
        'secConfig'             => 'sec_config',
        'welcome'               => 'welcome',
        'showRelatedQuestions'  => 'show_related_questions',
        'relatedQuestionPrompt' => 'related_question_prompt',
        'extraInfo'             => 'extra_info',
        'extraInfoJson'         => 'extra_info_json',
        'interactionType'       => 'interaction_type',
        'voice'                 => 'voice',
        'model'                 => 'model',
        'modelList'             => 'model_list',
        'refLibraryIds'         => 'ref_library_ids',
        'refPlugins'            => 'ref_plugins',
        'refMcpServers'         => 'ref_mcp_servers',
        'subAgents'             => 'sub_agents',
        'refWorkflows'          => 'ref_workflows',
        'refCardIds'            => 'ref_card_ids',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('uniqueCode', $this->uniqueCode, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('agentVersion', $this->agentVersion, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('creator', $this->creator, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('secConfig', $this->secConfig, true);
        Model::validateRequired('welcome', $this->welcome, true);
        Model::validateRequired('showRelatedQuestions', $this->showRelatedQuestions, true);
        Model::validateRequired('relatedQuestionPrompt', $this->relatedQuestionPrompt, true);
        Model::validateRequired('extraInfo', $this->extraInfo, true);
        Model::validateRequired('extraInfoJson', $this->extraInfoJson, true);
        Model::validateRequired('interactionType', $this->interactionType, true);
        Model::validateRequired('voice', $this->voice, true);
        Model::validateRequired('model', $this->model, true);
        Model::validateRequired('modelList', $this->modelList, true);
        Model::validateRequired('refLibraryIds', $this->refLibraryIds, true);
        Model::validateRequired('refPlugins', $this->refPlugins, true);
        Model::validateRequired('refMcpServers', $this->refMcpServers, true);
        Model::validateRequired('subAgents', $this->subAgents, true);
        Model::validateRequired('refWorkflows', $this->refWorkflows, true);
        Model::validateRequired('refCardIds', $this->refCardIds, true);
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->uniqueCode) {
            $res['unique_code'] = $this->uniqueCode;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->agentVersion) {
            $res['agent_version'] = $this->agentVersion;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->creator) {
            $res['creator'] = $this->creator;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->secConfig) {
            $res['sec_config'] = null !== $this->secConfig ? $this->secConfig->toMap() : null;
        }
        if (null !== $this->welcome) {
            $res['welcome'] = $this->welcome;
        }
        if (null !== $this->showRelatedQuestions) {
            $res['show_related_questions'] = $this->showRelatedQuestions;
        }
        if (null !== $this->relatedQuestionPrompt) {
            $res['related_question_prompt'] = $this->relatedQuestionPrompt;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->extraInfoJson) {
            $res['extra_info_json'] = $this->extraInfoJson;
        }
        if (null !== $this->interactionType) {
            $res['interaction_type'] = $this->interactionType;
        }
        if (null !== $this->voice) {
            $res['voice'] = $this->voice;
        }
        if (null !== $this->model) {
            $res['model'] = $this->model;
        }
        if (null !== $this->modelList) {
            $res['model_list'] = [];
            if (null !== $this->modelList && \is_array($this->modelList)) {
                $n = 0;
                foreach ($this->modelList as $item) {
                    $res['model_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->refLibraryIds) {
            $res['ref_library_ids'] = $this->refLibraryIds;
        }
        if (null !== $this->refPlugins) {
            $res['ref_plugins'] = [];
            if (null !== $this->refPlugins && \is_array($this->refPlugins)) {
                $n = 0;
                foreach ($this->refPlugins as $item) {
                    $res['ref_plugins'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->refMcpServers) {
            $res['ref_mcp_servers'] = [];
            if (null !== $this->refMcpServers && \is_array($this->refMcpServers)) {
                $n = 0;
                foreach ($this->refMcpServers as $item) {
                    $res['ref_mcp_servers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->subAgents) {
            $res['sub_agents'] = [];
            if (null !== $this->subAgents && \is_array($this->subAgents)) {
                $n = 0;
                foreach ($this->subAgents as $item) {
                    $res['sub_agents'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->refWorkflows) {
            $res['ref_workflows'] = [];
            if (null !== $this->refWorkflows && \is_array($this->refWorkflows)) {
                $n = 0;
                foreach ($this->refWorkflows as $item) {
                    $res['ref_workflows'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->refCardIds) {
            $res['ref_card_ids'] = $this->refCardIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AgentVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['unique_code'])) {
            $model->uniqueCode = $map['unique_code'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['agent_version'])) {
            $model->agentVersion = $map['agent_version'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['creator'])) {
            $model->creator = $map['creator'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['sec_config'])) {
            $model->secConfig = AgentSecConfig::fromMap($map['sec_config']);
        }
        if (isset($map['welcome'])) {
            $model->welcome = $map['welcome'];
        }
        if (isset($map['show_related_questions'])) {
            $model->showRelatedQuestions = $map['show_related_questions'];
        }
        if (isset($map['related_question_prompt'])) {
            $model->relatedQuestionPrompt = $map['related_question_prompt'];
        }
        if (isset($map['extra_info'])) {
            $model->extraInfo = $map['extra_info'];
        }
        if (isset($map['extra_info_json'])) {
            $model->extraInfoJson = $map['extra_info_json'];
        }
        if (isset($map['interaction_type'])) {
            $model->interactionType = $map['interaction_type'];
        }
        if (isset($map['voice'])) {
            $model->voice = $map['voice'];
        }
        if (isset($map['model'])) {
            $model->model = $map['model'];
        }
        if (isset($map['model_list'])) {
            if (!empty($map['model_list'])) {
                $model->modelList = [];
                $n                = 0;
                foreach ($map['model_list'] as $item) {
                    $model->modelList[$n++] = null !== $item ? AgentModelParams::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ref_library_ids'])) {
            if (!empty($map['ref_library_ids'])) {
                $model->refLibraryIds = $map['ref_library_ids'];
            }
        }
        if (isset($map['ref_plugins'])) {
            if (!empty($map['ref_plugins'])) {
                $model->refPlugins = [];
                $n                 = 0;
                foreach ($map['ref_plugins'] as $item) {
                    $model->refPlugins[$n++] = null !== $item ? AgentRefPluginInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ref_mcp_servers'])) {
            if (!empty($map['ref_mcp_servers'])) {
                $model->refMcpServers = [];
                $n                    = 0;
                foreach ($map['ref_mcp_servers'] as $item) {
                    $model->refMcpServers[$n++] = null !== $item ? AgentRefPluginInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['sub_agents'])) {
            if (!empty($map['sub_agents'])) {
                $model->subAgents = [];
                $n                = 0;
                foreach ($map['sub_agents'] as $item) {
                    $model->subAgents[$n++] = null !== $item ? SubAgentInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ref_workflows'])) {
            if (!empty($map['ref_workflows'])) {
                $model->refWorkflows = [];
                $n                   = 0;
                foreach ($map['ref_workflows'] as $item) {
                    $model->refWorkflows[$n++] = null !== $item ? AgentRefPluginInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ref_card_ids'])) {
            if (!empty($map['ref_card_ids'])) {
                $model->refCardIds = $map['ref_card_ids'];
            }
        }

        return $model;
    }
}
