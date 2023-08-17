<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models;

use AlibabaCloud\Tea\Model;

class User extends Model
{
    // 接入标注系统的用户ID
    /**
     * @example jiangwenhua166
     *
     * @var string
     */
    public $accountno;

    // 用户名称
    /**
     * @example 张三
     *
     * @var string
     */
    public $username;

    // 用户来源
    /**
     * @example lingyang
     *
     * @var string
     */
    public $accountsource;

    // UserId
    /**
     * @example 1689153972611817472
     *
     * @var string
     */
    public $userid;
    protected $_name = [
        'accountno'     => 'accountno',
        'username'      => 'username',
        'accountsource' => 'accountsource',
        'userid'        => 'userid',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accountno) {
            $res['accountno'] = $this->accountno;
        }
        if (null !== $this->username) {
            $res['username'] = $this->username;
        }
        if (null !== $this->accountsource) {
            $res['accountsource'] = $this->accountsource;
        }
        if (null !== $this->userid) {
            $res['userid'] = $this->userid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return User
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['accountno'])) {
            $model->accountno = $map['accountno'];
        }
        if (isset($map['username'])) {
            $model->username = $map['username'];
        }
        if (isset($map['accountsource'])) {
            $model->accountsource = $map['accountsource'];
        }
        if (isset($map['userid'])) {
            $model->userid = $map['userid'];
        }

        return $model;
    }
}
