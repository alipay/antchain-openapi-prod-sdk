<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class List_ extends Model
{
    // 记录ID
    /**
     * @example 1100034
     *
     * @var int
     */
    public $id;

    // 活动ID
    /**
     * @example 1100001911234
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

    // 用户ID
    /**
     * @example 2088000098761234
     *
     * @var string
     */
    public $userId;

    // 业务ID
    /**
     * @example 110001011234
     *
     * @var string
     */
    public $bizId;

    // 记录来源：NORMAL（正常发券）/ HAITUN_SYNC（上游补录）
    /**
     * @example NORMAL
     *
     * @var string
     */
    public $recordSource;

    // 创建时间
    /**
     * @example yyyy-MM-dd HH:mm:ss
     *
     * @var string
     */
    public $gmtCreate;

    // 更新时间
    /**
     * @example yyyy-MM-dd HH:mm:ss
     *
     * @var string
     */
    public $gmtModified;
    protected $_name = [
        'id'           => 'id',
        'activityId'   => 'activity_id',
        'activityName' => 'activity_name',
        'userId'       => 'user_id',
        'bizId'        => 'biz_id',
        'recordSource' => 'record_source',
        'gmtCreate'    => 'gmt_create',
        'gmtModified'  => 'gmt_modified',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->activityId) {
            $res['activity_id'] = $this->activityId;
        }
        if (null !== $this->activityName) {
            $res['activity_name'] = $this->activityName;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->recordSource) {
            $res['record_source'] = $this->recordSource;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return List_
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['activity_id'])) {
            $model->activityId = $map['activity_id'];
        }
        if (isset($map['activity_name'])) {
            $model->activityName = $map['activity_name'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['record_source'])) {
            $model->recordSource = $map['record_source'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }

        return $model;
    }
}
