<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class ComboItemDTO extends Model {
    protected $_name = [
        'id' => 'id',
        'uniqueCode' => 'unique_code',
        'offerName' => 'offer_name',
        'offerInnerCode' => 'offer_inner_code',
        'offerSaleCode' => 'offer_sale_code',
        'offerAttr' => 'offer_attr',
        'offerAttrDesc' => 'offer_attr_desc',
        'chargeType' => 'charge_type',
        'quantity' => 'quantity',
        'durationType' => 'duration_type',
        'durationValue' => 'duration_value',
        'required' => 'required',
        'seqOrder' => 'seq_order',
        'extendsConfig' => 'extends_config',
        'offerAttrOption' => 'offer_attr_option',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->uniqueCode) {
            $res['unique_code'] = $this->uniqueCode;
        }
        if (null !== $this->offerName) {
            $res['offer_name'] = $this->offerName;
        }
        if (null !== $this->offerInnerCode) {
            $res['offer_inner_code'] = $this->offerInnerCode;
        }
        if (null !== $this->offerSaleCode) {
            $res['offer_sale_code'] = $this->offerSaleCode;
        }
        if (null !== $this->offerAttr) {
            $res['offer_attr'] = $this->offerAttr;
        }
        if (null !== $this->offerAttrDesc) {
            $res['offer_attr_desc'] = $this->offerAttrDesc;
        }
        if (null !== $this->chargeType) {
            $res['charge_type'] = $this->chargeType;
        }
        if (null !== $this->quantity) {
            $res['quantity'] = $this->quantity;
        }
        if (null !== $this->durationType) {
            $res['duration_type'] = $this->durationType;
        }
        if (null !== $this->durationValue) {
            $res['duration_value'] = $this->durationValue;
        }
        if (null !== $this->required) {
            $res['required'] = $this->required;
        }
        if (null !== $this->seqOrder) {
            $res['seq_order'] = $this->seqOrder;
        }
        if (null !== $this->extendsConfig) {
            $res['extends_config'] = $this->extendsConfig;
        }
        if (null !== $this->offerAttrOption) {
            $res['offer_attr_option'] = $this->offerAttrOption;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ComboItemDTO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['unique_code'])){
            $model->uniqueCode = $map['unique_code'];
        }
        if(isset($map['offer_name'])){
            $model->offerName = $map['offer_name'];
        }
        if(isset($map['offer_inner_code'])){
            $model->offerInnerCode = $map['offer_inner_code'];
        }
        if(isset($map['offer_sale_code'])){
            $model->offerSaleCode = $map['offer_sale_code'];
        }
        if(isset($map['offer_attr'])){
            $model->offerAttr = $map['offer_attr'];
        }
        if(isset($map['offer_attr_desc'])){
            $model->offerAttrDesc = $map['offer_attr_desc'];
        }
        if(isset($map['charge_type'])){
            $model->chargeType = $map['charge_type'];
        }
        if(isset($map['quantity'])){
            $model->quantity = $map['quantity'];
        }
        if(isset($map['duration_type'])){
            $model->durationType = $map['duration_type'];
        }
        if(isset($map['duration_value'])){
            $model->durationValue = $map['duration_value'];
        }
        if(isset($map['required'])){
            $model->required = $map['required'];
        }
        if(isset($map['seq_order'])){
            $model->seqOrder = $map['seq_order'];
        }
        if(isset($map['extends_config'])){
            $model->extendsConfig = $map['extends_config'];
        }
        if(isset($map['offer_attr_option'])){
            $model->offerAttrOption = $map['offer_attr_option'];
        }
        return $model;
    }
    // 主键ID
    /**
     * @example 123
     * @var int
     */
    public $id;

    // 唯一编码
    /**
     * @example 123xxx
     * @var string
     */
    public $uniqueCode;

    // 商品名称
    /**
     * @example xxx商品
     * @var string
     */
    public $offerName;

    // 商品主数据CODE
    /**
     * @example sf12321xxx
     * @var string
     */
    public $offerInnerCode;

    // 商品销售CODE（仅当指定 ou 且商品在该 OU 下上架时有值）
    /**
     * @example sf123xxxx
     * @var string
     */
    public $offerSaleCode;

    // 商品规格，JSON 结构
    /**
     * @example {}
     * @var string
     */
    public $offerAttr;

    // 商品规格描述
    /**
     * @example xxx描述
     * @var string
     */
    public $offerAttrDesc;

    // 付费方式（如 AFTER_PAY_BY_HOUR 后付费量价、PREPAY_BY_MONTH 预付费包年包月）
    /**
     * @example AFTER_PAY_BY_HOUR
     * @var string
     */
    public $chargeType;

    // 商品数量
    /**
     * @example 1
     * @var int
     */
    public $quantity;

    // 订购周期类型
    /**
     * @example Y
     * @var string
     */
    public $durationType;

    // 订购周期值
    /**
     * @example 1
     * @var int
     */
    public $durationValue;

    // 是否必选（true 必选，false 可选）
    /**
     * @example true
     * @var bool
     */
    public $required;

    // 商品在套餐中的排序
    /**
     * @example 1
     * @var int
     */
    public $seqOrder;

    // 扩展配置
    /**
     * @example {}
     * @var string
     */
    public $extendsConfig;

    // 商品规格 JSON 结构，CommodityInfo 的 JSON 序列化字符串
    /**
     * @example {}
     * @var string
     */
    public $offerAttrOption;

}
