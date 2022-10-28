<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CheckIpCodebyphoneRequest extends Model
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

    // 基础参数
    /**
     * @var BaseRequestInfo
     */
    public $baseRequest;

    // 支持数字凭证的加密编码及UNI序列号
    /**
     * @var string
     */
    public $code;

    // 核验用户的手机号
    /**
     * @var string
     */
    public $phoneNumber;

    // 核验用户的名称
    /**
     * @var string
     */
    public $userName;

    // 外部客户自定义客户ID
    /**
     * @var string
     */
    public $externalUserId;

    // 核验用户的位置信息
    /**
     * @var string
     */
    public $gps;

    // 核验用户头像地址
    /**
     * @var string
     */
    public $avatar;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'code'              => 'code',
        'phoneNumber'       => 'phone_number',
        'userName'          => 'user_name',
        'externalUserId'    => 'external_user_id',
        'gps'               => 'gps',
        'avatar'            => 'avatar',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('phoneNumber', $this->phoneNumber, true);
        Model::validateRequired('userName', $this->userName, true);
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
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->externalUserId) {
            $res['external_user_id'] = $this->externalUserId;
        }
        if (null !== $this->gps) {
            $res['gps'] = $this->gps;
        }
        if (null !== $this->avatar) {
            $res['avatar'] = $this->avatar;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckIpCodebyphoneRequest
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
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequestInfo::fromMap($map['base_request']);
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['phone_number'])) {
            $model->phoneNumber = $map['phone_number'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['external_user_id'])) {
            $model->externalUserId = $map['external_user_id'];
        }
        if (isset($map['gps'])) {
            $model->gps = $map['gps'];
        }
        if (isset($map['avatar'])) {
            $model->avatar = $map['avatar'];
        }

        return $model;
    }
}
