<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryInnerWithholdsignResponse extends Model
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

    // 协议当前状态
    // 1. UNSIGNED：未签约
    // 2. SIGNED：已签约；
    // 3.APPLY_TERMINATE:申请解约
    // 4. TERMINATED：已解约
    // 5.TIMEOUT_CLOSE:超时关闭
    /**
     * @var string
     */
    public $status;

    // 支付宝代扣协议号
    /**
     * @var string
     */
    public $agreementNo;

    // 协议签署时间
    // yyyy-MM-dd HH:mm:ss 格式
    /**
     * @var string
     */
    public $signTime;

    // 协议生效时间
    // yyyy-MM-dd HH:mm:ss 格式
    /**
     * @var string
     */
    public $validTime;

    // 协议失效时间
    // yyyy-MM-dd HH:mm:ss 格式
    /**
     * @var string
     */
    public $invalidTime;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'status'      => 'status',
        'agreementNo' => 'agreement_no',
        'signTime'    => 'sign_time',
        'validTime'   => 'valid_time',
        'invalidTime' => 'invalid_time',
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
        if (null !== $this->agreementNo) {
            $res['agreement_no'] = $this->agreementNo;
        }
        if (null !== $this->signTime) {
            $res['sign_time'] = $this->signTime;
        }
        if (null !== $this->validTime) {
            $res['valid_time'] = $this->validTime;
        }
        if (null !== $this->invalidTime) {
            $res['invalid_time'] = $this->invalidTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInnerWithholdsignResponse
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
        if (isset($map['agreement_no'])) {
            $model->agreementNo = $map['agreement_no'];
        }
        if (isset($map['sign_time'])) {
            $model->signTime = $map['sign_time'];
        }
        if (isset($map['valid_time'])) {
            $model->validTime = $map['valid_time'];
        }
        if (isset($map['invalid_time'])) {
            $model->invalidTime = $map['invalid_time'];
        }

        return $model;
    }
}
