<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class ActivityBaseInfo extends Model
{
    // 活动ID
    /**
     * @example 110000199001011234
     *
     * @var string
     */
    public $activityId;

    // 活动名称
    /**
     * @example xx面馆活动
     *
     * @var string
     */
    public $activityName;

    // 活动状态
    /**
     * @example CAMP_CREATED
     *
     * @var string
     */
    public $activityStatus;

    // 平台类型
    /**
     * @example PLATFORM
     *
     * @var string
     */
    public $platformType;

    // 活动开始时间
    /**
     * @example yyyy-MM-dd HH:mm:ss
     *
     * @var string
     */
    public $publishStartTime;

    // 活动结束时间
    /**
     * @example yyyy-MM-dd HH:mm:ss
     *
     * @var string
     */
    public $publishEndTime;
    protected $_name = [
        'activityId'       => 'activity_id',
        'activityName'     => 'activity_name',
        'activityStatus'   => 'activity_status',
        'platformType'     => 'platform_type',
        'publishStartTime' => 'publish_start_time',
        'publishEndTime'   => 'publish_end_time',
    ];

    public function validate()
    {
        Model::validateRequired('activityId', $this->activityId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->activityId) {
            $res['activity_id'] = $this->activityId;
        }
        if (null !== $this->activityName) {
            $res['activity_name'] = $this->activityName;
        }
        if (null !== $this->activityStatus) {
            $res['activity_status'] = $this->activityStatus;
        }
        if (null !== $this->platformType) {
            $res['platform_type'] = $this->platformType;
        }
        if (null !== $this->publishStartTime) {
            $res['publish_start_time'] = $this->publishStartTime;
        }
        if (null !== $this->publishEndTime) {
            $res['publish_end_time'] = $this->publishEndTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ActivityBaseInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['activity_id'])) {
            $model->activityId = $map['activity_id'];
        }
        if (isset($map['activity_name'])) {
            $model->activityName = $map['activity_name'];
        }
        if (isset($map['activity_status'])) {
            $model->activityStatus = $map['activity_status'];
        }
        if (isset($map['platform_type'])) {
            $model->platformType = $map['platform_type'];
        }
        if (isset($map['publish_start_time'])) {
            $model->publishStartTime = $map['publish_start_time'];
        }
        if (isset($map['publish_end_time'])) {
            $model->publishEndTime = $map['publish_end_time'];
        }

        return $model;
    }
}
