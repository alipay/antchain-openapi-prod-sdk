<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XSiteExportData extends Model
{
    /**
     * @example
     *
     * @var XDashboardCRULResponseCURequest[]
     */
    public $dashboards;

    /**
     * @example
     *
     * @var XDatasourceCRULResponseCURequest[]
     */
    public $datasources;

    /**
     * @example
     *
     * @var UnifiedAlarmRuleVO[]
     */
    public $alerts;

    /**
     * @example
     *
     * @var XSiteExportStats
     */
    public $stats;

    // 自定义告警的BASE64编码
    /**
     * @example AAAA
     *
     * @var string
     */
    public $alarmRulesV2Custom;
    protected $_name = [
        'dashboards'         => 'dashboards',
        'datasources'        => 'datasources',
        'alerts'             => 'alerts',
        'stats'              => 'stats',
        'alarmRulesV2Custom' => 'alarm_rules_v2_custom',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dashboards) {
            $res['dashboards'] = [];
            if (null !== $this->dashboards && \is_array($this->dashboards)) {
                $n = 0;
                foreach ($this->dashboards as $item) {
                    $res['dashboards'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->datasources) {
            $res['datasources'] = [];
            if (null !== $this->datasources && \is_array($this->datasources)) {
                $n = 0;
                foreach ($this->datasources as $item) {
                    $res['datasources'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->alerts) {
            $res['alerts'] = [];
            if (null !== $this->alerts && \is_array($this->alerts)) {
                $n = 0;
                foreach ($this->alerts as $item) {
                    $res['alerts'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->stats) {
            $res['stats'] = null !== $this->stats ? $this->stats->toMap() : null;
        }
        if (null !== $this->alarmRulesV2Custom) {
            $res['alarm_rules_v2_custom'] = $this->alarmRulesV2Custom;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XSiteExportData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['dashboards'])) {
            if (!empty($map['dashboards'])) {
                $model->dashboards = [];
                $n                 = 0;
                foreach ($map['dashboards'] as $item) {
                    $model->dashboards[$n++] = null !== $item ? XDashboardCRULResponseCURequest::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['datasources'])) {
            if (!empty($map['datasources'])) {
                $model->datasources = [];
                $n                  = 0;
                foreach ($map['datasources'] as $item) {
                    $model->datasources[$n++] = null !== $item ? XDatasourceCRULResponseCURequest::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['alerts'])) {
            if (!empty($map['alerts'])) {
                $model->alerts = [];
                $n             = 0;
                foreach ($map['alerts'] as $item) {
                    $model->alerts[$n++] = null !== $item ? UnifiedAlarmRuleVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['stats'])) {
            $model->stats = XSiteExportStats::fromMap($map['stats']);
        }
        if (isset($map['alarm_rules_v2_custom'])) {
            $model->alarmRulesV2Custom = $map['alarm_rules_v2_custom'];
        }

        return $model;
    }
}
