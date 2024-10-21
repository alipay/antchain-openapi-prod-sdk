<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SP\Models;

use AlibabaCloud\Tea\Model;

class SyncPccCommodityStatusRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $productAccessCode;

    // 主商品编码
    /**
     * @var string
     */
    public $commodityCode;

    // 商品名称
    /**
     * @var string
     */
    public $commodityName;

    // 商品服务模式，PLATFORM-平台型
    /**
     * @var string
     */
    public $commodityServiceMode;

    // 商品计费模式，PREPAY_BY_MONTH-包年包月 AFTER_PAY_BY_HOUR-按量付费
    /**
     * @var string
     */
    public $commodityChargeType;

    // 商品状态，ONLINE-上架，OFFLINE-下架
    /**
     * @var string
     */
    public $commodityStatus;

    // 产品干系人
    /**
     * @var RelUser[]
     */
    public $productRelUses;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'productAccessCode'    => 'product_access_code',
        'commodityCode'        => 'commodity_code',
        'commodityName'        => 'commodity_name',
        'commodityServiceMode' => 'commodity_service_mode',
        'commodityChargeType'  => 'commodity_charge_type',
        'commodityStatus'      => 'commodity_status',
        'productRelUses'       => 'product_rel_uses',
    ];

    public function validate()
    {
        Model::validateRequired('commodityCode', $this->commodityCode, true);
        Model::validateRequired('commodityName', $this->commodityName, true);
        Model::validateRequired('commodityServiceMode', $this->commodityServiceMode, true);
        Model::validateRequired('commodityChargeType', $this->commodityChargeType, true);
        Model::validateRequired('commodityStatus', $this->commodityStatus, true);
        Model::validateRequired('productRelUses', $this->productRelUses, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->productAccessCode) {
            $res['product_access_code'] = $this->productAccessCode;
        }
        if (null !== $this->commodityCode) {
            $res['commodity_code'] = $this->commodityCode;
        }
        if (null !== $this->commodityName) {
            $res['commodity_name'] = $this->commodityName;
        }
        if (null !== $this->commodityServiceMode) {
            $res['commodity_service_mode'] = $this->commodityServiceMode;
        }
        if (null !== $this->commodityChargeType) {
            $res['commodity_charge_type'] = $this->commodityChargeType;
        }
        if (null !== $this->commodityStatus) {
            $res['commodity_status'] = $this->commodityStatus;
        }
        if (null !== $this->productRelUses) {
            $res['product_rel_uses'] = [];
            if (null !== $this->productRelUses && \is_array($this->productRelUses)) {
                $n = 0;
                foreach ($this->productRelUses as $item) {
                    $res['product_rel_uses'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncPccCommodityStatusRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['product_access_code'])) {
            $model->productAccessCode = $map['product_access_code'];
        }
        if (isset($map['commodity_code'])) {
            $model->commodityCode = $map['commodity_code'];
        }
        if (isset($map['commodity_name'])) {
            $model->commodityName = $map['commodity_name'];
        }
        if (isset($map['commodity_service_mode'])) {
            $model->commodityServiceMode = $map['commodity_service_mode'];
        }
        if (isset($map['commodity_charge_type'])) {
            $model->commodityChargeType = $map['commodity_charge_type'];
        }
        if (isset($map['commodity_status'])) {
            $model->commodityStatus = $map['commodity_status'];
        }
        if (isset($map['product_rel_uses'])) {
            if (!empty($map['product_rel_uses'])) {
                $model->productRelUses = [];
                $n                     = 0;
                foreach ($map['product_rel_uses'] as $item) {
                    $model->productRelUses[$n++] = null !== $item ? RelUser::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
