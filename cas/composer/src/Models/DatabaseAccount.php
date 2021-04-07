<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DatabaseAccount extends Model
{
    // database
    /**
     * @example
     *
     * @var Database
     */
    public $database;

    // description
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // iaas_type
    /**
     * @example iaas_type
     *
     * @var string
     */
    public $iaasType;

    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // 名称
    /**
     * @example haha
     *
     * @var string
     */
    public $name;

    // 密码
    /**
     * @example xxd@#xd
     *
     * @var string
     */
    public $password;

    // 权限
    /**
     * @example READONLY
     *
     * @var string
     */
    public $privilege;

    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;

    // utc_create
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcCreate;

    // utc_modified
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcModified;
    protected $_name = [
        'database'    => 'database',
        'description' => 'description',
        'iaasType'    => 'iaas_type',
        'id'          => 'id',
        'name'        => 'name',
        'password'    => 'password',
        'privilege'   => 'privilege',
        'status'      => 'status',
        'utcCreate'   => 'utc_create',
        'utcModified' => 'utc_modified',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('password', $this->password, true);
        Model::validateRequired('privilege', $this->privilege, true);
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->database) {
            $res['database'] = null !== $this->database ? $this->database->toMap() : null;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->iaasType) {
            $res['iaas_type'] = $this->iaasType;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->password) {
            $res['password'] = $this->password;
        }
        if (null !== $this->privilege) {
            $res['privilege'] = $this->privilege;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DatabaseAccount
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['database'])) {
            $model->database = Database::fromMap($map['database']);
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['iaas_type'])) {
            $model->iaasType = $map['iaas_type'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['password'])) {
            $model->password = $map['password'];
        }
        if (isset($map['privilege'])) {
            $model->privilege = $map['privilege'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['utc_modified'])) {
            $model->utcModified = $map['utc_modified'];
        }

        return $model;
    }
}
