<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class TokenData extends Model
{
    // 授权token
    /**
     * @example token
     *
     * @var string
     */
    public $accessToken;

    // 授权类型
    /**
     * @example type
     *
     * @var string
     */
    public $tokenType;

    // 过期时间
    /**
     * @example
     *
     * @var int
     */
    public $expiresln;

    // 重新刷新Token
    /**
     * @example token
     *
     * @var string
     */
    public $refreshToken;

    // sessionid
    /**
     * @example xxx
     *
     * @var string
     */
    public $sessionId;
    protected $_name = [
        'accessToken'  => 'access_token',
        'tokenType'    => 'token_type',
        'expiresln'    => 'expiresln',
        'refreshToken' => 'refresh_token',
        'sessionId'    => 'session_id',
    ];

    public function validate()
    {
        Model::validateRequired('accessToken', $this->accessToken, true);
        Model::validateRequired('tokenType', $this->tokenType, true);
        Model::validateRequired('expiresln', $this->expiresln, true);
        Model::validateRequired('refreshToken', $this->refreshToken, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accessToken) {
            $res['access_token'] = $this->accessToken;
        }
        if (null !== $this->tokenType) {
            $res['token_type'] = $this->tokenType;
        }
        if (null !== $this->expiresln) {
            $res['expiresln'] = $this->expiresln;
        }
        if (null !== $this->refreshToken) {
            $res['refresh_token'] = $this->refreshToken;
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TokenData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['access_token'])) {
            $model->accessToken = $map['access_token'];
        }
        if (isset($map['token_type'])) {
            $model->tokenType = $map['token_type'];
        }
        if (isset($map['expiresln'])) {
            $model->expiresln = $map['expiresln'];
        }
        if (isset($map['refresh_token'])) {
            $model->refreshToken = $map['refresh_token'];
        }
        if (isset($map['session_id'])) {
            $model->sessionId = $map['session_id'];
        }

        return $model;
    }
}
