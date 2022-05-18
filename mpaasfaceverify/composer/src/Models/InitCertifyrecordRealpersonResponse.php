<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MPAASFACEVERIFY\Models;

use AlibabaCloud\Tea\Model;

class InitCertifyrecordRealpersonResponse extends Model
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

    // 预留扩展结果
    /**
     * @var string
     */
    public $externInfo;

    // 产品结果明细，不影响决策
    /**
     * @var string
     */
    public $resultCodeSub;

    // result_code_sub对应的文案
    /**
     * @var string
     */
    public $resultMsgSub;

    // 认证单据号
    /**
     * @var string
     */
    public $certifyId;

    // 认证h5 url
    /**
     * @var string
     */
    public $certifyUrl;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'externInfo'    => 'extern_info',
        'resultCodeSub' => 'result_code_sub',
        'resultMsgSub'  => 'result_msg_sub',
        'certifyId'     => 'certify_id',
        'certifyUrl'    => 'certify_url',
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
        if (null !== $this->externInfo) {
            $res['extern_info'] = $this->externInfo;
        }
        if (null !== $this->resultCodeSub) {
            $res['result_code_sub'] = $this->resultCodeSub;
        }
        if (null !== $this->resultMsgSub) {
            $res['result_msg_sub'] = $this->resultMsgSub;
        }
        if (null !== $this->certifyId) {
            $res['certify_id'] = $this->certifyId;
        }
        if (null !== $this->certifyUrl) {
            $res['certify_url'] = $this->certifyUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitCertifyrecordRealpersonResponse
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
        if (isset($map['extern_info'])) {
            $model->externInfo = $map['extern_info'];
        }
        if (isset($map['result_code_sub'])) {
            $model->resultCodeSub = $map['result_code_sub'];
        }
        if (isset($map['result_msg_sub'])) {
            $model->resultMsgSub = $map['result_msg_sub'];
        }
        if (isset($map['certify_id'])) {
            $model->certifyId = $map['certify_id'];
        }
        if (isset($map['certify_url'])) {
            $model->certifyUrl = $map['certify_url'];
        }

        return $model;
    }
}
