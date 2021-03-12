<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class NodeInfo extends Model
{
    // 链的区块高度
    /**
     * @example 10000
     *
     * @var int
     */
    public $blockheight;

    // 节点名称
    /**
     * @example 名字
     *
     * @var string
     */
    public $nodename;

    // 节点健康状况
    /**
     * @example true
     *
     * @var bool
     */
    public $status;

    // 节点版本
    /**
     * @example 0.10
     *
     * @var string
     */
    public $version;
    protected $_name = [
        'blockheight' => 'blockheight',
        'nodename'    => 'nodename',
        'status'      => 'status',
        'version'     => 'version',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->blockheight) {
            $res['blockheight'] = $this->blockheight;
        }
        if (null !== $this->nodename) {
            $res['nodename'] = $this->nodename;
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
     * @return NodeInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['blockheight'])) {
            $model->blockheight = $map['blockheight'];
        }
        if (isset($map['nodename'])) {
            $model->nodename = $map['nodename'];
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
