<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class PricePlanVO extends Model
{
    // 规格Code
    /**
     * @example software_bpaas_xxxx_xxx_pre
     *
     * @var string
     */
    public $specCode;

    // 定价类型
    /**
     * @example YEAR_MONTH
     *
     * @var string
     */
    public $priceType;

    // 定价计划描述
    /**
     * @example 定价计划描述xxx
     *
     * @var string
     */
    public $pricePlanDesc;

    // 定价约束列表
    /**
     * @example
     *
     * @var PriceConstraintVO[]
     */
    public $priceConstraint;
    protected $_name = [
        'specCode'        => 'spec_code',
        'priceType'       => 'price_type',
        'pricePlanDesc'   => 'price_plan_desc',
        'priceConstraint' => 'price_constraint',
    ];

    public function validate()
    {
        Model::validateRequired('specCode', $this->specCode, true);
        Model::validateRequired('priceType', $this->priceType, true);
        Model::validateRequired('pricePlanDesc', $this->pricePlanDesc, true);
        Model::validateRequired('priceConstraint', $this->priceConstraint, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->specCode) {
            $res['spec_code'] = $this->specCode;
        }
        if (null !== $this->priceType) {
            $res['price_type'] = $this->priceType;
        }
        if (null !== $this->pricePlanDesc) {
            $res['price_plan_desc'] = $this->pricePlanDesc;
        }
        if (null !== $this->priceConstraint) {
            $res['price_constraint'] = [];
            if (null !== $this->priceConstraint && \is_array($this->priceConstraint)) {
                $n = 0;
                foreach ($this->priceConstraint as $item) {
                    $res['price_constraint'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PricePlanVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['spec_code'])) {
            $model->specCode = $map['spec_code'];
        }
        if (isset($map['price_type'])) {
            $model->priceType = $map['price_type'];
        }
        if (isset($map['price_plan_desc'])) {
            $model->pricePlanDesc = $map['price_plan_desc'];
        }
        if (isset($map['price_constraint'])) {
            if (!empty($map['price_constraint'])) {
                $model->priceConstraint = [];
                $n                      = 0;
                foreach ($map['price_constraint'] as $item) {
                    $model->priceConstraint[$n++] = null !== $item ? PriceConstraintVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
