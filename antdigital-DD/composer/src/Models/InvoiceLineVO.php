<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class InvoiceLineVO extends Model {
    protected $_name = [
        'lineAmt' => 'line_amt',
        'lineId' => 'line_id',
        'taxAmt' => 'tax_amt',
        'taxRate' => 'tax_rate',
        'lineProductName' => 'line_product_name',
        'taxExclusiveAmt' => 'tax_exclusive_amt',
        'quantity' => 'quantity',
        'unit' => 'unit',
        'unitPrice' => 'unit_price',
        'specificationModel' => 'specification_model',
        'taxClassificationName' => 'tax_classification_name',
        'taxClassificationCode' => 'tax_classification_code',
        'productNameSuffix' => 'product_name_suffix',
    ];
    public function validate() {
        Model::validateRequired('lineAmt', $this->lineAmt, true);
        Model::validateRequired('lineId', $this->lineId, true);
        Model::validateRequired('taxAmt', $this->taxAmt, true);
        Model::validateRequired('taxRate', $this->taxRate, true);
        Model::validateRequired('lineProductName', $this->lineProductName, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->lineAmt) {
            $res['line_amt'] = $this->lineAmt;
        }
        if (null !== $this->lineId) {
            $res['line_id'] = $this->lineId;
        }
        if (null !== $this->taxAmt) {
            $res['tax_amt'] = $this->taxAmt;
        }
        if (null !== $this->taxRate) {
            $res['tax_rate'] = $this->taxRate;
        }
        if (null !== $this->lineProductName) {
            $res['line_product_name'] = $this->lineProductName;
        }
        if (null !== $this->taxExclusiveAmt) {
            $res['tax_exclusive_amt'] = $this->taxExclusiveAmt;
        }
        if (null !== $this->quantity) {
            $res['quantity'] = $this->quantity;
        }
        if (null !== $this->unit) {
            $res['unit'] = $this->unit;
        }
        if (null !== $this->unitPrice) {
            $res['unit_price'] = $this->unitPrice;
        }
        if (null !== $this->specificationModel) {
            $res['specification_model'] = $this->specificationModel;
        }
        if (null !== $this->taxClassificationName) {
            $res['tax_classification_name'] = $this->taxClassificationName;
        }
        if (null !== $this->taxClassificationCode) {
            $res['tax_classification_code'] = $this->taxClassificationCode;
        }
        if (null !== $this->productNameSuffix) {
            $res['product_name_suffix'] = $this->productNameSuffix;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return InvoiceLineVO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['line_amt'])){
            $model->lineAmt = $map['line_amt'];
        }
        if(isset($map['line_id'])){
            $model->lineId = $map['line_id'];
        }
        if(isset($map['tax_amt'])){
            $model->taxAmt = $map['tax_amt'];
        }
        if(isset($map['tax_rate'])){
            $model->taxRate = $map['tax_rate'];
        }
        if(isset($map['line_product_name'])){
            $model->lineProductName = $map['line_product_name'];
        }
        if(isset($map['tax_exclusive_amt'])){
            $model->taxExclusiveAmt = $map['tax_exclusive_amt'];
        }
        if(isset($map['quantity'])){
            $model->quantity = $map['quantity'];
        }
        if(isset($map['unit'])){
            $model->unit = $map['unit'];
        }
        if(isset($map['unit_price'])){
            $model->unitPrice = $map['unit_price'];
        }
        if(isset($map['specification_model'])){
            $model->specificationModel = $map['specification_model'];
        }
        if(isset($map['tax_classification_name'])){
            $model->taxClassificationName = $map['tax_classification_name'];
        }
        if(isset($map['tax_classification_code'])){
            $model->taxClassificationCode = $map['tax_classification_code'];
        }
        if(isset($map['product_name_suffix'])){
            $model->productNameSuffix = $map['product_name_suffix'];
        }
        return $model;
    }
    // 发票行金额
    /**
     * @example 10.09
     * @var string
     */
    public $lineAmt;

    // 发票行ID
    /**
     * @example 20
     * @var string
     */
    public $lineId;

    // 税额
    /**
     * @example 20.09
     * @var string
     */
    public $taxAmt;

    // 税率
    /**
     * @example 0.06
     * @var string
     */
    public $taxRate;

    // 货物或劳务名称，如 软件服务费201612
    /**
     * @example 软件服务费201612
     * @var string
     */
    public $lineProductName;

    // 不含税金额
    /**
     * @example 93.24
     * @var string
     */
    public $taxExclusiveAmt;

    // 数量
    /**
     * @example 13
     * @var int
     */
    public $quantity;

    // 单位
    /**
     * @example 个
     * @var string
     */
    public $unit;

    // 单价
    /**
     * @example 2.34
     * @var string
     */
    public $unitPrice;

    // 规格型号
    /**
     * @example 规格型号
     * @var string
     */
    public $specificationModel;

    // 服务大类
    /**
     * @example 技术服务费
     * @var string
     */
    public $taxClassificationName;

    // 税收分类编号
    /**
     * @example 344555
     * @var string
     */
    public $taxClassificationCode;

    // 货物或劳务名称后缀
    /**
     * @example 202306
     * @var string
     */
    public $productNameSuffix;

}
