<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ContextBreakdown extends Model {
    protected $_name = [
        'systemPrompt' => 'system_prompt',
        'skills' => 'skills',
        'toolDefinitions' => 'tool_definitions',
        'conversation' => 'conversation',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->systemPrompt) {
            $res['system_prompt'] = $this->systemPrompt;
        }
        if (null !== $this->skills) {
            $res['skills'] = $this->skills;
        }
        if (null !== $this->toolDefinitions) {
            $res['tool_definitions'] = $this->toolDefinitions;
        }
        if (null !== $this->conversation) {
            $res['conversation'] = $this->conversation;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ContextBreakdown
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['system_prompt'])){
            $model->systemPrompt = $map['system_prompt'];
        }
        if(isset($map['skills'])){
            $model->skills = $map['skills'];
        }
        if(isset($map['tool_definitions'])){
            $model->toolDefinitions = $map['tool_definitions'];
        }
        if(isset($map['conversation'])){
            $model->conversation = $map['conversation'];
        }
        return $model;
    }
    // 系统提示词占用token数（估算）
    /**
     * @example undefined
     * @var int
     */
    public $systemPrompt;

    // Skill/插件提示词占用token数（估算）
    /**
     * @example undefined
     * @var int
     */
    public $skills;

    // 工具定义占用token数（估算）
    /**
     * @example undefined
     * @var int
     */
    public $toolDefinitions;

    // 对话历史占用token数（估算）
    /**
     * @example undefined
     * @var int
     */
    public $conversation;

}
