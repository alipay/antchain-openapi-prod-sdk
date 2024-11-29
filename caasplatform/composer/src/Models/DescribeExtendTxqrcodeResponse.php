<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAASPLATFORM\Models;

use AlibabaCloud\Tea\Model;

class DescribeExtendTxqrcodeResponse extends Model
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

    // Base64编码的二维码 png 图片
    /**
     * @var string
     */
    public $base64QrCodePng;

    // 二维码内容
    /**
     * @var string
     */
    public $qrCodeContent;

    // ac73c8fa158436513e0b398632d9a082e04cee3eac6f9fb50087a46d801bdfd1
    /**
     * @var string
     */
    public $txHash;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'base64QrCodePng' => 'base64_qr_code_png',
        'qrCodeContent'   => 'qr_code_content',
        'txHash'          => 'tx_hash',
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
        if (null !== $this->base64QrCodePng) {
            $res['base64_qr_code_png'] = $this->base64QrCodePng;
        }
        if (null !== $this->qrCodeContent) {
            $res['qr_code_content'] = $this->qrCodeContent;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DescribeExtendTxqrcodeResponse
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
        if (isset($map['base64_qr_code_png'])) {
            $model->base64QrCodePng = $map['base64_qr_code_png'];
        }
        if (isset($map['qr_code_content'])) {
            $model->qrCodeContent = $map['qr_code_content'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }

        return $model;
    }
}
