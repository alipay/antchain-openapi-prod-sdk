<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryYdauthprotThreemetaResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 核验是否通过
    /**
     * @var bool
     */
    public $passed;

    // 风险分
    /**
     * @var string
     */
    public $score;

    // 命中的策略列表
    /**
     * @var string[]
     */
    public $strategies;

    // 风险决策结果
    /**
     * @var string
     */
    public $decision;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'passed'     => 'passed',
        'score'      => 'score',
        'strategies' => 'strategies',
        'decision'   => 'decision',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->passed) {
            $res['passed'] = $this->passed;
        }
        if (null !== $this->score) {
            $res['score'] = $this->score;
        }
        if (null !== $this->strategies) {
            $res['strategies'] = $this->strategies;
        }
        if (null !== $this->decision) {
            $res['decision'] = $this->decision;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryYdauthprotThreemetaResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['passed'])) {
            $model->passed = $map['passed'];
        }
        if (isset($map['score'])) {
            $model->score = $map['score'];
        }
        if (isset($map['strategies'])) {
            if (!empty($map['strategies'])) {
                $model->strategies = $map['strategies'];
            }
        }
        if (isset($map['decision'])) {
            $model->decision = $map['decision'];
        }

        return $model;
    }
}
