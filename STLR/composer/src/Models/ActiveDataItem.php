<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

use AntChain\STLR\Models\MonthDataDetail;

class ActiveDataItem extends Model {
    protected $_name = [
        'externalItemCode' => 'external_item_code',
        'processName' => 'process_name',
        'materialName' => 'material_name',
        'supplierName' => 'supplier_name',
        'supplierProductName' => 'supplier_product_name',
        'activeDataList' => 'active_data_list',
        'processNo' => 'process_no',
        'materialType' => 'material_type',
    ];
    public function validate() {
        Model::validateRequired('materialName', $this->materialName, true);
        Model::validateRequired('activeDataList', $this->activeDataList, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->externalItemCode) {
            $res['external_item_code'] = $this->externalItemCode;
        }
        if (null !== $this->processName) {
            $res['process_name'] = $this->processName;
        }
        if (null !== $this->materialName) {
            $res['material_name'] = $this->materialName;
        }
        if (null !== $this->supplierName) {
            $res['supplier_name'] = $this->supplierName;
        }
        if (null !== $this->supplierProductName) {
            $res['supplier_product_name'] = $this->supplierProductName;
        }
        if (null !== $this->activeDataList) {
            $res['active_data_list'] = [];
            if(null !== $this->activeDataList && is_array($this->activeDataList)){
                $n = 0;
                foreach($this->activeDataList as $item){
                    $res['active_data_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->processNo) {
            $res['process_no'] = $this->processNo;
        }
        if (null !== $this->materialType) {
            $res['material_type'] = $this->materialType;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ActiveDataItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['external_item_code'])){
            $model->externalItemCode = $map['external_item_code'];
        }
        if(isset($map['process_name'])){
            $model->processName = $map['process_name'];
        }
        if(isset($map['material_name'])){
            $model->materialName = $map['material_name'];
        }
        if(isset($map['supplier_name'])){
            $model->supplierName = $map['supplier_name'];
        }
        if(isset($map['supplier_product_name'])){
            $model->supplierProductName = $map['supplier_product_name'];
        }
        if(isset($map['active_data_list'])){
            if(!empty($map['active_data_list'])){
                $model->activeDataList = [];
                $n = 0;
                foreach($map['active_data_list'] as $item) {
                    $model->activeDataList[$n++] = null !== $item ? MonthDataDetail::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['process_no'])){
            $model->processNo = $map['process_no'];
        }
        if(isset($map['material_type'])){
            $model->materialType = $map['material_type'];
        }
        return $model;
    }
    // 明细编码，用于异常回传和排查
    /**
     * @example xxxx
     * @var string
     */
    public $externalItemCode;

    // 单元过程名称；`inputByProcess = true` 时必填，取 options 返回的 `processList[].processName`
    /**
     * @example xxxx
     * @var string
     */
    public $processName;

    // 物料名称
    /**
     * @example xxxx
     * @var string
     */
    public $materialName;

    // 供应商名称，无供应商时为空
    /**
     * @example xxxx
     * @var string
     */
    public $supplierName;

    // 外购产品或自有产品名称，无供应商产品时为空
    /**
     * @example xxxx
     * @var string
     */
    public $supplierProductName;

    // 月度活动数据明细，包含多个月份
    /**
     * @example undefined
     * @var MonthDataDetail[]
     */
    public $activeDataList;

    // 单元过程编码
    /**
     * @example xxxx
     * @var string
     */
    public $processNo;

    // 物料类型，默认为RAW原辅料数据
    /**
     * @example xxxx
     * @var string
     */
    public $materialType;

}
