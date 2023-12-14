<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_aafd16538edd4fc0ab50acd01355adb6\Models;

use AlibabaCloud\Tea\Model;

class StartBlockchainTaxRiskEvaluationResponse extends Model
{
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

    // 授权订单订单号
    /**
     * @var string
     */
    public $orderNo;

    // 是否授权成功true是，false否
    /**
     * @var string
     */
    public $authSuccess;

    // 过期时间，unix时间戳 毫秒
    /**
     * @var int
     */
    public $expireTime;

    // 授权时间，unix时间戳 毫秒
    /**
     * @var int
     */
    public $authTime;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'orderNo'     => 'order_no',
        'authSuccess' => 'auth_success',
        'expireTime'  => 'expire_time',
        'authTime'    => 'auth_time',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
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
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->authSuccess) {
            $res['auth_success'] = $this->authSuccess;
        }
        if (null !== $this->expireTime) {
            $res['expire_time'] = $this->expireTime;
        }
        if (null !== $this->authTime) {
            $res['auth_time'] = $this->authTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartBlockchainTaxRiskEvaluationResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['auth_success'])) {
            $model->authSuccess = $map['auth_success'];
        }
        if (isset($map['expire_time'])) {
            $model->expireTime = $map['expire_time'];
        }
        if (isset($map['auth_time'])) {
            $model->authTime = $map['auth_time'];
        }

        return $model;
    }
}
