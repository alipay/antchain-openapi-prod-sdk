<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ff57c3b0e36d40419ee97697bacb6c79\Models;

use AlibabaCloud\Tea\Model;

class QueryAntchainTdmCpfAuthRequest extends Model
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

    // 身份证ID
    /**
     * @var string
     */
    public $dataOwnerIdentity;

    // 被授权机构ID
    /**
     * @var string
     */
    public $authorizedIdentity;

    // 端ID
    /**
     * @var string
     */
    public $authorizedPlatformIdentity;

    // 标的产品码
    /**
     * @var string
     */
    public $targetCode;

    // 扩展字段
    /**
     * @var string
     */
    public $extendParams;

    // 授权状态
    /**
     * @var string
     */
    public $authState;
    protected $_name = [
        'authToken'                  => 'auth_token',
        'productInstanceId'          => 'product_instance_id',
        'dataOwnerIdentity'          => 'data_owner_identity',
        'authorizedIdentity'         => 'authorized_identity',
        'authorizedPlatformIdentity' => 'authorized_platform_identity',
        'targetCode'                 => 'target_code',
        'extendParams'               => 'extend_params',
        'authState'                  => 'auth_state',
    ];

    public function validate()
    {
        Model::validateRequired('dataOwnerIdentity', $this->dataOwnerIdentity, true);
        Model::validateRequired('authState', $this->authState, true);
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
        if (null !== $this->dataOwnerIdentity) {
            $res['data_owner_identity'] = $this->dataOwnerIdentity;
        }
        if (null !== $this->authorizedIdentity) {
            $res['authorized_identity'] = $this->authorizedIdentity;
        }
        if (null !== $this->authorizedPlatformIdentity) {
            $res['authorized_platform_identity'] = $this->authorizedPlatformIdentity;
        }
        if (null !== $this->targetCode) {
            $res['target_code'] = $this->targetCode;
        }
        if (null !== $this->extendParams) {
            $res['extend_params'] = $this->extendParams;
        }
        if (null !== $this->authState) {
            $res['auth_state'] = $this->authState;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntchainTdmCpfAuthRequest
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
        if (isset($map['data_owner_identity'])) {
            $model->dataOwnerIdentity = $map['data_owner_identity'];
        }
        if (isset($map['authorized_identity'])) {
            $model->authorizedIdentity = $map['authorized_identity'];
        }
        if (isset($map['authorized_platform_identity'])) {
            $model->authorizedPlatformIdentity = $map['authorized_platform_identity'];
        }
        if (isset($map['target_code'])) {
            $model->targetCode = $map['target_code'];
        }
        if (isset($map['extend_params'])) {
            $model->extendParams = $map['extend_params'];
        }
        if (isset($map['auth_state'])) {
            $model->authState = $map['auth_state'];
        }

        return $model;
    }
}
