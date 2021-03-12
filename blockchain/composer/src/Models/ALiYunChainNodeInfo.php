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
    protected $_name = [
        'blockHeight' => 'block_height',
        'nodeName'    => 'node_name',
        'status'      => 'status',
        'version'     => 'version',
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

        return $model;
    }
}
