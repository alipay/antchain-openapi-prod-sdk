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
        'turnId' => 'turn_id',
        'complete' => 'complete',
        'turnDurationMs' => 'turn_duration_ms',
    ];
    public function validate() {}
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
        if (null !== $this->turnId) {
            $res['turn_id'] = $this->turnId;
        }
        if (null !== $this->complete) {
            $res['complete'] = $this->complete;
        }
        if (null !== $this->turnDurationMs) {
            $res['turn_duration_ms'] = $this->turnDurationMs;
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
        if(isset($map['turn_id'])){
            $model->turnId = $map['turn_id'];
        }
        if(isset($map['complete'])){
            $model->complete = $map['complete'];
        }
        if(isset($map['turn_duration_ms'])){
            $model->turnDurationMs = $map['turn_duration_ms'];
        }
        return $model;
    }
    // 模型名
    /**
     * @example undefined
     * @var string
     */
    public $model;

    // 调用状态
    /**
     * @example undefined
     * @var string
     */
    public $status;

    // 输入token
    /**
     * @example undefined
     * @var int
     */
    public $inputTokens;

    // 输出token
    /**
     * @example undefined
     * @var int
     */
    public $outputTokens;

    // 总token
    /**
     * @example undefined
     * @var int
     */
    public $totalTokens;

    // 推理token
    /**
     * @example undefined
     * @var int
     */
    public $reasoningTokens;

    // 缓存读取token
    /**
     * @example undefined
     * @var int
     */
    public $cachedReadTokens;

    // 缓存写入token
    /**
     * @example undefined
     * @var int
     */
    public $cachedWriteTokens;

    // 单次模型调用耗时(毫秒)
    /**
     * @example undefined
     * @var int
     */
    public $modelDurationMs;

    // 轮次ID
    /**
     * @example undefined
     * @var string
     */
    public $turnId;

    // 该轮用量是否完整计量
    /**
     * @example undefined
     * @var bool
     */
    public $complete;

    // 轮次总耗时(毫秒，含模型调用+工具执行)
    /**
     * @example undefined
     * @var int
     */
    public $turnDurationMs;

}
