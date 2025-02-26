<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models;

use AlibabaCloud\Tea\Model;

class GetBlockchainBccrDciPayurlResponse extends Model
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

    // 支付链接
    /**
     * @var string
     */
    public $payUrl;

    // 错误信息
    /**
     * @var string
     */
    public $errorMsg;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'payUrl'     => 'pay_url',
        'errorMsg'   => 'error_msg',
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
        if (null !== $this->payUrl) {
            $res['pay_url'] = $this->payUrl;
        }
        if (null !== $this->errorMsg) {
            $res['error_msg'] = $this->errorMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetBlockchainBccrDciPayurlResponse
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
        if (isset($map['pay_url'])) {
            $model->payUrl = $map['pay_url'];
        }
        if (isset($map['error_msg'])) {
            $model->errorMsg = $map['error_msg'];
        }

        return $model;
    }
}
