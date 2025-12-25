<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class CarUserInfo extends Model
{
    // 唯一标识用户的id
    /**
     * @example xxxxx
     *
     * @var string
     */
    public $userId;

    // 手机号
    /**
     * @example 138xxxxxxx
     *
     * @var string
     */
    public $phoneNum;

    // 城市编码
    /**
     * @example 110000
     *
     * @var string
     */
    public $cityCode;

    // 姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $userCertName;

    // 证件号码
    /**
     * @example xxxxx
     *
     * @var string
     */
    public $userCertNo;

    // 性别
    /**
     * @example girl
     *
     * @var string
     */
    public $userGender;

    // 昵称
    /**
     * @example xxxxx
     *
     * @var string
     */
    public $nick;
    protected $_name = [
        'userId'       => 'user_id',
        'phoneNum'     => 'phone_num',
        'cityCode'     => 'city_code',
        'userCertName' => 'user_cert_name',
        'userCertNo'   => 'user_cert_no',
        'userGender'   => 'user_gender',
        'nick'         => 'nick',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('phoneNum', $this->phoneNum, true);
        Model::validateRequired('cityCode', $this->cityCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->phoneNum) {
            $res['phone_num'] = $this->phoneNum;
        }
        if (null !== $this->cityCode) {
            $res['city_code'] = $this->cityCode;
        }
        if (null !== $this->userCertName) {
            $res['user_cert_name'] = $this->userCertName;
        }
        if (null !== $this->userCertNo) {
            $res['user_cert_no'] = $this->userCertNo;
        }
        if (null !== $this->userGender) {
            $res['user_gender'] = $this->userGender;
        }
        if (null !== $this->nick) {
            $res['nick'] = $this->nick;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CarUserInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['phone_num'])) {
            $model->phoneNum = $map['phone_num'];
        }
        if (isset($map['city_code'])) {
            $model->cityCode = $map['city_code'];
        }
        if (isset($map['user_cert_name'])) {
            $model->userCertName = $map['user_cert_name'];
        }
        if (isset($map['user_cert_no'])) {
            $model->userCertNo = $map['user_cert_no'];
        }
        if (isset($map['user_gender'])) {
            $model->userGender = $map['user_gender'];
        }
        if (isset($map['nick'])) {
            $model->nick = $map['nick'];
        }

        return $model;
    }
}
