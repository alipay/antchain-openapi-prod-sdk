<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class TokenUsageSummary extends Model {
    protected $_name = [
        'scope' => 'scope',
        'promptTokens' => 'prompt_tokens',
        'completionTokens' => 'completion_tokens',
        'totalTokens' => 'total_tokens',
        'guardTotalTokens' => 'guard_total_tokens',
        'upstreamTotalTokens' => 'upstream_total_tokens',
        'modelCallCount' => 'model_call_count',
        'reportedCallCount' => 'reported_call_count',
        'unreportedCallCount' => 'unreported_call_count',
        'inFlightCallCount' => 'in_flight_call_count',
        'complete' => 'complete',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->promptTokens) {
            $res['prompt_tokens'] = $this->promptTokens;
        }
        if (null !== $this->completionTokens) {
            $res['completion_tokens'] = $this->completionTokens;
        }
        if (null !== $this->totalTokens) {
            $res['total_tokens'] = $this->totalTokens;
        }
        if (null !== $this->guardTotalTokens) {
            $res['guard_total_tokens'] = $this->guardTotalTokens;
        }
        if (null !== $this->upstreamTotalTokens) {
            $res['upstream_total_tokens'] = $this->upstreamTotalTokens;
        }
        if (null !== $this->modelCallCount) {
            $res['model_call_count'] = $this->modelCallCount;
        }
        if (null !== $this->reportedCallCount) {
            $res['reported_call_count'] = $this->reportedCallCount;
        }
        if (null !== $this->unreportedCallCount) {
            $res['unreported_call_count'] = $this->unreportedCallCount;
        }
        if (null !== $this->inFlightCallCount) {
            $res['in_flight_call_count'] = $this->inFlightCallCount;
        }
        if (null !== $this->complete) {
            $res['complete'] = $this->complete;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return TokenUsageSummary
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['scope'])){
            $model->scope = $map['scope'];
        }
        if(isset($map['prompt_tokens'])){
            $model->promptTokens = $map['prompt_tokens'];
        }
        if(isset($map['completion_tokens'])){
            $model->completionTokens = $map['completion_tokens'];
        }
        if(isset($map['total_tokens'])){
            $model->totalTokens = $map['total_tokens'];
        }
        if(isset($map['guard_total_tokens'])){
            $model->guardTotalTokens = $map['guard_total_tokens'];
        }
        if(isset($map['upstream_total_tokens'])){
            $model->upstreamTotalTokens = $map['upstream_total_tokens'];
        }
        if(isset($map['model_call_count'])){
            $model->modelCallCount = $map['model_call_count'];
        }
        if(isset($map['reported_call_count'])){
            $model->reportedCallCount = $map['reported_call_count'];
        }
        if(isset($map['unreported_call_count'])){
            $model->unreportedCallCount = $map['unreported_call_count'];
        }
        if(isset($map['in_flight_call_count'])){
            $model->inFlightCallCount = $map['in_flight_call_count'];
        }
        if(isset($map['complete'])){
            $model->complete = $map['complete'];
        }
        return $model;
    }
    // 标识该对象是请求级汇总，便于 BI 侧过滤代理阶段日志。
    /**
     * @example REQUEST
     * @var string
     */
    public $scope;

    // 提示词token
    /**
     * @example 10
     * @var int
     */
    public $promptTokens;

    // 模型生成回答时输出的 token 数量
    /**
     * @example 1
     * @var int
     */
    public $completionTokens;

    // 总tokens
    /**
     * @example 1
     * @var int
     */
    public $totalTokens;

    // 护栏内部模型（含 Embedding）总 token。
    /**
     * @example 1
     * @var int
     */
    public $guardTotalTokens;

    // 代理转发的上游大模型总 token。
    /**
     * @example 1
     * @var int
     */
    public $upstreamTotalTokens;

    // 已实际发起的模型调用数，包括尚未返回的调用
    /**
     * @example 1
     * @var int
     */
    public $modelCallCount;

    // 能够确定 total_tokens 的模型调用数。
    /**
     * @example 1
     * @var int
     */
    public $reportedCallCount;

    // 已结束但无法确定 total_tokens 的模型调用数
    /**
     * @example 1
     * @var int
     */
    public $unreportedCallCount;

    // 当前快照时仍在执行的模型调用数。
    /**
     * @example 1
     * @var int
     */
    public $inFlightCallCount;

    // 仅当所有已发起调用都结束且均能确定 total_tokens，并且业务未发生提前返回时为 true。
    /**
     * @example true
     * @var bool
     */
    public $complete;

}
