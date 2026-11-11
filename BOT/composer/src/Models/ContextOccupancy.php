<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BOT\Models\ContextBreakdown;

class ContextOccupancy extends Model {
    protected $_name = [
        'model' => 'model',
        'estimatedInputTokens' => 'estimated_input_tokens',
        'contextWindowTokens' => 'context_window_tokens',
        'inputWindowRatio' => 'input_window_ratio',
        'remainingInputBudgetTokens' => 'remaining_input_budget_tokens',
        'warning' => 'warning',
        'contextBreakdown' => 'context_breakdown',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->model) {
            $res['model'] = $this->model;
        }
        if (null !== $this->estimatedInputTokens) {
            $res['estimated_input_tokens'] = $this->estimatedInputTokens;
        }
        if (null !== $this->contextWindowTokens) {
            $res['context_window_tokens'] = $this->contextWindowTokens;
        }
        if (null !== $this->inputWindowRatio) {
            $res['input_window_ratio'] = $this->inputWindowRatio;
        }
        if (null !== $this->remainingInputBudgetTokens) {
            $res['remaining_input_budget_tokens'] = $this->remainingInputBudgetTokens;
        }
        if (null !== $this->warning) {
            $res['warning'] = $this->warning;
        }
        if (null !== $this->contextBreakdown) {
            $res['context_breakdown'] = null !== $this->contextBreakdown ? $this->contextBreakdown->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ContextOccupancy
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['model'])){
            $model->model = $map['model'];
        }
        if(isset($map['estimated_input_tokens'])){
            $model->estimatedInputTokens = $map['estimated_input_tokens'];
        }
        if(isset($map['context_window_tokens'])){
            $model->contextWindowTokens = $map['context_window_tokens'];
        }
        if(isset($map['input_window_ratio'])){
            $model->inputWindowRatio = $map['input_window_ratio'];
        }
        if(isset($map['remaining_input_budget_tokens'])){
            $model->remainingInputBudgetTokens = $map['remaining_input_budget_tokens'];
        }
        if(isset($map['warning'])){
            $model->warning = $map['warning'];
        }
        if(isset($map['context_breakdown'])){
            $model->contextBreakdown = ContextBreakdown::fromMap($map['context_breakdown']);
        }
        return $model;
    }
    // 最后一次模型调用的模型名
    /**
     * @example deepseek-flash
     * @var string
     */
    public $model;

    // 当前上下文占用token数
    /**
     * @example 5000
     * @var int
     */
    public $estimatedInputTokens;

    // 模型上下文窗口上限
    /**
     * @example 128000
     * @var int
     */
    public $contextWindowTokens;

    // 上下文占用比率
    /**
     * @example 0.039
     * @var int
     */
    public $inputWindowRatio;

    // 剩余上下文预算token数
    /**
     * @example 123000
     * @var int
     */
    public $remainingInputBudgetTokens;

    // 告警级别
    /**
     * @example NORMAL
     * @var string
     */
    public $warning;

    // 上下文占用分项明细（估算值）：system_prompt=系统提示词, skills=Skill/插件提示词, tool_definitions=工具定义, conversation=对话历史
    /**
     * @example undefined
     * @var ContextBreakdown
     */
    public $contextBreakdown;

}
