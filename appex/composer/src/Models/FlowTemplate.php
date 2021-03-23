<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class FlowTemplate extends Model
{
    // 业务单据类型
    /**
     * @example
     *
     * @var string
     */
    public $type;

    // 起始状态
    /**
     * @example
     *
     * @var string
     */
    public $fromStatus;

    // 目标状态
    /**
     * @example
     *
     * @var string
     */
    public $toStatus;

    // 是否为状态流起始节点
    /**
     * @example
     *
     * @var bool
     */
    public $startNode;
    protected $_name = [
        'type'       => 'type',
        'fromStatus' => 'from_status',
        'toStatus'   => 'to_status',
        'startNode'  => 'start_node',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('fromStatus', $this->fromStatus, true);
        Model::validateRequired('toStatus', $this->toStatus, true);
        Model::validateRequired('startNode', $this->startNode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->fromStatus) {
            $res['from_status'] = $this->fromStatus;
        }
        if (null !== $this->toStatus) {
            $res['to_status'] = $this->toStatus;
        }
        if (null !== $this->startNode) {
            $res['start_node'] = $this->startNode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FlowTemplate
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['from_status'])) {
            $model->fromStatus = $map['from_status'];
        }
        if (isset($map['to_status'])) {
            $model->toStatus = $map['to_status'];
        }
        if (isset($map['start_node'])) {
            $model->startNode = $map['start_node'];
        }

        return $model;
    }
}
