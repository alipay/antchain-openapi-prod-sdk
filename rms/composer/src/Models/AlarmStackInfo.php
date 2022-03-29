<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AlarmStackInfo extends Model
{
    // 是应用监控，还是自定义监控
    /**
     * @example ["CUSTOM","STACK","TABLE]
     *
     * @var string
     */
    public $datasourceType;

    // 数据源
    /**
     * @example MM@@2000464
     *
     * @var string
     */
    public $datasource;

    // 应用类型
    /**
     * @example ["APP","HOST"]
     *
     * @var string
     */
    public $alarmTargetType;

    // 应用名称
    /**
     * @example RMS-monitorprod
     *
     * @var string
     */
    public $alarmTargetIdentify;
    protected $_name = [
        'datasourceType'      => 'datasource_type',
        'datasource'          => 'datasource',
        'alarmTargetType'     => 'alarm_target_type',
        'alarmTargetIdentify' => 'alarm_target_identify',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->datasourceType) {
            $res['datasource_type'] = $this->datasourceType;
        }
        if (null !== $this->datasource) {
            $res['datasource'] = $this->datasource;
        }
        if (null !== $this->alarmTargetType) {
            $res['alarm_target_type'] = $this->alarmTargetType;
        }
        if (null !== $this->alarmTargetIdentify) {
            $res['alarm_target_identify'] = $this->alarmTargetIdentify;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AlarmStackInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['datasource_type'])) {
            $model->datasourceType = $map['datasource_type'];
        }
        if (isset($map['datasource'])) {
            $model->datasource = $map['datasource'];
        }
        if (isset($map['alarm_target_type'])) {
            $model->alarmTargetType = $map['alarm_target_type'];
        }
        if (isset($map['alarm_target_identify'])) {
            $model->alarmTargetIdentify = $map['alarm_target_identify'];
        }

        return $model;
    }
}
