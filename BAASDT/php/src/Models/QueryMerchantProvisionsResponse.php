<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BAASDT\Models\DiscreteValue;

class QueryMerchantProvisionsResponse extends Model {
    protected $_name = [
        'discreteValues' => 'discrete_values',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->discreteValues) {
            $res['discrete_values'] = [];
            if(null !== $this->discreteValues && is_array($this->discreteValues)){
                $n = 0;
                foreach($this->discreteValues as $item){
                    $res['discrete_values'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryMerchantProvisionsResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['discrete_values'])){
            if(!empty($map['discrete_values'])){
                $model->discreteValues = [];
                $n = 0;
                foreach($map['discrete_values'] as $item) {
                    $model->discreteValues[$n++] = null !== $item ? DiscreteValue::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    /**
     * @description 租户的备付金列表信息
     * @example 
     * @var array
     */
    public $discreteValues;

}
