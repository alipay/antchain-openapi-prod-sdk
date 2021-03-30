<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class UploadOrderAmount extends Model
{
    // 币种
    /**
     * @example 人民币
     *
     * @var string
     */
    public $currency;

    // 总金额
    /**
     * @example 123.23
     *
     * @var string
     */
    public $totalAmount;
    protected $_name = [
        'currency'    => 'currency',
        'totalAmount' => 'total_amount',
    ];

    public function validate()
    {
        Model::validateRequired('currency', $this->currency, true);
        Model::validateRequired('totalAmount', $this->totalAmount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadOrderAmount
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }

        return $model;
    }
}
