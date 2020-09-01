<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class UpdateBaasEbcAuthStatusRequest extends Model
{
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
    public $regionName;

    // 授权关系id
    //
    /**
     * @var string
     */
    public $authId;

    // 1:启用，2：禁用，3：停用
    /**
     * @var int
     */
    public $status;

    // 消费方租户id
    //
    /**
     * @var string
     */
    public $tenantName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName'        => 'region_name',
        'authId'            => 'auth_id',
        'status'            => 'status',
        'tenantName'        => 'tenant_name',
    ];

    public function validate()
    {
        Model::validateMaxLength('authId', $this->authId, 256);
        Model::validateMaxLength('tenantName', $this->tenantName, 64);
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
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->authId) {
            $res['auth_id'] = $this->authId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateBaasEbcAuthStatusRequest
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
        if (isset($map['region_name'])) {
            $model->regionName = $map['region_name'];
        }
        if (isset($map['auth_id'])) {
            $model->authId = $map['auth_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }

        return $model;
    }
}
