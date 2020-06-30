<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryMerchantExchangeableequitylistResponse extends Model {
    protected $_name = [
        'object' => 'object',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->object) {
            $res['object'] = null !== $this->object ? $this->object->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryMerchantExchangeableequitylistResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['object'])){
            $model->object = ExchangeableEquityList::fromMap($map['object']);
        }
        return $model;
    }
    /**
     * @description 可兑换商品信息列表
     * @example 
     * @var ExchangeableEquityList
     */
    public $object;

}
