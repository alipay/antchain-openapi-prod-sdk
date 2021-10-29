<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAAS_MIDWAY\Models;

use AlibabaCloud\Tea\Model;

class CreateTlsRequest extends Model
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

    // 链ID
    /**
     * @var string
     */
    public $bizId;

    // 非对称加密算法
    /**
     * @var string
     */
    public $tlsAlgo;

    // 密码
    /**
     * @var string
     */
    public $password;

    // 封装格式
    /**
     * @var string
     */
    public $keyFormat;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'tlsAlgo'           => 'tls_algo',
        'password'          => 'password',
        'keyFormat'         => 'key_format',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->tlsAlgo) {
            $res['tls_algo'] = $this->tlsAlgo;
        }
        if (null !== $this->password) {
            $res['password'] = $this->password;
        }
        if (null !== $this->keyFormat) {
            $res['key_format'] = $this->keyFormat;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateTlsRequest
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['tls_algo'])) {
            $model->tlsAlgo = $map['tls_algo'];
        }
        if (isset($map['password'])) {
            $model->password = $map['password'];
        }
        if (isset($map['key_format'])) {
            $model->keyFormat = $map['key_format'];
        }

        return $model;
    }
}
