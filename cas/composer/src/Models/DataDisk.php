<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DataDisk extends Model
{
    // 磁盘大小
    /**
     * @example
     *
     * @var int
     */
    public $size;

    // 若使用磁盘创建，需填写此字段
    /**
     * @example 123456
     *
     * @var string
     */
    public $snapshotSequence;

    // 磁盘规格
    /**
     * @example cloud_efficiency
     *
     * @var string
     */
    public $specId;

    // 数据盘设备
    /**
     * @example /dev/xvdb
     *
     * @var string
     */
    public $device;
    protected $_name = [
        'size'             => 'size',
        'snapshotSequence' => 'snapshot_sequence',
        'specId'           => 'spec_id',
        'device'           => 'device',
    ];

    public function validate()
    {
        Model::validateRequired('size', $this->size, true);
        Model::validateRequired('specId', $this->specId, true);
        Model::validateRequired('device', $this->device, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->size) {
            $res['size'] = $this->size;
        }
        if (null !== $this->snapshotSequence) {
            $res['snapshot_sequence'] = $this->snapshotSequence;
        }
        if (null !== $this->specId) {
            $res['spec_id'] = $this->specId;
        }
        if (null !== $this->device) {
            $res['device'] = $this->device;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DataDisk
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['size'])) {
            $model->size = $map['size'];
        }
        if (isset($map['snapshot_sequence'])) {
            $model->snapshotSequence = $map['snapshot_sequence'];
        }
        if (isset($map['spec_id'])) {
            $model->specId = $map['spec_id'];
        }
        if (isset($map['device'])) {
            $model->device = $map['device'];
        }

        return $model;
    }
}
