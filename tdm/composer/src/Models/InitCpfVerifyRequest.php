<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class InitCpfVerifyRequest extends Model
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

    // 核身初始化请求信息
    /**
     * @var string
     */
    public $certificationRequest;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'certificationRequest' => 'certification_request',
    ];

    public function validate()
    {
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
        if (null !== $this->certificationRequest) {
            $res['certification_request'] = $this->certificationRequest;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitCpfVerifyRequest
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
        if (isset($map['certification_request'])) {
            $model->certificationRequest = $map['certification_request'];
        }

        return $model;
    }
}
