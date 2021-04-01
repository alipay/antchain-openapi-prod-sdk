<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryTraceabilityTxCheckRequest extends Model
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

    // 接入业务标识，一接入方有条链或者必须区分统计业务类型情况下必填。
    /**
     * @var string
     */
    public $bizType;

    // 溯源信息内容校验码用sha256hex(内容) 计算出其正确性。
    /**
     * @var string
     */
    public $payloadHash;

    // 区块链接入来源
    /**
     * @var string
     */
    public $source;

    // 区块查证信息透传
    /**
     * @var string
     */
    public $subTitle;

    // 透传到查证结果的标题信息
    /**
     * @var string
     */
    public $title;

    // 要查询的区块链交易信息。
    /**
     * @var string
     */
    public $txHash;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizType'           => 'biz_type',
        'payloadHash'       => 'payload_hash',
        'source'            => 'source',
        'subTitle'          => 'sub_title',
        'title'             => 'title',
        'txHash'            => 'tx_hash',
    ];

    public function validate()
    {
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('txHash', $this->txHash, true);
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
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->payloadHash) {
            $res['payload_hash'] = $this->payloadHash;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->subTitle) {
            $res['sub_title'] = $this->subTitle;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTraceabilityTxCheckRequest
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
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['payload_hash'])) {
            $model->payloadHash = $map['payload_hash'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['sub_title'])) {
            $model->subTitle = $map['sub_title'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }

        return $model;
    }
}
