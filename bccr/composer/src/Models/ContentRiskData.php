<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class ContentRiskData extends Model
{
    // 识别结果
    /**
     * @example 成功：1，失败：0
     *
     * @var int
     */
    public $code;

    // 内容类型
    /**
     * @example IMAGE
     *
     * @var string
     */
    public $contentType;

    // 风险名称
    /**
     * @example 风险名称
     *
     * @var string
     */
    public $riskName;

    // 风险等级
    /**
     * @example 高3，中2，低1
     *
     * @var int
     */
    public $riskLevel;

    // 风险评分
    /**
     * @example 风险评分
     *
     * @var int
     */
    public $riskScore;
    protected $_name = [
        'code'        => 'code',
        'contentType' => 'content_type',
        'riskName'    => 'risk_name',
        'riskLevel'   => 'risk_level',
        'riskScore'   => 'risk_score',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('contentType', $this->contentType, true);
        Model::validateRequired('riskName', $this->riskName, true);
        Model::validateRequired('riskLevel', $this->riskLevel, true);
        Model::validateRequired('riskScore', $this->riskScore, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->contentType) {
            $res['content_type'] = $this->contentType;
        }
        if (null !== $this->riskName) {
            $res['risk_name'] = $this->riskName;
        }
        if (null !== $this->riskLevel) {
            $res['risk_level'] = $this->riskLevel;
        }
        if (null !== $this->riskScore) {
            $res['risk_score'] = $this->riskScore;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContentRiskData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['content_type'])) {
            $model->contentType = $map['content_type'];
        }
        if (isset($map['risk_name'])) {
            $model->riskName = $map['risk_name'];
        }
        if (isset($map['risk_level'])) {
            $model->riskLevel = $map['risk_level'];
        }
        if (isset($map['risk_score'])) {
            $model->riskScore = $map['risk_score'];
        }

        return $model;
    }
}
