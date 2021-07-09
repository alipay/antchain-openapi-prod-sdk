<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class UpdateContractPersonRequest extends Model
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

    // 邮箱地址，默认不变
    /**
     * @var string
     */
    public $email;

    // 证件号，该字段只有为空才允许修改
    /**
     * @var string
     */
    public $idNumber;

    // 证件类型，默认为身份证
    /**
     * @var string
     */
    public $idType;

    // 手机号码，默认不变
    /**
     * @var string
     */
    public $mobile;

    // 姓名，默认不变
    /**
     * @var string
     */
    public $name;

    // 用户账号id，注册用户返回的个人账号id
    /**
     * @var string
     */
    public $userId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'email'             => 'email',
        'idNumber'          => 'id_number',
        'idType'            => 'id_type',
        'mobile'            => 'mobile',
        'name'              => 'name',
        'userId'            => 'user_id',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
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
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->idNumber) {
            $res['id_number'] = $this->idNumber;
        }
        if (null !== $this->idType) {
            $res['id_type'] = $this->idType;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateContractPersonRequest
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
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['id_number'])) {
            $model->idNumber = $map['id_number'];
        }
        if (isset($map['id_type'])) {
            $model->idType = $map['id_type'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }

        return $model;
    }
}
