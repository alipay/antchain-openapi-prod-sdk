<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BAASDT\Models\UserPriceEquity;

class QueryBlockanalysisUserpriceupdatedequitiesResponse extends Model {
    protected $_name = [
        'equities' => 'equities',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->equities) {
            $res['equities'] = [];
            if(null !== $this->equities && is_array($this->equities)){
                $n = 0;
                foreach($this->equities as $item){
                    $res['equities'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBlockanalysisUserpriceupdatedequitiesResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['equities'])){
            if(!empty($map['equities'])){
                $model->equities = [];
                $n = 0;
                foreach($map['equities'] as $item) {
                    $model->equities[$n++] = null !== $item ? UserPriceEquity::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    /**
     * @description 权益商品信息详细信息list
     * @example 
     * @var array
     */
    public $equities;

}
