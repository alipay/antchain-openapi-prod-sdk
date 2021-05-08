<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class CancelAuthRequest extends Model
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

    // 授权租户身份ID：
    // 身份证号/统一社会组织机构信用码
    /**
     * @var string
     */
    public $dataOwnerIdentity;

    // 分配code
    /**
     * @var string
     */
    public $authorizedPlatformIdentity;

    // 标的物，查询授权接口返回
    //
    //
    /**
     * @var string
     */
    public $authCode;

    // 核身信息
    //
    /**
     * @var string
     */
    public $certificationInfo;

    // 请求流水号
    //
    // 幂等标示
    //
    //
    /**
     * @var string
     */
    public $requestId;
    protected $_name = [
        'authToken'                  => 'auth_token',
        'productInstanceId'          => 'product_instance_id',
        'dataOwnerIdentity'          => 'data_owner_identity',
        'authorizedPlatformIdentity' => 'authorized_platform_identity',
        'authCode'                   => 'auth_code',
        'certificationInfo'          => 'certification_info',
        'requestId'                  => 'request_id',
    ];

    public function validate()
    {
        Model::validateRequired('dataOwnerIdentity', $this->dataOwnerIdentity, true);
        Model::validateRequired('authorizedPlatformIdentity', $this->authorizedPlatformIdentity, true);
        Model::validateRequired('authCode', $this->authCode, true);
        Model::validateRequired('certificationInfo', $this->certificationInfo, true);
        Model::validateRequired('requestId', $this->requestId, true);
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
        if (null !== $this->authorizedPlatformIdentity) {
            $res['authorized_platform_identity'] = $this->authorizedPlatformIdentity;
        }
        if (null !== $this->authCode) {
            $res['auth_code'] = $this->authCode;
        }
        if (null !== $this->certificationInfo) {
            $res['certification_info'] = $this->certificationInfo;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelAuthRequest
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
        if (isset($map['authorized_platform_identity'])) {
            $model->authorizedPlatformIdentity = $map['authorized_platform_identity'];
        }
        if (isset($map['auth_code'])) {
            $model->authCode = $map['auth_code'];
        }
        if (isset($map['certification_info'])) {
            $model->certificationInfo = $map['certification_info'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }

        return $model;
    }
}
