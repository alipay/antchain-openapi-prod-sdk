<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDIGITAL\Models;

use AlibabaCloud\Tea\Model;

class CreateAccountKmsRequest extends Model
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

    // 链id
    /**
     * @var string
     */
    public $bizid;

    // 链账户名称，支持长度100以内的，大小写字母、数字、下划线、横线、@、点
    /**
     * @var string
     */
    public $account;

    // 托管账户所在的租户，默认为调用者的租户
    /**
     * @var string
     */
    public $tenantId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizid'             => 'bizid',
        'account'           => 'account',
        'tenantId'          => 'tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('bizid', $this->bizid, true);
        Model::validateRequired('account', $this->account, true);
        Model::validateMinLength('bizid', $this->bizid, 1);
        Model::validateMinLength('account', $this->account, 1);
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
        if (null !== $this->bizid) {
            $res['bizid'] = $this->bizid;
        }
        if (null !== $this->account) {
            $res['account'] = $this->account;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAccountKmsRequest
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
        if (isset($map['bizid'])) {
            $model->bizid = $map['bizid'];
        }
        if (isset($map['account'])) {
            $model->account = $map['account'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }

        return $model;
    }
}
