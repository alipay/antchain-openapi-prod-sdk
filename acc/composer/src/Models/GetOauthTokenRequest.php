<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class GetOauthTokenRequest extends Model
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

    // 授权类型
    /**
     * @var string
     */
    public $grantType;

    // 授权码
    /**
     * @var string
     */
    public $authCode;

    // client端申请oauth时的口令
    /**
     * @var string
     */
    public $clientToken;

    // 过期时间
    /**
     * @var int
     */
    public $expires;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'grantType'         => 'grant_type',
        'authCode'          => 'auth_code',
        'clientToken'       => 'client_token',
        'expires'           => 'expires',
    ];

    public function validate()
    {
        Model::validateRequired('grantType', $this->grantType, true);
        Model::validateRequired('authCode', $this->authCode, true);
        Model::validateRequired('clientToken', $this->clientToken, true);
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
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }
        if (null !== $this->expires) {
            $res['expires'] = $this->expires;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetOauthTokenRequest
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
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }
        if (isset($map['expires'])) {
            $model->expires = $map['expires'];
        }

        return $model;
    }
}
