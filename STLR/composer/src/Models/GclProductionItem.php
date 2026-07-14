<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

use AntChain\STLR\Models\MonthDataDetail;

class GclProductionItem extends Model {
    protected $_name = [
        'externalItemCode' => 'external_item_code',
        'locationName' => 'location_name',
        'productName' => 'product_name',
        'specification' => 'specification',
        'productionDataList' => 'production_data_list',
    ];
    public function validate() {
        Model::validateRequired('locationName', $this->locationName, true);
        Model::validateRequired('productName', $this->productName, true);
        Model::validateRequired('specification', $this->specification, true);
        Model::validateRequired('productionDataList', $this->productionDataList, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->externalItemCode) {
            $res['external_item_code'] = $this->externalItemCode;
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
        if (null !== $this->productionDataList) {
            $res['production_data_list'] = [];
            if(null !== $this->productionDataList && is_array($this->productionDataList)){
                $n = 0;
                foreach($this->productionDataList as $item){
                    $res['production_data_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GclProductionItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['external_item_code'])){
            $model->externalItemCode = $map['external_item_code'];
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
        if(isset($map['production_data_list'])){
            if(!empty($map['production_data_list'])){
                $model->productionDataList = [];
                $n = 0;
                foreach($map['production_data_list'] as $item) {
                    $model->productionDataList[$n++] = null !== $item ? MonthDataDetail::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 用户侧传入明细编码，用于异常回传和排查
    /**
     * @example xxxx
     * @var string
     */
    public $externalItemCode;

    // 生产单元名称
    /**
     * @example xxxx
     * @var string
     */
    public $locationName;

    // 产品名称
    /**
     * @example xxxx
     * @var string
     */
    public $productName;

    // 产品规格
    /**
     * @example xxxx
     * @var string
     */
    public $specification;

    // 月度产量明细
    /**
     * @example undefined
     * @var MonthDataDetail[]
     */
    public $productionDataList;

}
