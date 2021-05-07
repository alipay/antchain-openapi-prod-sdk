<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class GetFacevrfEvidenceResponse extends Model
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

    // 刷脸的certifyId，原样返回
    /**
     * @var string
     */
    public $certifyId;

    // 统一证据ID，非SUCCESS状态为null，可在控制台中持统一证据ID验证pdf文件的正确性，法院方也可用此统一证据ID在司法链控制台进行核验pdf文件的正确性。
    /**
     * @var string
     */
    public $onchainId;

    // 上链状态，`SUCCESS`表示成功、`INIT`表示正在上链
    /**
     * @var string
     */
    public $onchainStatus;

    // pdf存证是否已经过期，不支持超过6个月的存证获取
    /**
     * @var bool
     */
    public $pdfExpired;

    // 存证pdf文件内容的base64
    /**
     * @var string
     */
    public $pdfContent;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'certifyId'     => 'certify_id',
        'onchainId'     => 'onchain_id',
        'onchainStatus' => 'onchain_status',
        'pdfExpired'    => 'pdf_expired',
        'pdfContent'    => 'pdf_content',
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
        if (null !== $this->certifyId) {
            $res['certify_id'] = $this->certifyId;
        }
        if (null !== $this->onchainId) {
            $res['onchain_id'] = $this->onchainId;
        }
        if (null !== $this->onchainStatus) {
            $res['onchain_status'] = $this->onchainStatus;
        }
        if (null !== $this->pdfExpired) {
            $res['pdf_expired'] = $this->pdfExpired;
        }
        if (null !== $this->pdfContent) {
            $res['pdf_content'] = $this->pdfContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetFacevrfEvidenceResponse
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
        if (isset($map['certify_id'])) {
            $model->certifyId = $map['certify_id'];
        }
        if (isset($map['onchain_id'])) {
            $model->onchainId = $map['onchain_id'];
        }
        if (isset($map['onchain_status'])) {
            $model->onchainStatus = $map['onchain_status'];
        }
        if (isset($map['pdf_expired'])) {
            $model->pdfExpired = $map['pdf_expired'];
        }
        if (isset($map['pdf_content'])) {
            $model->pdfContent = $map['pdf_content'];
        }

        return $model;
    }
}
