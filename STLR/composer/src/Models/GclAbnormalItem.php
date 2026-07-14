<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class GclAbnormalItem extends Model {
    protected $_name = [
        'externalItemCode' => 'external_item_code',
        'locationName' => 'location_name',
        'specification' => 'specification',
        'productName' => 'product_name',
        'occurDate' => 'occur_date',
        'dosageUnit' => 'dosage_unit',
        'errorCode' => 'error_code',
        'errorMsg' => 'error_msg',
        'processName' => 'process_name',
        'materialType' => 'material_type',
        'materialName' => 'material_name',
        'supplierName' => 'supplier_name',
        'supplierProductName' => 'supplier_product_name',
        'processNo' => 'process_no',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->externalItemCode) {
            $res['external_item_code'] = $this->externalItemCode;
        }
        if (null !== $this->locationName) {
            $res['location_name'] = $this->locationName;
        }
        if (null !== $this->specification) {
            $res['specification'] = $this->specification;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->occurDate) {
            $res['occur_date'] = $this->occurDate;
        }
        if (null !== $this->dosageUnit) {
            $res['dosage_unit'] = $this->dosageUnit;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->errorMsg) {
            $res['error_msg'] = $this->errorMsg;
        }
        if (null !== $this->processName) {
            $res['process_name'] = $this->processName;
        }
        if (null !== $this->materialType) {
            $res['material_type'] = $this->materialType;
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
        if (null !== $this->processNo) {
            $res['process_no'] = $this->processNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GclAbnormalItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['external_item_code'])){
            $model->externalItemCode = $map['external_item_code'];
        }
        if(isset($map['location_name'])){
            $model->locationName = $map['location_name'];
        }
        if(isset($map['specification'])){
            $model->specification = $map['specification'];
        }
        if(isset($map['product_name'])){
            $model->productName = $map['product_name'];
        }
        if(isset($map['occur_date'])){
            $model->occurDate = $map['occur_date'];
        }
        if(isset($map['dosage_unit'])){
            $model->dosageUnit = $map['dosage_unit'];
        }
        if(isset($map['error_code'])){
            $model->errorCode = $map['error_code'];
        }
        if(isset($map['error_msg'])){
            $model->errorMsg = $map['error_msg'];
        }
        if(isset($map['process_name'])){
            $model->processName = $map['process_name'];
        }
        if(isset($map['material_type'])){
            $model->materialType = $map['material_type'];
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
        if(isset($map['process_no'])){
            $model->processNo = $map['process_no'];
        }
        return $model;
    }
    // 明细编码
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

    // 产品规格
    /**
     * @example xxxx
     * @var string
     */
    public $specification;

    // 产品名称
    /**
     * @example xxxx
     * @var string
     */
    public $productName;

    // 发生月份
    /**
     * @example xxxx
     * @var string
     */
    public $occurDate;

    // 请求单位
    /**
     * @example -
     * @var string
     */
    public $dosageUnit;

    // 业务错误码
    /**
     * @example -
     * @var string
     */
    public $errorCode;

    // 错误描述
    /**
     * @example -
     * @var string
     */
    public $errorMsg;

    // 单元过程名称
    /**
     * @example xxxx
     * @var string
     */
    public $processName;

    // 物料类型
    /**
     * @example xxxx
     * @var string
     */
    public $materialType;

    // 物料名称
    /**
     * @example xxxx
     * @var string
     */
    public $materialName;

    // 供应商名称
    /**
     * @example xxxx
     * @var string
     */
    public $supplierName;

    // 供应商产品名称
    /**
     * @example xxxx
     * @var string
     */
    public $supplierProductName;

    // 过程编码
    /**
     * @example xxxx
     * @var string
     */
    public $processNo;

}
