<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTC\Models;

use AlibabaCloud\Tea\Model;

class ApplyNftTransferRequest extends Model
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

    // 藏品标识sku
    /**
     * @var int
     */
    public $skuId;

    // 被转入用户的支付宝uid和手机号
    /**
     * @var string
     */
    public $toIdNo;

    // 参照idType枚举
    /**
     * @var string
     */
    public $toIdType;

    // 用户购买价格，可以为0，单位分
    /**
     * @var int
     */
    public $priceCent;

    // 用户在商户购买的订单号
    /**
     * @var string
     */
    public $orderNo;

    // 调用方渠道租户，传租户id即可
    /**
     * @var string
     */
    public $channelTenant;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'skuId'             => 'sku_id',
        'toIdNo'            => 'to_id_no',
        'toIdType'          => 'to_id_type',
        'priceCent'         => 'price_cent',
        'orderNo'           => 'order_no',
        'channelTenant'     => 'channel_tenant',
    ];

    public function validate()
    {
        Model::validateRequired('skuId', $this->skuId, true);
        Model::validateRequired('toIdNo', $this->toIdNo, true);
        Model::validateRequired('toIdType', $this->toIdType, true);
        Model::validateRequired('priceCent', $this->priceCent, true);
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('channelTenant', $this->channelTenant, true);
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
        if (null !== $this->skuId) {
            $res['sku_id'] = $this->skuId;
        }
        if (null !== $this->toIdNo) {
            $res['to_id_no'] = $this->toIdNo;
        }
        if (null !== $this->toIdType) {
            $res['to_id_type'] = $this->toIdType;
        }
        if (null !== $this->priceCent) {
            $res['price_cent'] = $this->priceCent;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->channelTenant) {
            $res['channel_tenant'] = $this->channelTenant;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyNftTransferRequest
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
        if (isset($map['sku_id'])) {
            $model->skuId = $map['sku_id'];
        }
        if (isset($map['to_id_no'])) {
            $model->toIdNo = $map['to_id_no'];
        }
        if (isset($map['to_id_type'])) {
            $model->toIdType = $map['to_id_type'];
        }
        if (isset($map['price_cent'])) {
            $model->priceCent = $map['price_cent'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['channel_tenant'])) {
            $model->channelTenant = $map['channel_tenant'];
        }

        return $model;
    }
}
