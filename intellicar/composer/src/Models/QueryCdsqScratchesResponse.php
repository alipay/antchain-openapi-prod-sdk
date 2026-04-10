<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class QueryCdsqScratchesResponse extends Model
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

    // 结果码，999999 表示成功
    /**
     * @var string
     */
    public $responseCode;

    // 错误信息，成功时为空
    /**
     * @var string
     */
    public $responseMsg;

    // 电子保单 url 地址
    /**
     * @var string
     */
    public $returnPdfValue;

    // 保单服务号
    /**
     * @var string
     */
    public $policyNo;

    // 保单生效时间，格式：yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $beginTime;

    // 保单失效时间，格式：yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $endTime;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'responseCode'   => 'response_code',
        'responseMsg'    => 'response_msg',
        'returnPdfValue' => 'return_pdf_value',
        'policyNo'       => 'policy_no',
        'beginTime'      => 'begin_time',
        'endTime'        => 'end_time',
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
        if (null !== $this->responseCode) {
            $res['response_code'] = $this->responseCode;
        }
        if (null !== $this->responseMsg) {
            $res['response_msg'] = $this->responseMsg;
        }
        if (null !== $this->returnPdfValue) {
            $res['return_pdf_value'] = $this->returnPdfValue;
        }
        if (null !== $this->policyNo) {
            $res['policy_no'] = $this->policyNo;
        }
        if (null !== $this->beginTime) {
            $res['begin_time'] = $this->beginTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCdsqScratchesResponse
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
        if (isset($map['response_code'])) {
            $model->responseCode = $map['response_code'];
        }
        if (isset($map['response_msg'])) {
            $model->responseMsg = $map['response_msg'];
        }
        if (isset($map['return_pdf_value'])) {
            $model->returnPdfValue = $map['return_pdf_value'];
        }
        if (isset($map['policy_no'])) {
            $model->policyNo = $map['policy_no'];
        }
        if (isset($map['begin_time'])) {
            $model->beginTime = $map['begin_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }

        return $model;
    }
}
