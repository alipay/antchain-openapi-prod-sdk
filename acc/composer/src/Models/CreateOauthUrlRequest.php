<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class CreateOauthUrlRequest extends Model
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

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 回调地址
    /**
     * @var string
     */
    public $callbackUrl;

    // 登录渠道(web,h5)
    /**
     * @var string
     */
    public $loginChannel;

    // 客户端口令
    /**
     * @var string
     */
    public $clientToken;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'callbackUrl'       => 'callback_url',
        'loginChannel'      => 'login_channel',
        'clientToken'       => 'client_token',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('callbackUrl', $this->callbackUrl, true);
        Model::validateRequired('loginChannel', $this->loginChannel, true);
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->callbackUrl) {
            $res['callback_url'] = $this->callbackUrl;
        }
        if (null !== $this->loginChannel) {
            $res['login_channel'] = $this->loginChannel;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateOauthUrlRequest
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['callback_url'])) {
            $model->callbackUrl = $map['callback_url'];
        }
        if (isset($map['login_channel'])) {
            $model->loginChannel = $map['login_channel'];
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }

        return $model;
    }
}
