<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CargoAmount extends Model {
    protected $_name = [
        'amount' => 'amount',
        'cargoOrder' => 'cargo_order',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->cargoOrder) {
            $res['cargo_order'] = $this->cargoOrder;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CargoAmount
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['amount'])){
            $model->amount = $map['amount'];
        }
        if(isset($map['cargo_order'])){
            $model->cargoOrder = $map['cargo_order'];
        }
        return $model;
    }
    // 货运单对应金额（2位小数）
    /**
     * @example 100000.00
     * @var string
     */
    public $amount;

    // 货源单号
    /**
     * @example 123466
     * @var string
     */
    public $cargoOrder;

}
