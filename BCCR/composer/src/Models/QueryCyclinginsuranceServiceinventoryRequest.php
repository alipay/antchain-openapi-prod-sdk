<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class QueryCyclinginsuranceServiceinventoryRequest extends Model
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

    // 场景
    /**
     * @var string
     */
    public $scene;

    // 请求id，用于链路追踪，如uuid
    /**
     * @var string
     */
    public $requestId;

    // 调用方
    /**
     * @var string
     */
    public $callerAppName;

    // 服务商账号id
    /**
     * @var string
     */
    public $accountId;

    // 商品code
    /**
     * @var string
     */
    public $itemCode;

    // 商品属性
    // tenantAddressProvince: 上门地址所在省
    // tenantAddressCity：上门地址所在市
    // insurancePolicyId:保险单号
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
        'accountId'         => 'account_id',
        'itemCode'          => 'item_code',
        'itemAttributes'    => 'item_attributes',
    ];

    public function validate()
    {
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('callerAppName', $this->callerAppName, true);
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
     * @return QueryCyclinginsuranceServiceinventoryRequest
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
