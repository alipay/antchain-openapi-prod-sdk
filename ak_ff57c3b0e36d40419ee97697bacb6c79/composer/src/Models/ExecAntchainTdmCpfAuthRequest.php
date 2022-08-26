<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ff57c3b0e36d40419ee97697bacb6c79\Models;

use AlibabaCloud\Tea\Model;

class ExecAntchainTdmCpfAuthRequest extends Model
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

    // 流水号
    /**
     * @var string
     */
    public $requestId;

    // 用户身份证ID
    /**
     * @var string
     */
    public $dataOwnerIdentity;

    // 用户姓名
    /**
     * @var string
     */
    public $dataOwnerName;

    // 被授权机构ID
    /**
     * @var string
     */
    public $authorizedIdentity;

    // 被授权机构名称
    /**
     * @var string
     */
    public $authorizedName;

    // 端ID
    /**
     * @var string
     */
    public $authorizedPlatformIdentity;

    // 授权标的
    /**
     * @var string
     */
    public $targetCode;

    // 授权协议
    /**
     * @var AuthAgreement
     */
    public $authAgreement;

    // 核身信息
    /**
     * @var CertificationInfo
     */
    public $certificationInfo;

    // 扩展字段
    /**
     * @var string
     */
    public $content;
    protected $_name = [
        'authToken'                  => 'auth_token',
        'productInstanceId'          => 'product_instance_id',
        'requestId'                  => 'request_id',
        'dataOwnerIdentity'          => 'data_owner_identity',
        'dataOwnerName'              => 'data_owner_name',
        'authorizedIdentity'         => 'authorized_identity',
        'authorizedName'             => 'authorized_name',
        'authorizedPlatformIdentity' => 'authorized_platform_identity',
        'targetCode'                 => 'target_code',
        'authAgreement'              => 'auth_agreement',
        'certificationInfo'          => 'certification_info',
        'content'                    => 'content',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('dataOwnerIdentity', $this->dataOwnerIdentity, true);
        Model::validateRequired('authorizedIdentity', $this->authorizedIdentity, true);
        Model::validateRequired('targetCode', $this->targetCode, true);
        Model::validateRequired('authAgreement', $this->authAgreement, true);
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
        if (null !== $this->dataOwnerName) {
            $res['data_owner_name'] = $this->dataOwnerName;
        }
        if (null !== $this->authorizedIdentity) {
            $res['authorized_identity'] = $this->authorizedIdentity;
        }
        if (null !== $this->authorizedName) {
            $res['authorized_name'] = $this->authorizedName;
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
        if (null !== $this->certificationInfo) {
            $res['certification_info'] = null !== $this->certificationInfo ? $this->certificationInfo->toMap() : null;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecAntchainTdmCpfAuthRequest
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
        if (isset($map['data_owner_name'])) {
            $model->dataOwnerName = $map['data_owner_name'];
        }
        if (isset($map['authorized_identity'])) {
            $model->authorizedIdentity = $map['authorized_identity'];
        }
        if (isset($map['authorized_name'])) {
            $model->authorizedName = $map['authorized_name'];
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
        if (isset($map['certification_info'])) {
            $model->certificationInfo = CertificationInfo::fromMap($map['certification_info']);
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }

        return $model;
    }
}
