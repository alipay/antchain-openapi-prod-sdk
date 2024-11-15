<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class GetProductSaassdkRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 共享能力码
    /**
     * @var string
     */
    public $saasCode;
    protected $_name = [
        'authToken' => 'auth_token',
        'saasCode'  => 'saas_code',
    ];

    public function validate()
    {
        Model::validateRequired('saasCode', $this->saasCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->saasCode) {
            $res['saas_code'] = $this->saasCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetProductSaassdkRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['saas_code'])) {
            $model->saasCode = $map['saas_code'];
        }

        return $model;
    }
}
