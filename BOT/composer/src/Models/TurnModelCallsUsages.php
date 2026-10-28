<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class TurnModelCallsUsages extends Model {
    protected $_name = [
        'model' => 'model',
        'status' => 'status',
        'inputTokens' => 'input_tokens',
        'outputTokens' => 'output_tokens',
        'totalTokens' => 'total_tokens',
        'reasoningTokens' => 'reasoning_tokens',
        'cachedReadTokens' => 'cached_read_tokens',
        'cachedWriteTokens' => 'cached_write_tokens',
        'modelDurationMs' => 'model_duration_ms',
    ];
    public function validate() {
        Model::validateRequired('model', $this->model, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('inputTokens', $this->inputTokens, true);
        Model::validateRequired('outputTokens', $this->outputTokens, true);
        Model::validateRequired('totalTokens', $this->totalTokens, true);
        Model::validateRequired('modelDurationMs', $this->modelDurationMs, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->model) {
            $res['model'] = $this->model;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->inputTokens) {
            $res['input_tokens'] = $this->inputTokens;
        }
        if (null !== $this->outputTokens) {
            $res['output_tokens'] = $this->outputTokens;
        }
        if (null !== $this->totalTokens) {
            $res['total_tokens'] = $this->totalTokens;
        }
        if (null !== $this->reasoningTokens) {
            $res['reasoning_tokens'] = $this->reasoningTokens;
        }
        if (null !== $this->cachedReadTokens) {
            $res['cached_read_tokens'] = $this->cachedReadTokens;
        }
        if (null !== $this->cachedWriteTokens) {
            $res['cached_write_tokens'] = $this->cachedWriteTokens;
        }
        if (null !== $this->modelDurationMs) {
            $res['model_duration_ms'] = $this->modelDurationMs;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return TurnModelCallsUsages
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['model'])){
            $model->model = $map['model'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['input_tokens'])){
            $model->inputTokens = $map['input_tokens'];
        }
        if(isset($map['output_tokens'])){
            $model->outputTokens = $map['output_tokens'];
        }
        if(isset($map['total_tokens'])){
            $model->totalTokens = $map['total_tokens'];
        }
        if(isset($map['reasoning_tokens'])){
            $model->reasoningTokens = $map['reasoning_tokens'];
        }
        if(isset($map['cached_read_tokens'])){
            $model->cachedReadTokens = $map['cached_read_tokens'];
        }
        if(isset($map['cached_write_tokens'])){
            $model->cachedWriteTokens = $map['cached_write_tokens'];
        }
        if(isset($map['model_duration_ms'])){
            $model->modelDurationMs = $map['model_duration_ms'];
        }
        return $model;
    }
    // 模型名称
    /**
     * @example deepseek-v4.1-flash
     * @var string
     */
    public $model;

    // 调用状态：COMPLETED / FAILED / CANCELLED / UNKNOWN
    /**
     * @example COMPLETED
     * @var string
     */
    public $status;

    // 输入 token
    /**
     * @example 20
     * @var int
     */
    public $inputTokens;

    // 输出 token
    /**
     * @example 1024
     * @var int
     */
    public $outputTokens;

    // 总 token
    /**
     * @example 1024
     * @var int
     */
    public $totalTokens;

    // 推理 token（可选，有才返回）
    /**
     * @example 1024
     * @var int
     */
    public $reasoningTokens;

    // 缓存读取 token（可选）
    /**
     * @example 1024
     * @var int
     */
    public $cachedReadTokens;

    // 缓存写入 token（可选）
    /**
     * @example 1024
     * @var int
     */
    public $cachedWriteTokens;

    // 当前模型调用耗时
    /**
     * @example 1000
     * @var int
     */
    public $modelDurationMs;

}
