<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AICONUMDECISION\Models;

use AlibabaCloud\Tea\Model;

class QueryAntcloudDtcallagentVoiceinspectionResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'qcRecordId' => 'qc_record_id',
        'status' => 'status',
        'totalScore' => 'total_score',
        'result' => 'result',
        'checklist' => 'checklist',
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
        if (null !== $this->qcRecordId) {
            $res['qc_record_id'] = $this->qcRecordId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->totalScore) {
            $res['total_score'] = $this->totalScore;
        }
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        if (null !== $this->checklist) {
            $res['checklist'] = $this->checklist;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAntcloudDtcallagentVoiceinspectionResponse
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
        if(isset($map['qc_record_id'])){
            $model->qcRecordId = $map['qc_record_id'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['total_score'])){
            $model->totalScore = $map['total_score'];
        }
        if(isset($map['result'])){
            $model->result = $map['result'];
        }
        if(isset($map['checklist'])){
            if(!empty($map['checklist'])){
                $model->checklist = $map['checklist'];
            }
        }
        return $model;
    }
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

    // qc_record_id
    /**
     * @var string
     */
    public $qcRecordId;

    // 异步任务状态，如 PROCESSING、COMPLETED、FAILED
    /**
     * @var string
     */
    public $status;

    // 100 分制总分
    /**
     * @var int
     */
    public $totalScore;

    // result
    /**
     * @var string
     */
    public $result;

    // 质检规则命中明细
    /**
     * @var string[]
     */
    public $checklist;

}
