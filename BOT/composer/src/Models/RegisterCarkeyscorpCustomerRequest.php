<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class RegisterCarkeyscorpCustomerRequest extends Model
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

    // 对应客户企业名称缩写
    /**
     * @var string
     */
    public $corpValue;

    // 企业全称
    /**
     * @var string
     */
    public $customerName;

    // 接入场景码 内部分配给客户
    /**
     * @var string
     */
    public $accessScene;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'corpValue'         => 'corp_value',
        'customerName'      => 'customer_name',
        'accessScene'       => 'access_scene',
        'tenantId'          => 'tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('corpValue', $this->corpValue, true);
        Model::validateRequired('customerName', $this->customerName, true);
        Model::validateRequired('accessScene', $this->accessScene, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
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
        if (null !== $this->corpValue) {
            $res['corp_value'] = $this->corpValue;
        }
        if (null !== $this->customerName) {
            $res['customer_name'] = $this->customerName;
        }
        if (null !== $this->accessScene) {
            $res['access_scene'] = $this->accessScene;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RegisterCarkeyscorpCustomerRequest
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
        if (isset($map['corp_value'])) {
            $model->corpValue = $map['corp_value'];
        }
        if (isset($map['customer_name'])) {
            $model->customerName = $map['customer_name'];
        }
        if (isset($map['access_scene'])) {
            $model->accessScene = $map['access_scene'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }

        return $model;
    }
}
