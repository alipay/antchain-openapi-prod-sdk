<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models;

use AlibabaCloud\Tea\Model;

class ALiYunChainSubnet extends Model
{
    // 子链id
    /**
     * @example S210304150059
     *
     * @var string
     */
    public $antChainId;

    // 子链名称
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // 子链节点数
    /**
     * @example 1
     *
     * @var int
     */
    public $nodeSum;

    // 子链监控状态
    /**
     * @example true, false
     *
     * @var bool
     */
    public $monitor;

    // 子链的块高
    /**
     * @example 100
     *
     * @var string
     */
    public $blockHeight;

    // 子链的业务总数
    /**
     * @example 1000
     *
     * @var int
     */
    public $transactionSum;

    // 子链的创建时间
    /**
     * @example 1000821213123
     *
     * @var int
     */
    public $createTime;

    // 子链的状态
    /**
     * @example STOP/CREATE
     *
     * @var string
     */
    public $status;

    // 子链的权限
    /**
     * @example true, false
     *
     * @var bool
     */
    public $consortiumMember;

    // 主链id
    /**
     * @example 2e7e22c42bb8419bbf99b7f56aa2f17f
     *
     * @var string
     */
    public $mainChainId;

    // rest申请状态
    /**
     * @example OK
     *
     * @var string
     */
    public $rest;

    // 子链序号
    /**
     * @example 0000000000000002000000000000000000000000
     *
     * @var string
     */
    public $groupId;
    protected $_name = [
        'antChainId'       => 'ant_chain_id',
        'name'             => 'name',
        'nodeSum'          => 'node_sum',
        'monitor'          => 'monitor',
        'blockHeight'      => 'block_height',
        'transactionSum'   => 'transaction_sum',
        'createTime'       => 'create_time',
        'status'           => 'status',
        'consortiumMember' => 'consortium_member',
        'mainChainId'      => 'main_chain_id',
        'rest'             => 'rest',
        'groupId'          => 'group_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->antChainId) {
            $res['ant_chain_id'] = $this->antChainId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->nodeSum) {
            $res['node_sum'] = $this->nodeSum;
        }
        if (null !== $this->monitor) {
            $res['monitor'] = $this->monitor;
        }
        if (null !== $this->blockHeight) {
            $res['block_height'] = $this->blockHeight;
        }
        if (null !== $this->transactionSum) {
            $res['transaction_sum'] = $this->transactionSum;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->consortiumMember) {
            $res['consortium_member'] = $this->consortiumMember;
        }
        if (null !== $this->mainChainId) {
            $res['main_chain_id'] = $this->mainChainId;
        }
        if (null !== $this->rest) {
            $res['rest'] = $this->rest;
        }
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunChainSubnet
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ant_chain_id'])) {
            $model->antChainId = $map['ant_chain_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['node_sum'])) {
            $model->nodeSum = $map['node_sum'];
        }
        if (isset($map['monitor'])) {
            $model->monitor = $map['monitor'];
        }
        if (isset($map['block_height'])) {
            $model->blockHeight = $map['block_height'];
        }
        if (isset($map['transaction_sum'])) {
            $model->transactionSum = $map['transaction_sum'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['consortium_member'])) {
            $model->consortiumMember = $map['consortium_member'];
        }
        if (isset($map['main_chain_id'])) {
            $model->mainChainId = $map['main_chain_id'];
        }
        if (isset($map['rest'])) {
            $model->rest = $map['rest'];
        }
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }

        return $model;
    }
}
