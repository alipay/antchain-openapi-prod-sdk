<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunChainInfo extends Model
{
    // abnormal_nodes
    /**
     * @example 4
     *
     * @var int
     */
    public $abnormalNodes;

    // ant_chain_id
    /**
     * @example ant_chain_id
     *
     * @var string
     */
    public $antChainId;

    // block_height
    /**
     * @example 2131
     *
     * @var int
     */
    public $blockHeight;

    // create_time
    /**
     * @example 123131212312
     *
     * @var int
     */
    public $createTime;

    // is_role
    /**
     * @example true
     *
     * @var bool
     */
    public $isRole;

    // node_number
    /**
     * @example 4
     *
     * @var int
     */
    public $nodeNumber;

    // normal
    /**
     * @example true, false
     *
     * @var bool
     */
    public $normal;

    // transaction_sum
    /**
     * @example 312312
     *
     * @var int
     */
    public $transactionSum;

    // Version
    /**
     * @example Version
     *
     * @var string
     */
    public $version;

    // node_infos
    /**
     * @example node_infos
     *
     * @var ALiYunChainNodeInfo[]
     */
    public $nodeInfos;
    protected $_name = [
        'abnormalNodes'  => 'abnormal_nodes',
        'antChainId'     => 'ant_chain_id',
        'blockHeight'    => 'block_height',
        'createTime'     => 'create_time',
        'isRole'         => 'is_role',
        'nodeNumber'     => 'node_number',
        'normal'         => 'normal',
        'transactionSum' => 'transaction_sum',
        'version'        => 'version',
        'nodeInfos'      => 'node_infos',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->abnormalNodes) {
            $res['abnormal_nodes'] = $this->abnormalNodes;
        }
        if (null !== $this->antChainId) {
            $res['ant_chain_id'] = $this->antChainId;
        }
        if (null !== $this->blockHeight) {
            $res['block_height'] = $this->blockHeight;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->isRole) {
            $res['is_role'] = $this->isRole;
        }
        if (null !== $this->nodeNumber) {
            $res['node_number'] = $this->nodeNumber;
        }
        if (null !== $this->normal) {
            $res['normal'] = $this->normal;
        }
        if (null !== $this->transactionSum) {
            $res['transaction_sum'] = $this->transactionSum;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->nodeInfos) {
            $res['node_infos'] = [];
            if (null !== $this->nodeInfos && \is_array($this->nodeInfos)) {
                $n = 0;
                foreach ($this->nodeInfos as $item) {
                    $res['node_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunChainInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['abnormal_nodes'])) {
            $model->abnormalNodes = $map['abnormal_nodes'];
        }
        if (isset($map['ant_chain_id'])) {
            $model->antChainId = $map['ant_chain_id'];
        }
        if (isset($map['block_height'])) {
            $model->blockHeight = $map['block_height'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['is_role'])) {
            $model->isRole = $map['is_role'];
        }
        if (isset($map['node_number'])) {
            $model->nodeNumber = $map['node_number'];
        }
        if (isset($map['normal'])) {
            $model->normal = $map['normal'];
        }
        if (isset($map['transaction_sum'])) {
            $model->transactionSum = $map['transaction_sum'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['node_infos'])) {
            if (!empty($map['node_infos'])) {
                $model->nodeInfos = [];
                $n                = 0;
                foreach ($map['node_infos'] as $item) {
                    $model->nodeInfos[$n++] = null !== $item ? ALiYunChainNodeInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
