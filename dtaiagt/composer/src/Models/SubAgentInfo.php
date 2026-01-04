<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class SubAgentInfo extends Model
{
    // agent主键id
    //
    /**
     * @example
     *
     * @var int
     */
    public $id;

    // agent code
    //
    /**
     * @example agent code
     *
     * @var string
     */
    public $uniqueCode;

    // 场景描述
    //
    /**
     * @example 场景描述
     *
     * @var string
     */
    public $scene;

    // 调用示例 话术
    //
    /**
     * @example
     *
     * @var string[]
     */
    public $scripting;

    // 是否默认展示
    //
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isDefault;

    // 实例id
    //
    /**
     * @example 1
     *
     * @var string
     */
    public $instanceId;

    // edges 信息
    //
    /**
     * @example
     *
     * @var MultiAgentEdge[]
     */
    public $edges;

    // 坐标信息
    //
    /**
     * @example {}
     *
     * @var DraftPosition
     */
    public $position;

    // agent 来源类型
    //
    /**
     * @example "internal"
     *
     * @var string
     */
    public $agentSource;
    protected $_name = [
        'id'          => 'id',
        'uniqueCode'  => 'unique_code',
        'scene'       => 'scene',
        'scripting'   => 'scripting',
        'isDefault'   => 'is_default',
        'instanceId'  => 'instance_id',
        'edges'       => 'edges',
        'position'    => 'position',
        'agentSource' => 'agent_source',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('uniqueCode', $this->uniqueCode, true);
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('scripting', $this->scripting, true);
        Model::validateRequired('isDefault', $this->isDefault, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('edges', $this->edges, true);
        Model::validateRequired('position', $this->position, true);
        Model::validateRequired('agentSource', $this->agentSource, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->uniqueCode) {
            $res['unique_code'] = $this->uniqueCode;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->scripting) {
            $res['scripting'] = $this->scripting;
        }
        if (null !== $this->isDefault) {
            $res['is_default'] = $this->isDefault;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->edges) {
            $res['edges'] = [];
            if (null !== $this->edges && \is_array($this->edges)) {
                $n = 0;
                foreach ($this->edges as $item) {
                    $res['edges'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->position) {
            $res['position'] = null !== $this->position ? $this->position->toMap() : null;
        }
        if (null !== $this->agentSource) {
            $res['agent_source'] = $this->agentSource;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubAgentInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['unique_code'])) {
            $model->uniqueCode = $map['unique_code'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['scripting'])) {
            if (!empty($map['scripting'])) {
                $model->scripting = $map['scripting'];
            }
        }
        if (isset($map['is_default'])) {
            $model->isDefault = $map['is_default'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['edges'])) {
            if (!empty($map['edges'])) {
                $model->edges = [];
                $n            = 0;
                foreach ($map['edges'] as $item) {
                    $model->edges[$n++] = null !== $item ? MultiAgentEdge::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['position'])) {
            $model->position = DraftPosition::fromMap($map['position']);
        }
        if (isset($map['agent_source'])) {
            $model->agentSource = $map['agent_source'];
        }

        return $model;
    }
}
