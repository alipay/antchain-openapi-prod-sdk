<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYTC\Models;

use AlibabaCloud\Tea\Model;

class QueryCodeStatResponse extends Model
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

    // 上链交易量
    /**
     * @var int
     */
    public $transactionSize;

    // 上链总数据存储容量占用
    /**
     * @var int
     */
    public $chainCapacity;

    // 记录条数，包括上链和未上链的总数据条数
    /**
     * @var int
     */
    public $recordSize;

    // 对重复操作仅做一次记录的数据统计量。eg: 实际溯源码注册量，实际绑定信息的数据量。
    /**
     * @var int
     */
    public $validSize;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'transactionSize' => 'transaction_size',
        'chainCapacity'   => 'chain_capacity',
        'recordSize'      => 'record_size',
        'validSize'       => 'valid_size',
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
        if (null !== $this->transactionSize) {
            $res['transaction_size'] = $this->transactionSize;
        }
        if (null !== $this->chainCapacity) {
            $res['chain_capacity'] = $this->chainCapacity;
        }
        if (null !== $this->recordSize) {
            $res['record_size'] = $this->recordSize;
        }
        if (null !== $this->validSize) {
            $res['valid_size'] = $this->validSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCodeStatResponse
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
        if (isset($map['transaction_size'])) {
            $model->transactionSize = $map['transaction_size'];
        }
        if (isset($map['chain_capacity'])) {
            $model->chainCapacity = $map['chain_capacity'];
        }
        if (isset($map['record_size'])) {
            $model->recordSize = $map['record_size'];
        }
        if (isset($map['valid_size'])) {
            $model->validSize = $map['valid_size'];
        }

        return $model;
    }
}
