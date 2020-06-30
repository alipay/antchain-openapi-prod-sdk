<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryMerchantExchangeableequitydetailResponse extends Model {
    protected $_name = [
        'equity' => 'equity',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->equity) {
            $res['equity'] = null !== $this->equity ? $this->equity->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryMerchantExchangeableequitydetailResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['equity'])){
            $model->equity = EquityDetail::fromMap($map['equity']);
        }
        return $model;
    }
    /**
     * @description 可兑换的商品详情信息
     * @example 
     * @var EquityDetail
     */
    public $equity;

}
