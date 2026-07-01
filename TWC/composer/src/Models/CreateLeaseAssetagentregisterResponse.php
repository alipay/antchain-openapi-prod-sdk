<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateLeaseAssetagentregisterResponse extends Model
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

    // 业务层错误码
    /**
     * @var string
     */
    public $bizErrorCode;

    // 错误信息描述
    /**
     * @var string
     */
    public $bizErrorMsg;

    // 代理关系链上存证哈希
    /**
     * @var string
     */
    public $txHash;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'bizErrorCode' => 'biz_error_code',
        'bizErrorMsg'  => 'biz_error_msg',
        'txHash'       => 'tx_hash',
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
        if (null !== $this->bizErrorCode) {
            $res['biz_error_code'] = $this->bizErrorCode;
        }
        if (null !== $this->bizErrorMsg) {
            $res['biz_error_msg'] = $this->bizErrorMsg;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLeaseAssetagentregisterResponse
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
        if (isset($map['biz_error_code'])) {
            $model->bizErrorCode = $map['biz_error_code'];
        }
        if (isset($map['biz_error_msg'])) {
            $model->bizErrorMsg = $map['biz_error_msg'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }

        return $model;
    }
}
