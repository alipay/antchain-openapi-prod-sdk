<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class Owner extends Model
{
    // 应用Owner邮箱，云游资产使用。
    /**
     * @example xizhe@antcloud.com
     *
     * @var string
     */
    public $ownerEmail;

    // 应用Owner登陆名，云游资产使用。
    /**
     * @example xizhe
     *
     * @var string
     */
    public $ownerLoginName;

    // 应用Owner昵称，云游资产使用。
    /**
     * @example xizhe_nick
     *
     * @var string
     */
    public $ownerNickName;

    // 应用Owner真实名称，云游资产使用。
    /**
     * @example xizhe_real
     *
     * @var string
     */
    public $ownerRealName;

    // 应用Owner员工号，云游资产使用。
    /**
     * @example 1234abc
     *
     * @var string
     */
    public $ownerStaffNo;
    protected $_name = [
        'ownerEmail'     => 'owner_email',
        'ownerLoginName' => 'owner_login_name',
        'ownerNickName'  => 'owner_nick_name',
        'ownerRealName'  => 'owner_real_name',
        'ownerStaffNo'   => 'owner_staff_no',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ownerEmail) {
            $res['owner_email'] = $this->ownerEmail;
        }
        if (null !== $this->ownerLoginName) {
            $res['owner_login_name'] = $this->ownerLoginName;
        }
        if (null !== $this->ownerNickName) {
            $res['owner_nick_name'] = $this->ownerNickName;
        }
        if (null !== $this->ownerRealName) {
            $res['owner_real_name'] = $this->ownerRealName;
        }
        if (null !== $this->ownerStaffNo) {
            $res['owner_staff_no'] = $this->ownerStaffNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Owner
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['owner_email'])) {
            $model->ownerEmail = $map['owner_email'];
        }
        if (isset($map['owner_login_name'])) {
            $model->ownerLoginName = $map['owner_login_name'];
        }
        if (isset($map['owner_nick_name'])) {
            $model->ownerNickName = $map['owner_nick_name'];
        }
        if (isset($map['owner_real_name'])) {
            $model->ownerRealName = $map['owner_real_name'];
        }
        if (isset($map['owner_staff_no'])) {
            $model->ownerStaffNo = $map['owner_staff_no'];
        }

        return $model;
    }
}
