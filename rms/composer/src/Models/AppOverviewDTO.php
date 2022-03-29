<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AppOverviewDTO extends Model
{
    // 应用总数
    /**
     * @example 105
     *
     * @var int
     */
    public $totalAppCount;

    // 正常运行应用数
    /**
     * @example 100
     *
     * @var int
     */
    public $normalAppCount;

    // 告警应用数
    /**
     * @example 5
     *
     * @var int
     */
    public $alarmAppCount;

    // 自定义监控配置数
    /**
     * @example
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

    // 告警模板配置数
    /**
     * @example
     *
     * @var int
     */
    public $alarmTplCount;

    // 日志路径数
    /**
     * @example
     *
     * @var int
     */
    public $logConfigCount;

    // mem top排序应用
    /**
     * @example
     *
     * @var AppTopItem[]
     */
    public $memTopApps;

    // cpu top排序应用
    /**
     * @example
     *
     * @var AppTopItem[]
     */
    public $cpuTopApps;

    // 磁盘 top排序应用
    /**
     * @example
     *
     * @var AppTopItem[]
     */
    public $diskTopApps;

    // 告警top排序应用
    /**
     * @example
     *
     * @var AppTopItem[]
     */
    public $alarmTopApps;

    // error top排序应用
    /**
     * @example
     *
     * @var AppTopItem[]
     */
    public $errorTopApps;
    protected $_name = [
        'totalAppCount'     => 'total_app_count',
        'normalAppCount'    => 'normal_app_count',
        'alarmAppCount'     => 'alarm_app_count',
        'customPluginCount' => 'custom_plugin_count',
        'alarmRuleCount'    => 'alarm_rule_count',
        'alarmTplCount'     => 'alarm_tpl_count',
        'logConfigCount'    => 'log_config_count',
        'memTopApps'        => 'mem_top_apps',
        'cpuTopApps'        => 'cpu_top_apps',
        'diskTopApps'       => 'disk_top_apps',
        'alarmTopApps'      => 'alarm_top_apps',
        'errorTopApps'      => 'error_top_apps',
    ];

    public function validate()
    {
        Model::validateRequired('totalAppCount', $this->totalAppCount, true);
        Model::validateRequired('normalAppCount', $this->normalAppCount, true);
        Model::validateRequired('alarmAppCount', $this->alarmAppCount, true);
        Model::validateRequired('customPluginCount', $this->customPluginCount, true);
        Model::validateRequired('alarmRuleCount', $this->alarmRuleCount, true);
        Model::validateRequired('alarmTplCount', $this->alarmTplCount, true);
        Model::validateRequired('logConfigCount', $this->logConfigCount, true);
        Model::validateRequired('memTopApps', $this->memTopApps, true);
        Model::validateRequired('cpuTopApps', $this->cpuTopApps, true);
        Model::validateRequired('diskTopApps', $this->diskTopApps, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->totalAppCount) {
            $res['total_app_count'] = $this->totalAppCount;
        }
        if (null !== $this->normalAppCount) {
            $res['normal_app_count'] = $this->normalAppCount;
        }
        if (null !== $this->alarmAppCount) {
            $res['alarm_app_count'] = $this->alarmAppCount;
        }
        if (null !== $this->customPluginCount) {
            $res['custom_plugin_count'] = $this->customPluginCount;
        }
        if (null !== $this->alarmRuleCount) {
            $res['alarm_rule_count'] = $this->alarmRuleCount;
        }
        if (null !== $this->alarmTplCount) {
            $res['alarm_tpl_count'] = $this->alarmTplCount;
        }
        if (null !== $this->logConfigCount) {
            $res['log_config_count'] = $this->logConfigCount;
        }
        if (null !== $this->memTopApps) {
            $res['mem_top_apps'] = [];
            if (null !== $this->memTopApps && \is_array($this->memTopApps)) {
                $n = 0;
                foreach ($this->memTopApps as $item) {
                    $res['mem_top_apps'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->cpuTopApps) {
            $res['cpu_top_apps'] = [];
            if (null !== $this->cpuTopApps && \is_array($this->cpuTopApps)) {
                $n = 0;
                foreach ($this->cpuTopApps as $item) {
                    $res['cpu_top_apps'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->diskTopApps) {
            $res['disk_top_apps'] = [];
            if (null !== $this->diskTopApps && \is_array($this->diskTopApps)) {
                $n = 0;
                foreach ($this->diskTopApps as $item) {
                    $res['disk_top_apps'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->alarmTopApps) {
            $res['alarm_top_apps'] = [];
            if (null !== $this->alarmTopApps && \is_array($this->alarmTopApps)) {
                $n = 0;
                foreach ($this->alarmTopApps as $item) {
                    $res['alarm_top_apps'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->errorTopApps) {
            $res['error_top_apps'] = [];
            if (null !== $this->errorTopApps && \is_array($this->errorTopApps)) {
                $n = 0;
                foreach ($this->errorTopApps as $item) {
                    $res['error_top_apps'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppOverviewDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['total_app_count'])) {
            $model->totalAppCount = $map['total_app_count'];
        }
        if (isset($map['normal_app_count'])) {
            $model->normalAppCount = $map['normal_app_count'];
        }
        if (isset($map['alarm_app_count'])) {
            $model->alarmAppCount = $map['alarm_app_count'];
        }
        if (isset($map['custom_plugin_count'])) {
            $model->customPluginCount = $map['custom_plugin_count'];
        }
        if (isset($map['alarm_rule_count'])) {
            $model->alarmRuleCount = $map['alarm_rule_count'];
        }
        if (isset($map['alarm_tpl_count'])) {
            $model->alarmTplCount = $map['alarm_tpl_count'];
        }
        if (isset($map['log_config_count'])) {
            $model->logConfigCount = $map['log_config_count'];
        }
        if (isset($map['mem_top_apps'])) {
            if (!empty($map['mem_top_apps'])) {
                $model->memTopApps = [];
                $n                 = 0;
                foreach ($map['mem_top_apps'] as $item) {
                    $model->memTopApps[$n++] = null !== $item ? AppTopItem::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['cpu_top_apps'])) {
            if (!empty($map['cpu_top_apps'])) {
                $model->cpuTopApps = [];
                $n                 = 0;
                foreach ($map['cpu_top_apps'] as $item) {
                    $model->cpuTopApps[$n++] = null !== $item ? AppTopItem::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['disk_top_apps'])) {
            if (!empty($map['disk_top_apps'])) {
                $model->diskTopApps = [];
                $n                  = 0;
                foreach ($map['disk_top_apps'] as $item) {
                    $model->diskTopApps[$n++] = null !== $item ? AppTopItem::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['alarm_top_apps'])) {
            if (!empty($map['alarm_top_apps'])) {
                $model->alarmTopApps = [];
                $n                   = 0;
                foreach ($map['alarm_top_apps'] as $item) {
                    $model->alarmTopApps[$n++] = null !== $item ? AppTopItem::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['error_top_apps'])) {
            if (!empty($map['error_top_apps'])) {
                $model->errorTopApps = [];
                $n                   = 0;
                foreach ($map['error_top_apps'] as $item) {
                    $model->errorTopApps[$n++] = null !== $item ? AppTopItem::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
