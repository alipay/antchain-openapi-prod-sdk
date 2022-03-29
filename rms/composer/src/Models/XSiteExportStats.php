<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XSiteExportStats extends Model
{
    /**
     * @example
     *
     * @var int
     */
    public $alert;

    /**
     * @example
     *
     * @var int
     */
    public $alertDatasource;

    /**
     * @example
     *
     * @var int
     */
    public $dashboard;

    /**
     * @example
     *
     * @var int
     */
    public $dashboardDatasource;

    /**
     * @example
     *
     * @var int
     */
    public $datasource;

    // 通知对象的数量
    /**
     * @example 1
     *
     * @var int
     */
    public $alarmSubscriberCount;
    protected $_name = [
        'alert'                => 'alert',
        'alertDatasource'      => 'alert_datasource',
        'dashboard'            => 'dashboard',
        'dashboardDatasource'  => 'dashboard_datasource',
        'datasource'           => 'datasource',
        'alarmSubscriberCount' => 'alarm_subscriber_count',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->alert) {
            $res['alert'] = $this->alert;
        }
        if (null !== $this->alertDatasource) {
            $res['alert_datasource'] = $this->alertDatasource;
        }
        if (null !== $this->dashboard) {
            $res['dashboard'] = $this->dashboard;
        }
        if (null !== $this->dashboardDatasource) {
            $res['dashboard_datasource'] = $this->dashboardDatasource;
        }
        if (null !== $this->datasource) {
            $res['datasource'] = $this->datasource;
        }
        if (null !== $this->alarmSubscriberCount) {
            $res['alarm_subscriber_count'] = $this->alarmSubscriberCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XSiteExportStats
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['alert'])) {
            $model->alert = $map['alert'];
        }
        if (isset($map['alert_datasource'])) {
            $model->alertDatasource = $map['alert_datasource'];
        }
        if (isset($map['dashboard'])) {
            $model->dashboard = $map['dashboard'];
        }
        if (isset($map['dashboard_datasource'])) {
            $model->dashboardDatasource = $map['dashboard_datasource'];
        }
        if (isset($map['datasource'])) {
            $model->datasource = $map['datasource'];
        }
        if (isset($map['alarm_subscriber_count'])) {
            $model->alarmSubscriberCount = $map['alarm_subscriber_count'];
        }

        return $model;
    }
}
