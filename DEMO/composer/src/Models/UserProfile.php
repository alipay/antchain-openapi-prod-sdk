<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class UserProfile extends Model
{
    // 用户ID
    /**
     * @example 1234567890
     *
     * @var string
     */
    public $userId;

    // 用户身份证号
    /**
     * @example 110101199003072516
     *
     * @var string
     */
    public $idNumber;

    // 手机号
    /**
     * @example 13800138000
     *
     * @var string
     */
    public $mobile;

    // 年龄
    /**
     * @example 32
     *
     * @var int
     */
    public $age;

    // 信用评分
    /**
     * @example 720
     *
     * @var int
     */
    public $creditScore;
    protected $_name = [
        'userId'      => 'user_id',
        'idNumber'    => 'id_number',
        'mobile'      => 'mobile',
        'age'         => 'age',
        'creditScore' => 'credit_score',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->idNumber) {
            $res['id_number'] = $this->idNumber;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->age) {
            $res['age'] = $this->age;
        }
        if (null !== $this->creditScore) {
            $res['credit_score'] = $this->creditScore;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UserProfile
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['id_number'])) {
            $model->idNumber = $map['id_number'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['age'])) {
            $model->age = $map['age'];
        }
        if (isset($map['credit_score'])) {
            $model->creditScore = $map['credit_score'];
        }

        return $model;
    }
}
