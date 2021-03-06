<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateLeaseZftagreementunsignResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'errMessage' => 'err_message',
        'code' => 'code',
        'responseData' => 'response_data',
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
        if (null !== $this->errMessage) {
            $res['err_message'] = $this->errMessage;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->responseData) {
            $res['response_data'] = $this->responseData;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateLeaseZftagreementunsignResponse
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
        if(isset($map['err_message'])){
            $model->errMessage = $map['err_message'];
        }
        if(isset($map['code'])){
            $model->code = $map['code'];
        }
        if(isset($map['response_data'])){
            $model->responseData = $map['response_data'];
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

    // 错误码描述信息
    /**
     * @var string
     */
    public $errMessage;

    // 错误码
    /**
     * @var int
     */
    public $code;

    // 网商直付通解约链上哈希
    /**
     * @var string
     */
    public $responseData;

}
