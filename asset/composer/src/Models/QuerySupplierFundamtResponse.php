<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ASSET\Models;

use AlibabaCloud\Tea\Model;

class QuerySupplierFundamtResponse extends Model
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

    // 出资账户
    /**
     * @var string
     */
    public $fundAccount;

    // 核销金额
    /**
     * @var int
     */
    public $writeOffAmount;

    // 供应商被占用总金额，单位分
    /**
     * @var int
     */
    public $totalAmount;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'fundAccount'    => 'fund_account',
        'writeOffAmount' => 'write_off_amount',
        'totalAmount'    => 'total_amount',
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
        if (null !== $this->fundAccount) {
            $res['fund_account'] = $this->fundAccount;
        }
        if (null !== $this->writeOffAmount) {
            $res['write_off_amount'] = $this->writeOffAmount;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySupplierFundamtResponse
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
        if (isset($map['fund_account'])) {
            $model->fundAccount = $map['fund_account'];
        }
        if (isset($map['write_off_amount'])) {
            $model->writeOffAmount = $map['write_off_amount'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }

        return $model;
    }
}
