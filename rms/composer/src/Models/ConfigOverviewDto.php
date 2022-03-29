<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class ConfigOverviewDto extends Model
{
    // 自定义监控配置数
    /**
     * @example custom_plugin_count
     *
     * @var int
     */
    public $customPluginCount;

    // 告警规则配置数
    /**
     * @example
     *
     * @var int
     */
    public $alarmRuleCount;

    // 告警规则配置数
    /**
     * @example
     *
     * @var int
     */
    public $alarmTplCount;
    protected $_name = [
        'customPluginCount' => 'custom_plugin_count',
        'alarmRuleCount'    => 'alarm_rule_count',
        'alarmTplCount'     => 'alarm_tpl_count',
    ];

    public function validate()
    {
        Model::validateRequired('customPluginCount', $this->customPluginCount, true);
        Model::validateRequired('alarmRuleCount', $this->alarmRuleCount, true);
        Model::validateRequired('alarmTplCount', $this->alarmTplCount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->customPluginCount) {
            $res['custom_plugin_count'] = $this->customPluginCount;
        }
        if (null !== $this->alarmRuleCount) {
            $res['alarm_rule_count'] = $this->alarmRuleCount;
        }
        if (null !== $this->alarmTplCount) {
            $res['alarm_tpl_count'] = $this->alarmTplCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfigOverviewDto
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['custom_plugin_count'])) {
            $model->customPluginCount = $map['custom_plugin_count'];
        }
        if (isset($map['alarm_rule_count'])) {
            $model->alarmRuleCount = $map['alarm_rule_count'];
        }
        if (isset($map['alarm_tpl_count'])) {
            $model->alarmTplCount = $map['alarm_tpl_count'];
        }

        return $model;
    }
}
