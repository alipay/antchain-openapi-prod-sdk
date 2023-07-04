<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class HostPathVolumeSource extends Model
{
    // 宿主机挂载的路径
    /**
     * @example /home/t2/iam/data
     *
     * @var string
     */
    public $path;

    // 挂载的类型：  FILE("File"),
    // DIRECTORY("Directory");
    /**
     * @example Directory
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'path' => 'path',
        'type' => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('path', $this->path, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->path) {
            $res['path'] = $this->path;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HostPathVolumeSource
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['path'])) {
            $model->path = $map['path'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
