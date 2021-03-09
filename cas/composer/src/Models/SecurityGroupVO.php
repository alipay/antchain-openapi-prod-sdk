<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class SecurityGroupVO extends Model
{
    // id
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $id;

    // iaasIds
    /**
     * @example
     *
     * @var string[]
     */
    public $iaasIds;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // description
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;

    // type
    /**
     * @example type
     *
     * @var string
     */
    public $type;

    // utcCreate
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcCreate;

    // instanceCount
    /**
     * @example
     *
     * @var int
     */
    public $instanceCount;
    protected $_name = [
        'id'            => 'id',
        'iaasIds'       => 'iaas_ids',
        'name'          => 'name',
        'description'   => 'description',
        'status'        => 'status',
        'type'          => 'type',
        'utcCreate'     => 'utc_create',
        'instanceCount' => 'instance_count',
    ];

    public function validate()
    {
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->iaasIds) {
            $res['iaas_ids'] = $this->iaasIds;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->instanceCount) {
            $res['instance_count'] = $this->instanceCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SecurityGroupVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['iaas_ids'])) {
            if (!empty($map['iaas_ids'])) {
                $model->iaasIds = $map['iaas_ids'];
            }
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['instance_count'])) {
            $model->instanceCount = $map['instance_count'];
        }

        return $model;
    }
}
