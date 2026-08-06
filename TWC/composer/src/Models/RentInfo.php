<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class RentInfo extends Model {
    protected $_name = [
        'rentPrice' => 'rent_price',
        'rentTerm' => 'rent_term',
        'commission' => 'commission',
        'buyoutPrice' => 'buyout_price',
        'retainedPrice' => 'retained_price',
    ];
    public function validate() {
        Model::validateRequired('rentPrice', $this->rentPrice, true);
        Model::validateRequired('rentTerm', $this->rentTerm, true);
        Model::validateRequired('commission', $this->commission, true);
        Model::validateRequired('buyoutPrice', $this->buyoutPrice, true);
        Model::validateRequired('retainedPrice', $this->retainedPrice, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->rentPrice) {
            $res['rent_price'] = $this->rentPrice;
        }
        if (null !== $this->rentTerm) {
            $res['rent_term'] = $this->rentTerm;
        }
        if (null !== $this->commission) {
            $res['commission'] = $this->commission;
        }
        if (null !== $this->buyoutPrice) {
            $res['buyout_price'] = $this->buyoutPrice;
        }
        if (null !== $this->retainedPrice) {
            $res['retained_price'] = $this->retainedPrice;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RentInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['rent_price'])){
            $model->rentPrice = $map['rent_price'];
        }
        if(isset($map['rent_term'])){
            $model->rentTerm = $map['rent_term'];
        }
        if(isset($map['commission'])){
            $model->commission = $map['commission'];
        }
        if(isset($map['buyout_price'])){
            $model->buyoutPrice = $map['buyout_price'];
        }
        if(isset($map['retained_price'])){
            $model->retainedPrice = $map['retained_price'];
        }
        return $model;
    }
    // 租金
    /**
     * @example 2933300
     * @var int
     */
    public $rentPrice;

    // 租期
    /**
     * @example 12
     * @var int
     */
    public $rentTerm;

    // 手续费
    /**
     * @example 1234
     * @var int
     */
    public $commission;

    // 买断价
    /**
     * @example 0
     * @var int
     */
    public $buyoutPrice;

    // 留购价
    /**
     * @example 31903 
     * @var int
     */
    public $retainedPrice;

}
