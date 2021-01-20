<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class CallbackSpiPayordercallbackResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'code' => 'code',
        'data' => 'data',
        'message' => 'message',
        'synchro' => 'synchro',
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
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->synchro) {
            $res['synchro'] = $this->synchro;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CallbackSpiPayordercallbackResponse
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
        if(isset($map['code'])){
            $model->code = $map['code'];
        }
        if(isset($map['data'])){
            $model->data = $map['data'];
        }
        if(isset($map['message'])){
            $model->message = $map['message'];
        }
        if(isset($map['synchro'])){
            $model->synchro = $map['synchro'];
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

    // code
    /**
     * @var string
     */
    public $code;

    // data
    /**
     * @var string
     */
    public $data;

    // message
    /**
     * @var string
     */
    public $message;

    // synchro
    /**
     * @var string
     */
    public $synchro;

    // success
    /**
     * @var bool
     */
    public $success;

}
