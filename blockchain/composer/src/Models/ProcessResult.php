<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ProcessResult extends Model
{
    // 申请权限的扩展参数
    /**
     * @example test
     *
     * @var string
     */
    public $extension;

    // 申请权限原因
    /**
     * @example test
     *
     * @var string
     */
    public $message;

    // 下一个处理节点ID
    /**
     * @example did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
     *
     * @var string
     */
    public $next;

    // 流程ID
    /**
     * @example 68f955a58591e80b94e6ed755722abab4d665936a59bbe6482dd0be9aad21d9a
     *
     * @var string
     */
    public $processId;

    // 流程状态
    /**
     * @example processing
     *
     * @var string
     */
    public $status;

    // 数据对象ID
    /**
     * @example did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
     *
     * @var string
     */
    public $dataId;

    // 交易HASH
    /**
     * @example AQEETAAAAEEAAAAETbYFwqfIiyqFWt2Tasr2f4
     *
     * @var string
     */
    public $txHash;

    // 区块高度
    /**
     * @example 1256
     *
     * @var int
     */
    public $blockNumber;

    // 授权凭证
    /**
     * @example JSON格式
     *
     * @var string
     */
    public $authorityCert;
    protected $_name = [
        'extension'     => 'extension',
        'message'       => 'message',
        'next'          => 'next',
        'processId'     => 'process_id',
        'status'        => 'status',
        'dataId'        => 'data_id',
        'txHash'        => 'tx_hash',
        'blockNumber'   => 'block_number',
        'authorityCert' => 'authority_cert',
    ];

    public function validate()
    {
        Model::validateRequired('processId', $this->processId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('dataId', $this->dataId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->extension) {
            $res['extension'] = $this->extension;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->next) {
            $res['next'] = $this->next;
        }
        if (null !== $this->processId) {
            $res['process_id'] = $this->processId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->blockNumber) {
            $res['block_number'] = $this->blockNumber;
        }
        if (null !== $this->authorityCert) {
            $res['authority_cert'] = $this->authorityCert;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProcessResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['extension'])) {
            $model->extension = $map['extension'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['next'])) {
            $model->next = $map['next'];
        }
        if (isset($map['process_id'])) {
            $model->processId = $map['process_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['block_number'])) {
            $model->blockNumber = $map['block_number'];
        }
        if (isset($map['authority_cert'])) {
            $model->authorityCert = $map['authority_cert'];
        }

        return $model;
    }
}
