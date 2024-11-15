<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class BucUser extends Model
{
    // 工号
    /**
     * @example 387745
     *
     * @var string
     */
    public $empId;

    // 域账号
    /**
     * @example zhangsan.zs
     *
     * @var string
     */
    public $emailPrefix;

    // 花名
    /**
     * @example 张三
     *
     * @var string
     */
    public $nickName;
    protected $_name = [
        'empId'       => 'emp_id',
        'emailPrefix' => 'email_prefix',
        'nickName'    => 'nick_name',
    ];

    public function validate()
    {
        Model::validateRequired('empId', $this->empId, true);
        Model::validateRequired('emailPrefix', $this->emailPrefix, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->empId) {
            $res['emp_id'] = $this->empId;
        }
        if (null !== $this->emailPrefix) {
            $res['email_prefix'] = $this->emailPrefix;
        }
        if (null !== $this->nickName) {
            $res['nick_name'] = $this->nickName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BucUser
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['emp_id'])) {
            $model->empId = $map['emp_id'];
        }
        if (isset($map['email_prefix'])) {
            $model->emailPrefix = $map['email_prefix'];
        }
        if (isset($map['nick_name'])) {
            $model->nickName = $map['nick_name'];
        }

        return $model;
    }
}
