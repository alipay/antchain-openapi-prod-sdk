<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class LocalDiskVolumeSource extends Model
{
    // 主机路径。
    /**
     * @example /tmp
     *
     * @var string
     */
    public $hostDirectoryPath;

    // 是否允许创建。
    /**
     * @example true, false
     *
     * @var bool
     */
    public $createIfNotPresent;
    protected $_name = [
        'hostDirectoryPath'  => 'host_directory_path',
        'createIfNotPresent' => 'create_if_not_present',
    ];

    public function validate()
    {
        Model::validateRequired('hostDirectoryPath', $this->hostDirectoryPath, true);
        Model::validateRequired('createIfNotPresent', $this->createIfNotPresent, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->hostDirectoryPath) {
            $res['host_directory_path'] = $this->hostDirectoryPath;
        }
        if (null !== $this->createIfNotPresent) {
            $res['create_if_not_present'] = $this->createIfNotPresent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LocalDiskVolumeSource
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['host_directory_path'])) {
            $model->hostDirectoryPath = $map['host_directory_path'];
        }
        if (isset($map['create_if_not_present'])) {
            $model->createIfNotPresent = $map['create_if_not_present'];
        }

        return $model;
    }
}
