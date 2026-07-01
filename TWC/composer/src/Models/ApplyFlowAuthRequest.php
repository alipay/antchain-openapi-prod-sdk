<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ApplyFlowAuthRequest extends Model
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

    // 授权时间长度，单位为s，默认72小时，即259200s，有效期为接口调用时间开始，接口调用时间+授权时间长度的时间为结束时间，例如当前时间为2022-08-18 00:00:00，授权时间长度为86400s(即一天)，则授权截止时间为2022-08-19 00:00:00
    /**
     * @var int
     */
    public $authTimePeriod;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'flowId'            => 'flow_id',
        'chainPackTxHash'   => 'chain_pack_tx_hash',
        'authTimePeriod'    => 'auth_time_period',
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
        if (null !== $this->authTimePeriod) {
            $res['auth_time_period'] = $this->authTimePeriod;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyFlowAuthRequest
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
        if (isset($map['auth_time_period'])) {
            $model->authTimePeriod = $map['auth_time_period'];
        }

        return $model;
    }
}
