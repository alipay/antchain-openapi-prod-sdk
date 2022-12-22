<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartAuthDataRequest extends Model
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

    // 调用方生成的请求id，需保证唯一
    /**
     * @var string
     */
    public $authId;

    // 调用方请求的数据类型
    /**
     * @var string
     */
    public $authType;

    // 授权结果通知调用方的方式
    /**
     * @var string
     */
    public $callbackType;

    // 授权结果通知调用方的地址
    /**
     * @var string
     */
    public $callbackUrl;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'authId'            => 'auth_id',
        'authType'          => 'auth_type',
        'callbackType'      => 'callback_type',
        'callbackUrl'       => 'callback_url',
    ];

    public function validate()
    {
        Model::validateRequired('authId', $this->authId, true);
        Model::validateRequired('authType', $this->authType, true);
        Model::validateRequired('callbackType', $this->callbackType, true);
        Model::validateRequired('callbackUrl', $this->callbackUrl, true);
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
        if (null !== $this->authId) {
            $res['auth_id'] = $this->authId;
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->callbackType) {
            $res['callback_type'] = $this->callbackType;
        }
        if (null !== $this->callbackUrl) {
            $res['callback_url'] = $this->callbackUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartAuthDataRequest
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
        if (isset($map['auth_id'])) {
            $model->authId = $map['auth_id'];
        }
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['callback_type'])) {
            $model->callbackType = $map['callback_type'];
        }
        if (isset($map['callback_url'])) {
            $model->callbackUrl = $map['callback_url'];
        }

        return $model;
    }
}
