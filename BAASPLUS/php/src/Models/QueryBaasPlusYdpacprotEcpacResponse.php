<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryBaasPlusYdpacprotEcpacResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'decision' => 'decision',
        'passed' => 'passed',
        'score' => 'score',
        'strategies' => 'strategies',
    ];
    public function validate() {}
    public function toMap() {
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
        if (null !== $this->decision) {
            $res['decision'] = $this->decision;
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
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBaasPlusYdpacprotEcpacResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['decision'])){
            $model->decision = $map['decision'];
        }
        if(isset($map['passed'])){
            $model->passed = $map['passed'];
        }
        if(isset($map['score'])){
            $model->score = $map['score'];
        }
        if(isset($map['strategies'])){
            if(!empty($map['strategies'])){
                $model->strategies = $map['strategies'];
            }
        }
        return $model;
    }
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 风险决策结果
    /**
     * @var string
     */
    public $decision;

    // 认证是否通过
    /**
     * @var bool
     */
    public $passed;

    // 模型分数
    /**
     * @var string
     */
    public $score;

    // 命中策略列表
    /**
     * @var string[]
     */
    public $strategies;

}
