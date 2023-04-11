<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\FAIROPENNET\Models;

use AlibabaCloud\Tea\Model;

class CubeNode extends Model
{
    // 无
    /**
     * @example ""
     *
     * @var string
     */
    public $domain;

    /**
     * @example
     *
     * @var NodeEndpoint[]
     */
    public $endpoints;

    /**
     * @example ""
     *
     * @var string
     */
    public $nodeId;

    /**
     * @example ""
     *
     * @var string
     */
    public $nodeIdHash;

    /**
     * @example ""
     *
     * @var string
     */
    public $nodePublicKey;

    /**
     * @example true, false
     *
     * @var bool
     */
    public $isConnected;

    /**
     * @example
     *
     * @var int
     */
    public $type;
    protected $_name = [
        'domain'        => 'domain',
        'endpoints'     => 'endpoints',
        'nodeId'        => 'node_id',
        'nodeIdHash'    => 'node_id_hash',
        'nodePublicKey' => 'node_public_key',
        'isConnected'   => 'is_connected',
        'type'          => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('domain', $this->domain, true);
        Model::validateRequired('endpoints', $this->endpoints, true);
        Model::validateRequired('nodeId', $this->nodeId, true);
        Model::validateRequired('nodeIdHash', $this->nodeIdHash, true);
        Model::validateRequired('nodePublicKey', $this->nodePublicKey, true);
        Model::validateRequired('isConnected', $this->isConnected, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->domain) {
            $res['domain'] = $this->domain;
        }
        if (null !== $this->endpoints) {
            $res['endpoints'] = [];
            if (null !== $this->endpoints && \is_array($this->endpoints)) {
                $n = 0;
                foreach ($this->endpoints as $item) {
                    $res['endpoints'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->nodeId) {
            $res['node_id'] = $this->nodeId;
        }
        if (null !== $this->nodeIdHash) {
            $res['node_id_hash'] = $this->nodeIdHash;
        }
        if (null !== $this->nodePublicKey) {
            $res['node_public_key'] = $this->nodePublicKey;
        }
        if (null !== $this->isConnected) {
            $res['is_connected'] = $this->isConnected;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CubeNode
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['domain'])) {
            $model->domain = $map['domain'];
        }
        if (isset($map['endpoints'])) {
            if (!empty($map['endpoints'])) {
                $model->endpoints = [];
                $n                = 0;
                foreach ($map['endpoints'] as $item) {
                    $model->endpoints[$n++] = null !== $item ? NodeEndpoint::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['node_id'])) {
            $model->nodeId = $map['node_id'];
        }
        if (isset($map['node_id_hash'])) {
            $model->nodeIdHash = $map['node_id_hash'];
        }
        if (isset($map['node_public_key'])) {
            $model->nodePublicKey = $map['node_public_key'];
        }
        if (isset($map['is_connected'])) {
            $model->isConnected = $map['is_connected'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
