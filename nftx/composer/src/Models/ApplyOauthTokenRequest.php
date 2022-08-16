<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTX\Models;

use AlibabaCloud\Tea\Model;

class ApplyOauthTokenRequest extends Model
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

    // 1.authorization_code，表示换取使用用户授权码code换取授权令牌access_token。
    // 2.refresh_token，表示使用refresh_token刷新获取新授权令牌。
    // 本期只支持authorization_code
    /**
     * @var string
     */
    public $grantType;

    // 授权码，用户对应用授权后得到。
    // 本参数在 grant_type 为 authorization_code 时必填；为 refresh_token 时不填。
    /**
     * @var string
     */
    public $authCode;

    // 刷新令牌，上次换取访问令牌时得到。本参数在 grant_type 为 authorization_code 时不填；为 refresh_token 时必填
    /**
     * @var string
     */
    public $refreshToken;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'grantType'         => 'grant_type',
        'authCode'          => 'auth_code',
        'refreshToken'      => 'refresh_token',
    ];

    public function validate()
    {
        Model::validateRequired('grantType', $this->grantType, true);
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
        if (null !== $this->grantType) {
            $res['grant_type'] = $this->grantType;
        }
        if (null !== $this->authCode) {
            $res['auth_code'] = $this->authCode;
        }
        if (null !== $this->refreshToken) {
            $res['refresh_token'] = $this->refreshToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyOauthTokenRequest
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
        if (isset($map['grant_type'])) {
            $model->grantType = $map['grant_type'];
        }
        if (isset($map['auth_code'])) {
            $model->authCode = $map['auth_code'];
        }
        if (isset($map['refresh_token'])) {
            $model->refreshToken = $map['refresh_token'];
        }

        return $model;
    }
}
