<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AICONUMDECISION\Models;

use AlibabaCloud\Tea\Model;

class ExecuteAntcloudDtcallagentVoiceinspectionResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'qcRecordId' => 'qc_record_id',
        'status' => 'status',
        'batchId' => 'batch_id',
        'externalCallId' => 'external_call_id',
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
        if (null !== $this->batchId) {
            $res['batch_id'] = $this->batchId;
        }
        if (null !== $this->externalCallId) {
            $res['external_call_id'] = $this->externalCallId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecuteAntcloudDtcallagentVoiceinspectionResponse
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
        if(isset($map['batch_id'])){
            $model->batchId = $map['batch_id'];
        }
        if(isset($map['external_call_id'])){
            $model->externalCallId = $map['external_call_id'];
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

    // 质检记录 ID
    /**
     * @var string
     */
    public $qcRecordId;

    // ACCEPTED 表示异步任务已受理
    /**
     * @var string
     */
    public $status;

    // 本次提交的批次 ID
    /**
     * @var string
     */
    public $batchId;

    // 外部通话唯一标识
    /**
     * @var string
     */
    public $externalCallId;

}
