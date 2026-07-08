<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class CheckPdcpDtraceResponse extends Model
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

    // 存证操作内容
    /**
     * @var DataDepositInfo
     */
    public $depositData;

    // 区块链编号
    /**
     * @var int
     */
    public $blockNumber;

    // 数据存证方式
    /**
     * @var string
     */
    public $depositType;

    // 链上数据
    /**
     * @var string
     */
    public $onChainData;

    // 链下数据
    /**
     * @var string
     */
    public $offChainData;

    // 链上-链下数据是否一致
    /**
     * @var bool
     */
    public $consistent;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'depositData'  => 'deposit_data',
        'blockNumber'  => 'block_number',
        'depositType'  => 'deposit_type',
        'onChainData'  => 'on_chain_data',
        'offChainData' => 'off_chain_data',
        'consistent'   => 'consistent',
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
            $res['deposit_data'] = null !== $this->depositData ? $this->depositData->toMap() : null;
        }
        if (null !== $this->blockNumber) {
            $res['block_number'] = $this->blockNumber;
        }
        if (null !== $this->depositType) {
            $res['deposit_type'] = $this->depositType;
        }
        if (null !== $this->onChainData) {
            $res['on_chain_data'] = $this->onChainData;
        }
        if (null !== $this->offChainData) {
            $res['off_chain_data'] = $this->offChainData;
        }
        if (null !== $this->consistent) {
            $res['consistent'] = $this->consistent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckPdcpDtraceResponse
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
            $model->depositData = DataDepositInfo::fromMap($map['deposit_data']);
        }
        if (isset($map['block_number'])) {
            $model->blockNumber = $map['block_number'];
        }
        if (isset($map['deposit_type'])) {
            $model->depositType = $map['deposit_type'];
        }
        if (isset($map['on_chain_data'])) {
            $model->onChainData = $map['on_chain_data'];
        }
        if (isset($map['off_chain_data'])) {
            $model->offChainData = $map['off_chain_data'];
        }
        if (isset($map['consistent'])) {
            $model->consistent = $map['consistent'];
        }

        return $model;
    }
}
