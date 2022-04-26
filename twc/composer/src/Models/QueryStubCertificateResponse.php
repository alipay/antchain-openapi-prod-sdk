<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryStubCertificateResponse extends Model
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

    // 存证证明下载地址，有效期1个小时
    /**
     * @var string
     */
    public $certificateUrl;

    // Legal码H5页面URL
    /**
     * @var string
     */
    public $legalCodeUrl;

    // Legal码证书H5页面URL
    /**
     * @var string
     */
    public $legalShowUrl;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'certificateUrl' => 'certificate_url',
        'legalCodeUrl'   => 'legal_code_url',
        'legalShowUrl'   => 'legal_show_url',
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
        if (null !== $this->certificateUrl) {
            $res['certificate_url'] = $this->certificateUrl;
        }
        if (null !== $this->legalCodeUrl) {
            $res['legal_code_url'] = $this->legalCodeUrl;
        }
        if (null !== $this->legalShowUrl) {
            $res['legal_show_url'] = $this->legalShowUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryStubCertificateResponse
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
        if (isset($map['certificate_url'])) {
            $model->certificateUrl = $map['certificate_url'];
        }
        if (isset($map['legal_code_url'])) {
            $model->legalCodeUrl = $map['legal_code_url'];
        }
        if (isset($map['legal_show_url'])) {
            $model->legalShowUrl = $map['legal_show_url'];
        }

        return $model;
    }
}
