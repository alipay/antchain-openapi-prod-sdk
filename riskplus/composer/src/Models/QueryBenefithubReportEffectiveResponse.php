<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryBenefithubReportEffectiveResponse extends Model
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

    // 是否存在有效订单0无1有
    /**
     * @var string
     */
    public $reportValid;

    // 报告生成时间
    /**
     * @var string
     */
    public $reportValidFrom;

    // 报告过期时间
    /**
     * @var string
     */
    public $reportValidTo;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'reportValid'     => 'report_valid',
        'reportValidFrom' => 'report_valid_from',
        'reportValidTo'   => 'report_valid_to',
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
        if (null !== $this->reportValid) {
            $res['report_valid'] = $this->reportValid;
        }
        if (null !== $this->reportValidFrom) {
            $res['report_valid_from'] = $this->reportValidFrom;
        }
        if (null !== $this->reportValidTo) {
            $res['report_valid_to'] = $this->reportValidTo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBenefithubReportEffectiveResponse
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
        if (isset($map['report_valid'])) {
            $model->reportValid = $map['report_valid'];
        }
        if (isset($map['report_valid_from'])) {
            $model->reportValidFrom = $map['report_valid_from'];
        }
        if (isset($map['report_valid_to'])) {
            $model->reportValidTo = $map['report_valid_to'];
        }

        return $model;
    }
}
