<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETING\Models;

use AlibabaCloud\Tea\Model;

class CorporateContacts extends Model
{
    // 职务
    /**
     * @example 总经理
     *
     * @var string
     */
    public $jobTitle;

    // 姓名
    /**
     * @example XXX
     *
     * @var string
     */
    public $realName;

    // 电话
    /**
     * @example 15888888888
     *
     * @var string
     */
    public $mobilePhone;

    // 邮箱
    /**
     * @example XXX@XXX.COM
     *
     * @var string
     */
    public $email;
    protected $_name = [
        'jobTitle'    => 'job_title',
        'realName'    => 'real_name',
        'mobilePhone' => 'mobile_phone',
        'email'       => 'email',
    ];

    public function validate()
    {
        Model::validateRequired('realName', $this->realName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->jobTitle) {
            $res['job_title'] = $this->jobTitle;
        }
        if (null !== $this->realName) {
            $res['real_name'] = $this->realName;
        }
        if (null !== $this->mobilePhone) {
            $res['mobile_phone'] = $this->mobilePhone;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CorporateContacts
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['job_title'])) {
            $model->jobTitle = $map['job_title'];
        }
        if (isset($map['real_name'])) {
            $model->realName = $map['real_name'];
        }
        if (isset($map['mobile_phone'])) {
            $model->mobilePhone = $map['mobile_phone'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }

        return $model;
    }
}
