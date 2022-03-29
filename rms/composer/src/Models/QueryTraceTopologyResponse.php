<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryTraceTopologyResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 拓扑节点
    /**
     * @var TopologyNode[]
     */
    public $nodes;

    // 拓扑边
    /**
     * @var TopologyEdge[]
     */
    public $edges;

    // 节点性能指标
    /**
     * @var TimeSeriesMetrics[]
     */
    public $nodeMetrics;

    // 边性能指标
    /**
     * @var TimeSeriesMetrics[]
     */
    public $edgeMetrics;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'nodes'       => 'nodes',
        'edges'       => 'edges',
        'nodeMetrics' => 'node_metrics',
        'edgeMetrics' => 'edge_metrics',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
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
        if (null !== $this->edges) {
            $res['edges'] = [];
            if (null !== $this->edges && \is_array($this->edges)) {
                $n = 0;
                foreach ($this->edges as $item) {
                    $res['edges'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->nodeMetrics) {
            $res['node_metrics'] = [];
            if (null !== $this->nodeMetrics && \is_array($this->nodeMetrics)) {
                $n = 0;
                foreach ($this->nodeMetrics as $item) {
                    $res['node_metrics'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->edgeMetrics) {
            $res['edge_metrics'] = [];
            if (null !== $this->edgeMetrics && \is_array($this->edgeMetrics)) {
                $n = 0;
                foreach ($this->edgeMetrics as $item) {
                    $res['edge_metrics'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTraceTopologyResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['nodes'])) {
            if (!empty($map['nodes'])) {
                $model->nodes = [];
                $n            = 0;
                foreach ($map['nodes'] as $item) {
                    $model->nodes[$n++] = null !== $item ? TopologyNode::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['edges'])) {
            if (!empty($map['edges'])) {
                $model->edges = [];
                $n            = 0;
                foreach ($map['edges'] as $item) {
                    $model->edges[$n++] = null !== $item ? TopologyEdge::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['node_metrics'])) {
            if (!empty($map['node_metrics'])) {
                $model->nodeMetrics = [];
                $n                  = 0;
                foreach ($map['node_metrics'] as $item) {
                    $model->nodeMetrics[$n++] = null !== $item ? TimeSeriesMetrics::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['edge_metrics'])) {
            if (!empty($map['edge_metrics'])) {
                $model->edgeMetrics = [];
                $n                  = 0;
                foreach ($map['edge_metrics'] as $item) {
                    $model->edgeMetrics[$n++] = null !== $item ? TimeSeriesMetrics::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
