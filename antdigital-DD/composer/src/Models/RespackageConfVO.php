<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\DeductOmsField;
use AntChain\DD\Models\StringMap;

class RespackageConfVO extends Model {
    protected $_name = [
        'templateCode' => 'template_code',
        'templateName' => 'template_name',
        'templateDimension' => 'template_dimension',
        'productCode' => 'product_code',
        'offerCode' => 'offer_code',
        'deductProductCode' => 'deduct_product_code',
        'deductOmsField' => 'deduct_oms_field',
        'deductType' => 'deduct_type',
        'specification' => 'specification',
        'calcAmount' => 'calc_amount',
        'subPack' => 'sub_pack',
        'subPackSplitType' => 'sub_pack_split_type',
        'relTemplate' => 'rel_template',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->templateCode) {
            $res['template_code'] = $this->templateCode;
        }
        if (null !== $this->templateName) {
            $res['template_name'] = $this->templateName;
        }
        if (null !== $this->templateDimension) {
            $res['template_dimension'] = $this->templateDimension;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->offerCode) {
            $res['offer_code'] = $this->offerCode;
        }
        if (null !== $this->deductProductCode) {
            $res['deduct_product_code'] = $this->deductProductCode;
        }
        if (null !== $this->deductOmsField) {
            $res['deduct_oms_field'] = [];
            if(null !== $this->deductOmsField && is_array($this->deductOmsField)){
                $n = 0;
                foreach($this->deductOmsField as $item){
                    $res['deduct_oms_field'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->deductType) {
            $res['deduct_type'] = $this->deductType;
        }
        if (null !== $this->specification) {
            $res['specification'] = [];
            if(null !== $this->specification && is_array($this->specification)){
                $n = 0;
                foreach($this->specification as $item){
                    $res['specification'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->calcAmount) {
            $res['calc_amount'] = $this->calcAmount;
        }
        if (null !== $this->subPack) {
            $res['sub_pack'] = $this->subPack;
        }
        if (null !== $this->subPackSplitType) {
            $res['sub_pack_split_type'] = $this->subPackSplitType;
        }
        if (null !== $this->relTemplate) {
            $res['rel_template'] = $this->relTemplate;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RespackageConfVO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['template_code'])){
            $model->templateCode = $map['template_code'];
        }
        if(isset($map['template_name'])){
            $model->templateName = $map['template_name'];
        }
        if(isset($map['template_dimension'])){
            $model->templateDimension = $map['template_dimension'];
        }
        if(isset($map['product_code'])){
            $model->productCode = $map['product_code'];
        }
        if(isset($map['offer_code'])){
            $model->offerCode = $map['offer_code'];
        }
        if(isset($map['deduct_product_code'])){
            if(!empty($map['deduct_product_code'])){
                $model->deductProductCode = $map['deduct_product_code'];
            }
        }
        if(isset($map['deduct_oms_field'])){
            if(!empty($map['deduct_oms_field'])){
                $model->deductOmsField = [];
                $n = 0;
                foreach($map['deduct_oms_field'] as $item) {
                    $model->deductOmsField[$n++] = null !== $item ? DeductOmsField::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['deduct_type'])){
            $model->deductType = $map['deduct_type'];
        }
        if(isset($map['specification'])){
            if(!empty($map['specification'])){
                $model->specification = [];
                $n = 0;
                foreach($map['specification'] as $item) {
                    $model->specification[$n++] = null !== $item ? StringMap::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['calc_amount'])){
            $model->calcAmount = $map['calc_amount'];
        }
        if(isset($map['sub_pack'])){
            $model->subPack = $map['sub_pack'];
        }
        if(isset($map['sub_pack_split_type'])){
            $model->subPackSplitType = $map['sub_pack_split_type'];
        }
        if(isset($map['rel_template'])){
            $model->relTemplate = $map['rel_template'];
        }
        return $model;
    }
    // 模板code
    /**
     * @example test_deadline
     * @var string
     */
    public $templateCode;

    // 模板展示名称
    /**
     * @example 资源包模板
     * @var string
     */
    public $templateName;

    // 资源包模板维度
    /**
     * @example Single
     * @var string
     */
    public $templateDimension;

    // 产品名称 -> 商品模型2.0中的渠道产品Code
    /**
     * @example testcode
     * @var string
     */
    public $productCode;

    // 商品名称 -> 商品模型2.0中的offerInnerCode
    /**
     * @example testcode
     * @var string
     */
    public $offerCode;

    // 抵扣的量价商品 -> 商品模型2.0中的渠道产品Code
    /**
     * @example 
     * @var string[]
     */
    public $deductProductCode;

    // 抵扣的量价商品与计量项的关系
    /**
     * @example 
     * @var DeductOmsField[]
     */
    public $deductOmsField;

    // 资源包抵扣类型
    /**
     * @example PeriodMonthly
     * @var string
     */
    public $deductType;

    // 产时的规格约束
    /**
     * @example 
     * @var StringMap[]
     */
    public $specification;

    // 是否计算金额
    /**
     * @example 
     * @var bool
     */
    public $calcAmount;

    // 是否使用子包
    /**
     * @example true, false
     * @var bool
     */
    public $subPack;

    // 子包切分规则 None(不切割)、NaturalMonth(按自然月切割) 、SubscribeMonth(按订单月切割) *
    /**
     * @example None
     * @var string
     */
    public $subPackSplitType;

    // 关联子包模版
    /**
     * @example template
     * @var string
     */
    public $relTemplate;

}
