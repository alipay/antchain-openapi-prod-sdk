<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RMS\Models\CallErrorMessage;

class ExecRmsUniversalcleankeyResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'errorMessage' => 'error_message',
        'partSuc' => 'part_suc',
        'result' => 'result',
        'success' => 'success',
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
        if (null !== $this->errorMessage) {
            $res['error_message'] = null !== $this->errorMessage ? $this->errorMessage->toMap() : null;
        }
        if (null !== $this->partSuc) {
            $res['part_suc'] = $this->partSuc;
        }
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecRmsUniversalcleankeyResponse
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
        if(isset($map['error_message'])){
            $model->errorMessage = CallErrorMessage::fromMap($map['error_message']);
        }
        if(isset($map['part_suc'])){
            $model->partSuc = $map['part_suc'];
        }
        if(isset($map['result'])){
            $model->result = $map['result'];
        }
        if(isset($map['success'])){
            $model->success = $map['success'];
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

    // error_message
    /**
     * @var CallErrorMessage
     */
    public $errorMessage;

    // part_suc
    /**
     * @var bool
     */
    public $partSuc;

    // result
    /**
     * @var string
     */
    public $result;

    // success
    /**
     * @var bool
     */
    public $success;

}
