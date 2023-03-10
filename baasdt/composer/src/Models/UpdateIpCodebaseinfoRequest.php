<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class UpdateIpCodebaseinfoRequest extends Model
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

    // phone_number、user_id 必填一个
    /**
     * @var string
     */
    public $userId;

    // phone_number、user_id 必填一个
    /**
     * @var string
     */
    public $phoneNumber;

    // 用户头像地址，传空则查询shareInfo并更新
    /**
     * @var string
     */
    public $avatar;

    // 用户昵称，传空则查询shareInfo并更新
    /**
     * @var string
     */
    public $nickName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'userId'            => 'user_id',
        'phoneNumber'       => 'phone_number',
        'avatar'            => 'avatar',
        'nickName'          => 'nick_name',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
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
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
        }
        if (null !== $this->avatar) {
            $res['avatar'] = $this->avatar;
        }
        if (null !== $this->nickName) {
            $res['nick_name'] = $this->nickName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateIpCodebaseinfoRequest
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
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['phone_number'])) {
            $model->phoneNumber = $map['phone_number'];
        }
        if (isset($map['avatar'])) {
            $model->avatar = $map['avatar'];
        }
        if (isset($map['nick_name'])) {
            $model->nickName = $map['nick_name'];
        }

        return $model;
    }
}
