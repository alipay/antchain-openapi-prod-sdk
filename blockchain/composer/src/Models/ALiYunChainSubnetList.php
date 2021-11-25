<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunChainSubnetList extends Model
{
    // ant_chain_id
    /**
     * @example S210304150059
     *
     * @var string
     */
    public $antChainId;

    // 子链名称
    /**
     * @example 子链名称
     *
     * @var string
     */
    public $blockchainName;

    // 联盟管理员
    /**
     * @example true, false
     *
     * @var bool
     */
    public $consortiumAdmin;

    // 子链列表信息
    /**
     * @example
     *
     * @var ALiYunChainSubnet[]
     */
    public $blockchainSubnetList;
    protected $_name = [
        'antChainId'           => 'ant_chain_id',
        'blockchainName'       => 'blockchain_name',
        'consortiumAdmin'      => 'consortium_admin',
        'blockchainSubnetList' => 'blockchain_subnet_list',
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
        if (null !== $this->blockchainName) {
            $res['blockchain_name'] = $this->blockchainName;
        }
        if (null !== $this->consortiumAdmin) {
            $res['consortium_admin'] = $this->consortiumAdmin;
        }
        if (null !== $this->blockchainSubnetList) {
            $res['blockchain_subnet_list'] = [];
            if (null !== $this->blockchainSubnetList && \is_array($this->blockchainSubnetList)) {
                $n = 0;
                foreach ($this->blockchainSubnetList as $item) {
                    $res['blockchain_subnet_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunChainSubnetList
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ant_chain_id'])) {
            $model->antChainId = $map['ant_chain_id'];
        }
        if (isset($map['blockchain_name'])) {
            $model->blockchainName = $map['blockchain_name'];
        }
        if (isset($map['consortium_admin'])) {
            $model->consortiumAdmin = $map['consortium_admin'];
        }
        if (isset($map['blockchain_subnet_list'])) {
            if (!empty($map['blockchain_subnet_list'])) {
                $model->blockchainSubnetList = [];
                $n                           = 0;
                foreach ($map['blockchain_subnet_list'] as $item) {
                    $model->blockchainSubnetList[$n++] = null !== $item ? ALiYunChainSubnet::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
