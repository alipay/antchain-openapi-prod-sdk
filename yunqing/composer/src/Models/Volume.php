<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class Volume extends Model
{
    // 数据卷名称
    /**
     * @example logs
     *
     * @var string
     */
    public $name;

    // 可挂载的配置
    /**
     * @example
     *
     * @var VolumeSource
     */
    public $volumeSource;

    // 数据卷配置
    /**
     * @example
     *
     * @var MountOptions
     */
    public $mountOptions;
    protected $_name = [
        'name'         => 'name',
        'volumeSource' => 'volume_source',
        'mountOptions' => 'mount_options',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('volumeSource', $this->volumeSource, true);
        Model::validateRequired('mountOptions', $this->mountOptions, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->volumeSource) {
            $res['volume_source'] = null !== $this->volumeSource ? $this->volumeSource->toMap() : null;
        }
        if (null !== $this->mountOptions) {
            $res['mount_options'] = null !== $this->mountOptions ? $this->mountOptions->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Volume
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['volume_source'])) {
            $model->volumeSource = VolumeSource::fromMap($map['volume_source']);
        }
        if (isset($map['mount_options'])) {
            $model->mountOptions = MountOptions::fromMap($map['mount_options']);
        }

        return $model;
    }
}
