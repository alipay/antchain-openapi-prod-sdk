<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\MultiCurrencyMoney;

class RespackegeBanlanceVO extends Model {
    protected $_name = [
        'productCode' => 'product_code',
        'tempalteName' => 'tempalte_name',
        'displayName' => 'display_name',
        'initialCapacity' => 'initial_capacity',
        'currentCapacity' => 'current_capacity',
        'totalFund' => 'total_fund',
        'remainFund' => 'remain_fund',
        'decimalCurrentCapacity' => 'decimal_current_capacity',
    ];
    public function validate() {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('tempalteName', $this->tempalteName, true);
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('initialCapacity', $this->initialCapacity, true);
        Model::validateRequired('currentCapacity', $this->currentCapacity, true);
        Model::validateRequired('totalFund', $this->totalFund, true);
        Model::validateRequired('remainFund', $this->remainFund, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->tempalteName) {
            $res['tempalte_name'] = $this->tempalteName;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->initialCapacity) {
            $res['initial_capacity'] = $this->initialCapacity;
        }
        if (null !== $this->currentCapacity) {
            $res['current_capacity'] = $this->currentCapacity;
        }
        if (null !== $this->totalFund) {
            $res['total_fund'] = null !== $this->totalFund ? $this->totalFund->toMap() : null;
        }
        if (null !== $this->remainFund) {
            $res['remain_fund'] = null !== $this->remainFund ? $this->remainFund->toMap() : null;
        }
        if (null !== $this->decimalCurrentCapacity) {
            $res['decimal_current_capacity'] = $this->decimalCurrentCapacity;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RespackegeBanlanceVO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['product_code'])){
            $model->productCode = $map['product_code'];
        }
        if(isset($map['tempalte_name'])){
            $model->tempalteName = $map['tempalte_name'];
        }
        if(isset($map['display_name'])){
            $model->displayName = $map['display_name'];
        }
        if(isset($map['initial_capacity'])){
            $model->initialCapacity = $map['initial_capacity'];
        }
        if(isset($map['current_capacity'])){
            $model->currentCapacity = $map['current_capacity'];
        }
        if(isset($map['total_fund'])){
            $model->totalFund = MultiCurrencyMoney::fromMap($map['total_fund']);
        }
        if(isset($map['remain_fund'])){
            $model->remainFund = MultiCurrencyMoney::fromMap($map['remain_fund']);
        }
        if(isset($map['decimal_current_capacity'])){
            $model->decimalCurrentCapacity = $map['decimal_current_capacity'];
        }
        return $model;
    }
    // 资源包商品编码
    /**
     * @example ZLPTFM01221964
     * @var string
     */
    public $productCode;

    // 资源包模板编码
    /**
     * @example ZNHYFM01222350_Deadline
     * @var string
     */
    public $tempalteName;

    // 资源包展示名称
    /**
     * @example credits资源包(加油包)
     * @var string
     */
    public $displayName;

    // 初始容量
    /**
     * @example 10000
     * @var string
     */
    public $initialCapacity;

    // 当前余量
    /**
     * @example 10000
     * @var string
     */
    public $currentCapacity;

    // 总金额
    /**
     * @example 
     * @var MultiCurrencyMoney
     */
    public $totalFund;

    // 剩余金额
    // 
    /**
     * @example 
     * @var MultiCurrencyMoney
     */
    public $remainFund;

    // 高精度余量
    /**
     * @example 0.09
     * @var string
     */
    public $decimalCurrentCapacity;

}
