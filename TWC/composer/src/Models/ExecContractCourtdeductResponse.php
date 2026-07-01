<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ExecContractCourtdeductResponse extends Model
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

    // 是否执行成功
    /**
     * @var bool
     */
    public $success;

    // 扣款金额，单位：分
    /**
     * @var int
     */
    public $payMoney;

    // 扣款详情信息
    /**
     * @var string
     */
    public $payDetailMsg;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'success'      => 'success',
        'payMoney'     => 'pay_money',
        'payDetailMsg' => 'pay_detail_msg',
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
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->payMoney) {
            $res['pay_money'] = $this->payMoney;
        }
        if (null !== $this->payDetailMsg) {
            $res['pay_detail_msg'] = $this->payDetailMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecContractCourtdeductResponse
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
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['pay_money'])) {
            $model->payMoney = $map['pay_money'];
        }
        if (isset($map['pay_detail_msg'])) {
            $model->payDetailMsg = $map['pay_detail_msg'];
        }

        return $model;
    }
}
