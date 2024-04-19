<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class UploadEcarPlaformfileResponse extends Model
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

    // 文档名称
    /**
     * @var string
     */
    public $documentName;

    // 文档地址信息
    /**
     * @var string
     */
    public $documentAddress;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'documentName'    => 'document_name',
        'documentAddress' => 'document_address',
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
        if (null !== $this->documentName) {
            $res['document_name'] = $this->documentName;
        }
        if (null !== $this->documentAddress) {
            $res['document_address'] = $this->documentAddress;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadEcarPlaformfileResponse
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
        if (isset($map['document_name'])) {
            $model->documentName = $map['document_name'];
        }
        if (isset($map['document_address'])) {
            $model->documentAddress = $map['document_address'];
        }

        return $model;
    }
}
