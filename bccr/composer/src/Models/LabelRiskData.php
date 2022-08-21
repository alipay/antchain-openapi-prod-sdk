<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class LabelRiskData extends Model
{
    // 识别结果
    /**
     * @example 成功：1，失败：0
     *
     * @var int
     */
    public $code;

    // 识别出的标签名称
    /**
     * @example 识别出的标签名称
     *
     * @var string
     */
    public $labelName;

    // 识别出的标签是否与用户选择的标签匹配
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isRisk;

    // 识别出的标签匹配度百分比
    /**
     * @example 识别出的标签匹配度百分比
     *
     * @var string
     */
    public $similarValue;

    // 风险等级
    /**
     * @example 高3，中2，低1
     *
     * @var int
     */
    public $riskLevel;
    protected $_name = [
        'code'         => 'code',
        'labelName'    => 'label_name',
        'isRisk'       => 'is_risk',
        'similarValue' => 'similar_value',
        'riskLevel'    => 'risk_level',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('labelName', $this->labelName, true);
        Model::validateRequired('isRisk', $this->isRisk, true);
        Model::validateRequired('similarValue', $this->similarValue, true);
        Model::validateRequired('riskLevel', $this->riskLevel, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->labelName) {
            $res['label_name'] = $this->labelName;
        }
        if (null !== $this->isRisk) {
            $res['is_risk'] = $this->isRisk;
        }
        if (null !== $this->similarValue) {
            $res['similar_value'] = $this->similarValue;
        }
        if (null !== $this->riskLevel) {
            $res['risk_level'] = $this->riskLevel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LabelRiskData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['label_name'])) {
            $model->labelName = $map['label_name'];
        }
        if (isset($map['is_risk'])) {
            $model->isRisk = $map['is_risk'];
        }
        if (isset($map['similar_value'])) {
            $model->similarValue = $map['similar_value'];
        }
        if (isset($map['risk_level'])) {
            $model->riskLevel = $map['risk_level'];
        }

        return $model;
    }
}
