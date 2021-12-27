<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class GetRtopCompanyDetailResponse extends Model
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

    // 风险分数
    /**
     * @var int
     */
    public $riskScore;

    // 风险维度特征
    /**
     * @var string
     */
    public $riskFeatures;

    // 风险标签列表
    /**
     * @var RtopRiskTag[]
     */
    public $riskTags;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'riskScore'    => 'risk_score',
        'riskFeatures' => 'risk_features',
        'riskTags'     => 'risk_tags',
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
        if (null !== $this->riskScore) {
            $res['risk_score'] = $this->riskScore;
        }
        if (null !== $this->riskFeatures) {
            $res['risk_features'] = $this->riskFeatures;
        }
        if (null !== $this->riskTags) {
            $res['risk_tags'] = [];
            if (null !== $this->riskTags && \is_array($this->riskTags)) {
                $n = 0;
                foreach ($this->riskTags as $item) {
                    $res['risk_tags'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetRtopCompanyDetailResponse
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
        if (isset($map['risk_score'])) {
            $model->riskScore = $map['risk_score'];
        }
        if (isset($map['risk_features'])) {
            $model->riskFeatures = $map['risk_features'];
        }
        if (isset($map['risk_tags'])) {
            if (!empty($map['risk_tags'])) {
                $model->riskTags = [];
                $n               = 0;
                foreach ($map['risk_tags'] as $item) {
                    $model->riskTags[$n++] = null !== $item ? RtopRiskTag::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
