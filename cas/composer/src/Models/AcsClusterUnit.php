<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AcsClusterUnit extends Model
{
    // cluster_id
    /**
     * @example cluster_id
     *
     * @var string
     */
    public $clusterId;

    // address
    /**
     * @example address
     *
     * @var string
     */
    public $address;

    // unit_status
    /**
     * @example 1
     *
     * @var int
     */
    public $unitStatus;

    // create_time
    /**
     * @example create_time
     *
     * @var string
     */
    public $createTime;

    // modify_time
    /**
     * @example modify_time
     *
     * @var string
     */
    public $modifyTime;

    // container_id
    /**
     * @example container_id
     *
     * @var string
     */
    public $containerId;
    protected $_name = [
        'clusterId'   => 'cluster_id',
        'address'     => 'address',
        'unitStatus'  => 'unit_status',
        'createTime'  => 'create_time',
        'modifyTime'  => 'modify_time',
        'containerId' => 'container_id',
    ];

    public function validate()
    {
        Model::validateRequired('clusterId', $this->clusterId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->clusterId) {
            $res['cluster_id'] = $this->clusterId;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->unitStatus) {
            $res['unit_status'] = $this->unitStatus;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->modifyTime) {
            $res['modify_time'] = $this->modifyTime;
        }
        if (null !== $this->containerId) {
            $res['container_id'] = $this->containerId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AcsClusterUnit
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cluster_id'])) {
            $model->clusterId = $map['cluster_id'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['unit_status'])) {
            $model->unitStatus = $map['unit_status'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['modify_time'])) {
            $model->modifyTime = $map['modify_time'];
        }
        if (isset($map['container_id'])) {
            $model->containerId = $map['container_id'];
        }

        return $model;
    }
}
