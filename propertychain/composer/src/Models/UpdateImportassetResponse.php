<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class UpdateImportassetResponse extends Model
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

    // 区块链信息
    /**
     * @var BlockchainInfo
     */
    public $blockchainInfo;

    // 请求时间
    /**
     * @var int
     */
    public $date;

    // 请求标识
    /**
     * @var string
     */
    public $requestId;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'blockchainInfo' => 'blockchain_info',
        'date'           => 'date',
        'requestId'      => 'request_id',
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
        if (null !== $this->blockchainInfo) {
            $res['blockchain_info'] = null !== $this->blockchainInfo ? $this->blockchainInfo->toMap() : null;
        }
        if (null !== $this->date) {
            $res['date'] = $this->date;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateImportassetResponse
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
        if (isset($map['blockchain_info'])) {
            $model->blockchainInfo = BlockchainInfo::fromMap($map['blockchain_info']);
        }
        if (isset($map['date'])) {
            $model->date = $map['date'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }

        return $model;
    }
}
