<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AlarmPkgDO extends Model
{
    // biz_groupby_name
    /**
     * @example biz_groupby_name
     *
     * @var string
     */
    public $bizGroupbyName;

    // id
    /**
     * @example id
     *
     * @var int
     */
    public $id;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // stack_metric_group_metric_table
    /**
     * @example stack_metric_group_metric_table
     *
     * @var string
     */
    public $stackMetricGroupMetricTable;

    // tag_value
    /**
     * @example tag_value
     *
     * @var string
     */
    public $tagValue;

    // uuid
    /**
     * @example uuid
     *
     * @var string
     */
    public $uuid;

    // alarm
    /**
     * @example alarm
     *
     * @var AlarmDO
     */
    public $alarm;

    // top_alarm
    /**
     * @example top_alarm
     *
     * @var TopAlarmDO
     */
    public $topAlarm;
    protected $_name = [
        'bizGroupbyName'              => 'biz_groupby_name',
        'id'                          => 'id',
        'name'                        => 'name',
        'stackMetricGroupMetricTable' => 'stack_metric_group_metric_table',
        'tagValue'                    => 'tag_value',
        'uuid'                        => 'uuid',
        'alarm'                       => 'alarm',
        'topAlarm'                    => 'top_alarm',
    ];

    public function validate()
    {
        Model::validateRequired('bizGroupbyName', $this->bizGroupbyName, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('stackMetricGroupMetricTable', $this->stackMetricGroupMetricTable, true);
        Model::validateRequired('tagValue', $this->tagValue, true);
        Model::validateRequired('uuid', $this->uuid, true);
        Model::validateRequired('alarm', $this->alarm, true);
        Model::validateRequired('topAlarm', $this->topAlarm, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizGroupbyName) {
            $res['biz_groupby_name'] = $this->bizGroupbyName;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->stackMetricGroupMetricTable) {
            $res['stack_metric_group_metric_table'] = $this->stackMetricGroupMetricTable;
        }
        if (null !== $this->tagValue) {
            $res['tag_value'] = $this->tagValue;
        }
        if (null !== $this->uuid) {
            $res['uuid'] = $this->uuid;
        }
        if (null !== $this->alarm) {
            $res['alarm'] = null !== $this->alarm ? $this->alarm->toMap() : null;
        }
        if (null !== $this->topAlarm) {
            $res['top_alarm'] = null !== $this->topAlarm ? $this->topAlarm->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AlarmPkgDO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_groupby_name'])) {
            $model->bizGroupbyName = $map['biz_groupby_name'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['stack_metric_group_metric_table'])) {
            $model->stackMetricGroupMetricTable = $map['stack_metric_group_metric_table'];
        }
        if (isset($map['tag_value'])) {
            $model->tagValue = $map['tag_value'];
        }
        if (isset($map['uuid'])) {
            $model->uuid = $map['uuid'];
        }
        if (isset($map['alarm'])) {
            $model->alarm = AlarmDO::fromMap($map['alarm']);
        }
        if (isset($map['top_alarm'])) {
            $model->topAlarm = TopAlarmDO::fromMap($map['top_alarm']);
        }

        return $model;
    }
}
