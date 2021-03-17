<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ListContractTradeidsResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 0表示成功
    /**
     * @var int
     */
    public $code;

    // 错误信息描述
    /**
     * @var string
     */
    public $errMessage;

    // 所有item的个数
    /**
     * @var int
     */
    public $total;

    // 所有满足条件的订单
    /**
     * @var string[]
     */
    public $outTradeNo;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'code'       => 'code',
        'errMessage' => 'err_message',
        'total'      => 'total',
        'outTradeNo' => 'out_trade_no',
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
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->errMessage) {
            $res['err_message'] = $this->errMessage;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->outTradeNo) {
            $res['out_trade_no'] = $this->outTradeNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListContractTradeidsResponse
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
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['err_message'])) {
            $model->errMessage = $map['err_message'];
        }
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['out_trade_no'])) {
            if (!empty($map['out_trade_no'])) {
                $model->outTradeNo = $map['out_trade_no'];
            }
        }

        return $model;
    }
}
