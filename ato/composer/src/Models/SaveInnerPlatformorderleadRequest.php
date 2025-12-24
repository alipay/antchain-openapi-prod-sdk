<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SaveInnerPlatformorderleadRequest extends Model
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

    // 服务商租户id
    /**
     * @var string
     */
    public $tenantId;

    // 平台订单号
    /**
     * @var string
     */
    public $deliveryId;

    // 备注内容
    /**
     * @var string
     */
    public $remark;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'deliveryId'        => 'delivery_id',
        'remark'            => 'remark',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('deliveryId', $this->deliveryId, true);
        Model::validateRequired('remark', $this->remark, true);
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->deliveryId) {
            $res['delivery_id'] = $this->deliveryId;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveInnerPlatformorderleadRequest
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['delivery_id'])) {
            $model->deliveryId = $map['delivery_id'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }

        return $model;
    }
}
