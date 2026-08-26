<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\ResourcePackageConstraintMeta;

class ResPackageTemplateNewMeta extends Model {
    protected $_name = [
        'templateName' => 'template_name',
        'templateType' => 'template_type',
        'deductType' => 'deduct_type',
        'productCode' => 'product_code',
        'productName' => 'product_name',
        'displayName' => 'display_name',
        'applicableProductName' => 'applicable_product_name',
        'prodEventCode' => 'prod_event_code',
        'priority' => 'priority',
        'renewable' => 'renewable',
        'upgradable' => 'upgradable',
        'unitKey' => 'unit_key',
        'calcAmount' => 'calc_amount',
        'subPack' => 'sub_pack',
        'subPackSplitType' => 'sub_pack_split_type',
        'relTemplate' => 'rel_template',
        'status' => 'status',
        'resourcePackageConstraintMetas' => 'resource_package_constraint_metas',
    ];
    public function validate() {
        Model::validateRequired('templateName', $this->templateName, true);
        Model::validateRequired('templateType', $this->templateType, true);
        Model::validateRequired('deductType', $this->deductType, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('productName', $this->productName, true);
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('applicableProductName', $this->applicableProductName, true);
        Model::validateRequired('unitKey', $this->unitKey, true);
        Model::validateRequired('calcAmount', $this->calcAmount, true);
        Model::validateRequired('subPack', $this->subPack, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->templateName) {
            $res['template_name'] = $this->templateName;
        }
        if (null !== $this->templateType) {
            $res['template_type'] = $this->templateType;
        }
        if (null !== $this->deductType) {
            $res['deduct_type'] = $this->deductType;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->applicableProductName) {
            $res['applicable_product_name'] = $this->applicableProductName;
        }
        if (null !== $this->prodEventCode) {
            $res['prod_event_code'] = $this->prodEventCode;
        }
        if (null !== $this->priority) {
            $res['priority'] = $this->priority;
        }
        if (null !== $this->renewable) {
            $res['renewable'] = $this->renewable;
        }
        if (null !== $this->upgradable) {
            $res['upgradable'] = $this->upgradable;
        }
        if (null !== $this->unitKey) {
            $res['unit_key'] = $this->unitKey;
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->resourcePackageConstraintMetas) {
            $res['resource_package_constraint_metas'] = [];
            if(null !== $this->resourcePackageConstraintMetas && is_array($this->resourcePackageConstraintMetas)){
                $n = 0;
                foreach($this->resourcePackageConstraintMetas as $item){
                    $res['resource_package_constraint_metas'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ResPackageTemplateNewMeta
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['template_name'])){
            $model->templateName = $map['template_name'];
        }
        if(isset($map['template_type'])){
            $model->templateType = $map['template_type'];
        }
        if(isset($map['deduct_type'])){
            $model->deductType = $map['deduct_type'];
        }
        if(isset($map['product_code'])){
            $model->productCode = $map['product_code'];
        }
        if(isset($map['product_name'])){
            $model->productName = $map['product_name'];
        }
        if(isset($map['display_name'])){
            $model->displayName = $map['display_name'];
        }
        if(isset($map['applicable_product_name'])){
            $model->applicableProductName = $map['applicable_product_name'];
        }
        if(isset($map['prod_event_code'])){
            $model->prodEventCode = $map['prod_event_code'];
        }
        if(isset($map['priority'])){
            $model->priority = $map['priority'];
        }
        if(isset($map['renewable'])){
            $model->renewable = $map['renewable'];
        }
        if(isset($map['upgradable'])){
            $model->upgradable = $map['upgradable'];
        }
        if(isset($map['unit_key'])){
            $model->unitKey = $map['unit_key'];
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
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['resource_package_constraint_metas'])){
            if(!empty($map['resource_package_constraint_metas'])){
                $model->resourcePackageConstraintMetas = [];
                $n = 0;
                foreach($map['resource_package_constraint_metas'] as $item) {
                    $model->resourcePackageConstraintMetas[$n++] = null !== $item ? ResourcePackageConstraintMeta::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 资源包code
    /**
     * @example test_deadline
     * @var string
     */
    public $templateName;

    // 资源包模板类型
    /**
     * @example single
     * @var string
     */
    public $templateType;

    // 抵扣类型
    /**
     * @example deadline
     * @var string
     */
    public $deductType;

    // 资源包l5code
    /**
     * @example testcode
     * @var string
     */
    public $productCode;

    // 资源包serviceCode
    /**
     * @example serviceCode
     * @var string
     */
    public $productName;

    // 资源包模板名称
    /**
     * @example 测试资源包模板
     * @var string
     */
    public $displayName;

    // 可抵扣的l5code
    /**
     * @example testcode
     * @var string
     */
    public $applicableProductName;

    // 收费事件码
    /**
     * @example eventcode
     * @var string
     */
    public $prodEventCode;

    // 抵扣优先级
    /**
     * @example 1
     * @var string
     */
    public $priority;

    // 是否可续费
    /**
     * @example true
     * @var bool
     */
    public $renewable;

    // 是否可升级
    /**
     * @example true
     * @var bool
     */
    public $upgradable;

    // 单位转换关系
    /**
     * @example [{"ratio":"1","unit":"次","roundMode":7,"scale":0},{"ratio":"10000","unit":"万次","roundMode":4,"scale":4}]
     * @var string
     */
    public $unitKey;

    // 是否计算金额
    /**
     * @example true
     * @var bool
     */
    public $calcAmount;

    // 是否使用子包
    /**
     * @example true
     * @var bool
     */
    public $subPack;

    // 子包切分规则
    /**
     * @example None
     * @var string
     */
    public $subPackSplitType;

    // 关联子包模版
    /**
     * @example test_deadline
     * @var string
     */
    public $relTemplate;

    // 状态
    /**
     * @example effect
     * @var string
     */
    public $status;

    // 资源包约束元数据列表
    /**
     * @example undefined
     * @var ResourcePackageConstraintMeta[]
     */
    public $resourcePackageConstraintMetas;

}
