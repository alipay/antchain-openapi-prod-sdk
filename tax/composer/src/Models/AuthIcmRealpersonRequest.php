<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class AuthIcmRealpersonRequest extends Model
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

    // 基础授权请求
    /**
     * @var BaseAuthRequest
     */
    public $request;

    // 个人证件号
    /**
     * @var string
     */
    public $identityId;

    // 名字
    /**
     * @var string
     */
    public $identityName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'request'           => 'request',
        'identityId'        => 'identity_id',
        'identityName'      => 'identity_name',
    ];

    public function validate()
    {
        Model::validateRequired('request', $this->request, true);
        Model::validateRequired('identityId', $this->identityId, true);
        Model::validateRequired('identityName', $this->identityName, true);
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
        if (null !== $this->request) {
            $res['request'] = null !== $this->request ? $this->request->toMap() : null;
        }
        if (null !== $this->identityId) {
            $res['identity_id'] = $this->identityId;
        }
        if (null !== $this->identityName) {
            $res['identity_name'] = $this->identityName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthIcmRealpersonRequest
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
        if (isset($map['request'])) {
            $model->request = BaseAuthRequest::fromMap($map['request']);
        }
        if (isset($map['identity_id'])) {
            $model->identityId = $map['identity_id'];
        }
        if (isset($map['identity_name'])) {
            $model->identityName = $map['identity_name'];
        }

        return $model;
    }
}
