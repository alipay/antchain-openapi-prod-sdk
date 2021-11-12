<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class Cloud extends Model
{
    // 云的ID
    /**
     * @example 123456
     *
     * @var string
     */
    public $cloudId;

    // 云的名字
    /**
     * @example 蚂蚁58云
     *
     * @var string
     */
    public $name;
    protected $_name = [
        'cloudId' => 'cloud_id',
        'name'    => 'name',
    ];

    public function validate()
    {
        Model::validateRequired('cloudId', $this->cloudId, true);
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cloudId) {
            $res['cloud_id'] = $this->cloudId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Cloud
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cloud_id'])) {
            $model->cloudId = $map['cloud_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
