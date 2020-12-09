<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class OpenDigitalLogisticCreditDriverResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'applyId' => 'apply_id',
        'signUrl' => 'sign_url',
        'status' => 'status',
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
        if (null !== $this->applyId) {
            $res['apply_id'] = $this->applyId;
        }
        if (null !== $this->signUrl) {
            $res['sign_url'] = $this->signUrl;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OpenDigitalLogisticCreditDriverResponse
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
        if(isset($map['apply_id'])){
            $model->applyId = $map['apply_id'];
        }
        if(isset($map['sign_url'])){
            $model->signUrl = $map['sign_url'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
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

    // 签署开通申请id
    /**
     * @var string
     */
    public $applyId;

    // 协议签署开通url
    /**
     * @var string
     */
    public $signUrl;

    // 签署状态
    // -1:签署开通失败, 0:未签署开通, 1:已签署开通
    /**
     * @var int
     */
    public $status;

}
