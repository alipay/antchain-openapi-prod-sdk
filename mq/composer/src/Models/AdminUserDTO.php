<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class AdminUserDTO extends Model
{
    // 创建时间
    /**
     * @example
     *
     * @var int
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example
     *
     * @var int
     */
    public $gmtModified;

    // 数据库id
    /**
     * @example
     *
     * @var int
     */
    public $id;

    // 登录名
    /**
     * @example login_name
     *
     * @var string
     */
    public $loginName;

    // 昵称
    /**
     * @example nick_name
     *
     * @var string
     */
    public $nickName;

    // 真实姓名
    /**
     * @example real_name
     *
     * @var string
     */
    public $realName;

    // 用户类型
    /**
     * @example
     *
     * @var int
     */
    public $userType;

    // 操作人
    /**
     * @example alipay
     *
     * @var string
     */
    public $operator;
    protected $_name = [
        'gmtCreate'   => 'gmt_create',
        'gmtModified' => 'gmt_modified',
        'id'          => 'id',
        'loginName'   => 'login_name',
        'nickName'    => 'nick_name',
        'realName'    => 'real_name',
        'userType'    => 'user_type',
        'operator'    => 'operator',
    ];

    public function validate()
    {
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('loginName', $this->loginName, true);
        Model::validateRequired('nickName', $this->nickName, true);
        Model::validateRequired('realName', $this->realName, true);
        Model::validateRequired('userType', $this->userType, true);
        Model::validateRequired('operator', $this->operator, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        if (null !== $this->nickName) {
            $res['nick_name'] = $this->nickName;
        }
        if (null !== $this->realName) {
            $res['real_name'] = $this->realName;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AdminUserDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['login_name'])) {
            $model->loginName = $map['login_name'];
        }
        if (isset($map['nick_name'])) {
            $model->nickName = $map['nick_name'];
        }
        if (isset($map['real_name'])) {
            $model->realName = $map['real_name'];
        }
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }

        return $model;
    }
}
