<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunOldContractBlockchain extends Model
{
    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // bizid
    /**
     * @example bizid
     *
     * @var string
     */
    public $bizid;

    // chain_type
    /**
     * @example chain_type
     *
     * @var string
     */
    public $chainType;

    // node_num
    /**
     * @example node_num
     *
     * @var int
     */
    public $nodeNum;

    // member_status
    /**
     * @example member_status
     *
     * @var string
     */
    public $memberStatus;

    // block_height
    /**
     * @example block_height
     *
     * @var int
     */
    public $blockHeight;

    // transactions
    /**
     * @example transactions
     *
     * @var int
     */
    public $transactions;

    // network
    /**
     * @example network
     *
     * @var string
     */
    public $network;

    // version
    /**
     * @example version
     *
     * @var string
     */
    public $version;
    protected $_name = [
        'name'         => 'name',
        'bizid'        => 'bizid',
        'chainType'    => 'chain_type',
        'nodeNum'      => 'node_num',
        'memberStatus' => 'member_status',
        'blockHeight'  => 'block_height',
        'transactions' => 'transactions',
        'network'      => 'network',
        'version'      => 'version',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->bizid) {
            $res['bizid'] = $this->bizid;
        }
        if (null !== $this->chainType) {
            $res['chain_type'] = $this->chainType;
        }
        if (null !== $this->nodeNum) {
            $res['node_num'] = $this->nodeNum;
        }
        if (null !== $this->memberStatus) {
            $res['member_status'] = $this->memberStatus;
        }
        if (null !== $this->blockHeight) {
            $res['block_height'] = $this->blockHeight;
        }
        if (null !== $this->transactions) {
            $res['transactions'] = $this->transactions;
        }
        if (null !== $this->network) {
            $res['network'] = $this->network;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunOldContractBlockchain
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['bizid'])) {
            $model->bizid = $map['bizid'];
        }
        if (isset($map['chain_type'])) {
            $model->chainType = $map['chain_type'];
        }
        if (isset($map['node_num'])) {
            $model->nodeNum = $map['node_num'];
        }
        if (isset($map['member_status'])) {
            $model->memberStatus = $map['member_status'];
        }
        if (isset($map['block_height'])) {
            $model->blockHeight = $map['block_height'];
        }
        if (isset($map['transactions'])) {
            $model->transactions = $map['transactions'];
        }
        if (isset($map['network'])) {
            $model->network = $map['network'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }

        return $model;
    }
}
