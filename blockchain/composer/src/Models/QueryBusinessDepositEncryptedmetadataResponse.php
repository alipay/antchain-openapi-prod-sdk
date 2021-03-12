<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryBusinessDepositEncryptedmetadataResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 被存证的数据
    /**
     * @var string
     */
    public $depositData;

    // 存证的唯一主键
    /**
     * @var string
     */
    public $depositId;

    // 被存证的主键关联的历史交易
    /**
     * @var string[]
     */
    public $historyTxId;

    // 是否查询成功
    /**
     * @var string
     */
    public $status;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'depositData' => 'deposit_data',
        'depositId'   => 'deposit_id',
        'historyTxId' => 'history_tx_id',
        'status'      => 'status',
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
        if (null !== $this->depositData) {
            $res['deposit_data'] = $this->depositData;
        }
        if (null !== $this->depositId) {
            $res['deposit_id'] = $this->depositId;
        }
        if (null !== $this->historyTxId) {
            $res['history_tx_id'] = $this->historyTxId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBusinessDepositEncryptedmetadataResponse
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
        if (isset($map['deposit_data'])) {
            $model->depositData = $map['deposit_data'];
        }
        if (isset($map['deposit_id'])) {
            $model->depositId = $map['deposit_id'];
        }
        if (isset($map['history_tx_id'])) {
            if (!empty($map['history_tx_id'])) {
                $model->historyTxId = $map['history_tx_id'];
            }
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
