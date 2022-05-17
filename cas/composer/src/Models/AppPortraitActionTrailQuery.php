<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AppPortraitActionTrailQuery extends Model
{
    // 操作时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $actiontrailTimestamp;

    // title
    /**
     * @example title
     *
     * @var string
     */
    public $title;

    // 状态
    /**
     * @example 成功
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'actiontrailTimestamp' => 'actiontrail_timestamp',
        'title'                => 'title',
        'status'               => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('actiontrailTimestamp', $this->actiontrailTimestamp, true);
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('status', $this->status, true);
        Model::validatePattern('actiontrailTimestamp', $this->actiontrailTimestamp, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->actiontrailTimestamp) {
            $res['actiontrail_timestamp'] = $this->actiontrailTimestamp;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppPortraitActionTrailQuery
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['actiontrail_timestamp'])) {
            $model->actiontrailTimestamp = $map['actiontrail_timestamp'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
