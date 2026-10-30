<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class SessionUsage extends Model {
    protected $_name = [
        'inputTokens' => 'input_tokens',
        'outputTokens' => 'output_tokens',
        'totalTokens' => 'total_tokens',
        'modelCallCount' => 'model_call_count',
        'complete' => 'complete',
        'turnDurationMs' => 'turn_duration_ms',
    ];
    public function validate() {
        Model::validateRequired('inputTokens', $this->inputTokens, true);
        Model::validateRequired('outputTokens', $this->outputTokens, true);
        Model::validateRequired('totalTokens', $this->totalTokens, true);
        Model::validateRequired('modelCallCount', $this->modelCallCount, true);
        Model::validateRequired('complete', $this->complete, true);
        Model::validateRequired('turnDurationMs', $this->turnDurationMs, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->inputTokens) {
            $res['input_tokens'] = $this->inputTokens;
        }
        if (null !== $this->outputTokens) {
            $res['output_tokens'] = $this->outputTokens;
        }
        if (null !== $this->totalTokens) {
            $res['total_tokens'] = $this->totalTokens;
        }
        if (null !== $this->modelCallCount) {
            $res['model_call_count'] = $this->modelCallCount;
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
     * @return SessionUsage
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['input_tokens'])){
            $model->inputTokens = $map['input_tokens'];
        }
        if(isset($map['output_tokens'])){
            $model->outputTokens = $map['output_tokens'];
        }
        if(isset($map['total_tokens'])){
            $model->totalTokens = $map['total_tokens'];
        }
        if(isset($map['model_call_count'])){
            $model->modelCallCount = $map['model_call_count'];
        }
        if(isset($map['complete'])){
            $model->complete = $map['complete'];
        }
        if(isset($map['turn_duration_ms'])){
            $model->turnDurationMs = $map['turn_duration_ms'];
        }
        return $model;
    }
    // 输入Token
    /**
     * @example 1024
     * @var int
     */
    public $inputTokens;

    // 输出token
    /**
     * @example 1024
     * @var int
     */
    public $outputTokens;

    // 总Token
    /**
     * @example 1024
     * @var int
     */
    public $totalTokens;

    // 模型调用次数
    /**
     * @example 1024
     * @var int
     */
    public $modelCallCount;

    // 是否完成
    /**
     * @example true
     * @var bool
     */
    public $complete;

    // 当前轮次请求耗时
    /**
     * @example 1000
     * @var int
     */
    public $turnDurationMs;

}
