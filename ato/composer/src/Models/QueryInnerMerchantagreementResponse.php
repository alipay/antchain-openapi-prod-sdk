<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryInnerMerchantagreementResponse extends Model
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

    // 签约状态 枚举
    // TOBE 待签
    // FAIL 签约失败
    // SUCCESS 签约成功
    /**
     * @var string
     */
    public $signStatus;

    // 签约时间
    /**
     * @var string
     */
    public $signDateStr;

    // 协议内容 富文本
    /**
     * @var string
     */
    public $agreementContent;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'signStatus'       => 'sign_status',
        'signDateStr'      => 'sign_date_str',
        'agreementContent' => 'agreement_content',
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
        if (null !== $this->signStatus) {
            $res['sign_status'] = $this->signStatus;
        }
        if (null !== $this->signDateStr) {
            $res['sign_date_str'] = $this->signDateStr;
        }
        if (null !== $this->agreementContent) {
            $res['agreement_content'] = $this->agreementContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInnerMerchantagreementResponse
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
        if (isset($map['sign_status'])) {
            $model->signStatus = $map['sign_status'];
        }
        if (isset($map['sign_date_str'])) {
            $model->signDateStr = $map['sign_date_str'];
        }
        if (isset($map['agreement_content'])) {
            $model->agreementContent = $map['agreement_content'];
        }

        return $model;
    }
}
