<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTX\Models;

use AlibabaCloud\Tea\Model;

class PayOrderDataResponse extends Model
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

    // 鲸探开放平台内部订单号
    /**
     * @var string
     */
    public $openOrderNo;

    // json字符串
    /**
     * @var string
     */
    public $payParams;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'openOrderNo' => 'open_order_no',
        'payParams'   => 'pay_params',
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
        if (null !== $this->openOrderNo) {
            $res['open_order_no'] = $this->openOrderNo;
        }
        if (null !== $this->payParams) {
            $res['pay_params'] = $this->payParams;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PayOrderDataResponse
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
        if (isset($map['open_order_no'])) {
            $model->openOrderNo = $map['open_order_no'];
        }
        if (isset($map['pay_params'])) {
            $model->payParams = $map['pay_params'];
        }

        return $model;
    }
}
