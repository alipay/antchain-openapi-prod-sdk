<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ProcessInfo extends Model
{
    // 当前处理节点
    /**
     * @example 1
     *
     * @var int
     */
    public $currentNode;

    // 扩展信息
    /**
     * @example 68f955a58591e80b94e6ed755722abab4d665936a59bbe6482dd0be9aad21d9a
     *
     * @var string
     */
    public $extensionInfo;

    // 节点列表
    /**
     * @example
     *
     * @var NodeDetail[]
     */
    public $nodes;

    // 流程ID
    /**
     * @example 68f955a58591e80b94e6ed755722abab4d665936a59bbe6482dd0be9aad21d9a
     *
     * @var string
     */
    public $processId;

    // 流程状态
    /**
     * @example processing
     *
     * @var string
     */
    public $processStatus;

    // 流程节点总数
    /**
     * @example 1
     *
     * @var int
     */
    public $totalCount;

    // 数据对象ID
    /**
     * @example did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
     *
     * @var string
     */
    public $dataId;
    protected $_name = [
        'currentNode'   => 'current_node',
        'extensionInfo' => 'extension_info',
        'nodes'         => 'nodes',
        'processId'     => 'process_id',
        'processStatus' => 'process_status',
        'totalCount'    => 'total_count',
        'dataId'        => 'data_id',
    ];

    public function validate()
    {
        Model::validateRequired('currentNode', $this->currentNode, true);
        Model::validateRequired('nodes', $this->nodes, true);
        Model::validateRequired('processId', $this->processId, true);
        Model::validateRequired('processStatus', $this->processStatus, true);
        Model::validateRequired('totalCount', $this->totalCount, true);
        Model::validateRequired('dataId', $this->dataId, true);
        Model::validateMinimum('currentNode', $this->currentNode, 0);
        Model::validateMinimum('totalCount', $this->totalCount, 0);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->currentNode) {
            $res['current_node'] = $this->currentNode;
        }
        if (null !== $this->extensionInfo) {
            $res['extension_info'] = $this->extensionInfo;
        }
        if (null !== $this->nodes) {
            $res['nodes'] = [];
            if (null !== $this->nodes && \is_array($this->nodes)) {
                $n = 0;
                foreach ($this->nodes as $item) {
                    $res['nodes'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->processId) {
            $res['process_id'] = $this->processId;
        }
        if (null !== $this->processStatus) {
            $res['process_status'] = $this->processStatus;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProcessInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['current_node'])) {
            $model->currentNode = $map['current_node'];
        }
        if (isset($map['extension_info'])) {
            $model->extensionInfo = $map['extension_info'];
        }
        if (isset($map['nodes'])) {
            if (!empty($map['nodes'])) {
                $model->nodes = [];
                $n            = 0;
                foreach ($map['nodes'] as $item) {
                    $model->nodes[$n++] = null !== $item ? NodeDetail::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['process_id'])) {
            $model->processId = $map['process_id'];
        }
        if (isset($map['process_status'])) {
            $model->processStatus = $map['process_status'];
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }

        return $model;
    }
}
