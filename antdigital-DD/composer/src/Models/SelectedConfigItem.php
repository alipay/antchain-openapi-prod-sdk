<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class SelectedConfigItem extends Model {
    protected $_name = [
        'offerInnerCode' => 'offer_inner_code',
        'offerSaleCode' => 'offer_sale_code',
        'duration' => 'duration',
        'pricingCycle' => 'pricing_cycle',
        'quantity' => 'quantity',
        'couponId' => 'coupon_id',
        'componentsMap' => 'components_map',
    ];
    public function validate() {
        Model::validateRequired('offerInnerCode', $this->offerInnerCode, true);
        Model::validateRequired('offerSaleCode', $this->offerSaleCode, true);
        Model::validateRequired('duration', $this->duration, true);
        Model::validateRequired('pricingCycle', $this->pricingCycle, true);
        Model::validateRequired('quantity', $this->quantity, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->offerInnerCode) {
            $res['offer_inner_code'] = $this->offerInnerCode;
        }
        if (null !== $this->offerSaleCode) {
            $res['offer_sale_code'] = $this->offerSaleCode;
        }
        if (null !== $this->duration) {
            $res['duration'] = $this->duration;
        }
        if (null !== $this->pricingCycle) {
            $res['pricing_cycle'] = $this->pricingCycle;
        }
        if (null !== $this->quantity) {
            $res['quantity'] = $this->quantity;
        }
        if (null !== $this->couponId) {
            $res['coupon_id'] = $this->couponId;
        }
        if (null !== $this->componentsMap) {
            $res['components_map'] = $this->componentsMap;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SelectedConfigItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['offer_inner_code'])){
            $model->offerInnerCode = $map['offer_inner_code'];
        }
        if(isset($map['offer_sale_code'])){
            $model->offerSaleCode = $map['offer_sale_code'];
        }
        if(isset($map['duration'])){
            $model->duration = $map['duration'];
        }
        if(isset($map['pricing_cycle'])){
            $model->pricingCycle = $map['pricing_cycle'];
        }
        if(isset($map['quantity'])){
            $model->quantity = $map['quantity'];
        }
        if(isset($map['coupon_id'])){
            $model->couponId = $map['coupon_id'];
        }
        if(isset($map['components_map'])){
            $model->componentsMap = $map['components_map'];
        }
        return $model;
    }
    // 商品主数据内码（L5内码）
    /**
     * @example BSTAFM01234567
     * @var string
     */
    public $offerInnerCode;

    // 商品销售码（带 OU 属性）
    /**
     * @example BSTAFSZL70139xxxx
     * @var string
     */
    public $offerSaleCode;

    // 购买时长；预付费根据实际时长填写，后付费填 1
    /**
     * @example 1
     * @var int
     */
    public $duration;

    // 购买时长单位； month / year
    /**
     * @example month
     * @var string
     */
    public $pricingCycle;

    // 购买实例的数量
    /**
     * @example 1
     * @var int
     */
    public $quantity;

    // 该子商品使用的优惠券ID
    /**
     * @example 123456
     * @var string
     */
    public $couponId;

    // 要购买的产品规格配件值,JSON格式
    /**
     * @example {}
     * @var string
     */
    public $componentsMap;

}
