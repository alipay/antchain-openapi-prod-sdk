<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class UserPrice extends Model {
    protected $_name = [
        'price' => 'price',
        'ratio' => 'ratio',
        'snapshotTenantPrice' => 'snapshot_tenant_price',
        'userPriceType' => 'user_price_type',
    ];
    public function validate() {}
    public function toMap() {
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
        return $res;
    }
    /**
     * @param array $map
     * @return UserPrice
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['price'])){
            $model->price = $map['price'];
        }
        if(isset($map['ratio'])){
            $model->ratio = $map['ratio'];
        }
        if(isset($map['snapshot_tenant_price'])){
            $model->snapshotTenantPrice = $map['snapshot_tenant_price'];
        }
        if(isset($map['user_price_type'])){
            $model->userPriceType = $map['user_price_type'];
        }
        return $model;
    }
    /**
     * @example 10.0000
     * @description 具体价格
     * @var string
     */
    public $price;

    /**
     * @example 1
     * @description 相对比例
     * @var string
     */
    public $ratio;

    /**
     * @example 10.0000
     * @description 对租户价格(需要和当前生效价格匹配)
     * @var string
     */
    public $snapshotTenantPrice;

    /**
     * @example 0 | 1
     * @description 价格类型(数值/比例)
     * @var integer
     */
    public $userPriceType;

}
