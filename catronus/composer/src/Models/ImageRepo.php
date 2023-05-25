<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class ImageRepo extends Model
{
    // repo ID
    /**
     * @example 1000000000001
     *
     * @var string
     */
    public $id;

    // 镜像仓库名称
    /**
     * @example hub
     *
     * @var string
     */
    public $name;

    // 镜像仓库域名
    /**
     * @example hub.jbhb.net
     *
     * @var string
     */
    public $domain;

    // 用户名
    /**
     * @example admin
     *
     * @var string
     */
    public $userName;

    // 密码
    /**
     * @example your_password
     *
     * @var string
     */
    public $password;

    // 状态
    /**
     * @example SUCCESS
     *
     * @var bool
     */
    public $status;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $createTime;

    // 上次连接时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $lastConnectTime;
    protected $_name = [
        'id'              => 'id',
        'name'            => 'name',
        'domain'          => 'domain',
        'userName'        => 'user_name',
        'password'        => 'password',
        'status'          => 'status',
        'createTime'      => 'create_time',
        'lastConnectTime' => 'last_connect_time',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('domain', $this->domain, true);
        Model::validateRequired('userName', $this->userName, true);
        Model::validateRequired('password', $this->password, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('createTime', $this->createTime, true);
        Model::validateRequired('lastConnectTime', $this->lastConnectTime, true);
        Model::validatePattern('createTime', $this->createTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('lastConnectTime', $this->lastConnectTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->domain) {
            $res['domain'] = $this->domain;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->password) {
            $res['password'] = $this->password;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->lastConnectTime) {
            $res['last_connect_time'] = $this->lastConnectTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImageRepo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['domain'])) {
            $model->domain = $map['domain'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['password'])) {
            $model->password = $map['password'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['last_connect_time'])) {
            $model->lastConnectTime = $map['last_connect_time'];
        }

        return $model;
    }
}
