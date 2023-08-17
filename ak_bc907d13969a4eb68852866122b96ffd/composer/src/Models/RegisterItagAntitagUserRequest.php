<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models;

use AlibabaCloud\Tea\Model;

class RegisterItagAntitagUserRequest extends Model
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

    // 名称
    /**
     * @var string
     */
    public $name;

    // 第三方系统用户账号ID
    /**
     * @var string
     */
    public $accountno;

    // 用户来源
    /**
     * @var string
     */
    public $accountsource;

    // 邮箱
    /**
     * @var string
     */
    public $email;

    // 电话
    /**
     * @var string
     */
    public $phone;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'name'              => 'name',
        'accountno'         => 'accountno',
        'accountsource'     => 'accountsource',
        'email'             => 'email',
        'phone'             => 'phone',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('accountno', $this->accountno, true);
        Model::validateRequired('accountsource', $this->accountsource, true);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->accountno) {
            $res['accountno'] = $this->accountno;
        }
        if (null !== $this->accountsource) {
            $res['accountsource'] = $this->accountsource;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RegisterItagAntitagUserRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['accountno'])) {
            $model->accountno = $map['accountno'];
        }
        if (isset($map['accountsource'])) {
            $model->accountsource = $map['accountsource'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }

        return $model;
    }
}
