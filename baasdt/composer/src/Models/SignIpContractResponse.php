<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class SignIpContractResponse extends Model
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

    // 签署完成的文件OSS key。只有在签署流程全部完成后才会返回该数据。
    /**
     * @var string
     */
    public $signedContractFile;

    // 签署完成的文件下载链接。只有在签署流程全部完成后才会返回该数据。
    /**
     * @var string
     */
    public $signedContractFileUrl;
    protected $_name = [
        'reqMsgId'              => 'req_msg_id',
        'resultCode'            => 'result_code',
        'resultMsg'             => 'result_msg',
        'signedContractFile'    => 'signed_contract_file',
        'signedContractFileUrl' => 'signed_contract_file_url',
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
        if (null !== $this->signedContractFile) {
            $res['signed_contract_file'] = $this->signedContractFile;
        }
        if (null !== $this->signedContractFileUrl) {
            $res['signed_contract_file_url'] = $this->signedContractFileUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SignIpContractResponse
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
        if (isset($map['signed_contract_file'])) {
            $model->signedContractFile = $map['signed_contract_file'];
        }
        if (isset($map['signed_contract_file_url'])) {
            $model->signedContractFileUrl = $map['signed_contract_file_url'];
        }

        return $model;
    }
}
