<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class PostPayPrice extends Model
{
    // 币种单位值，156（CNY)
    /**
     * @example  币种单位值，156（CNY)
     *
     * @var string
     */
    public $currencyValue;

    // 价格周期
    /**
     * @example  价格周期
     *
     * @var OrderDuration
     */
    public $duration;

    // 非继承型一客一价
    /**
     * @example 非继承型一客一价
     *
     * @var NoExtendPrice[]
     */
    public $noExtendPrices;
    protected $_name = [
        'currencyValue'  => 'currency_value',
        'duration'       => 'duration',
        'noExtendPrices' => 'no_extend_prices',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->currencyValue) {
            $res['currency_value'] = $this->currencyValue;
        }
        if (null !== $this->duration) {
            $res['duration'] = null !== $this->duration ? $this->duration->toMap() : null;
        }
        if (null !== $this->noExtendPrices) {
            $res['no_extend_prices'] = [];
            if (null !== $this->noExtendPrices && \is_array($this->noExtendPrices)) {
                $n = 0;
                foreach ($this->noExtendPrices as $item) {
                    $res['no_extend_prices'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PostPayPrice
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['currency_value'])) {
            $model->currencyValue = $map['currency_value'];
        }
        if (isset($map['duration'])) {
            $model->duration = OrderDuration::fromMap($map['duration']);
        }
        if (isset($map['no_extend_prices'])) {
            if (!empty($map['no_extend_prices'])) {
                $model->noExtendPrices = [];
                $n                     = 0;
                foreach ($map['no_extend_prices'] as $item) {
                    $model->noExtendPrices[$n++] = null !== $item ? NoExtendPrice::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
