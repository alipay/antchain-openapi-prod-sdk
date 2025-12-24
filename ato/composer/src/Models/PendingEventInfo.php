<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class PendingEventInfo extends Model
{
    // 事件id
    /**
     * @example 12345678912
     *
     * @var string
     */
    public $eventId;

    // 通知:NOTIFICATION
    // 确认函:CONFIRMATION
    /**
     * @example NOTIFICATION
     *
     * @var string
     */
    public $type;

    // ("PENDING","待办中"),  ("CONFIRMED","确认"),
    // ("REJECTED","已拒绝")
    // ("FAILED","失败"),("EXPIRED","已过期");
    /**
     * @example PENDING
     *
     * @var string
     */
    public $status;

    // 待办内容主题
    /**
     * @example 用信确认函
     *
     * @var string
     */
    public $contentSubject;

    // 事件有效期开始
    /**
     * @example 2024-08-27 14:07:46.600
     *
     * @var string
     */
    public $effectiveStartTime;

    // 事件有效期结束
    /**
     * @example 2025-02-19 11:03:43.786
     *
     * @var string
     */
    public $effectiveEndTime;

    // 待办类型
    /**
     * @example text
     *
     * @var string
     */
    public $contentType;

    // 待办详情，根据content_type可能为下载链接或者富文本
    /**
     * @example http://123.docx
     *
     * @var string
     */
    public $contentDetails;
    protected $_name = [
        'eventId'            => 'event_id',
        'type'               => 'type',
        'status'             => 'status',
        'contentSubject'     => 'content_subject',
        'effectiveStartTime' => 'effective_start_time',
        'effectiveEndTime'   => 'effective_end_time',
        'contentType'        => 'content_type',
        'contentDetails'     => 'content_details',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->eventId) {
            $res['event_id'] = $this->eventId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->contentSubject) {
            $res['content_subject'] = $this->contentSubject;
        }
        if (null !== $this->effectiveStartTime) {
            $res['effective_start_time'] = $this->effectiveStartTime;
        }
        if (null !== $this->effectiveEndTime) {
            $res['effective_end_time'] = $this->effectiveEndTime;
        }
        if (null !== $this->contentType) {
            $res['content_type'] = $this->contentType;
        }
        if (null !== $this->contentDetails) {
            $res['content_details'] = $this->contentDetails;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PendingEventInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['event_id'])) {
            $model->eventId = $map['event_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['content_subject'])) {
            $model->contentSubject = $map['content_subject'];
        }
        if (isset($map['effective_start_time'])) {
            $model->effectiveStartTime = $map['effective_start_time'];
        }
        if (isset($map['effective_end_time'])) {
            $model->effectiveEndTime = $map['effective_end_time'];
        }
        if (isset($map['content_type'])) {
            $model->contentType = $map['content_type'];
        }
        if (isset($map['content_details'])) {
            $model->contentDetails = $map['content_details'];
        }

        return $model;
    }
}
