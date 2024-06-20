<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAASPLATFORM\Models;

use AlibabaCloud\Tea\Model;

class QueryDepositCertificateResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 业务幂等id
    /**
     * @var string
     */
    public $orderId;

    // 服务实例id
    /**
     * @var string
     */
    public $serviceId;

    // 基础信息json
    /**
     * @var string
     */
    public $baseInfoJson;

    // 额外信息json
    /**
     * @var string
     */
    public $extensionInfoJson;

    // 交易hash
    /**
     * @var string
     */
    public $txHash;

    // 块高
    /**
     * @var int
     */
    public $blockNumber;

    // 交易时间戳
    /**
     * @var int
     */
    public $timestamp;

    // 文件地址
    /**
     * @var string
     */
    public $fileUrl;

    // 文件id
    /**
     * @var string
     */
    public $fileId;

    // 文件哈希
    /**
     * @var string
     */
    public $fileHash;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'orderId'           => 'order_id',
        'serviceId'         => 'service_id',
        'baseInfoJson'      => 'base_info_json',
        'extensionInfoJson' => 'extension_info_json',
        'txHash'            => 'tx_hash',
        'blockNumber'       => 'block_number',
        'timestamp'         => 'timestamp',
        'fileUrl'           => 'file_url',
        'fileId'            => 'file_id',
        'fileHash'          => 'file_hash',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->baseInfoJson) {
            $res['base_info_json'] = $this->baseInfoJson;
        }
        if (null !== $this->extensionInfoJson) {
            $res['extension_info_json'] = $this->extensionInfoJson;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->blockNumber) {
            $res['block_number'] = $this->blockNumber;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->fileHash) {
            $res['file_hash'] = $this->fileHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDepositCertificateResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
        }
        if (isset($map['base_info_json'])) {
            $model->baseInfoJson = $map['base_info_json'];
        }
        if (isset($map['extension_info_json'])) {
            $model->extensionInfoJson = $map['extension_info_json'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['block_number'])) {
            $model->blockNumber = $map['block_number'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['file_hash'])) {
            $model->fileHash = $map['file_hash'];
        }

        return $model;
    }
}
