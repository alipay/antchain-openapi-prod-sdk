<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class CreateIRealpersonFacevrfServerResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'certifyId' => 'certify_id',
        'certifyUrl' => 'certify_url',
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
        if (null !== $this->certifyId) {
            $res['certify_id'] = $this->certifyId;
        }
        if (null !== $this->certifyUrl) {
            $res['certify_url'] = $this->certifyUrl;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateIRealpersonFacevrfServerResponse
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
        if(isset($map['certify_id'])){
            $model->certifyId = $map['certify_id'];
        }
        if(isset($map['certify_url'])){
            $model->certifyUrl = $map['certify_url'];
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

    // 实人认证唯一标识
    /**
     * @var string
     */
    public $certifyId;

    // 认证地址。只在特定场景返回。
    /**
     * @var string
     */
    public $certifyUrl;

}
