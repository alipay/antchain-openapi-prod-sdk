<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class InstanceCreateDTO extends Model
{
    // instance id
    /**
     * @example MQ_INST_111111111111_DOxxxxxx
     *
     * @var string
     */
    public $instanceId;

    // 实例类型
    /**
     * @example 1
     *
     * @var int
     */
    public $instanceType;
    protected $_name = [
        'instanceId'   => 'instance_id',
        'instanceType' => 'instance_type',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('instanceType', $this->instanceType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->instanceType) {
            $res['instance_type'] = $this->instanceType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InstanceCreateDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['instance_type'])) {
            $model->instanceType = $map['instance_type'];
        }

        return $model;
    }
}
