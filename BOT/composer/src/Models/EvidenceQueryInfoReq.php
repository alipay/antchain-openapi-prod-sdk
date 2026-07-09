<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class EvidenceQueryInfoReq extends Model
{
    // 暂时保留
    /**
     * @example null
     *
     * @var string
     */
    public $deviceSignature;

    // 暂时保留
    /**
     * @example null
     *
     * @var string
     */
    public $deviceUid;

    // 不同上链方式
    // "CZ": 普通存证
    // "IOTPAY": 支付存证
    // "RAW": 文本上链
    // "TTTS": 溯源存证
    /**
     * @example "CZ"
     *
     * @var string
     */
    public $queryType;

    // 查询的链上交易txHash
    /**
     * @example "516e981c8b62c6ef08dc99b5f5165ab2a8592b5a116298788f95bbd45d0cc499"
     *
     * @var string
     */
    public $txHash;
    protected $_name = [
        'deviceSignature' => 'device_signature',
        'deviceUid'       => 'device_uid',
        'queryType'       => 'query_type',
        'txHash'          => 'tx_hash',
    ];

    public function validate()
    {
        Model::validateRequired('queryType', $this->queryType, true);
        Model::validateRequired('txHash', $this->txHash, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deviceSignature) {
            $res['device_signature'] = $this->deviceSignature;
        }
        if (null !== $this->deviceUid) {
            $res['device_uid'] = $this->deviceUid;
        }
        if (null !== $this->queryType) {
            $res['query_type'] = $this->queryType;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EvidenceQueryInfoReq
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['device_signature'])) {
            $model->deviceSignature = $map['device_signature'];
        }
        if (isset($map['device_uid'])) {
            $model->deviceUid = $map['device_uid'];
        }
        if (isset($map['query_type'])) {
            $model->queryType = $map['query_type'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }

        return $model;
    }
}
