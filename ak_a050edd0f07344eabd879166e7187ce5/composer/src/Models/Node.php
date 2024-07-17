<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_a050edd0f07344eabd879166e7187ce5\Models;

use AlibabaCloud\Tea\Model;

class Node extends Model
{
    // 节点的id
    /**
     * @example p9endh76
     *
     * @var string
     */
    public $nodeId;

    // 节点名称
    /**
     * @example ss
     *
     * @var string
     */
    public $nodeName;

    // 节点类型
    /**
     * @example START
     *
     * @var string
     */
    public $nodeType;

    // 节点在画布的横向位置
    /**
     * @example
     *
     * @var int
     */
    public $x;

    // 节点在画布的纵向位置
    /**
     * @example
     *
     * @var int
     */
    public $y;

    // 节点配置信息
    /**
     * @example
     *
     * @var NodeInfo
     */
    public $nodeInfo;

    // 交互节点的首问播报
    /**
     * @example
     *
     * @var Output
     */
    public $nodeOutputs;

    // 交互节点的新的首问播报
    /**
     * @example
     *
     * @var Output[]
     */
    public $firstOutputs;

    // 视频首句播报配置
    /**
     * @example
     *
     * @var Output
     */
    public $nodeVideoOutput;

    // 视频结束配置
    /**
     * @example
     *
     * @var OutputGroup
     */
    public $endVideoOutput;
    protected $_name = [
        'nodeId'          => 'node_id',
        'nodeName'        => 'node_name',
        'nodeType'        => 'node_type',
        'x'               => 'x',
        'y'               => 'y',
        'nodeInfo'        => 'node_info',
        'nodeOutputs'     => 'node_outputs',
        'firstOutputs'    => 'first_outputs',
        'nodeVideoOutput' => 'node_video_output',
        'endVideoOutput'  => 'end_video_output',
    ];

    public function validate()
    {
        Model::validateRequired('nodeId', $this->nodeId, true);
        Model::validateRequired('nodeName', $this->nodeName, true);
        Model::validateRequired('nodeType', $this->nodeType, true);
        Model::validateRequired('x', $this->x, true);
        Model::validateRequired('y', $this->y, true);
        Model::validateRequired('nodeInfo', $this->nodeInfo, true);
        Model::validateRequired('nodeOutputs', $this->nodeOutputs, true);
        Model::validateRequired('firstOutputs', $this->firstOutputs, true);
        Model::validateRequired('nodeVideoOutput', $this->nodeVideoOutput, true);
        Model::validateRequired('endVideoOutput', $this->endVideoOutput, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->nodeId) {
            $res['node_id'] = $this->nodeId;
        }
        if (null !== $this->nodeName) {
            $res['node_name'] = $this->nodeName;
        }
        if (null !== $this->nodeType) {
            $res['node_type'] = $this->nodeType;
        }
        if (null !== $this->x) {
            $res['x'] = $this->x;
        }
        if (null !== $this->y) {
            $res['y'] = $this->y;
        }
        if (null !== $this->nodeInfo) {
            $res['node_info'] = null !== $this->nodeInfo ? $this->nodeInfo->toMap() : null;
        }
        if (null !== $this->nodeOutputs) {
            $res['node_outputs'] = null !== $this->nodeOutputs ? $this->nodeOutputs->toMap() : null;
        }
        if (null !== $this->firstOutputs) {
            $res['first_outputs'] = [];
            if (null !== $this->firstOutputs && \is_array($this->firstOutputs)) {
                $n = 0;
                foreach ($this->firstOutputs as $item) {
                    $res['first_outputs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->nodeVideoOutput) {
            $res['node_video_output'] = null !== $this->nodeVideoOutput ? $this->nodeVideoOutput->toMap() : null;
        }
        if (null !== $this->endVideoOutput) {
            $res['end_video_output'] = null !== $this->endVideoOutput ? $this->endVideoOutput->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Node
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['node_id'])) {
            $model->nodeId = $map['node_id'];
        }
        if (isset($map['node_name'])) {
            $model->nodeName = $map['node_name'];
        }
        if (isset($map['node_type'])) {
            $model->nodeType = $map['node_type'];
        }
        if (isset($map['x'])) {
            $model->x = $map['x'];
        }
        if (isset($map['y'])) {
            $model->y = $map['y'];
        }
        if (isset($map['node_info'])) {
            $model->nodeInfo = NodeInfo::fromMap($map['node_info']);
        }
        if (isset($map['node_outputs'])) {
            $model->nodeOutputs = Output::fromMap($map['node_outputs']);
        }
        if (isset($map['first_outputs'])) {
            if (!empty($map['first_outputs'])) {
                $model->firstOutputs = [];
                $n                   = 0;
                foreach ($map['first_outputs'] as $item) {
                    $model->firstOutputs[$n++] = null !== $item ? Output::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['node_video_output'])) {
            $model->nodeVideoOutput = Output::fromMap($map['node_video_output']);
        }
        if (isset($map['end_video_output'])) {
            $model->endVideoOutput = OutputGroup::fromMap($map['end_video_output']);
        }

        return $model;
    }
}
