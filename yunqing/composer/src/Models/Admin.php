<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class Admin extends Model
{
    // 应用SRE邮箱，云游资产使用。
    /**
     * @example yinyu@antcloud.com
     *
     * @var string
     */
    public $adminEmail;

    // 应用SRE登陆名，云游资产使用。
    /**
     * @example yinyu
     *
     * @var string
     */
    public $adminLoginName;

    // 应用SRE昵称，云游资产使用
    /**
     * @example yinyu_nick
     *
     * @var string
     */
    public $adminNickName;

    // 应用SRE真实名称，云游资产使用
    /**
     * @example yinyu_real
     *
     * @var string
     */
    public $adminRealName;

    // 应用SRE员工号，云游资产使用
    /**
     * @example 123abc
     *
     * @var string
     */
    public $adminStaffNo;
    protected $_name = [
        'adminEmail'     => 'admin_email',
        'adminLoginName' => 'admin_login_name',
        'adminNickName'  => 'admin_nick_name',
        'adminRealName'  => 'admin_real_name',
        'adminStaffNo'   => 'admin_staff_no',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->adminEmail) {
            $res['admin_email'] = $this->adminEmail;
        }
        if (null !== $this->adminLoginName) {
            $res['admin_login_name'] = $this->adminLoginName;
        }
        if (null !== $this->adminNickName) {
            $res['admin_nick_name'] = $this->adminNickName;
        }
        if (null !== $this->adminRealName) {
            $res['admin_real_name'] = $this->adminRealName;
        }
        if (null !== $this->adminStaffNo) {
            $res['admin_staff_no'] = $this->adminStaffNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Admin
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['admin_email'])) {
            $model->adminEmail = $map['admin_email'];
        }
        if (isset($map['admin_login_name'])) {
            $model->adminLoginName = $map['admin_login_name'];
        }
        if (isset($map['admin_nick_name'])) {
            $model->adminNickName = $map['admin_nick_name'];
        }
        if (isset($map['admin_real_name'])) {
            $model->adminRealName = $map['admin_real_name'];
        }
        if (isset($map['admin_staff_no'])) {
            $model->adminStaffNo = $map['admin_staff_no'];
        }

        return $model;
    }
}
