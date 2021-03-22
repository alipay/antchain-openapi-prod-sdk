<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class UserPrice extends Model
{
    // 具体价格
    /**
     * @example 10.0000
     *
     * @var string
     */
    public $price;

    // 相对比例
    /**
     * @example 1
     *
     * @var string
     */
    public $ratio;

    // 对租户价格(需要和当前生效价格匹配)
    /**
     * @example 10.0000
     *
     * @var string
     */
    public $snapshotTenantPrice;

    // 价格类型(数值/比例)
    /**
     * @example 0 | 1
     *
     * @var int
     */
    public $userPriceType;

    // 租户用户价格包括费率
    /**
     * @example 1.001
     *
     * @var string
     */
    public $userPriceWithCommission;
    protected $_name = [
        'price'                   => 'price',
        'ratio'                   => 'ratio',
        'snapshotTenantPrice'     => 'snapshot_tenant_price',
        'userPriceType'           => 'user_price_type',
        'userPriceWithCommission' => 'user_price_with_commission',
    ];

    public function validate()
    {
        Model::validateRequired('price', $this->price, true);
        Model::validateRequired('ratio', $this->ratio, true);
        Model::validateRequired('snapshotTenantPrice', $this->snapshotTenantPrice, true);
        Model::validateRequired('userPriceType', $this->userPriceType, true);
        Model::validateRequired('userPriceWithCommission', $this->userPriceWithCommission, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->price) {
            $res['price'] = $this->price;
        }
        if (null !== $this->ratio) {
            $res['ratio'] = $this->ratio;
        }
        if (null !== $this->snapshotTenantPrice) {
            $res['snapshot_tenant_price'] = $this->snapshotTenantPrice;
        }
        if (null !== $this->userPriceType) {
            $res['user_price_type'] = $this->userPriceType;
        }
        if (null !== $this->userPriceWithCommission) {
            $res['user_price_with_commission'] = $this->userPriceWithCommission;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UserPrice
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['price'])) {
            $model->price = $map['price'];
        }
        if (isset($map['ratio'])) {
            $model->ratio = $map['ratio'];
        }
        if (isset($map['snapshot_tenant_price'])) {
            $model->snapshotTenantPrice = $map['snapshot_tenant_price'];
        }
        if (isset($map['user_price_type'])) {
            $model->userPriceType = $map['user_price_type'];
        }
        if (isset($map['user_price_with_commission'])) {
            $model->userPriceWithCommission = $map['user_price_with_commission'];
        }

        return $model;
    }
}
