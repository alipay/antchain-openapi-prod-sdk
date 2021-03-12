<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class BlockchainBrowserNodeOwner extends Model
{
    // node_id
    /**
     * @example node_id
     *
     * @var string
     */
    public $nodeId;

    // node_ip
    /**
     * @example node_ip
     *
     * @var string
     */
    public $nodeIp;

    // node_name
    /**
     * @example node_name
     *
     * @var string
     */
    public $nodeName;

    // node_owner
    /**
     * @example node_owner
     *
     * @var string
     */
    public $nodeOwner;

    // node_port
    /**
     * @example node_port
     *
     * @var string
     */
    public $nodePort;

    // node_source
    /**
     * @example node_source
     *
     * @var string
     */
    public $nodeSource;

    // node_state
    /**
     * @example node_state
     *
     * @var string
     */
    public $nodeState;

    // node_type
    /**
     * @example node_type
     *
     * @var string
     */
    public $nodeType;
    protected $_name = [
        'nodeId'     => 'node_id',
        'nodeIp'     => 'node_ip',
        'nodeName'   => 'node_name',
        'nodeOwner'  => 'node_owner',
        'nodePort'   => 'node_port',
        'nodeSource' => 'node_source',
        'nodeState'  => 'node_state',
        'nodeType'   => 'node_type',
    ];

    public function validate()
    {
        Model::validateRequired('nodeId', $this->nodeId, true);
        Model::validateRequired('nodeIp', $this->nodeIp, true);
        Model::validateRequired('nodeName', $this->nodeName, true);
        Model::validateRequired('nodeOwner', $this->nodeOwner, true);
        Model::validateRequired('nodePort', $this->nodePort, true);
        Model::validateRequired('nodeSource', $this->nodeSource, true);
        Model::validateRequired('nodeState', $this->nodeState, true);
        Model::validateRequired('nodeType', $this->nodeType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->nodeId) {
            $res['node_id'] = $this->nodeId;
        }
        if (null !== $this->nodeIp) {
            $res['node_ip'] = $this->nodeIp;
        }
        if (null !== $this->nodeName) {
            $res['node_name'] = $this->nodeName;
        }
        if (null !== $this->nodeOwner) {
            $res['node_owner'] = $this->nodeOwner;
        }
        if (null !== $this->nodePort) {
            $res['node_port'] = $this->nodePort;
        }
        if (null !== $this->nodeSource) {
            $res['node_source'] = $this->nodeSource;
        }
        if (null !== $this->nodeState) {
            $res['node_state'] = $this->nodeState;
        }
        if (null !== $this->nodeType) {
            $res['node_type'] = $this->nodeType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BlockchainBrowserNodeOwner
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['node_id'])) {
            $model->nodeId = $map['node_id'];
        }
        if (isset($map['node_ip'])) {
            $model->nodeIp = $map['node_ip'];
        }
        if (isset($map['node_name'])) {
            $model->nodeName = $map['node_name'];
        }
        if (isset($map['node_owner'])) {
            $model->nodeOwner = $map['node_owner'];
        }
        if (isset($map['node_port'])) {
            $model->nodePort = $map['node_port'];
        }
        if (isset($map['node_source'])) {
            $model->nodeSource = $map['node_source'];
        }
        if (isset($map['node_state'])) {
            $model->nodeState = $map['node_state'];
        }
        if (isset($map['node_type'])) {
            $model->nodeType = $map['node_type'];
        }

        return $model;
    }
}
