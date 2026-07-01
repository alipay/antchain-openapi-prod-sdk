<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CancelDataflowAuthorizeRequest extends Model
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

    // 目标租户ID
    /**
     * @var string
     */
    public $targetTenant;

    // 授权类型： 1. PUBKEY_UPLOAD：上传信封公钥 2. GET_NOTARY：查询存证原文 3. CHECK_NOTARY：核验存证信息
    /**
     * @var string
     */
    public $authType;

    // 授权范围，授权类型为GET_NOTARY或者CHECK_NOTARY时必填，取值为： 1. TXHASH：交易哈希维度授权 2. ACCOUNT：账号维度授权
    /**
     * @var string
     */
    public $authScope;

    // 授权的目标存证地址，当授权类型为GET_NOTARY或者CHECK_NOTARY，且授权范围为TXHASH时必填，最多20个
    /**
     * @var string[]
     */
    public $txHashList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'targetTenant'      => 'target_tenant',
        'authType'          => 'auth_type',
        'authScope'         => 'auth_scope',
        'txHashList'        => 'tx_hash_list',
    ];

    public function validate()
    {
        Model::validateRequired('targetTenant', $this->targetTenant, true);
        Model::validateRequired('authType', $this->authType, true);
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
        if (null !== $this->targetTenant) {
            $res['target_tenant'] = $this->targetTenant;
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->authScope) {
            $res['auth_scope'] = $this->authScope;
        }
        if (null !== $this->txHashList) {
            $res['tx_hash_list'] = $this->txHashList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelDataflowAuthorizeRequest
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
        if (isset($map['target_tenant'])) {
            $model->targetTenant = $map['target_tenant'];
        }
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['auth_scope'])) {
            $model->authScope = $map['auth_scope'];
        }
        if (isset($map['tx_hash_list'])) {
            if (!empty($map['tx_hash_list'])) {
                $model->txHashList = $map['tx_hash_list'];
            }
        }

        return $model;
    }
}
