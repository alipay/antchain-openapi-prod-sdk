<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class PersistentVolumeConfig extends Model
{
    // 挂载名称
    /**
     * @example logs
     *
     * @var string
     */
    public $volumeName;

    // 挂载的获取名称，默认：ReadWriteOnce。READWRITEONCE("ReadWriteOnce"),
    // READONLYMANY("ReadOnlyMany"),
    // READWRITEMANY("ReadWriteMany");
    /**
     * @example
     *
     * @var string[]
     */
    public $accessModes;

    // 存储类
    /**
     * @example yoda
     *
     * @var string
     */
    public $storageClass;

    // 是否使用匿名卷，，默认false
    /**
     * @example false
     *
     * @var bool
     */
    public $useEmptyDir;
    protected $_name = [
        'volumeName'   => 'volume_name',
        'accessModes'  => 'access_modes',
        'storageClass' => 'storage_class',
        'useEmptyDir'  => 'use_empty_dir',
    ];

    public function validate()
    {
        Model::validateRequired('volumeName', $this->volumeName, true);
        Model::validateRequired('useEmptyDir', $this->useEmptyDir, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->volumeName) {
            $res['volume_name'] = $this->volumeName;
        }
        if (null !== $this->accessModes) {
            $res['access_modes'] = $this->accessModes;
        }
        if (null !== $this->storageClass) {
            $res['storage_class'] = $this->storageClass;
        }
        if (null !== $this->useEmptyDir) {
            $res['use_empty_dir'] = $this->useEmptyDir;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PersistentVolumeConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['volume_name'])) {
            $model->volumeName = $map['volume_name'];
        }
        if (isset($map['access_modes'])) {
            if (!empty($map['access_modes'])) {
                $model->accessModes = $map['access_modes'];
            }
        }
        if (isset($map['storage_class'])) {
            $model->storageClass = $map['storage_class'];
        }
        if (isset($map['use_empty_dir'])) {
            $model->useEmptyDir = $map['use_empty_dir'];
        }

        return $model;
    }
}
