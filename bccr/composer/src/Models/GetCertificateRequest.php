<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class GetCertificateRequest extends Model
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

    // 证书类型
    /**
     * @var string
     */
    public $certificateType;

    // 功能类型
    /**
     * @var string
     */
    public $featuresType;

    // 版权登记id
    /**
     * @var string
     */
    public $registerId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'certificateType'   => 'certificate_type',
        'featuresType'      => 'features_type',
        'registerId'        => 'register_id',
    ];

    public function validate()
    {
        Model::validateRequired('certificateType', $this->certificateType, true);
        Model::validateRequired('featuresType', $this->featuresType, true);
        Model::validateRequired('registerId', $this->registerId, true);
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
        if (null !== $this->certificateType) {
            $res['certificate_type'] = $this->certificateType;
        }
        if (null !== $this->featuresType) {
            $res['features_type'] = $this->featuresType;
        }
        if (null !== $this->registerId) {
            $res['register_id'] = $this->registerId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetCertificateRequest
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
        if (isset($map['certificate_type'])) {
            $model->certificateType = $map['certificate_type'];
        }
        if (isset($map['features_type'])) {
            $model->featuresType = $map['features_type'];
        }
        if (isset($map['register_id'])) {
            $model->registerId = $map['register_id'];
        }

        return $model;
    }
}
