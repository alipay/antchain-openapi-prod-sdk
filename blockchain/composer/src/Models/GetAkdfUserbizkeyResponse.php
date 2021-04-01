<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class GetAkdfUserbizkeyResponse extends Model
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

    // 区块链id
    /**
     * @var string
     */
    public $bizid;

    // 4dY3DnjHPogYcsiVujkdhBRBceY8ZT5cUBP1zRBAZia7WZhJZyHmWbARBAWvy13aB7cNenbBg5D4CnM1gijv5YiSgBgHTC89sag9M7cxxdaRMrvFEA4YpcaunZdd4Q1APBynsDsqmVyzyGnZk5Kez9WBz5PZRyRC3gqCNXhHLLwuJmGCn8aEv3Ar9vsFUQa6qAgNtVVgiDxEYqBNNQc9K51ytdpBX81ph8nzy2ctUvLqi4G7iFU1wVsdd14XS7oz1v54M5Hb2CUTkv7ncXZSnNJYDsGyKAmHiriL2rargNzp6v2nUXhGSrkCVMDCVkZVcpeVFqSxKGatVdkGYUAswt3vtRVCcs
    /**
     * @var string
     */
    public $encryptedPrivateKey;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'bizid'               => 'bizid',
        'encryptedPrivateKey' => 'encrypted_private_key',
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
        if (null !== $this->bizid) {
            $res['bizid'] = $this->bizid;
        }
        if (null !== $this->encryptedPrivateKey) {
            $res['encrypted_private_key'] = $this->encryptedPrivateKey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAkdfUserbizkeyResponse
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
        if (isset($map['bizid'])) {
            $model->bizid = $map['bizid'];
        }
        if (isset($map['encrypted_private_key'])) {
            $model->encryptedPrivateKey = $map['encrypted_private_key'];
        }

        return $model;
    }
}
