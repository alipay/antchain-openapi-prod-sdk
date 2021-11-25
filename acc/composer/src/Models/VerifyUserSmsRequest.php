<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class VerifyUserSmsRequest extends Model
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

    // 核验id，sms_login_apply 产生
    /**
     * @var string
     */
    public $verifyId;

    // 短信code
    /**
     * @var string
     */
    public $checkCode;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'verifyId'          => 'verify_id',
        'checkCode'         => 'check_code',
        'tenantId'          => 'tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('verifyId', $this->verifyId, true);
        Model::validateRequired('checkCode', $this->checkCode, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
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
        if (null !== $this->verifyId) {
            $res['verify_id'] = $this->verifyId;
        }
        if (null !== $this->checkCode) {
            $res['check_code'] = $this->checkCode;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyUserSmsRequest
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
        if (isset($map['verify_id'])) {
            $model->verifyId = $map['verify_id'];
        }
        if (isset($map['check_code'])) {
            $model->checkCode = $map['check_code'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }

        return $model;
    }
}
