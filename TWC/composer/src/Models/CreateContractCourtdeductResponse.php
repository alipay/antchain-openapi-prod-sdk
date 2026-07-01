<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateContractCourtdeductResponse extends Model
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

    // 给工行上传的调解书文件名
    /**
     * @var string
     */
    public $fileName;

    // 存证txHash，存证核验时需要
    /**
     * @var string
     */
    public $txHash;

    // 存证原文
    /**
     * @var string
     */
    public $notaryContent;

    // 存证原文hash
    /**
     * @var string
     */
    public $notaryContentHash;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'fileName'          => 'file_name',
        'txHash'            => 'tx_hash',
        'notaryContent'     => 'notary_content',
        'notaryContentHash' => 'notary_content_hash',
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
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->notaryContent) {
            $res['notary_content'] = $this->notaryContent;
        }
        if (null !== $this->notaryContentHash) {
            $res['notary_content_hash'] = $this->notaryContentHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateContractCourtdeductResponse
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
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['notary_content'])) {
            $model->notaryContent = $map['notary_content'];
        }
        if (isset($map['notary_content_hash'])) {
            $model->notaryContentHash = $map['notary_content_hash'];
        }

        return $model;
    }
}
