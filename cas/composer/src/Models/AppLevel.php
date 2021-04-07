<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AppLevel extends Model
{
    // ID
    /**
     * @example 1234
     *
     * @var string
     */
    public $id;

    // 应用等级名称
    /**
     * @example test
     *
     * @var string
     */
    public $name;

    // 创建者
    /**
     * @example tester
     *
     * @var string
     */
    public $creatorId;

    // 租户ID
    /**
     * @example 123
     *
     * @var string
     */
    public $tenantId;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcCreate;

    // 最近修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcModified;
    protected $_name = [
        'id'          => 'id',
        'name'        => 'name',
        'creatorId'   => 'creator_id',
        'tenantId'    => 'tenant_id',
        'utcCreate'   => 'utc_create',
        'utcModified' => 'utc_modified',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->creatorId) {
            $res['creator_id'] = $this->creatorId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
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
     * @return AppLevel
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
        if (isset($map['creator_id'])) {
            $model->creatorId = $map['creator_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
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
