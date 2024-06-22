<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SyncTradeFinanceloanapplyRequest extends Model
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

    // 订单所属商户的社会信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 融资放款申请接口
    /**
     * @var string
     */
    public $merchantName;

    // 资方的社会信用代码
    /**
     * @var string
     */
    public $fundId;

    // 类型
    // ● 默认为：ORDER, 单订单申请
    // ● PACKAGE_ORDER , 资产包订单模式
    /**
     * @var string
     */
    public $type;

    // 资产包id
    // type = PACKAGE_ORDER ， 必填
    /**
     * @var string
     */
    public $assetPackageId;

    // type = PACKAGE_ORDER ， 必填
    //
    // ● APPEND: 追加订单列表
    // ● FINIISH : 结束
    /**
     * @var string
     */
    public $stage;

    // 订单id列表的jsonArray
    /**
     * @var string
     */
    public $orderIdList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'merchantId'        => 'merchant_id',
        'merchantName'      => 'merchant_name',
        'fundId'            => 'fund_id',
        'type'              => 'type',
        'assetPackageId'    => 'asset_package_id',
        'stage'             => 'stage',
        'orderIdList'       => 'order_id_list',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('merchantName', $this->merchantName, true);
        Model::validateMaxLength('orderId', $this->orderId, 50);
        Model::validateMaxLength('merchantId', $this->merchantId, 64);
        Model::validateMaxLength('fundId', $this->fundId, 64);
        Model::validateMaxLength('assetPackageId', $this->assetPackageId, 50);
        Model::validateMinLength('orderId', $this->orderId, 1);
        Model::validateMinLength('merchantId', $this->merchantId, 1);
        Model::validateMinLength('assetPackageId', $this->assetPackageId, 6);
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
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->assetPackageId) {
            $res['asset_package_id'] = $this->assetPackageId;
        }
        if (null !== $this->stage) {
            $res['stage'] = $this->stage;
        }
        if (null !== $this->orderIdList) {
            $res['order_id_list'] = $this->orderIdList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncTradeFinanceloanapplyRequest
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
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['asset_package_id'])) {
            $model->assetPackageId = $map['asset_package_id'];
        }
        if (isset($map['stage'])) {
            $model->stage = $map['stage'];
        }
        if (isset($map['order_id_list'])) {
            $model->orderIdList = $map['order_id_list'];
        }

        return $model;
    }
}
