<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class TransactionChartInfo extends Model
{
    // a
    /**
     * @example a
     *
     * @var string
     */
    public $bizId;

    // biz_type
    /**
     * @example biz_type
     *
     * @var string
     */
    public $bizType;

    // cost
    /**
     * @example 111
     *
     * @var int
     */
    public $cost;

    // edges
    /**
     * @example edges
     *
     * @var TransactionEdge[]
     */
    public $edges;

    // end_time
    /**
     * @example end_time
     *
     * @var string
     */
    public $endTime;

    // last_handle_time
    /**
     * @example last_handle_time
     *
     * @var string
     */
    public $lastHandleTime;

    // lowerLineCount
    /**
     * @example lowerLineCount
     *
     * @var int
     */
    public $lowerLineCount;

    // nodes
    /**
     * @example nodes
     *
     * @var TransactionNode[]
     */
    public $nodes;

    // participatorNum
    /**
     * @example 1
     *
     * @var int
     */
    public $participatorNum;

    // starter_ip
    /**
     * @example starter_ip
     *
     * @var string
     */
    public $starterIp;

    // starterName
    /**
     * @example app
     *
     * @var string
     */
    public $starterName;

    // start_time
    /**
     * @example start_time
     *
     * @var string
     */
    public $startTime;

    // state
    /**
     * @example EC
     *
     * @var string
     */
    public $state;

    // txid
    /**
     * @example txid
     *
     * @var string
     */
    public $txId;

    // upper_line_count
    /**
     * @example upper_line_count
     *
     * @var int
     */
    public $upperLineCount;

    // action_mode
    /**
     * @example 3
     *
     * @var int
     */
    public $actionMode;
    protected $_name = [
        'bizId'           => 'biz_id',
        'bizType'         => 'biz_type',
        'cost'            => 'cost',
        'edges'           => 'edges',
        'endTime'         => 'end_time',
        'lastHandleTime'  => 'last_handle_time',
        'lowerLineCount'  => 'lower_line_count',
        'nodes'           => 'nodes',
        'participatorNum' => 'participator_num',
        'starterIp'       => 'starter_ip',
        'starterName'     => 'starter_name',
        'startTime'       => 'start_time',
        'state'           => 'state',
        'txId'            => 'tx_id',
        'upperLineCount'  => 'upper_line_count',
        'actionMode'      => 'action_mode',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('cost', $this->cost, true);
        Model::validateRequired('edges', $this->edges, true);
        Model::validateRequired('lowerLineCount', $this->lowerLineCount, true);
        Model::validateRequired('nodes', $this->nodes, true);
        Model::validateRequired('participatorNum', $this->participatorNum, true);
        Model::validateRequired('starterIp', $this->starterIp, true);
        Model::validateRequired('starterName', $this->starterName, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('txId', $this->txId, true);
        Model::validateRequired('upperLineCount', $this->upperLineCount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->cost) {
            $res['cost'] = $this->cost;
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
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->lastHandleTime) {
            $res['last_handle_time'] = $this->lastHandleTime;
        }
        if (null !== $this->lowerLineCount) {
            $res['lower_line_count'] = $this->lowerLineCount;
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
        if (null !== $this->participatorNum) {
            $res['participator_num'] = $this->participatorNum;
        }
        if (null !== $this->starterIp) {
            $res['starter_ip'] = $this->starterIp;
        }
        if (null !== $this->starterName) {
            $res['starter_name'] = $this->starterName;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->txId) {
            $res['tx_id'] = $this->txId;
        }
        if (null !== $this->upperLineCount) {
            $res['upper_line_count'] = $this->upperLineCount;
        }
        if (null !== $this->actionMode) {
            $res['action_mode'] = $this->actionMode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TransactionChartInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['cost'])) {
            $model->cost = $map['cost'];
        }
        if (isset($map['edges'])) {
            if (!empty($map['edges'])) {
                $model->edges = [];
                $n            = 0;
                foreach ($map['edges'] as $item) {
                    $model->edges[$n++] = null !== $item ? TransactionEdge::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['last_handle_time'])) {
            $model->lastHandleTime = $map['last_handle_time'];
        }
        if (isset($map['lower_line_count'])) {
            $model->lowerLineCount = $map['lower_line_count'];
        }
        if (isset($map['nodes'])) {
            if (!empty($map['nodes'])) {
                $model->nodes = [];
                $n            = 0;
                foreach ($map['nodes'] as $item) {
                    $model->nodes[$n++] = null !== $item ? TransactionNode::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['participator_num'])) {
            $model->participatorNum = $map['participator_num'];
        }
        if (isset($map['starter_ip'])) {
            $model->starterIp = $map['starter_ip'];
        }
        if (isset($map['starter_name'])) {
            $model->starterName = $map['starter_name'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['tx_id'])) {
            $model->txId = $map['tx_id'];
        }
        if (isset($map['upper_line_count'])) {
            $model->upperLineCount = $map['upper_line_count'];
        }
        if (isset($map['action_mode'])) {
            $model->actionMode = $map['action_mode'];
        }

        return $model;
    }
}
