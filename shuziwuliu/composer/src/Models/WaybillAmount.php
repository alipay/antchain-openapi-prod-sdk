<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class WaybillAmount extends Model
{
    // 运单金额（2位小数）
    /**
     * @example 100000.00
     *
     * @var string
     */
    public $amount;

    // 运单号
    /**
     * @example 123456
     *
     * @var string
     */
    public $waybillId;
    protected $_name = [
        'amount'    => 'amount',
        'waybillId' => 'waybill_id',
    ];

    public function validate()
    {
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('waybillId', $this->waybillId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->waybillId) {
            $res['waybill_id'] = $this->waybillId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WaybillAmount
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['waybill_id'])) {
            $model->waybillId = $map['waybill_id'];
        }

        return $model;
    }
}
