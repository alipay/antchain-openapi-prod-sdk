<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class DisplayInfo extends Model
{
    // 权益名称
    /**
     * @example 满100 减10元
     *
     * @var string
     */
    public $benefitName;

    // 展示金额文案
    /**
     * @example 10元
     *
     * @var string
     */
    public $showAmountText;

    // 门槛金额文案
    /**
     * @example 满100元可用
     *
     * @var string
     */
    public $thresholdAmountText;

    // 使用说明
    /**
     * @example 满100 减10元
     *
     * @var string
     */
    public $benefitUsageDesc;

    // 规则描述
    /**
     * @example 满100元可用
     *
     * @var string
     */
    public $benefitRuleDesc;
    protected $_name = [
        'benefitName'         => 'benefit_name',
        'showAmountText'      => 'show_amount_text',
        'thresholdAmountText' => 'threshold_amount_text',
        'benefitUsageDesc'    => 'benefit_usage_desc',
        'benefitRuleDesc'     => 'benefit_rule_desc',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->benefitName) {
            $res['benefit_name'] = $this->benefitName;
        }
        if (null !== $this->showAmountText) {
            $res['show_amount_text'] = $this->showAmountText;
        }
        if (null !== $this->thresholdAmountText) {
            $res['threshold_amount_text'] = $this->thresholdAmountText;
        }
        if (null !== $this->benefitUsageDesc) {
            $res['benefit_usage_desc'] = $this->benefitUsageDesc;
        }
        if (null !== $this->benefitRuleDesc) {
            $res['benefit_rule_desc'] = $this->benefitRuleDesc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DisplayInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['benefit_name'])) {
            $model->benefitName = $map['benefit_name'];
        }
        if (isset($map['show_amount_text'])) {
            $model->showAmountText = $map['show_amount_text'];
        }
        if (isset($map['threshold_amount_text'])) {
            $model->thresholdAmountText = $map['threshold_amount_text'];
        }
        if (isset($map['benefit_usage_desc'])) {
            $model->benefitUsageDesc = $map['benefit_usage_desc'];
        }
        if (isset($map['benefit_rule_desc'])) {
            $model->benefitRuleDesc = $map['benefit_rule_desc'];
        }

        return $model;
    }
}
