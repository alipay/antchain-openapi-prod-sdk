<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAAS_MIDWAY\Models;

use AlibabaCloud\Tea\Model;

class DownloadCaResponse extends Model
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

    // 根CA证书内容
    /**
     * @var string
     */
    public $trustCaContent;

    // CA证书格式，目前只有X509
    /**
     * @var string
     */
    public $caFormat;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'trustCaContent' => 'trust_ca_content',
        'caFormat'       => 'ca_format',
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
        if (null !== $this->trustCaContent) {
            $res['trust_ca_content'] = $this->trustCaContent;
        }
        if (null !== $this->caFormat) {
            $res['ca_format'] = $this->caFormat;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DownloadCaResponse
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
        if (isset($map['trust_ca_content'])) {
            $model->trustCaContent = $map['trust_ca_content'];
        }
        if (isset($map['ca_format'])) {
            $model->caFormat = $map['ca_format'];
        }

        return $model;
    }
}
