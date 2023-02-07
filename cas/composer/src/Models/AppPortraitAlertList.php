<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AppPortraitAlertList extends Model
{
    // 标题
    /**
     * @example 点餐码校验
     *
     * @var string
     */
    public $title;

    // 告警事件ID
    /**
     * @example 367_1653287760000_450529734
     *
     * @var string
     */
    public $eventId;

    // 应用名
    /**
     * @example 应用名
     *
     * @var string
     */
    public $appName;

    // 告警级别
    /**
     * @example INFO
     *
     * @var string
     */
    public $severity;

    // 告警内容
    /**
     * @example 告警内容
     *
     * @var string
     */
    public $alertContent;

    // 告警时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtOccurTimestamp;

    // 相关链接
    /**
     * @example https://sofa.console.aliyun.com/business/product/multiMinute/preview/3076?workspaceName=eco0shbpaas0prod&tenantName=DIVIXWCN
     *
     * @var string
     */
    public $alarmUrl;

    // * HEALTHY(0), // 健康
    // * PENDING(1), // 触发中
    // * FIRING(2), // 告警中
    // * SUSPENDED(3), // 已暂停
    // * SILENCED(4), // 已静默
    // * RECOVERED(5), // 已恢复
    //
    /**
     * @example 1
     *
     * @var int
     */
    public $status;
    protected $_name = [
        'title'             => 'title',
        'eventId'           => 'event_id',
        'appName'           => 'app_name',
        'severity'          => 'severity',
        'alertContent'      => 'alert_content',
        'gmtOccurTimestamp' => 'gmt_occur_timestamp',
        'alarmUrl'          => 'alarm_url',
        'status'            => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('eventId', $this->eventId, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('severity', $this->severity, true);
        Model::validateRequired('alertContent', $this->alertContent, true);
        Model::validateRequired('gmtOccurTimestamp', $this->gmtOccurTimestamp, true);
        Model::validateRequired('alarmUrl', $this->alarmUrl, true);
        Model::validateRequired('status', $this->status, true);
        Model::validatePattern('gmtOccurTimestamp', $this->gmtOccurTimestamp, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->eventId) {
            $res['event_id'] = $this->eventId;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->severity) {
            $res['severity'] = $this->severity;
        }
        if (null !== $this->alertContent) {
            $res['alert_content'] = $this->alertContent;
        }
        if (null !== $this->gmtOccurTimestamp) {
            $res['gmt_occur_timestamp'] = $this->gmtOccurTimestamp;
        }
        if (null !== $this->alarmUrl) {
            $res['alarm_url'] = $this->alarmUrl;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppPortraitAlertList
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['event_id'])) {
            $model->eventId = $map['event_id'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['severity'])) {
            $model->severity = $map['severity'];
        }
        if (isset($map['alert_content'])) {
            $model->alertContent = $map['alert_content'];
        }
        if (isset($map['gmt_occur_timestamp'])) {
            $model->gmtOccurTimestamp = $map['gmt_occur_timestamp'];
        }
        if (isset($map['alarm_url'])) {
            $model->alarmUrl = $map['alarm_url'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
