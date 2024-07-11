<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class QueryAntchainAtoRealpersonFacevrfRequest extends Model
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

    // 可信实人认证的唯一标识
    /**
     * @var string
     */
    public $realPersonVerificationCode;
    protected $_name = [
        'authToken'                  => 'auth_token',
        'productInstanceId'          => 'product_instance_id',
        'realPersonVerificationCode' => 'real_person_verification_code',
    ];

    public function validate()
    {
        Model::validateRequired('realPersonVerificationCode', $this->realPersonVerificationCode, true);
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
        if (null !== $this->realPersonVerificationCode) {
            $res['real_person_verification_code'] = $this->realPersonVerificationCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntchainAtoRealpersonFacevrfRequest
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
        if (isset($map['real_person_verification_code'])) {
            $model->realPersonVerificationCode = $map['real_person_verification_code'];
        }

        return $model;
    }
}
