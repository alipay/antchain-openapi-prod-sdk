<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\FAIROPENNET\Models;

use AlibabaCloud\Tea\Model;

class DynamicDsl extends Model
{
    /**
     * @example
     *
     * @var string
     */
    public $flowId;

    /**
     * @example
     *
     * @var string
     */
    public $instanceId;

    /**
     * @example true, false
     *
     * @var bool
     */
    public $autoStart;

    /**
     * @example
     *
     * @var string
     */
    public $parameters;
    protected $_name = [
        'flowId'     => 'flow_id',
        'instanceId' => 'instance_id',
        'autoStart'  => 'auto_start',
        'parameters' => 'parameters',
    ];

    public function validate()
    {
        Model::validateRequired('flowId', $this->flowId, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('autoStart', $this->autoStart, true);
        Model::validateRequired('parameters', $this->parameters, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->autoStart) {
            $res['auto_start'] = $this->autoStart;
        }
        if (null !== $this->parameters) {
            $res['parameters'] = $this->parameters;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DynamicDsl
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['auto_start'])) {
            $model->autoStart = $map['auto_start'];
        }
        if (isset($map['parameters'])) {
            $model->parameters = $map['parameters'];
        }

        return $model;
    }
}
