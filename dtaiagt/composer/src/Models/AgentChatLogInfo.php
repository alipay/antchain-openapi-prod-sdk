<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class AgentChatLogInfo extends Model
{
    // 记忆参数列表
    //
    /**
     * @example []
     *
     * @var AgentVariable[]
     */
    public $contextVariableList;

    // 引用工具/工作流列表
    //
    /**
     * @example []
     *
     * @var ToolOptionInfo[]
     */
    public $toolOptionList;

    // 对话界面思维链显示标题结构
    /**
     * @example
     *
     * @var ThoughtChainDisplay
     */
    public $thoughtChainDisplay;

    // 思维链信息详情列表
    //
    /**
     * @example
     *
     * @var ThoughtChainDisplayUnit[]
     */
    public $thoughtChainDisplayUnitList;

    // 该思维链有回答环节
    //
    /**
     * @example true, false
     *
     * @var bool
     */
    public $hasResponseType;
    protected $_name = [
        'contextVariableList'         => 'context_variable_list',
        'toolOptionList'              => 'tool_option_list',
        'thoughtChainDisplay'         => 'thought_chain_display',
        'thoughtChainDisplayUnitList' => 'thought_chain_display_unit_list',
        'hasResponseType'             => 'has_response_type',
    ];

    public function validate()
    {
        Model::validateRequired('contextVariableList', $this->contextVariableList, true);
        Model::validateRequired('toolOptionList', $this->toolOptionList, true);
        Model::validateRequired('thoughtChainDisplay', $this->thoughtChainDisplay, true);
        Model::validateRequired('thoughtChainDisplayUnitList', $this->thoughtChainDisplayUnitList, true);
        Model::validateRequired('hasResponseType', $this->hasResponseType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->contextVariableList) {
            $res['context_variable_list'] = [];
            if (null !== $this->contextVariableList && \is_array($this->contextVariableList)) {
                $n = 0;
                foreach ($this->contextVariableList as $item) {
                    $res['context_variable_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->toolOptionList) {
            $res['tool_option_list'] = [];
            if (null !== $this->toolOptionList && \is_array($this->toolOptionList)) {
                $n = 0;
                foreach ($this->toolOptionList as $item) {
                    $res['tool_option_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->thoughtChainDisplay) {
            $res['thought_chain_display'] = null !== $this->thoughtChainDisplay ? $this->thoughtChainDisplay->toMap() : null;
        }
        if (null !== $this->thoughtChainDisplayUnitList) {
            $res['thought_chain_display_unit_list'] = [];
            if (null !== $this->thoughtChainDisplayUnitList && \is_array($this->thoughtChainDisplayUnitList)) {
                $n = 0;
                foreach ($this->thoughtChainDisplayUnitList as $item) {
                    $res['thought_chain_display_unit_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->hasResponseType) {
            $res['has_response_type'] = $this->hasResponseType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AgentChatLogInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['context_variable_list'])) {
            if (!empty($map['context_variable_list'])) {
                $model->contextVariableList = [];
                $n                          = 0;
                foreach ($map['context_variable_list'] as $item) {
                    $model->contextVariableList[$n++] = null !== $item ? AgentVariable::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['tool_option_list'])) {
            if (!empty($map['tool_option_list'])) {
                $model->toolOptionList = [];
                $n                     = 0;
                foreach ($map['tool_option_list'] as $item) {
                    $model->toolOptionList[$n++] = null !== $item ? ToolOptionInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['thought_chain_display'])) {
            $model->thoughtChainDisplay = ThoughtChainDisplay::fromMap($map['thought_chain_display']);
        }
        if (isset($map['thought_chain_display_unit_list'])) {
            if (!empty($map['thought_chain_display_unit_list'])) {
                $model->thoughtChainDisplayUnitList = [];
                $n                                  = 0;
                foreach ($map['thought_chain_display_unit_list'] as $item) {
                    $model->thoughtChainDisplayUnitList[$n++] = null !== $item ? ThoughtChainDisplayUnit::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['has_response_type'])) {
            $model->hasResponseType = $map['has_response_type'];
        }

        return $model;
    }
}
