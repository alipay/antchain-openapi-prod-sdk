<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class CreateCyclinginsuranceServiceorderRequest extends Model
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

    // 来源场景
    /**
     * @var string
     */
    public $scene;

    // 请求唯一id
    /**
     * @var string
     */
    public $requestId;

    // 调用方应用名
    /**
     * @var string
     */
    public $callerAppName;

    // 业务id，用于幂等
    /**
     * @var string
     */
    public $bizId;

    // 下单账号
    /**
     * @var string
     */
    public $accountId;

    // 商品码
    /**
     * @var string
     */
    public $itemCode;

    // 商品属性
    // serviceStartTime:服务开始时间
    // serviceEndTime:服务结束时间
    // tenantAddress:上门地址
    // tenantPhone:租赁人电话
    // insurancePolicyId:保险单号
    // batteryType:电池型号
    /**
     * @var string
     */
    public $itemAttributes;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'scene'             => 'scene',
        'requestId'         => 'request_id',
        'callerAppName'     => 'caller_app_name',
        'bizId'             => 'biz_id',
        'accountId'         => 'account_id',
        'itemCode'          => 'item_code',
        'itemAttributes'    => 'item_attributes',
    ];

    public function validate()
    {
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('callerAppName', $this->callerAppName, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('itemCode', $this->itemCode, true);
        Model::validateRequired('itemAttributes', $this->itemAttributes, true);
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
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->callerAppName) {
            $res['caller_app_name'] = $this->callerAppName;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->itemCode) {
            $res['item_code'] = $this->itemCode;
        }
        if (null !== $this->itemAttributes) {
            $res['item_attributes'] = $this->itemAttributes;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateCyclinginsuranceServiceorderRequest
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
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['caller_app_name'])) {
            $model->callerAppName = $map['caller_app_name'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['item_code'])) {
            $model->itemCode = $map['item_code'];
        }
        if (isset($map['item_attributes'])) {
            $model->itemAttributes = $map['item_attributes'];
        }

        return $model;
    }
}
