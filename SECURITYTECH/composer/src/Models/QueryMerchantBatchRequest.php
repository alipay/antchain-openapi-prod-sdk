<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

use AntChain\SECURITYTECH\Models\MaoUsciIndustryPair;

class QueryMerchantBatchRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'merchantIds' => 'merchant_ids',
        'usciIndustryPairs' => 'usci_industry_pairs',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->merchantIds) {
            $res['merchant_ids'] = $this->merchantIds;
        }
        if (null !== $this->usciIndustryPairs) {
            $res['usci_industry_pairs'] = [];
            if(null !== $this->usciIndustryPairs && is_array($this->usciIndustryPairs)){
                $n = 0;
                foreach($this->usciIndustryPairs as $item){
                    $res['usci_industry_pairs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryMerchantBatchRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['merchant_ids'])){
            if(!empty($map['merchant_ids'])){
                $model->merchantIds = $map['merchant_ids'];
            }
        }
        if(isset($map['usci_industry_pairs'])){
            if(!empty($map['usci_industry_pairs'])){
                $model->usciIndustryPairs = [];
                $n = 0;
                foreach($map['usci_industry_pairs'] as $item) {
                    $model->usciIndustryPairs[$n++] = null !== $item ? MaoUsciIndustryPair::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 商户号列表
    /**
     * @var string[]
     */
    public $merchantIds;

    // usci+industry 组合列表
    /**
     * @var MaoUsciIndustryPair[]
     */
    public $usciIndustryPairs;

}
