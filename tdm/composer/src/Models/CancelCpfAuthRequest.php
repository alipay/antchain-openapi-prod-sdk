<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class CancelCpfAuthRequest extends Model
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

    // 身份证ID
    /**
     * @var string
     */
    public $dataOwnerIdentity;

    // 端ID
    /**
     * @var string
     */
    public $authorizedPlatformIdentity;

    // 授权接口返回的授权码
    /**
     * @var string
     */
    public $authCode;

    // 核身信息
    /**
     * @var string
     */
    public $certificationInfo;
    protected $_name = [
        'authToken'                  => 'auth_token',
        'productInstanceId'          => 'product_instance_id',
        'requestId'                  => 'request_id',
        'dataOwnerIdentity'          => 'data_owner_identity',
        'authorizedPlatformIdentity' => 'authorized_platform_identity',
        'authCode'                   => 'auth_code',
        'certificationInfo'          => 'certification_info',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('dataOwnerIdentity', $this->dataOwnerIdentity, true);
        Model::validateRequired('authCode', $this->authCode, true);
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
        if (null !== $this->authorizedPlatformIdentity) {
            $res['authorized_platform_identity'] = $this->authorizedPlatformIdentity;
        }
        if (null !== $this->authCode) {
            $res['auth_code'] = $this->authCode;
        }
        if (null !== $this->certificationInfo) {
            $res['certification_info'] = $this->certificationInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelCpfAuthRequest
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
        if (isset($map['authorized_platform_identity'])) {
            $model->authorizedPlatformIdentity = $map['authorized_platform_identity'];
        }
        if (isset($map['auth_code'])) {
            $model->authCode = $map['auth_code'];
        }
        if (isset($map['certification_info'])) {
            $model->certificationInfo = $map['certification_info'];
        }

        return $model;
    }
}
