<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\SelectedConfigItem;

class QueryAntcloudTradeComboPriceRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'comboCode' => 'combo_code',
        'tenantId' => 'tenant_id',
        'tenantName' => 'tenant_name',
        'orderType' => 'order_type',
        'couponId' => 'coupon_id',
        'comboVid' => 'combo_vid',
        'customSpecPricing' => 'custom_spec_pricing',
        'selectedConfigs' => 'selected_configs',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->comboCode) {
            $res['combo_code'] = $this->comboCode;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->orderType) {
            $res['order_type'] = $this->orderType;
        }
        if (null !== $this->couponId) {
            $res['coupon_id'] = $this->couponId;
        }
        if (null !== $this->comboVid) {
            $res['combo_vid'] = $this->comboVid;
        }
        if (null !== $this->customSpecPricing) {
            $res['custom_spec_pricing'] = $this->customSpecPricing;
        }
        if (null !== $this->selectedConfigs) {
            $res['selected_configs'] = [];
            if(null !== $this->selectedConfigs && is_array($this->selectedConfigs)){
                $n = 0;
                foreach($this->selectedConfigs as $item){
                    $res['selected_configs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAntcloudTradeComboPriceRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['combo_code'])){
            $model->comboCode = $map['combo_code'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['tenant_name'])){
            $model->tenantName = $map['tenant_name'];
        }
        if(isset($map['order_type'])){
            $model->orderType = $map['order_type'];
        }
        if(isset($map['coupon_id'])){
            $model->couponId = $map['coupon_id'];
        }
        if(isset($map['combo_vid'])){
            $model->comboVid = $map['combo_vid'];
        }
        if(isset($map['custom_spec_pricing'])){
            $model->customSpecPricing = $map['custom_spec_pricing'];
        }
        if(isset($map['selected_configs'])){
            if(!empty($map['selected_configs'])){
                $model->selectedConfigs = [];
                $n = 0;
                foreach($map['selected_configs'] as $item) {
                    $model->selectedConfigs[$n++] = null !== $item ? SelectedConfigItem::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 套餐编码。自定义规格询价时可为空
    /**
     * @var string
     */
    public $comboCode;

    // 租户ID，和租户名二选一必填
    /**
     * @var string
     */
    public $tenantId;

    // 8位租户名，和租户ID二选一必填
    /**
     * @var string
     */
    public $tenantName;

    // 订单类型，新购：NEW，不填则默认NEW
    /**
     * @var string
     */
    public $orderType;

    // 优惠券ID
    /**
     * @var string
     */
    public $couponId;

    // 套餐版本唯一版本号。CV开头的唯一版本号，由中台提供。自定义规格查询时必填
    /**
     * @var string
     */
    public $comboVid;

    // 是否自定义规格询价
    /**
     * @var bool
     */
    public $customSpecPricing;

    // 用户选择的规格配置列表
    /**
     * @var SelectedConfigItem[]
     */
    public $selectedConfigs;

}
