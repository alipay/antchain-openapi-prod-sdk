<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class TaskCrowdNodeDTO extends Model
{
    // 节点ID
    /**
     * @example c1bff3fe-f1fb-42a2-8fc7-9cbb1a011713
     *
     * @var string
     */
    public $nodeId;

    // 节点类型
    /**
     * @example GROUP、AND
     *
     * @var string
     */
    public $nodeType;

    // 是否排除
    /**
     * @example true, false
     *
     * @var bool
     */
    public $exclude;

    // 节点配置
    /**
     * @example "nodeConfig": { "tagCode": "P0010GC6", "valueList": [ { "selectedValues": [ "18", "30" ], "operator": "BT" } ], "tagType": "BASE" }
     *
     * @var string
     */
    public $nodeConfig;
    protected $_name = [
        'nodeId'     => 'node_id',
        'nodeType'   => 'node_type',
        'exclude'    => 'exclude',
        'nodeConfig' => 'node_config',
    ];

    public function validate()
    {
        Model::validateRequired('nodeId', $this->nodeId, true);
        Model::validateRequired('nodeType', $this->nodeType, true);
        Model::validateRequired('exclude', $this->exclude, true);
        Model::validateRequired('nodeConfig', $this->nodeConfig, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->nodeId) {
            $res['node_id'] = $this->nodeId;
        }
        if (null !== $this->nodeType) {
            $res['node_type'] = $this->nodeType;
        }
        if (null !== $this->exclude) {
            $res['exclude'] = $this->exclude;
        }
        if (null !== $this->nodeConfig) {
            $res['node_config'] = $this->nodeConfig;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TaskCrowdNodeDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['node_id'])) {
            $model->nodeId = $map['node_id'];
        }
        if (isset($map['node_type'])) {
            $model->nodeType = $map['node_type'];
        }
        if (isset($map['exclude'])) {
            $model->exclude = $map['exclude'];
        }
        if (isset($map['node_config'])) {
            $model->nodeConfig = $map['node_config'];
        }

        return $model;
    }
}
