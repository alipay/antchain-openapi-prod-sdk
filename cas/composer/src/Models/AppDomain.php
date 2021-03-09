<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AppDomain extends Model
{
    // 创建人id
    /**
     * @example creatorId
     *
     * @var string
     */
    public $creatorId;

    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // 名称
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // parentId
    /**
     * @example parentId
     *
     * @var string
     */
    public $parentId;

    // 租户id
    /**
     * @example tenantId
     *
     * @var string
     */
    public $tenantId;

    // toRootPath
    /**
     * @example toRootPath
     *
     * @var string
     */
    public $toRootPath;

    // utcCreate
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcCreate;

    // utcModified
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcModified;
    protected $_name = [
        'creatorId'   => 'creator_id',
        'id'          => 'id',
        'name'        => 'name',
        'parentId'    => 'parent_id',
        'tenantId'    => 'tenant_id',
        'toRootPath'  => 'to_root_path',
        'utcCreate'   => 'utc_create',
        'utcModified' => 'utc_modified',
    ];

    public function validate()
    {
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->creatorId) {
            $res['creator_id'] = $this->creatorId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->parentId) {
            $res['parent_id'] = $this->parentId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->toRootPath) {
            $res['to_root_path'] = $this->toRootPath;
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
     * @return AppDomain
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['creator_id'])) {
            $model->creatorId = $map['creator_id'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['parent_id'])) {
            $model->parentId = $map['parent_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['to_root_path'])) {
            $model->toRootPath = $map['to_root_path'];
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
