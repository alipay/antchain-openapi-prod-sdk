<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\FAIROPENNET\Models;

use AlibabaCloud\Tea\Model;

class FlowInstanceLocator extends Model
{
    /**
     * @example
     *
     * @var string
     */
    public $networkId;

    /**
     * @example
     *
     * @var string
     */
    public $spaceId;

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
    protected $_name = [
        'networkId'  => 'network_id',
        'spaceId'    => 'space_id',
        'flowId'     => 'flow_id',
        'instanceId' => 'instance_id',
    ];

    public function validate()
    {
        Model::validateRequired('networkId', $this->networkId, true);
        Model::validateRequired('spaceId', $this->spaceId, true);
        Model::validateRequired('flowId', $this->flowId, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->networkId) {
            $res['network_id'] = $this->networkId;
        }
        if (null !== $this->spaceId) {
            $res['space_id'] = $this->spaceId;
        }
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FlowInstanceLocator
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['network_id'])) {
            $model->networkId = $map['network_id'];
        }
        if (isset($map['space_id'])) {
            $model->spaceId = $map['space_id'];
        }
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }

        return $model;
    }
}
