<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

use AntChain\STLR\Models\GclProductionItem;

class PushProductDataRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'itemList' => 'item_list',
    ];
    public function validate() {
        Model::validateRequired('itemList', $this->itemList, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->itemList) {
            $res['item_list'] = [];
            if(null !== $this->itemList && is_array($this->itemList)){
                $n = 0;
                foreach($this->itemList as $item){
                    $res['item_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PushProductDataRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['item_list'])){
            if(!empty($map['item_list'])){
                $model->itemList = [];
                $n = 0;
                foreach($map['item_list'] as $item) {
                    $model->itemList[$n++] = null !== $item ? GclProductionItem::fromMap($item) : $item;
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

    // 产品产量填报
    /**
     * @var GclProductionItem[]
     */
    public $itemList;

}
