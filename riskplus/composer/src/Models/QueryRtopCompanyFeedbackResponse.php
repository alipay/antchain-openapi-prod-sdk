<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRtopCompanyFeedbackResponse extends Model
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

    // 企业反馈列表
    /**
     * @var RtopCompanyFeedback[]
     */
    public $companyFeedbacks;

    // 返回码
    /**
     * @var string
     */
    public $responseCode;

    // 是否调用成功
    /**
     * @var bool
     */
    public $success;

    // 总条数
    /**
     * @var int
     */
    public $totalNum;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'companyFeedbacks' => 'company_feedbacks',
        'responseCode'     => 'response_code',
        'success'          => 'success',
        'totalNum'         => 'total_num',
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
        if (null !== $this->companyFeedbacks) {
            $res['company_feedbacks'] = [];
            if (null !== $this->companyFeedbacks && \is_array($this->companyFeedbacks)) {
                $n = 0;
                foreach ($this->companyFeedbacks as $item) {
                    $res['company_feedbacks'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->responseCode) {
            $res['response_code'] = $this->responseCode;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->totalNum) {
            $res['total_num'] = $this->totalNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRtopCompanyFeedbackResponse
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
        if (isset($map['company_feedbacks'])) {
            if (!empty($map['company_feedbacks'])) {
                $model->companyFeedbacks = [];
                $n                       = 0;
                foreach ($map['company_feedbacks'] as $item) {
                    $model->companyFeedbacks[$n++] = null !== $item ? RtopCompanyFeedback::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['response_code'])) {
            $model->responseCode = $map['response_code'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['total_num'])) {
            $model->totalNum = $map['total_num'];
        }

        return $model;
    }
}
