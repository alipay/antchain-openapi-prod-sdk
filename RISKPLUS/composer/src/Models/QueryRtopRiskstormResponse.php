<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRtopRiskstormResponse extends Model
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

    // 年报数据
    /**
     * @var RtopRiskStormCompanyAnnualReport[]
     */
    public $annualReports;

    // 风险标签数据
    /**
     * @var RiskStormLabelResp[]
     */
    public $riskLabels;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'annualReports' => 'annual_reports',
        'riskLabels'    => 'risk_labels',
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
        if (null !== $this->annualReports) {
            $res['annual_reports'] = [];
            if (null !== $this->annualReports && \is_array($this->annualReports)) {
                $n = 0;
                foreach ($this->annualReports as $item) {
                    $res['annual_reports'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->riskLabels) {
            $res['risk_labels'] = [];
            if (null !== $this->riskLabels && \is_array($this->riskLabels)) {
                $n = 0;
                foreach ($this->riskLabels as $item) {
                    $res['risk_labels'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRtopRiskstormResponse
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
        if (isset($map['annual_reports'])) {
            if (!empty($map['annual_reports'])) {
                $model->annualReports = [];
                $n                    = 0;
                foreach ($map['annual_reports'] as $item) {
                    $model->annualReports[$n++] = null !== $item ? RtopRiskStormCompanyAnnualReport::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['risk_labels'])) {
            if (!empty($map['risk_labels'])) {
                $model->riskLabels = [];
                $n                 = 0;
                foreach ($map['risk_labels'] as $item) {
                    $model->riskLabels[$n++] = null !== $item ? RiskStormLabelResp::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
