<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class DidEvent extends Model
{
    // 事件对应的合约方法
    /**
     * @example add
     *
     * @var string
     */
    public $action;

    // 对应did
    /**
     * @example did:mychain:XXXX
     *
     * @var string
     */
    public $did;

    // did对应doc
    /**
     * @example {}
     *
     * @var string
     */
    public $didDoc;

    // 本次事件的触发者
    /**
     * @example XXXXXXXXX
     *
     * @var string
     */
    public $from;

    // 6500
    /**
     * @example 事件在区块的高度
     *
     * @var int
     */
    public $height;

    // 交易hash
    /**
     * @example xxxxxx
     *
     * @var string
     */
    public $txHash;

    // 交易在区块中的index
    /**
     * @example 1
     *
     * @var int
     */
    public $txIndex;
    protected $_name = [
        'action'  => 'action',
        'did'     => 'did',
        'didDoc'  => 'did_doc',
        'from'    => 'from',
        'height'  => 'height',
        'txHash'  => 'tx_hash',
        'txIndex' => 'tx_index',
    ];

    public function validate()
    {
        Model::validateRequired('action', $this->action, true);
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('didDoc', $this->didDoc, true);
        Model::validateRequired('from', $this->from, true);
        Model::validateRequired('height', $this->height, true);
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('txIndex', $this->txIndex, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->didDoc) {
            $res['did_doc'] = $this->didDoc;
        }
        if (null !== $this->from) {
            $res['from'] = $this->from;
        }
        if (null !== $this->height) {
            $res['height'] = $this->height;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->txIndex) {
            $res['tx_index'] = $this->txIndex;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DidEvent
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['action'])) {
            $model->action = $map['action'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['did_doc'])) {
            $model->didDoc = $map['did_doc'];
        }
        if (isset($map['from'])) {
            $model->from = $map['from'];
        }
        if (isset($map['height'])) {
            $model->height = $map['height'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['tx_index'])) {
            $model->txIndex = $map['tx_index'];
        }

        return $model;
    }
}
