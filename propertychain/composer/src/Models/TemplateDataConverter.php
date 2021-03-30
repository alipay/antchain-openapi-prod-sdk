<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class TemplateDataConverter extends Model
{
    // 货物品类
    /**
     * @example commodityCategory
     *
     * @var string
     */
    public $commodityCategory;

    // 仓单的生成时间
    /**
     * @example 14313413241
     *
     * @var int
     */
    public $createTime;

    // 仓储方名称或ID，提交的时候使用ID，展示使用名称
    /**
     * @example custodianCorp
     *
     * @var string
     */
    public $custodianCorp;

    // 存货人名称或ID，提交的时候使用ID，展示使用名称
    /**
     * @example customerCorp
     *
     * @var string
     */
    public $customerCorp;

    // 其他字典定制信息
    /**
     * @example customData
     *
     * @var string
     */
    public $customData;

    // 是否补仓
    /**
     * @example isSupplement
     *
     * @var bool
     */
    public $isSupplement;

    // 联盟ID
    /**
     * @example leagueId
     *
     * @var string
     */
    public $leagueId;

    // 联盟名称
    /**
     * @example leagueName
     *
     * @var string
     */
    public $leagueName;

    // 资金方名称或ID，提交的时候使用ID，展示使用名称
    /**
     * @example lenderCorp
     *
     * @var string
     */
    public $lenderCorp;

    // 仓位ID列表
    /**
     * @example position
     *
     * @var string[]
     */
    public $position;

    // 预分配仓位ID列表
    /**
     * @example prePosition
     *
     * @var string[]
     */
    public $prePosition;

    // 预分配仓库名称或ID，提交的时候使用ID，展示使用名称
    /**
     * @example preWarehouseName
     *
     * @var string
     */
    public $preWarehouseName;

    // 数量
    /**
     * @example quantity
     *
     * @var int
     */
    public $quantity;

    // 数量单位
    /**
     * @example quantityUnit
     *
     * @var string
     */
    public $quantityUnit;

    // 物权方
    /**
     * @example realRightName
     *
     * @var string
     */
    public $realRightName;

    // 仓单状态
    /**
     * @example 111
     *
     * @var string
     */
    public $state;

    // 补仓仓单ID
    /**
     * @example supplementWarehouseReceiptId
     *
     * @var string
     */
    public $supplementWarehouseReceiptId;

    // 仓单更新时间
    /**
     * @example 312124234
     *
     * @var int
     */
    public $updateTime;

    // 仓库名称或ID，提交的时候使用ID，展示使用名称
    /**
     * @example warehouseName
     *
     * @var string
     */
    public $warehouseName;

    // 仓单ID
    /**
     * @example warehouseReceiptId
     *
     * @var string
     */
    public $warehouseReceiptId;

    // 重量
    /**
     * @example 11.32
     *
     * @var string
     */
    public $weight;

    // 重量单位
    /**
     * @example 克
     *
     * @var string
     */
    public $weightUnit;
    protected $_name = [
        'commodityCategory'            => 'commodity_category',
        'createTime'                   => 'create_time',
        'custodianCorp'                => 'custodian_corp',
        'customerCorp'                 => 'customer_corp',
        'customData'                   => 'custom_data',
        'isSupplement'                 => 'is_supplement',
        'leagueId'                     => 'league_id',
        'leagueName'                   => 'league_name',
        'lenderCorp'                   => 'lender_corp',
        'position'                     => 'position',
        'prePosition'                  => 'pre_position',
        'preWarehouseName'             => 'pre_warehouse_name',
        'quantity'                     => 'quantity',
        'quantityUnit'                 => 'quantity_unit',
        'realRightName'                => 'real_right_name',
        'state'                        => 'state',
        'supplementWarehouseReceiptId' => 'supplement_warehouse_receipt_id',
        'updateTime'                   => 'update_time',
        'warehouseName'                => 'warehouse_name',
        'warehouseReceiptId'           => 'warehouse_receipt_id',
        'weight'                       => 'weight',
        'weightUnit'                   => 'weight_unit',
    ];

    public function validate()
    {
        Model::validateRequired('commodityCategory', $this->commodityCategory, true);
        Model::validateRequired('isSupplement', $this->isSupplement, true);
        Model::validateRequired('leagueId', $this->leagueId, true);
        Model::validateRequired('leagueName', $this->leagueName, true);
        Model::validateRequired('quantity', $this->quantity, true);
        Model::validateRequired('quantityUnit', $this->quantityUnit, true);
        Model::validateRequired('weight', $this->weight, true);
        Model::validateRequired('weightUnit', $this->weightUnit, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->commodityCategory) {
            $res['commodity_category'] = $this->commodityCategory;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->custodianCorp) {
            $res['custodian_corp'] = $this->custodianCorp;
        }
        if (null !== $this->customerCorp) {
            $res['customer_corp'] = $this->customerCorp;
        }
        if (null !== $this->customData) {
            $res['custom_data'] = $this->customData;
        }
        if (null !== $this->isSupplement) {
            $res['is_supplement'] = $this->isSupplement;
        }
        if (null !== $this->leagueId) {
            $res['league_id'] = $this->leagueId;
        }
        if (null !== $this->leagueName) {
            $res['league_name'] = $this->leagueName;
        }
        if (null !== $this->lenderCorp) {
            $res['lender_corp'] = $this->lenderCorp;
        }
        if (null !== $this->position) {
            $res['position'] = $this->position;
        }
        if (null !== $this->prePosition) {
            $res['pre_position'] = $this->prePosition;
        }
        if (null !== $this->preWarehouseName) {
            $res['pre_warehouse_name'] = $this->preWarehouseName;
        }
        if (null !== $this->quantity) {
            $res['quantity'] = $this->quantity;
        }
        if (null !== $this->quantityUnit) {
            $res['quantity_unit'] = $this->quantityUnit;
        }
        if (null !== $this->realRightName) {
            $res['real_right_name'] = $this->realRightName;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->supplementWarehouseReceiptId) {
            $res['supplement_warehouse_receipt_id'] = $this->supplementWarehouseReceiptId;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }
        if (null !== $this->warehouseName) {
            $res['warehouse_name'] = $this->warehouseName;
        }
        if (null !== $this->warehouseReceiptId) {
            $res['warehouse_receipt_id'] = $this->warehouseReceiptId;
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
        }
        if (null !== $this->weightUnit) {
            $res['weight_unit'] = $this->weightUnit;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TemplateDataConverter
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['commodity_category'])) {
            $model->commodityCategory = $map['commodity_category'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['custodian_corp'])) {
            $model->custodianCorp = $map['custodian_corp'];
        }
        if (isset($map['customer_corp'])) {
            $model->customerCorp = $map['customer_corp'];
        }
        if (isset($map['custom_data'])) {
            $model->customData = $map['custom_data'];
        }
        if (isset($map['is_supplement'])) {
            $model->isSupplement = $map['is_supplement'];
        }
        if (isset($map['league_id'])) {
            $model->leagueId = $map['league_id'];
        }
        if (isset($map['league_name'])) {
            $model->leagueName = $map['league_name'];
        }
        if (isset($map['lender_corp'])) {
            $model->lenderCorp = $map['lender_corp'];
        }
        if (isset($map['position'])) {
            if (!empty($map['position'])) {
                $model->position = $map['position'];
            }
        }
        if (isset($map['pre_position'])) {
            if (!empty($map['pre_position'])) {
                $model->prePosition = $map['pre_position'];
            }
        }
        if (isset($map['pre_warehouse_name'])) {
            $model->preWarehouseName = $map['pre_warehouse_name'];
        }
        if (isset($map['quantity'])) {
            $model->quantity = $map['quantity'];
        }
        if (isset($map['quantity_unit'])) {
            $model->quantityUnit = $map['quantity_unit'];
        }
        if (isset($map['real_right_name'])) {
            $model->realRightName = $map['real_right_name'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['supplement_warehouse_receipt_id'])) {
            $model->supplementWarehouseReceiptId = $map['supplement_warehouse_receipt_id'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }
        if (isset($map['warehouse_name'])) {
            $model->warehouseName = $map['warehouse_name'];
        }
        if (isset($map['warehouse_receipt_id'])) {
            $model->warehouseReceiptId = $map['warehouse_receipt_id'];
        }
        if (isset($map['weight'])) {
            $model->weight = $map['weight'];
        }
        if (isset($map['weight_unit'])) {
            $model->weightUnit = $map['weight_unit'];
        }

        return $model;
    }
}
