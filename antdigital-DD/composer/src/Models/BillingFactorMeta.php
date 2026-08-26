<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class BillingFactorMeta extends Model {
    protected $_name = [
        'feeCode' => 'fee_code',
        'factorCode' => 'factor_code',
        'factorName' => 'factor_name',
        'factorType' => 'factor_type',
        'factorUnit' => 'factor_unit',
        'meterFeildCode' => 'meter_feild_code',
        'factorRatio' => 'factor_ratio',
        'deductRespackage' => 'deduct_respackage',
        'isCumulative' => 'is_cumulative',
        'valOriginal' => 'val_original',
        'defaultValue' => 'default_value',
        'extraInfo' => 'extra_info',
        'factorModelType' => 'factor_model_type',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->feeCode) {
            $res['fee_code'] = $this->feeCode;
        }
        if (null !== $this->factorCode) {
            $res['factor_code'] = $this->factorCode;
        }
        if (null !== $this->factorName) {
            $res['factor_name'] = $this->factorName;
        }
        if (null !== $this->factorType) {
            $res['factor_type'] = $this->factorType;
        }
        if (null !== $this->factorUnit) {
            $res['factor_unit'] = $this->factorUnit;
        }
        if (null !== $this->meterFeildCode) {
            $res['meter_feild_code'] = $this->meterFeildCode;
        }
        if (null !== $this->factorRatio) {
            $res['factor_ratio'] = $this->factorRatio;
        }
        if (null !== $this->deductRespackage) {
            $res['deduct_respackage'] = $this->deductRespackage;
        }
        if (null !== $this->isCumulative) {
            $res['is_cumulative'] = $this->isCumulative;
        }
        if (null !== $this->valOriginal) {
            $res['val_original'] = $this->valOriginal;
        }
        if (null !== $this->defaultValue) {
            $res['default_value'] = $this->defaultValue;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->factorModelType) {
            $res['factor_model_type'] = $this->factorModelType;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return BillingFactorMeta
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['fee_code'])){
            $model->feeCode = $map['fee_code'];
        }
        if(isset($map['factor_code'])){
            $model->factorCode = $map['factor_code'];
        }
        if(isset($map['factor_name'])){
            $model->factorName = $map['factor_name'];
        }
        if(isset($map['factor_type'])){
            $model->factorType = $map['factor_type'];
        }
        if(isset($map['factor_unit'])){
            $model->factorUnit = $map['factor_unit'];
        }
        if(isset($map['meter_feild_code'])){
            $model->meterFeildCode = $map['meter_feild_code'];
        }
        if(isset($map['factor_ratio'])){
            $model->factorRatio = $map['factor_ratio'];
        }
        if(isset($map['deduct_respackage'])){
            $model->deductRespackage = $map['deduct_respackage'];
        }
        if(isset($map['is_cumulative'])){
            $model->isCumulative = $map['is_cumulative'];
        }
        if(isset($map['val_original'])){
            $model->valOriginal = $map['val_original'];
        }
        if(isset($map['default_value'])){
            $model->defaultValue = $map['default_value'];
        }
        if(isset($map['extra_info'])){
            $model->extraInfo = $map['extra_info'];
        }
        if(isset($map['factor_model_type'])){
            $model->factorModelType = $map['factor_model_type'];
        }
        return $model;
    }
    // 费用code
    /**
     * @example 费用code
     * @var string
     */
    public $feeCode;

    // 因子code
    /**
     * @example test
     * @var string
     */
    public $factorCode;

    // 因子名称
    /**
     * @example 因子名称
     * @var string
     */
    public $factorName;

    // 因子类型
    /**
     * @example 计费，规格
     * @var string
     */
    public $factorType;

    // 因子单位
    /**
     * @example 元
     * @var string
     */
    public $factorUnit;

    // 计量项code
    /**
     * @example 计量项code
     * @var string
     */
    public $meterFeildCode;

    // 转换比率，用于展示转换
    /**
     * @example 1
     * @var string
     */
    public $factorRatio;

    // 是否抵扣资源包
    /**
     * @example true, false
     * @var bool
     */
    public $deductRespackage;

    // 是否累计
    /**
     * @example true, false
     * @var bool
     */
    public $isCumulative;

    // 数据来源，配置，计量数据
    /**
     * @example use_data
     * @var string
     */
    public $valOriginal;

    // 默认值
    /**
     * @example 默认值
     * @var string
     */
    public $defaultValue;

    // 拓展信息
    /**
     * @example 拓展信息
     * @var string
     */
    public $extraInfo;

    // 订购模型，价格模型
    /**
     * @example 01
     * @var string
     */
    public $factorModelType;

}
