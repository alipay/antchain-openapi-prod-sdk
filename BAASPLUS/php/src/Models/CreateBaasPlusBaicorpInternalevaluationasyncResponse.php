<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class CreateBaasPlusBaicorpInternalevaluationasyncResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'contentScore' => 'content_score',
        'contentScoreDesc' => 'content_score_desc',
        'customId' => 'custom_id',
        'repeatReason' => 'repeat_reason',
        'repeatResult' => 'repeat_result',
        'riskResult' => 'risk_result',
        'riskResultDesc' => 'risk_result_desc',
        'taskId' => 'task_id',
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
        if (null !== $this->contentScore) {
            $res['content_score'] = $this->contentScore;
        }
        if (null !== $this->contentScoreDesc) {
            $res['content_score_desc'] = $this->contentScoreDesc;
        }
        if (null !== $this->customId) {
            $res['custom_id'] = $this->customId;
        }
        if (null !== $this->repeatReason) {
            $res['repeat_reason'] = $this->repeatReason;
        }
        if (null !== $this->repeatResult) {
            $res['repeat_result'] = $this->repeatResult;
        }
        if (null !== $this->riskResult) {
            $res['risk_result'] = $this->riskResult;
        }
        if (null !== $this->riskResultDesc) {
            $res['risk_result_desc'] = $this->riskResultDesc;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateBaasPlusBaicorpInternalevaluationasyncResponse
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
        if(isset($map['content_score'])){
            $model->contentScore = $map['content_score'];
        }
        if(isset($map['content_score_desc'])){
            $model->contentScoreDesc = $map['content_score_desc'];
        }
        if(isset($map['custom_id'])){
            $model->customId = $map['custom_id'];
        }
        if(isset($map['repeat_reason'])){
            $model->repeatReason = $map['repeat_reason'];
        }
        if(isset($map['repeat_result'])){
            $model->repeatResult = $map['repeat_result'];
        }
        if(isset($map['risk_result'])){
            $model->riskResult = $map['risk_result'];
        }
        if(isset($map['risk_result_desc'])){
            $model->riskResultDesc = $map['risk_result_desc'];
        }
        if(isset($map['task_id'])){
            $model->taskId = $map['task_id'];
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

    // 内容质量分
    /**
     * @var string
     */
    public $contentScore;

    // 质量分描述
    /**
     * @var string
     */
    public $contentScoreDesc;

    // 业务自定义id
    /**
     * @var string
     */
    public $customId;

    // 导致重复的原因
    /**
     * @var string
     */
    public $repeatReason;

    // 是否重复
    /**
     * @var bool
     */
    public $repeatResult;

    // 风险识别结果
    /**
     * @var string
     */
    public $riskResult;

    // 风险识别结果描述
    /**
     * @var string
     */
    public $riskResultDesc;

    // 监测任务ID
    /**
     * @var string
     */
    public $taskId;

}
