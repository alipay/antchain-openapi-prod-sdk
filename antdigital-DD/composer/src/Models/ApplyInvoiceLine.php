<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class ApplyInvoiceLine extends Model {
    protected $_name = [
        'amt' => 'amt',
        'taxAmt' => 'tax_amt',
        'taxRate' => 'tax_rate',
        'taxExclusiveAmt' => 'tax_exclusive_amt',
        'unitAmt' => 'unit_amt',
        'taxClassificationCode' => 'tax_classification_code',
        'productName' => 'product_name',
        'productCode' => 'product_code',
        'productSpecification' => 'product_specification',
        'measurementNnit' => 'measurement_nnit',
        'quantity' => 'quantity',
        'invoiceLineId' => 'invoice_line_id',
        'productNameSuffix' => 'product_name_suffix',
    ];
    public function validate() {
        Model::validateRequired('amt', $this->amt, true);
        Model::validateRequired('taxAmt', $this->taxAmt, true);
        Model::validateRequired('taxRate', $this->taxRate, true);
        Model::validateRequired('taxExclusiveAmt', $this->taxExclusiveAmt, true);
        Model::validateRequired('unitAmt', $this->unitAmt, true);
        Model::validateRequired('taxClassificationCode', $this->taxClassificationCode, true);
        Model::validateRequired('productName', $this->productName, true);
        Model::validateRequired('invoiceLineId', $this->invoiceLineId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->amt) {
            $res['amt'] = $this->amt;
        }
        if (null !== $this->taxAmt) {
            $res['tax_amt'] = $this->taxAmt;
        }
        if (null !== $this->taxRate) {
            $res['tax_rate'] = $this->taxRate;
        }
        if (null !== $this->taxExclusiveAmt) {
            $res['tax_exclusive_amt'] = $this->taxExclusiveAmt;
        }
        if (null !== $this->unitAmt) {
            $res['unit_amt'] = $this->unitAmt;
        }
        if (null !== $this->taxClassificationCode) {
            $res['tax_classification_code'] = $this->taxClassificationCode;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->productSpecification) {
            $res['product_specification'] = $this->productSpecification;
        }
        if (null !== $this->measurementNnit) {
            $res['measurement_nnit'] = $this->measurementNnit;
        }
        if (null !== $this->quantity) {
            $res['quantity'] = $this->quantity;
        }
        if (null !== $this->invoiceLineId) {
            $res['invoice_line_id'] = $this->invoiceLineId;
        }
        if (null !== $this->productNameSuffix) {
            $res['product_name_suffix'] = $this->productNameSuffix;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ApplyInvoiceLine
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['amt'])){
            $model->amt = $map['amt'];
        }
        if(isset($map['tax_amt'])){
            $model->taxAmt = $map['tax_amt'];
        }
        if(isset($map['tax_rate'])){
            $model->taxRate = $map['tax_rate'];
        }
        if(isset($map['tax_exclusive_amt'])){
            $model->taxExclusiveAmt = $map['tax_exclusive_amt'];
        }
        if(isset($map['unit_amt'])){
            $model->unitAmt = $map['unit_amt'];
        }
        if(isset($map['tax_classification_code'])){
            $model->taxClassificationCode = $map['tax_classification_code'];
        }
        if(isset($map['product_name'])){
            $model->productName = $map['product_name'];
        }
        if(isset($map['product_code'])){
            $model->productCode = $map['product_code'];
        }
        if(isset($map['product_specification'])){
            $model->productSpecification = $map['product_specification'];
        }
        if(isset($map['measurement_nnit'])){
            $model->measurementNnit = $map['measurement_nnit'];
        }
        if(isset($map['quantity'])){
            $model->quantity = $map['quantity'];
        }
        if(isset($map['invoice_line_id'])){
            $model->invoiceLineId = $map['invoice_line_id'];
        }
        if(isset($map['product_name_suffix'])){
            $model->productNameSuffix = $map['product_name_suffix'];
        }
        return $model;
    }
    // 含税金额
    /**
     * @example 133880
     * @var string
     */
    public $amt;

    // 税额
    /**
     * @example 45
     * @var string
     */
    public $taxAmt;

    // 税率
    /**
     * @example 0.13
     * @var string
     */
    public $taxRate;

    // 不含税金额
    /**
     * @example 24556
     * @var string
     */
    public $taxExclusiveAmt;

    // 含税单价
    /**
     * @example 234
     * @var string
     */
    public $unitAmt;

    // 服务大类编号
    /**
     * @example 2345455
     * @var string
     */
    public $taxClassificationCode;

    // 货物或劳务名称
    /**
     * @example 技术服务费
     * @var string
     */
    public $productName;

    // 产品CODE
    /**
     * @example SPU33445
     * @var string
     */
    public $productCode;

    // 规格型号
    /**
     * @example 333
     * @var string
     */
    public $productSpecification;

    // 计量单位
    /**
     * @example 个
     * @var string
     */
    public $measurementNnit;

    // 数量，默认为1
    /**
     * @example 1
     * @var string
     */
    public $quantity;

    // 发票行ID
    /**
     * @example 33455666
     * @var string
     */
    public $invoiceLineId;

    // 劳务与货物名称的后缀，主要有账期（202309）、PID（2088XXXX）等
    /**
     * @example 202309
     * @var string
     */
    public $productNameSuffix;

}
