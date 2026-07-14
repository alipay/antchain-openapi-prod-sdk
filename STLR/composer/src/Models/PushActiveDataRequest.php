<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

use AntChain\STLR\Models\ActiveDataItem;

class PushActiveDataRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'locationName' => 'location_name',
        'productName' => 'product_name',
        'specification' => 'specification',
        'inputByProcess' => 'input_by_process',
        'itemList' => 'item_list',
        'dataDimension' => 'data_dimension',
    ];
    public function validate() {
        Model::validateRequired('locationName', $this->locationName, true);
        Model::validateRequired('productName', $this->productName, true);
        Model::validateRequired('specification', $this->specification, true);
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
        if (null !== $this->locationName) {
            $res['location_name'] = $this->locationName;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->specification) {
            $res['specification'] = $this->specification;
        }
        if (null !== $this->inputByProcess) {
            $res['input_by_process'] = $this->inputByProcess;
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
        if (null !== $this->dataDimension) {
            $res['data_dimension'] = $this->dataDimension;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PushActiveDataRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['location_name'])){
            $model->locationName = $map['location_name'];
        }
        if(isset($map['product_name'])){
            $model->productName = $map['product_name'];
        }
        if(isset($map['specification'])){
            $model->specification = $map['specification'];
        }
        if(isset($map['input_by_process'])){
            $model->inputByProcess = $map['input_by_process'];
        }
        if(isset($map['item_list'])){
            if(!empty($map['item_list'])){
                $model->itemList = [];
                $n = 0;
                foreach($map['item_list'] as $item) {
                    $model->itemList[$n++] = null !== $item ? ActiveDataItem::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['data_dimension'])){
            $model->dataDimension = $map['data_dimension'];
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

    // 生产单元名称
    /**
     * @var string
     */
    public $locationName;

    // 产品名称
    /**
     * @var string
     */
    public $productName;

    // 规格型号
    /**
     * @var string
     */
    public $specification;

    // 是否按照单元过程录入
    /**
     * @var bool
     */
    public $inputByProcess;

    // lca活动数据项列表
    /**
     * @var ActiveDataItem[]
     */
    public $itemList;

    // 填报维度，PRODUCT，UNIT
    /**
     * @var string
     */
    public $dataDimension;

}
