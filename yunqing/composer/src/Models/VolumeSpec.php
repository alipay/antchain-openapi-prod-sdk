<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class VolumeSpec extends Model
{
    // 数据卷名称
    /**
     * @example logs
     *
     * @var string
     */
    public $volumeName;

    // 数据卷容量，单位为G
    /**
     * @example 10
     *
     * @var string
     */
    public $capacity;
    protected $_name = [
        'volumeName' => 'volume_name',
        'capacity'   => 'capacity',
    ];

    public function validate()
    {
        Model::validateRequired('volumeName', $this->volumeName, true);
        Model::validateRequired('capacity', $this->capacity, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->volumeName) {
            $res['volume_name'] = $this->volumeName;
        }
        if (null !== $this->capacity) {
            $res['capacity'] = $this->capacity;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VolumeSpec
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['volume_name'])) {
            $model->volumeName = $map['volume_name'];
        }
        if (isset($map['capacity'])) {
            $model->capacity = $map['capacity'];
        }

        return $model;
    }
}
