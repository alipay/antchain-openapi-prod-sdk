<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class InitVerifyRequest extends Model
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

    // 被授权机构ID（统一社会信用代码）
    /**
     * @var string
     */
    public $authorizedIdentity;

    // 核身发起端
    /**
     * @var string
     */
    public $authorizedPlatformIdentity;

    // 刷脸产品类型
    /**
     * @var string
     */
    public $certificationType;

    // 核身初始化请求信息
    /**
     * @var string
     */
    public $certificationRequest;
    protected $_name = [
        'authToken'                  => 'auth_token',
        'productInstanceId'          => 'product_instance_id',
        'authorizedIdentity'         => 'authorized_identity',
        'authorizedPlatformIdentity' => 'authorized_platform_identity',
        'certificationType'          => 'certification_type',
        'certificationRequest'       => 'certification_request',
    ];

    public function validate()
    {
        Model::validateRequired('authorizedIdentity', $this->authorizedIdentity, true);
        Model::validateRequired('authorizedPlatformIdentity', $this->authorizedPlatformIdentity, true);
        Model::validateRequired('certificationType', $this->certificationType, true);
        Model::validateRequired('certificationRequest', $this->certificationRequest, true);
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
        if (null !== $this->authorizedIdentity) {
            $res['authorized_identity'] = $this->authorizedIdentity;
        }
        if (null !== $this->authorizedPlatformIdentity) {
            $res['authorized_platform_identity'] = $this->authorizedPlatformIdentity;
        }
        if (null !== $this->certificationType) {
            $res['certification_type'] = $this->certificationType;
        }
        if (null !== $this->certificationRequest) {
            $res['certification_request'] = $this->certificationRequest;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitVerifyRequest
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
        if (isset($map['authorized_identity'])) {
            $model->authorizedIdentity = $map['authorized_identity'];
        }
        if (isset($map['authorized_platform_identity'])) {
            $model->authorizedPlatformIdentity = $map['authorized_platform_identity'];
        }
        if (isset($map['certification_type'])) {
            $model->certificationType = $map['certification_type'];
        }
        if (isset($map['certification_request'])) {
            $model->certificationRequest = $map['certification_request'];
        }

        return $model;
    }
}
