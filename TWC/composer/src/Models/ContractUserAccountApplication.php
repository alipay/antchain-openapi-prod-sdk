<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractUserAccountApplication extends Model
{
    // 邮箱地址，默认不变
    /**
     * @example xx@alipay.com
     *
     * @var string
     */
    public $email;

    // 证件号，该字段只有为空才允许修改
    /**
     * @example 311111111111111111
     *
     * @var string
     */
    public $idNumber;

    // 证件类型，默认为身份证
    /**
     * @example CRED_PSN_CH_IDCARD
     *
     * @var string
     */
    public $idType;

    // 手机号码，默认不变
    /**
     * @example 15811111111
     *
     * @var string
     */
    public $mobile;

    // 姓名，默认不变
    /**
     * @example 张三
     *
     * @var string
     */
    public $name;

    // 用户/经办人账号id
    /**
     * @example ORGJC1CN1591674666666
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
     * @return ContractUserAccountApplication
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
