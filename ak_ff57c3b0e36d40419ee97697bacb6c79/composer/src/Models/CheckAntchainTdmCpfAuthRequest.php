<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ff57c3b0e36d40419ee97697bacb6c79\Models;

use AlibabaCloud\Tea\Model;

class CheckAntchainTdmCpfAuthRequest extends Model
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

    // 流水ID
    /**
     * @var string
     */
    public $requestId;

    // 用户ID
    /**
     * @var string
     */
    public $dataOwnerIdentity;

    // 授权机构ID
    /**
     * @var string
     */
    public $authorizedIdentity;

    // 授权端ID
    /**
     * @var string
     */
    public $authorizedPlatformIdentity;

    // 授权业务码
    /**
     * @var string
     */
    public $targetCode;

    // 授权协议
    /**
     * @var AuthAgreement
     */
    public $authAgreement;

    // 扩展字段
    /**
     * @var AuthProperty
     */
    public $content;
    protected $_name = [
        'authToken'                  => 'auth_token',
        'productInstanceId'          => 'product_instance_id',
        'requestId'                  => 'request_id',
        'dataOwnerIdentity'          => 'data_owner_identity',
        'authorizedIdentity'         => 'authorized_identity',
        'authorizedPlatformIdentity' => 'authorized_platform_identity',
        'targetCode'                 => 'target_code',
        'authAgreement'              => 'auth_agreement',
        'content'                    => 'content',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('dataOwnerIdentity', $this->dataOwnerIdentity, true);
        Model::validateRequired('authorizedIdentity', $this->authorizedIdentity, true);
        Model::validateRequired('targetCode', $this->targetCode, true);
        Model::validateRequired('content', $this->content, true);
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
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
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
        if (null !== $this->authAgreement) {
            $res['auth_agreement'] = null !== $this->authAgreement ? $this->authAgreement->toMap() : null;
        }
        if (null !== $this->content) {
            $res['content'] = null !== $this->content ? $this->content->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckAntchainTdmCpfAuthRequest
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
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
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
        if (isset($map['auth_agreement'])) {
            $model->authAgreement = AuthAgreement::fromMap($map['auth_agreement']);
        }
        if (isset($map['content'])) {
            $model->content = AuthProperty::fromMap($map['content']);
        }

        return $model;
    }
}
