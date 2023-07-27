<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class VerifyTrustloginTokenRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 系统来源
    //
    /**
     * @var string
     */
    public $sourceSystem;

    // 申请免密登录时获取的token
    //
    /**
     * @var string
     */
    public $accessToken;
    protected $_name = [
        'authToken'    => 'auth_token',
        'sourceSystem' => 'source_system',
        'accessToken'  => 'access_token',
    ];

    public function validate()
    {
        Model::validateRequired('sourceSystem', $this->sourceSystem, true);
        Model::validateRequired('accessToken', $this->accessToken, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->sourceSystem) {
            $res['source_system'] = $this->sourceSystem;
        }
        if (null !== $this->accessToken) {
            $res['access_token'] = $this->accessToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyTrustloginTokenRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['source_system'])) {
            $model->sourceSystem = $map['source_system'];
        }
        if (isset($map['access_token'])) {
            $model->accessToken = $map['access_token'];
        }

        return $model;
    }
}
