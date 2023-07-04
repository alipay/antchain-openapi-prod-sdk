<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class VolumeSource extends Model
{
    // 宿主机模式配置
    /**
     * @example
     *
     * @var HostPathVolumeSource
     */
    public $hostPath;

    // 和Host二选一
    /**
     * @example
     *
     * @var PersistentVolumeSource
     */
    public $persistentVolume;
    protected $_name = [
        'hostPath'         => 'host_path',
        'persistentVolume' => 'persistent_volume',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->hostPath) {
            $res['host_path'] = null !== $this->hostPath ? $this->hostPath->toMap() : null;
        }
        if (null !== $this->persistentVolume) {
            $res['persistent_volume'] = null !== $this->persistentVolume ? $this->persistentVolume->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VolumeSource
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['host_path'])) {
            $model->hostPath = HostPathVolumeSource::fromMap($map['host_path']);
        }
        if (isset($map['persistent_volume'])) {
            $model->persistentVolume = PersistentVolumeSource::fromMap($map['persistent_volume']);
        }

        return $model;
    }
}
