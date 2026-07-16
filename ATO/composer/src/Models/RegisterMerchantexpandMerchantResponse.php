<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class RegisterMerchantexpandMerchantResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'payExpandId' => 'pay_expand_id',
        'enrollmentStatus' => 'enrollment_status',
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
        if (null !== $this->payExpandId) {
            $res['pay_expand_id'] = $this->payExpandId;
        }
        if (null !== $this->enrollmentStatus) {
            $res['enrollment_status'] = $this->enrollmentStatus;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RegisterMerchantexpandMerchantResponse
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
        if(isset($map['pay_expand_id'])){
            $model->payExpandId = $map['pay_expand_id'];
        }
        if(isset($map['enrollment_status'])){
            $model->enrollmentStatus = $map['enrollment_status'];
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

    // 进件流水号
    /**
     * @var string
     */
    public $payExpandId;

    // 进件状态
    // INIT 入驻中
    // SUCCESS 入驻成功
    // FAIL 入驻失败
    /**
     * @var string
     */
    public $enrollmentStatus;

}
