<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class RiskResult extends Model
{
    // 活体检测标签
    /**
     * @example {}
     *
     * @var string
     */
    public $imageLabels;

    // 设备风险等级
    /**
     * @example safe
     *
     * @var string
     */
    public $deviceRiskLevel;

    // 设备风险标签
    /**
     * @example {}
     *
     * @var string
     */
    public $deviceRiskLabels;

    // 行为风险等级
    /**
     * @example safe
     *
     * @var string
     */
    public $behaviorRiskLevel;

    // 行为风险标签
    /**
     * @example {}
     *
     * @var string
     */
    public $behaviorRiskLabels;

    // 是否关联攻击
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isCorrelate;
    protected $_name = [
        'imageLabels'        => 'image_labels',
        'deviceRiskLevel'    => 'device_risk_level',
        'deviceRiskLabels'   => 'device_risk_labels',
        'behaviorRiskLevel'  => 'behavior_risk_level',
        'behaviorRiskLabels' => 'behavior_risk_labels',
        'isCorrelate'        => 'is_correlate',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->imageLabels) {
            $res['image_labels'] = $this->imageLabels;
        }
        if (null !== $this->deviceRiskLevel) {
            $res['device_risk_level'] = $this->deviceRiskLevel;
        }
        if (null !== $this->deviceRiskLabels) {
            $res['device_risk_labels'] = $this->deviceRiskLabels;
        }
        if (null !== $this->behaviorRiskLevel) {
            $res['behavior_risk_level'] = $this->behaviorRiskLevel;
        }
        if (null !== $this->behaviorRiskLabels) {
            $res['behavior_risk_labels'] = $this->behaviorRiskLabels;
        }
        if (null !== $this->isCorrelate) {
            $res['is_correlate'] = $this->isCorrelate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RiskResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['image_labels'])) {
            $model->imageLabels = $map['image_labels'];
        }
        if (isset($map['device_risk_level'])) {
            $model->deviceRiskLevel = $map['device_risk_level'];
        }
        if (isset($map['device_risk_labels'])) {
            $model->deviceRiskLabels = $map['device_risk_labels'];
        }
        if (isset($map['behavior_risk_level'])) {
            $model->behaviorRiskLevel = $map['behavior_risk_level'];
        }
        if (isset($map['behavior_risk_labels'])) {
            $model->behaviorRiskLabels = $map['behavior_risk_labels'];
        }
        if (isset($map['is_correlate'])) {
            $model->isCorrelate = $map['is_correlate'];
        }

        return $model;
    }
}
