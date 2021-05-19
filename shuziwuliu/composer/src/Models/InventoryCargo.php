<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class InventoryCargo extends Model
{
    // 序号，在同一次库存申报请求中，序号保持不重复，不能小于等于0
    /**
     * @example 1
     *
     * @var int
     */
    public $inventoryIndex;

    // sku品名
    /**
     * @example 80656-RLC-422-5MP
     *
     * @var string
     */
    public $sku;

    // 商品名称
    //
    /**
     * @example 小米手机9
     *
     * @var string
     */
    public $cargoName;

    // 商品单品重量(kg)
    /**
     * @example 0.8
     *
     * @var string
     */
    public $cargoWeight;

    // 商品外扩长宽高(cm)
    /**
     * @example 20.00*30.00*40.00
     *
     * @var string
     */
    public $cargoDimensions;

    // 商品单品货物价值(元),最多支持2位小数
    /**
     * @example 3800.12
     *
     * @var string
     */
    public $cargoWorth;

    // 当前库存货物数量
    /**
     * @example 567
     *
     * @var int
     */
    public $currentInventoryCargoNum;

    // 客户代码
    //
    /**
     * @example 32112
     *
     * @var string
     */
    public $customerCode;

    // 关联保单号,需要仓储CP做拆分计算
    /**
     * @example TB1882881002991
     *
     * @var string
     */
    public $policyNo;

    // 入库时间, yyyy-MM-dd HH:mm:ss，需要仓储CP做拆分计算
    //
    /**
     * @example 2021-3-08 13:12:22
     *
     * @var string
     */
    public $stockinDate;

    // 时区,仓储CP上报入库时间所属的时区
    /**
     * @example 东八区
     *
     * @var string
     */
    public $timezone;
    protected $_name = [
        'inventoryIndex'           => 'inventory_index',
        'sku'                      => 'sku',
        'cargoName'                => 'cargo_name',
        'cargoWeight'              => 'cargo_weight',
        'cargoDimensions'          => 'cargo_dimensions',
        'cargoWorth'               => 'cargo_worth',
        'currentInventoryCargoNum' => 'current_inventory_cargo_num',
        'customerCode'             => 'customer_code',
        'policyNo'                 => 'policy_no',
        'stockinDate'              => 'stockin_date',
        'timezone'                 => 'timezone',
    ];

    public function validate()
    {
        Model::validateRequired('inventoryIndex', $this->inventoryIndex, true);
        Model::validateRequired('sku', $this->sku, true);
        Model::validateRequired('currentInventoryCargoNum', $this->currentInventoryCargoNum, true);
        Model::validateRequired('customerCode', $this->customerCode, true);
        Model::validateMaxLength('sku', $this->sku, 200);
        Model::validateMaxLength('cargoName', $this->cargoName, 200);
        Model::validateMaxLength('cargoWeight', $this->cargoWeight, 50);
        Model::validateMaxLength('cargoDimensions', $this->cargoDimensions, 200);
        Model::validateMaxLength('cargoWorth', $this->cargoWorth, 30);
        Model::validateMaxLength('customerCode', $this->customerCode, 50);
        Model::validateMaxLength('policyNo', $this->policyNo, 64);
        Model::validateMaxLength('timezone', $this->timezone, 16);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->inventoryIndex) {
            $res['inventory_index'] = $this->inventoryIndex;
        }
        if (null !== $this->sku) {
            $res['sku'] = $this->sku;
        }
        if (null !== $this->cargoName) {
            $res['cargo_name'] = $this->cargoName;
        }
        if (null !== $this->cargoWeight) {
            $res['cargo_weight'] = $this->cargoWeight;
        }
        if (null !== $this->cargoDimensions) {
            $res['cargo_dimensions'] = $this->cargoDimensions;
        }
        if (null !== $this->cargoWorth) {
            $res['cargo_worth'] = $this->cargoWorth;
        }
        if (null !== $this->currentInventoryCargoNum) {
            $res['current_inventory_cargo_num'] = $this->currentInventoryCargoNum;
        }
        if (null !== $this->customerCode) {
            $res['customer_code'] = $this->customerCode;
        }
        if (null !== $this->policyNo) {
            $res['policy_no'] = $this->policyNo;
        }
        if (null !== $this->stockinDate) {
            $res['stockin_date'] = $this->stockinDate;
        }
        if (null !== $this->timezone) {
            $res['timezone'] = $this->timezone;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InventoryCargo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['inventory_index'])) {
            $model->inventoryIndex = $map['inventory_index'];
        }
        if (isset($map['sku'])) {
            $model->sku = $map['sku'];
        }
        if (isset($map['cargo_name'])) {
            $model->cargoName = $map['cargo_name'];
        }
        if (isset($map['cargo_weight'])) {
            $model->cargoWeight = $map['cargo_weight'];
        }
        if (isset($map['cargo_dimensions'])) {
            $model->cargoDimensions = $map['cargo_dimensions'];
        }
        if (isset($map['cargo_worth'])) {
            $model->cargoWorth = $map['cargo_worth'];
        }
        if (isset($map['current_inventory_cargo_num'])) {
            $model->currentInventoryCargoNum = $map['current_inventory_cargo_num'];
        }
        if (isset($map['customer_code'])) {
            $model->customerCode = $map['customer_code'];
        }
        if (isset($map['policy_no'])) {
            $model->policyNo = $map['policy_no'];
        }
        if (isset($map['stockin_date'])) {
            $model->stockinDate = $map['stockin_date'];
        }
        if (isset($map['timezone'])) {
            $model->timezone = $map['timezone'];
        }

        return $model;
    }
}
