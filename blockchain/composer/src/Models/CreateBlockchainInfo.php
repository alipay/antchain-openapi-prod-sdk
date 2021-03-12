<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateBlockchainInfo extends Model
{
    // 链id
    /**
     * @example 141a48c42f1e47b085a4502dab442553
     *
     * @var string
     */
    public $bizid;

    // 链的状态
    /**
     * @example NOMAL
     *
     * @var string
     */
    public $blockchainStatus;

    // 链的类型
    /**
     * @example PROD、TEST
     *
     * @var string
     */
    public $blockchainType;

    // 链的名称
    /**
     * @example 区块链
     *
     * @var string
     */
    public $blockchainName;

    // 节点数量
    /**
     * @example 1
     *
     * @var int
     */
    public $blockchanNodeNum;

    // 创建时间
    /**
     * @example 1609731134000
     *
     * @var int
     */
    public $blockchainCreateTime;
    protected $_name = [
        'bizid'                => 'bizid',
        'blockchainStatus'     => 'blockchain_status',
        'blockchainType'       => 'blockchain_type',
        'blockchainName'       => 'blockchain_name',
        'blockchanNodeNum'     => 'blockchan_node_num',
        'blockchainCreateTime' => 'blockchain_create_time',
    ];

    public function validate()
    {
        Model::validateRequired('bizid', $this->bizid, true);
        Model::validateRequired('blockchainStatus', $this->blockchainStatus, true);
        Model::validateRequired('blockchainType', $this->blockchainType, true);
        Model::validateRequired('blockchainName', $this->blockchainName, true);
        Model::validateRequired('blockchanNodeNum', $this->blockchanNodeNum, true);
        Model::validateRequired('blockchainCreateTime', $this->blockchainCreateTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizid) {
            $res['bizid'] = $this->bizid;
        }
        if (null !== $this->blockchainStatus) {
            $res['blockchain_status'] = $this->blockchainStatus;
        }
        if (null !== $this->blockchainType) {
            $res['blockchain_type'] = $this->blockchainType;
        }
        if (null !== $this->blockchainName) {
            $res['blockchain_name'] = $this->blockchainName;
        }
        if (null !== $this->blockchanNodeNum) {
            $res['blockchan_node_num'] = $this->blockchanNodeNum;
        }
        if (null !== $this->blockchainCreateTime) {
            $res['blockchain_create_time'] = $this->blockchainCreateTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateBlockchainInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['bizid'])) {
            $model->bizid = $map['bizid'];
        }
        if (isset($map['blockchain_status'])) {
            $model->blockchainStatus = $map['blockchain_status'];
        }
        if (isset($map['blockchain_type'])) {
            $model->blockchainType = $map['blockchain_type'];
        }
        if (isset($map['blockchain_name'])) {
            $model->blockchainName = $map['blockchain_name'];
        }
        if (isset($map['blockchan_node_num'])) {
            $model->blockchanNodeNum = $map['blockchan_node_num'];
        }
        if (isset($map['blockchain_create_time'])) {
            $model->blockchainCreateTime = $map['blockchain_create_time'];
        }

        return $model;
    }
}
