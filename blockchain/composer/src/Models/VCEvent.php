<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class VCEvent extends Model
{
    // 事件对应的合约方法
    /**
     * @example add
     *
     * @var string
     */
    public $action;

    // 本次事件的触发者
    /**
     * @example xxxxx
     *
     * @var string
     */
    public $from;

    // 事件在区块的高度
    /**
     * @example 6300
     *
     * @var int
     */
    public $height;

    // 该VC的颁发者
    /**
     * @example did:mychian:xxxxx
     *
     * @var string
     */
    public $issuer;

    // 有效，或者无效
    /**
     * @example valid
     *
     * @var string
     */
    public $status;

    // 该vc的接受者
    /**
     * @example hash256(did:mychain:xxxxx)
     *
     * @var string
     */
    public $subjec;

    // 交易hash
    //
    /**
     * @example xxxx
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

    // 可验证声明Hash值
    /**
     * @example hash256(可验证声明)
     *
     * @var string
     */
    public $vcHash;

    // vcid
    /**
     * @example vc:mychain:XXXX
     *
     * @var string
     */
    public $vcId;
    protected $_name = [
        'action'  => 'action',
        'from'    => 'from',
        'height'  => 'height',
        'issuer'  => 'issuer',
        'status'  => 'status',
        'subjec'  => 'subjec',
        'txHash'  => 'tx_hash',
        'txIndex' => 'tx_index',
        'vcHash'  => 'vc_hash',
        'vcId'    => 'vc_id',
    ];

    public function validate()
    {
        Model::validateRequired('action', $this->action, true);
        Model::validateRequired('from', $this->from, true);
        Model::validateRequired('height', $this->height, true);
        Model::validateRequired('issuer', $this->issuer, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('subjec', $this->subjec, true);
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('txIndex', $this->txIndex, true);
        Model::validateRequired('vcHash', $this->vcHash, true);
        Model::validateRequired('vcId', $this->vcId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->from) {
            $res['from'] = $this->from;
        }
        if (null !== $this->height) {
            $res['height'] = $this->height;
        }
        if (null !== $this->issuer) {
            $res['issuer'] = $this->issuer;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->subjec) {
            $res['subjec'] = $this->subjec;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->txIndex) {
            $res['tx_index'] = $this->txIndex;
        }
        if (null !== $this->vcHash) {
            $res['vc_hash'] = $this->vcHash;
        }
        if (null !== $this->vcId) {
            $res['vc_id'] = $this->vcId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VCEvent
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['action'])) {
            $model->action = $map['action'];
        }
        if (isset($map['from'])) {
            $model->from = $map['from'];
        }
        if (isset($map['height'])) {
            $model->height = $map['height'];
        }
        if (isset($map['issuer'])) {
            $model->issuer = $map['issuer'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['subjec'])) {
            $model->subjec = $map['subjec'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['tx_index'])) {
            $model->txIndex = $map['tx_index'];
        }
        if (isset($map['vc_hash'])) {
            $model->vcHash = $map['vc_hash'];
        }
        if (isset($map['vc_id'])) {
            $model->vcId = $map['vc_id'];
        }

        return $model;
    }
}
