<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ProductCodeInfo extends Model
{
    // 链ID
    /**
     * @example chainId
     *
     * @var string
     */
    public $chainId;

    // 租户ID
    /**
     * @example OKIJUHYG
     *
     * @var string
     */
    public $tenantId;

    // 场景码
    /**
     * @example product_code
     *
     * @var string
     */
    public $productCode;

    // 租户映射链上账户名称
    /**
     * @example account_name
     *
     * @var string
     */
    public $accountName;

    // 租户映射账户链上账户ID
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $accountId;

    // 备注信息
    /**
     * @example 备注信息
     *
     * @var string
     */
    public $memo;
    protected $_name = [
        'chainId'     => 'chain_id',
        'tenantId'    => 'tenant_id',
        'productCode' => 'product_code',
        'accountName' => 'account_name',
        'accountId'   => 'account_id',
        'memo'        => 'memo',
    ];

    public function validate()
    {
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('productCode', $this->productCode, true);
    }

    public function toMap()
    {
        $res = [];
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
     * @return ProductCodeInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
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
