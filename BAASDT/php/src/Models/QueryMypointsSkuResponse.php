<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BAASDT\Models\SKUItem;

class QueryMypointsSkuResponse extends Model {
    protected $_name = [
        'skus' => 'skus',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->skus) {
            $res['skus'] = [];
            if(null !== $this->skus && is_array($this->skus)){
                $n = 0;
                foreach($this->skus as $item){
                    $res['skus'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryMypointsSkuResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['skus'])){
            if(!empty($map['skus'])){
                $model->skus = [];
                $n = 0;
                foreach($map['skus'] as $item) {
                    $model->skus[$n++] = null !== $item ? SKUItem::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    /**
     * @description 商品列表
     * @example 
     * @var array
     */
    public $skus;

}
