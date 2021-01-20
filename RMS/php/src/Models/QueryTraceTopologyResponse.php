<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RMS\Models\TopologyNode;
use AntChain\RMS\Models\TopologyEdge;
use AntChain\RMS\Models\TimeSeriesMetrics;

class QueryTraceTopologyResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'nodes' => 'nodes',
        'edges' => 'edges',
        'nodeMetrics' => 'node_metrics',
        'edgeMetrics' => 'edge_metrics',
    ];
    public function validate() {}
    public function toMap() {
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
            $res['nodes'] = null !== $this->nodes ? $this->nodes->toMap() : null;
        }
        if (null !== $this->edges) {
            $res['edges'] = null !== $this->edges ? $this->edges->toMap() : null;
        }
        if (null !== $this->nodeMetrics) {
            $res['node_metrics'] = null !== $this->nodeMetrics ? $this->nodeMetrics->toMap() : null;
        }
        if (null !== $this->edgeMetrics) {
            $res['edge_metrics'] = null !== $this->edgeMetrics ? $this->edgeMetrics->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryTraceTopologyResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['nodes'])){
            $model->nodes = TopologyNode::fromMap($map['nodes']);
        }
        if(isset($map['edges'])){
            $model->edges = TopologyEdge::fromMap($map['edges']);
        }
        if(isset($map['node_metrics'])){
            $model->nodeMetrics = TimeSeriesMetrics::fromMap($map['node_metrics']);
        }
        if(isset($map['edge_metrics'])){
            $model->edgeMetrics = TimeSeriesMetrics::fromMap($map['edge_metrics']);
        }
        return $model;
    }
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 拓扑节点
    /**
     * @var TopologyNode
     */
    public $nodes;

    // 拓扑边
    /**
     * @var TopologyEdge
     */
    public $edges;

    // 节点性能指标
    /**
     * @var TimeSeriesMetrics
     */
    public $nodeMetrics;

    // 边性能指标
    /**
     * @var TimeSeriesMetrics
     */
    public $edgeMetrics;

}
