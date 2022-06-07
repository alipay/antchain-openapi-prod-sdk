<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INDUSTRY\Models;

use AlibabaCloud\Tea\Model;

class TradeSettleDetail extends Model
{
    // 类型
    // replenish(补差)、replenish_refund(退补差)、transfer(分账)、transfer_refund(退分账)、settle(结算)、settle_refund(退结算)、on_settle(待结算)
    /**
     * @example transfer
     *
     * @var string
     */
    public $type;

    // 结算明细序列号，即结算请求中的业务单据号
    /**
     * @example 123456
     *
     * @var string
     */
    public $serialNo;

    // 转入账户
    /**
     * @example 2088123456789
     *
     * @var string
     */
    public $transIn;

    // 转出账号
    /**
     * @example 2088102146225135
     *
     * @var string
     */
    public $transOut;

    // 金额，元，最小支持到分
    /**
     * @example 10.99
     *
     * @var string
     */
    public $amount;
    protected $_name = [
        'type'     => 'type',
        'serialNo' => 'serial_no',
        'transIn'  => 'trans_in',
        'transOut' => 'trans_out',
        'amount'   => 'amount',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('serialNo', $this->serialNo, true);
        Model::validateRequired('transOut', $this->transOut, true);
        Model::validateRequired('amount', $this->amount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->serialNo) {
            $res['serial_no'] = $this->serialNo;
        }
        if (null !== $this->transIn) {
            $res['trans_in'] = $this->transIn;
        }
        if (null !== $this->transOut) {
            $res['trans_out'] = $this->transOut;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TradeSettleDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['serial_no'])) {
            $model->serialNo = $map['serial_no'];
        }
        if (isset($map['trans_in'])) {
            $model->transIn = $map['trans_in'];
        }
        if (isset($map['trans_out'])) {
            $model->transOut = $map['trans_out'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }

        return $model;
    }
}
