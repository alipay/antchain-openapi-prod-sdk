<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class InstanceInfo extends Model
{
    // 实例id
    /**
     * @example 设备001
     *
     * @var string
     */
    public $instanceId;

    // 实例名称
    /**
     * @example 12313
     *
     * @var string
     */
    public $instanceName;
    protected $_name = [
        'instanceId'   => 'instance_id',
        'instanceName' => 'instance_name',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('instanceName', $this->instanceName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->instanceName) {
            $res['instance_name'] = $this->instanceName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InstanceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['instance_name'])) {
            $model->instanceName = $map['instance_name'];
        }

        return $model;
    }
}
