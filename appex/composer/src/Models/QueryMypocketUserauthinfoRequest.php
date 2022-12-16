<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class QueryMypocketUserauthinfoRequest extends Model
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

    // 用户授权信息
    /**
     * @var Authorization
     */
    public $authorization;

    // 签名字符串
    /**
     * @var string
     */
    public $didSign;

    // 签名的用户did
    /**
     * @var string
     */
    public $did;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'authorization'     => 'authorization',
        'didSign'           => 'did_sign',
        'did'               => 'did',
    ];

    public function validate()
    {
        Model::validateRequired('authorization', $this->authorization, true);
        Model::validateRequired('didSign', $this->didSign, true);
        Model::validateRequired('did', $this->did, true);
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
        if (null !== $this->authorization) {
            $res['authorization'] = null !== $this->authorization ? $this->authorization->toMap() : null;
        }
        if (null !== $this->didSign) {
            $res['did_sign'] = $this->didSign;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMypocketUserauthinfoRequest
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
        if (isset($map['authorization'])) {
            $model->authorization = Authorization::fromMap($map['authorization']);
        }
        if (isset($map['did_sign'])) {
            $model->didSign = $map['did_sign'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }

        return $model;
    }
}
