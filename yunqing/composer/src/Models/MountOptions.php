<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class MountOptions extends Model
{
    // 容器内挂载路径
    /**
     * @example /home/admin/logs
     *
     * @var string
     */
    public $mountPath;

    // 是否只读，默认false
    /**
     * @example false
     *
     * @var string
     */
    public $readOnly;

    // 挂载传递策略：    NONE("None"),
    // HOSTTOCONTAINER("HostToContainer"),
    // BIDIRECTIONAL("Bidirectional");
    //
    /**
     * @example None
     *
     * @var string
     */
    public $mountPropagation;
    protected $_name = [
        'mountPath'        => 'mount_path',
        'readOnly'         => 'read_only',
        'mountPropagation' => 'mount_propagation',
    ];

    public function validate()
    {
        Model::validateRequired('mountPath', $this->mountPath, true);
        Model::validateRequired('readOnly', $this->readOnly, true);
        Model::validateRequired('mountPropagation', $this->mountPropagation, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->mountPath) {
            $res['mount_path'] = $this->mountPath;
        }
        if (null !== $this->readOnly) {
            $res['read_only'] = $this->readOnly;
        }
        if (null !== $this->mountPropagation) {
            $res['mount_propagation'] = $this->mountPropagation;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MountOptions
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['mount_path'])) {
            $model->mountPath = $map['mount_path'];
        }
        if (isset($map['read_only'])) {
            $model->readOnly = $map['read_only'];
        }
        if (isset($map['mount_propagation'])) {
            $model->mountPropagation = $map['mount_propagation'];
        }

        return $model;
    }
}
