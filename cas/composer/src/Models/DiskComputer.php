<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DiskComputer extends Model
{
    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // iaas id
    /**
     * @example i-aksfu8asufoisf***
     *
     * @var string
     */
    public $iaasId;

    // status
    /**
     * @example STOP
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'name'   => 'name',
        'id'     => 'id',
        'iaasId' => 'iaas_id',
        'status' => 'status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->iaasId) {
            $res['iaas_id'] = $this->iaasId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DiskComputer
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['iaas_id'])) {
            $model->iaasId = $map['iaas_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
