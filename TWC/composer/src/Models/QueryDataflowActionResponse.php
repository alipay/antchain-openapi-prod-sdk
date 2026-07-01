<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryDataflowActionResponse extends Model
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

    // 操作状态
    /**
     * @var int
     */
    public $status;

    // 信封公钥加密后的存证公钥信息，当查询类型为DEPLOY且status为密钥上传成功时返回。
    /**
     * @var string
     */
    public $encryptedPubkey;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'status'          => 'status',
        'encryptedPubkey' => 'encrypted_pubkey',
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->encryptedPubkey) {
            $res['encrypted_pubkey'] = $this->encryptedPubkey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDataflowActionResponse
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
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['encrypted_pubkey'])) {
            $model->encryptedPubkey = $map['encrypted_pubkey'];
        }

        return $model;
    }
}
