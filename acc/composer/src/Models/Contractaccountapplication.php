<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class Contractaccountapplication extends Model
{
    // 邮箱
    /**
     * @example xx@alipay.com
     *
     * @var string
     */
    public $email;

    // 身份证号码
    /**
     * @example 311111111111111111
     *
     * @var string
     */
    public $idNumber;

    // 身份证类型
    /**
     * @example CRED_PSN_CH_IDCARD
     *
     * @var string
     */
    public $idType;

    // 电话号
    /**
     * @example 15811111111
     *
     * @var string
     */
    public $mobile;

    // 姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $name;

    // 用户id
    /**
     * @example A001
     *
     * @var string
     */
    public $userId;
    protected $_name = [
        'email'    => 'email',
        'idNumber' => 'id_number',
        'idType'   => 'id_type',
        'mobile'   => 'mobile',
        'name'     => 'name',
        'userId'   => 'user_id',
    ];

    public function validate()
    {
        Model::validateRequired('email', $this->email, true);
        Model::validateRequired('idNumber', $this->idNumber, true);
        Model::validateRequired('idType', $this->idType, true);
        Model::validateRequired('mobile', $this->mobile, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('userId', $this->userId, true);
    }

    public function toMap()
    {
        $res = [];
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
     * @return Contractaccountapplication
     */
    public static function fromMap($map = [])
    {
        $model = new self();
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
