<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class GetOauthServiceaccountRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 三方授权凭证
    /**
     * @var string
     */
    public $accessToken;

    // 服务账号ID
    /**
     * @var string
     */
    public $serviceAccountId;
    protected $_name = [
        'authToken'        => 'auth_token',
        'accessToken'      => 'access_token',
        'serviceAccountId' => 'service_account_id',
    ];

    public function validate()
    {
        Model::validateRequired('accessToken', $this->accessToken, true);
        Model::validateRequired('serviceAccountId', $this->serviceAccountId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->accessToken) {
            $res['access_token'] = $this->accessToken;
        }
        if (null !== $this->serviceAccountId) {
            $res['service_account_id'] = $this->serviceAccountId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetOauthServiceaccountRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['access_token'])) {
            $model->accessToken = $map['access_token'];
        }
        if (isset($map['service_account_id'])) {
            $model->serviceAccountId = $map['service_account_id'];
        }

        return $model;
    }
}
