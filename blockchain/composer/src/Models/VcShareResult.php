<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class VcShareResult extends Model
{
    // 目标分享的VC的id
    /**
     * @example vc:mychain:dec9725c55bc7ad28b97340230f211b2ad96a35f5131ce9f77c1bd7b67f919451572244785477124
     *
     * @var string
     */
    public $vcId;

    // 分享给目标接受者的did
    /**
     * @example did:mychain:6d8f3ff4af91532eaa7fc477be6b68dea14ed3bcfd5755ccedced43f6c248214
     *
     * @var string
     */
    public $targetDid;

    // 分享链上VC数据的交易hash，可用于直连区块链查询交易内容时使用。
    /**
     * @example 388d0822df016aa66c954344e22c36ec89e4a4573ef0491220bd80c1fe3469cb
     *
     * @var string
     */
    public $txHash;

    // 分享是否成功，true：成功，false：失败
    /**
     * @example true，false
     *
     * @var bool
     */
    public $status;

    // 失败的对应原因信息
    /**
     * @example “失败原因”
     *
     * @var string
     */
    public $msg;
    protected $_name = [
        'vcId'      => 'vc_id',
        'targetDid' => 'target_did',
        'txHash'    => 'tx_hash',
        'status'    => 'status',
        'msg'       => 'msg',
    ];

    public function validate()
    {
        Model::validateRequired('vcId', $this->vcId, true);
        Model::validateRequired('targetDid', $this->targetDid, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->vcId) {
            $res['vc_id'] = $this->vcId;
        }
        if (null !== $this->targetDid) {
            $res['target_did'] = $this->targetDid;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->msg) {
            $res['msg'] = $this->msg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VcShareResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['vc_id'])) {
            $model->vcId = $map['vc_id'];
        }
        if (isset($map['target_did'])) {
            $model->targetDid = $map['target_did'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['msg'])) {
            $model->msg = $map['msg'];
        }

        return $model;
    }
}
