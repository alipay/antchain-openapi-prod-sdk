<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class SyncAntchainAtoTradeReceiptorderfullinfoRequest extends Model
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

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 商户社会信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 商户公司名字
    /**
     * @var string
     */
    public $merchantName;

    // 场景码
    /**
     * @var string
     */
    public $bizScene;

    // 业务类型
    /**
     * @var string
     */
    public $bizType;

    // 主订单信息，资产订单定义
    /**
     * @var string
     */
    public $receiptOrderInfo;

    // 订单包含的商品信息
    /**
     * @var string
     */
    public $productInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'merchantId'        => 'merchant_id',
        'merchantName'      => 'merchant_name',
        'bizScene'          => 'biz_scene',
        'bizType'           => 'biz_type',
        'receiptOrderInfo'  => 'receipt_order_info',
        'productInfo'       => 'product_info',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('merchantName', $this->merchantName, true);
        Model::validateRequired('bizScene', $this->bizScene, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('receiptOrderInfo', $this->receiptOrderInfo, true);
        Model::validateRequired('productInfo', $this->productInfo, true);
        Model::validateMaxLength('orderId', $this->orderId, 49);
        Model::validateMaxLength('merchantId', $this->merchantId, 63);
        Model::validateMaxLength('merchantName', $this->merchantName, 199);
        Model::validateMinLength('orderId', $this->orderId, 7);
        Model::validateMinLength('merchantId', $this->merchantId, 1);
        Model::validateMinLength('merchantName', $this->merchantName, 1);
        Model::validateMinLength('bizScene', $this->bizScene, 1);
        Model::validateMinLength('bizType', $this->bizType, 1);
        Model::validateMinLength('receiptOrderInfo', $this->receiptOrderInfo, 1);
        Model::validateMinLength('productInfo', $this->productInfo, 1);
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
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->merchantName) {
            $res['merchant_name'] = $this->merchantName;
        }
        if (null !== $this->bizScene) {
            $res['biz_scene'] = $this->bizScene;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->receiptOrderInfo) {
            $res['receipt_order_info'] = $this->receiptOrderInfo;
        }
        if (null !== $this->productInfo) {
            $res['product_info'] = $this->productInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncAntchainAtoTradeReceiptorderfullinfoRequest
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
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['merchant_name'])) {
            $model->merchantName = $map['merchant_name'];
        }
        if (isset($map['biz_scene'])) {
            $model->bizScene = $map['biz_scene'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['receipt_order_info'])) {
            $model->receiptOrderInfo = $map['receipt_order_info'];
        }
        if (isset($map['product_info'])) {
            $model->productInfo = $map['product_info'];
        }

        return $model;
    }
}
