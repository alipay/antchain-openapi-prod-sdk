<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class UpdateTenantRequest extends Model
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

    // 主键Id
    /**
     * @var int
     */
    public $id;

    // 租户
    /**
     * @var string
     */
    public $tenantName;

    // 组织名称
    /**
     * @var string
     */
    public $orgName;

    // 企业执照号
    //
    /**
     * @var string
     */
    public $owner;

    // 网关私钥
    //
    /**
     * @var string
     */
    public $gatewayPrivateKey;

    // 网关公钥
    //
    /**
     * @var string
     */
    public $gatewayPublicKey;

    // 是否为测试租户
    /**
     * @var bool
     */
    public $mock;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'id'                => 'id',
        'tenantName'        => 'tenant_name',
        'orgName'           => 'org_name',
        'owner'             => 'owner',
        'gatewayPrivateKey' => 'gateway_private_key',
        'gatewayPublicKey'  => 'gateway_public_key',
        'mock'              => 'mock',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->orgName) {
            $res['org_name'] = $this->orgName;
        }
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }
        if (null !== $this->gatewayPrivateKey) {
            $res['gateway_private_key'] = $this->gatewayPrivateKey;
        }
        if (null !== $this->gatewayPublicKey) {
            $res['gateway_public_key'] = $this->gatewayPublicKey;
        }
        if (null !== $this->mock) {
            $res['mock'] = $this->mock;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateTenantRequest
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['org_name'])) {
            $model->orgName = $map['org_name'];
        }
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }
        if (isset($map['gateway_private_key'])) {
            $model->gatewayPrivateKey = $map['gateway_private_key'];
        }
        if (isset($map['gateway_public_key'])) {
            $model->gatewayPublicKey = $map['gateway_public_key'];
        }
        if (isset($map['mock'])) {
            $model->mock = $map['mock'];
        }

        return $model;
    }
}
