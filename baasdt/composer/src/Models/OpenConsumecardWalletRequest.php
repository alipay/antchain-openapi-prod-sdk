<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class OpenConsumecardWalletRequest extends Model
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

    // 请求参数
    /**
     * @var BaseRequest
     */
    public $baseRequest;

    // 操作类型(0 开通钱包)
    /**
     * @var int
     */
    public $operateType;

    // 角色(1 机构, 2 个人)
    /**
     * @var int
     */
    public $roleType;

    // 钱包类型（0:余额账户）
    /**
     * @var int
     */
    public $walletType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'operateType'       => 'operate_type',
        'roleType'          => 'role_type',
        'walletType'        => 'wallet_type',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('operateType', $this->operateType, true);
        Model::validateRequired('roleType', $this->roleType, true);
        Model::validateRequired('walletType', $this->walletType, true);
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
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->operateType) {
            $res['operate_type'] = $this->operateType;
        }
        if (null !== $this->roleType) {
            $res['role_type'] = $this->roleType;
        }
        if (null !== $this->walletType) {
            $res['wallet_type'] = $this->walletType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpenConsumecardWalletRequest
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
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequest::fromMap($map['base_request']);
        }
        if (isset($map['operate_type'])) {
            $model->operateType = $map['operate_type'];
        }
        if (isset($map['role_type'])) {
            $model->roleType = $map['role_type'];
        }
        if (isset($map['wallet_type'])) {
            $model->walletType = $map['wallet_type'];
        }

        return $model;
    }
}
