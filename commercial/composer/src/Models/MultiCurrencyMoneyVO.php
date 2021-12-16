<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class MultiCurrencyMoneyVO extends Model
{
    // amount
    /**
     * @example amount
     *
     * @var string
     */
    public $amt;

    // ccy
    /**
     * @example ccy
     *
     * @var string
     */
    public $ccy;
    protected $_name = [
        'amt' => 'amt',
        'ccy' => 'ccy',
    ];

    public function validate()
    {
        Model::validateRequired('amt', $this->amt, true);
        Model::validateRequired('ccy', $this->ccy, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->amt) {
            $res['amt'] = $this->amt;
        }
        if (null !== $this->ccy) {
            $res['ccy'] = $this->ccy;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MultiCurrencyMoneyVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['amt'])) {
            $model->amt = $map['amt'];
        }
        if (isset($map['ccy'])) {
            $model->ccy = $map['ccy'];
        }

        return $model;
    }
}
