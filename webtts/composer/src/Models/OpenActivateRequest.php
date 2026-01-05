<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTTS\Models;

use AlibabaCloud\Tea\Model;

class OpenActivateRequest extends Model
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

    // 地址
    /**
     * @var string
     */
    public $address;

    // 外部客户id
    /**
     * @var string
     */
    public $externalCustomerId;

    // 客户性别
    /**
     * @var string
     */
    public $sex;

    // 用户名
    /**
     * @var string
     */
    public $username;

    // 出生日期
    /**
     * @var int
     */
    public $birthDate;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'address'            => 'address',
        'externalCustomerId' => 'external_customer_id',
        'sex'                => 'sex',
        'username'           => 'username',
        'birthDate'          => 'birth_date',
    ];

    public function validate()
    {
        Model::validateRequired('address', $this->address, true);
        Model::validateRequired('externalCustomerId', $this->externalCustomerId, true);
        Model::validateRequired('sex', $this->sex, true);
        Model::validateRequired('username', $this->username, true);
        Model::validateRequired('birthDate', $this->birthDate, true);
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
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->externalCustomerId) {
            $res['external_customer_id'] = $this->externalCustomerId;
        }
        if (null !== $this->sex) {
            $res['sex'] = $this->sex;
        }
        if (null !== $this->username) {
            $res['username'] = $this->username;
        }
        if (null !== $this->birthDate) {
            $res['birth_date'] = $this->birthDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpenActivateRequest
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
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['external_customer_id'])) {
            $model->externalCustomerId = $map['external_customer_id'];
        }
        if (isset($map['sex'])) {
            $model->sex = $map['sex'];
        }
        if (isset($map['username'])) {
            $model->username = $map['username'];
        }
        if (isset($map['birth_date'])) {
            $model->birthDate = $map['birth_date'];
        }

        return $model;
    }
}
