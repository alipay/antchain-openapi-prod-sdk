<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class PreviewInvoiceLine extends Model {
    protected $_name = [
        'lineProductName' => 'line_product_name',
        'taxRate' => 'tax_rate',
        'lineAmt' => 'line_amt',
        'ccy' => 'ccy',
        'measurementUnit' => 'measurement_unit',
        'relateCommodityCode' => 'relate_commodity_code',
        'serviceMode' => 'service_mode',
        'productSpecification' => 'product_specification',
    ];
    public function validate() {
        Model::validateRequired('lineProductName', $this->lineProductName, true);
        Model::validateRequired('taxRate', $this->taxRate, true);
        Model::validateRequired('lineAmt', $this->lineAmt, true);
        Model::validateRequired('relateCommodityCode', $this->relateCommodityCode, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->lineProductName) {
            $res['line_product_name'] = $this->lineProductName;
        }
        if (null !== $this->taxRate) {
            $res['tax_rate'] = $this->taxRate;
        }
        if (null !== $this->lineAmt) {
            $res['line_amt'] = $this->lineAmt;
        }
        if (null !== $this->ccy) {
            $res['ccy'] = $this->ccy;
        }
        if (null !== $this->measurementUnit) {
            $res['measurement_unit'] = $this->measurementUnit;
        }
        if (null !== $this->relateCommodityCode) {
            $res['relate_commodity_code'] = $this->relateCommodityCode;
        }
        if (null !== $this->serviceMode) {
            $res['service_mode'] = $this->serviceMode;
        }
        if (null !== $this->productSpecification) {
            $res['product_specification'] = $this->productSpecification;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PreviewInvoiceLine
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['line_product_name'])){
            $model->lineProductName = $map['line_product_name'];
        }
        if(isset($map['tax_rate'])){
            $model->taxRate = $map['tax_rate'];
        }
        if(isset($map['line_amt'])){
            $model->lineAmt = $map['line_amt'];
        }
        if(isset($map['ccy'])){
            $model->ccy = $map['ccy'];
        }
        if(isset($map['measurement_unit'])){
            $model->measurementUnit = $map['measurement_unit'];
        }
        if(isset($map['relate_commodity_code'])){
            $model->relateCommodityCode = $map['relate_commodity_code'];
        }
        if(isset($map['service_mode'])){
            $model->serviceMode = $map['service_mode'];
        }
        if(isset($map['product_specification'])){
            $model->productSpecification = $map['product_specification'];
        }
        return $model;
    }
    // 货物名称(商品名称)
    /**
     * @example 技术服务费
     * @var string
     */
    public $lineProductName;

    // 税率
    /**
     * @example 0.13
     * @var string
     */
    public $taxRate;

    // 发票行含税金额，单位:元
    /**
     * @example 102.98
     * @var string
     */
    public $lineAmt;

    // 币种，默认156
    /**
     * @example 156
     * @var string
     */
    public $ccy;

    // 单位
    /**
     * @example 个
     * @var string
     */
    public $measurementUnit;

    // 关联的L5商品
    /**
     * @example SQBRFSZL601262688
     * @var string
     */
    public $relateCommodityCode;

    // 服务类型 如：AFTECH_SERVICE
    /**
     * @example AFTECH_SERVICE
     * @var string
     */
    public $serviceMode;

    // 规格型号
    /**
     * @example 规格型号
     * @var string
     */
    public $productSpecification;

}
