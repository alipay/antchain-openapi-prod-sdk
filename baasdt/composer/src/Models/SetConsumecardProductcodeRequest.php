<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class SetConsumecardProductcodeRequest extends Model
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

    // 链ID
    /**
     * @var string
     */
    public $chainId;

    // 要配置的租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 场景码
    /**
     * @var string
     */
    public $productCode;

    // 账户链上名称
    /**
     * @var string
     */
    public $accountName;

    // 账户链上ID
    /**
     * @var string
     */
    public $accountId;

    // 备注信息
    /**
     * @var string
     */
    public $memo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'chainId'           => 'chain_id',
        'tenantId'          => 'tenant_id',
        'productCode'       => 'product_code',
        'accountName'       => 'account_name',
        'accountId'         => 'account_id',
        'memo'              => 'memo',
    ];

    public function validate()
    {
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('accountName', $this->accountName, true);
        Model::validateRequired('accountId', $this->accountId, true);
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
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->accountName) {
            $res['account_name'] = $this->accountName;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SetConsumecardProductcodeRequest
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
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['account_name'])) {
            $model->accountName = $map['account_name'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }

        return $model;
    }
}
