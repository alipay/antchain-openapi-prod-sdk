<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models;

use AlibabaCloud\Tea\Model;

class ALiYunAntChain extends Model
{
    // ant_chain_id
    /**
     * @example ant_chain_id
     *
     * @var string
     */
    public $antChainId;

    // 链名称
    /**
     * @example name
     *
     * @var string
     */
    public $antChainName;

    // 链的类型
    /**
     * @example 链的类型
     *
     * @var string
     */
    public $chainType;

    // cipher_suit
    /**
     * @example cipher_suit
     *
     * @var string
     */
    public $cipherSuit;

    // 创建时间
    /**
     * @example 创建时间
     *
     * @var int
     */
    public $createTime;

    // expire_time
    /**
     * @example 1123123123123
     *
     * @var int
     */
    public $expireTime;

    // instance_id
    /**
     * @example instance_id
     *
     * @var string
     */
    public $instanceId;

    // is_admin
    /**
     * @example true、false
     *
     * @var bool
     */
    public $isAdmin;

    // 成员状态
    /**
     * @example 成员状态
     *
     * @var string
     */
    public $memberStatus;

    // merkle_tree_suit
    /**
     * @example merkle_tree_suit
     *
     * @var string
     */
    public $merkleTreeSuit;

    // Network
    /**
     * @example Network
     *
     * @var string
     */
    public $network;

    // 节点数
    /**
     * @example 节点数
     *
     * @var int
     */
    public $nodeNum;

    // 区域信息
    /**
     * @example 区域信息
     *
     * @var string
     */
    public $regionId;

    // 链的资源大小
    /**
     * @example 链的资源大小
     *
     * @var string
     */
    public $resourceSize;

    // 算法参数
    /**
     * @example 算法参数
     *
     * @var string
     */
    public $tlsAlgo;

    // 版本信息
    /**
     * @example 0.10.2.12.5
     *
     * @var string
     */
    public $version;
    protected $_name = [
        'antChainId'     => 'ant_chain_id',
        'antChainName'   => 'ant_chain_name',
        'chainType'      => 'chain_type',
        'cipherSuit'     => 'cipher_suit',
        'createTime'     => 'create_time',
        'expireTime'     => 'expire_time',
        'instanceId'     => 'instance_id',
        'isAdmin'        => 'is_admin',
        'memberStatus'   => 'member_status',
        'merkleTreeSuit' => 'merkle_tree_suit',
        'network'        => 'network',
        'nodeNum'        => 'node_num',
        'regionId'       => 'region_id',
        'resourceSize'   => 'resource_size',
        'tlsAlgo'        => 'tls_algo',
        'version'        => 'version',
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
        if (null !== $this->antChainName) {
            $res['ant_chain_name'] = $this->antChainName;
        }
        if (null !== $this->chainType) {
            $res['chain_type'] = $this->chainType;
        }
        if (null !== $this->cipherSuit) {
            $res['cipher_suit'] = $this->cipherSuit;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->expireTime) {
            $res['expire_time'] = $this->expireTime;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->isAdmin) {
            $res['is_admin'] = $this->isAdmin;
        }
        if (null !== $this->memberStatus) {
            $res['member_status'] = $this->memberStatus;
        }
        if (null !== $this->merkleTreeSuit) {
            $res['merkle_tree_suit'] = $this->merkleTreeSuit;
        }
        if (null !== $this->network) {
            $res['network'] = $this->network;
        }
        if (null !== $this->nodeNum) {
            $res['node_num'] = $this->nodeNum;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->resourceSize) {
            $res['resource_size'] = $this->resourceSize;
        }
        if (null !== $this->tlsAlgo) {
            $res['tls_algo'] = $this->tlsAlgo;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunAntChain
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ant_chain_id'])) {
            $model->antChainId = $map['ant_chain_id'];
        }
        if (isset($map['ant_chain_name'])) {
            $model->antChainName = $map['ant_chain_name'];
        }
        if (isset($map['chain_type'])) {
            $model->chainType = $map['chain_type'];
        }
        if (isset($map['cipher_suit'])) {
            $model->cipherSuit = $map['cipher_suit'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['expire_time'])) {
            $model->expireTime = $map['expire_time'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['is_admin'])) {
            $model->isAdmin = $map['is_admin'];
        }
        if (isset($map['member_status'])) {
            $model->memberStatus = $map['member_status'];
        }
        if (isset($map['merkle_tree_suit'])) {
            $model->merkleTreeSuit = $map['merkle_tree_suit'];
        }
        if (isset($map['network'])) {
            $model->network = $map['network'];
        }
        if (isset($map['node_num'])) {
            $model->nodeNum = $map['node_num'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['resource_size'])) {
            $model->resourceSize = $map['resource_size'];
        }
        if (isset($map['tls_algo'])) {
            $model->tlsAlgo = $map['tls_algo'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }

        return $model;
    }
}
