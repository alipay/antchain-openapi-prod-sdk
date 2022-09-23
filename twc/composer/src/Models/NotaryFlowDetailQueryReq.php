<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class NotaryFlowDetailQueryReq extends Model
{
    // 全流程存证模板ID
    /**
     * @example someId
     *
     * @var string
     */
    public $templateId;

    // 全流程存证流程id
    /**
     * @example someId
     *
     * @var string
     */
    public $flowId;

    // 链上证据包对应的链上交易Hash
    /**
     * @example 9d5f26c7469ea9699a6e5f03ecfce24d
     *
     * @var string
     */
    public $chainPackTxHash;

    // 链上证据包授权码
    /**
     * @example someId
     *
     * @var string
     */
    public $authcode;
    protected $_name = [
        'templateId'      => 'template_id',
        'flowId'          => 'flow_id',
        'chainPackTxHash' => 'chain_pack_tx_hash',
        'authcode'        => 'authcode',
    ];

    public function validate()
    {
        Model::validateRequired('templateId', $this->templateId, true);
        Model::validateRequired('flowId', $this->flowId, true);
        Model::validateRequired('chainPackTxHash', $this->chainPackTxHash, true);
        Model::validateRequired('authcode', $this->authcode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->chainPackTxHash) {
            $res['chain_pack_tx_hash'] = $this->chainPackTxHash;
        }
        if (null !== $this->authcode) {
            $res['authcode'] = $this->authcode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotaryFlowDetailQueryReq
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['chain_pack_tx_hash'])) {
            $model->chainPackTxHash = $map['chain_pack_tx_hash'];
        }
        if (isset($map['authcode'])) {
            $model->authcode = $map['authcode'];
        }

        return $model;
    }
}
