<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class ComboCommodity extends Model
{
    // 商品名称
    /**
     * @example 测试商品
     *
     * @var string
     */
    public $name;

    // 商品在套餐中的唯一编码，当一个套餐中存在两个一样的商品时，编码会不一样
    /**
     * @example ZWZJFM00167122ABCDEF
     *
     * @var string
     */
    public $uniqueCode;

    // 商品主数据编码
    /**
     * @example ZWZJFM00167122
     *
     * @var string
     */
    public $innerCode;

    // 商品类型，资源包：attach
    /**
     * @example attach
     *
     * @var string
     */
    public $type;

    // 付费方式，预付：PREPAY，按量付费：POSTPAY
    /**
     * @example PREPAY
     *
     * @var string
     */
    public $chargeType;

    // 销售属性列表
    /**
     * @example []
     *
     * @var CommodityAttribute[]
     */
    public $attrs;

    // 商品数量
    /**
     * @example 1
     *
     * @var int
     */
    public $quantity;

    // 扩展信息，JSON结构，包含标签、个性化配置等数据
    /**
     * @example {"key":"name"}
     *
     * @var string
     */
    public $extendsConfig;
    protected $_name = [
        'name'          => 'name',
        'uniqueCode'    => 'unique_code',
        'innerCode'     => 'inner_code',
        'type'          => 'type',
        'chargeType'    => 'charge_type',
        'attrs'         => 'attrs',
        'quantity'      => 'quantity',
        'extendsConfig' => 'extends_config',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('uniqueCode', $this->uniqueCode, true);
        Model::validateRequired('innerCode', $this->innerCode, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('chargeType', $this->chargeType, true);
        Model::validateRequired('attrs', $this->attrs, true);
        Model::validateRequired('quantity', $this->quantity, true);
        Model::validateRequired('extendsConfig', $this->extendsConfig, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->uniqueCode) {
            $res['unique_code'] = $this->uniqueCode;
        }
        if (null !== $this->innerCode) {
            $res['inner_code'] = $this->innerCode;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->chargeType) {
            $res['charge_type'] = $this->chargeType;
        }
        if (null !== $this->attrs) {
            $res['attrs'] = [];
            if (null !== $this->attrs && \is_array($this->attrs)) {
                $n = 0;
                foreach ($this->attrs as $item) {
                    $res['attrs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->quantity) {
            $res['quantity'] = $this->quantity;
        }
        if (null !== $this->extendsConfig) {
            $res['extends_config'] = $this->extendsConfig;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ComboCommodity
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['unique_code'])) {
            $model->uniqueCode = $map['unique_code'];
        }
        if (isset($map['inner_code'])) {
            $model->innerCode = $map['inner_code'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['charge_type'])) {
            $model->chargeType = $map['charge_type'];
        }
        if (isset($map['attrs'])) {
            if (!empty($map['attrs'])) {
                $model->attrs = [];
                $n            = 0;
                foreach ($map['attrs'] as $item) {
                    $model->attrs[$n++] = null !== $item ? CommodityAttribute::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['quantity'])) {
            $model->quantity = $map['quantity'];
        }
        if (isset($map['extends_config'])) {
            $model->extendsConfig = $map['extends_config'];
        }

        return $model;
    }
}
