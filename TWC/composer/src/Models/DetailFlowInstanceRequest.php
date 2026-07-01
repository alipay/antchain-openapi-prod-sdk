<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class DetailFlowInstanceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 流程id
    /**
     * @var string
     */
    public $flowId;

    // 链上证据包对应的链上交易Hash，通过twc.notary.flow.evidence.query(全流程证据包生成进度查询)获取
    /**
     * @var string
     */
    public $chainPackTxHash;

    // 链上证据包授权码，不传默认按照当前租户校验，填写则按照授权租户检查
    /**
     * @var string
     */
    public $authCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'flowId'            => 'flow_id',
        'chainPackTxHash'   => 'chain_pack_tx_hash',
        'authCode'          => 'auth_code',
    ];

    public function validate()
    {
        Model::validateRequired('flowId', $this->flowId, true);
        Model::validateRequired('chainPackTxHash', $this->chainPackTxHash, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->chainPackTxHash) {
            $res['chain_pack_tx_hash'] = $this->chainPackTxHash;
        }
        if (null !== $this->authCode) {
            $res['auth_code'] = $this->authCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailFlowInstanceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['chain_pack_tx_hash'])) {
            $model->chainPackTxHash = $map['chain_pack_tx_hash'];
        }
        if (isset($map['auth_code'])) {
            $model->authCode = $map['auth_code'];
        }

        return $model;
    }
}
