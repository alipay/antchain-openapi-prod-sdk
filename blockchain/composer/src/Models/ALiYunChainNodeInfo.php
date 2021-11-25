<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunChainNodeInfo extends Model
{
    // block_height
    /**
     * @example 3123123
     *
     * @var int
     */
    public $blockHeight;

    // node_name
    /**
     * @example node_name
     *
     * @var string
     */
    public $nodeName;

    // status
    /**
     * @example true, false
     *
     * @var bool
     */
    public $status;

    // version
    /**
     * @example version
     *
     * @var string
     */
    public $version;

    // 节点id
    /**
     * @example 0x0AC5C397C076E394B3D32C1A9488AAF32BABD410A2FFAF97C87646F5BD04CD42
     *
     * @var string
     */
    public $nodeId;

    // 节点ip
    /**
     * @example 10.1.0.12
     *
     * @var string
     */
    public $nodeIp;

    // 节点的端口
    /**
     * @example 18130
     *
     * @var string
     */
    public $nodePort;

    // 节点类型
    /**
     * @example 共识或非共识
     *
     * @var string
     */
    public $nodeType;

    // 节点状态
    /**
     * @example 正常/异常
     *
     * @var string
     */
    public $nodeState;

    // 节点来源
    /**
     * @example BaaS
     *
     * @var string
     */
    public $nodeSource;

    // 节点存储空间使用量
    /**
     * @example 10
     *
     * @var string
     */
    public $diskUse;

    // 节点存储总空间大小
    /**
     * @example 1024
     *
     * @var string
     */
    public $diskTotal;

    // 节点公钥
    /**
     * @example 121231bcd
     *
     * @var string
     */
    public $publicKey;
    protected $_name = [
        'blockHeight' => 'block_height',
        'nodeName'    => 'node_name',
        'status'      => 'status',
        'version'     => 'version',
        'nodeId'      => 'node_id',
        'nodeIp'      => 'node_ip',
        'nodePort'    => 'node_port',
        'nodeType'    => 'node_type',
        'nodeState'   => 'node_state',
        'nodeSource'  => 'node_source',
        'diskUse'     => 'disk_use',
        'diskTotal'   => 'disk_total',
        'publicKey'   => 'public_key',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->blockHeight) {
            $res['block_height'] = $this->blockHeight;
        }
        if (null !== $this->nodeName) {
            $res['node_name'] = $this->nodeName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->nodeId) {
            $res['node_id'] = $this->nodeId;
        }
        if (null !== $this->nodeIp) {
            $res['node_ip'] = $this->nodeIp;
        }
        if (null !== $this->nodePort) {
            $res['node_port'] = $this->nodePort;
        }
        if (null !== $this->nodeType) {
            $res['node_type'] = $this->nodeType;
        }
        if (null !== $this->nodeState) {
            $res['node_state'] = $this->nodeState;
        }
        if (null !== $this->nodeSource) {
            $res['node_source'] = $this->nodeSource;
        }
        if (null !== $this->diskUse) {
            $res['disk_use'] = $this->diskUse;
        }
        if (null !== $this->diskTotal) {
            $res['disk_total'] = $this->diskTotal;
        }
        if (null !== $this->publicKey) {
            $res['public_key'] = $this->publicKey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunChainNodeInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['block_height'])) {
            $model->blockHeight = $map['block_height'];
        }
        if (isset($map['node_name'])) {
            $model->nodeName = $map['node_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['node_id'])) {
            $model->nodeId = $map['node_id'];
        }
        if (isset($map['node_ip'])) {
            $model->nodeIp = $map['node_ip'];
        }
        if (isset($map['node_port'])) {
            $model->nodePort = $map['node_port'];
        }
        if (isset($map['node_type'])) {
            $model->nodeType = $map['node_type'];
        }
        if (isset($map['node_state'])) {
            $model->nodeState = $map['node_state'];
        }
        if (isset($map['node_source'])) {
            $model->nodeSource = $map['node_source'];
        }
        if (isset($map['disk_use'])) {
            $model->diskUse = $map['disk_use'];
        }
        if (isset($map['disk_total'])) {
            $model->diskTotal = $map['disk_total'];
        }
        if (isset($map['public_key'])) {
            $model->publicKey = $map['public_key'];
        }

        return $model;
    }
}
