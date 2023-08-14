<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class SubmitHotspotTaskRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 媒体类型
    /**
     * @var string[]
     */
    public $mediaSubTypes;

    // 任务过期时间,单位秒
    /**
     * @var int
     */
    public $expiredTime;

    // 排序方式： 正序(+)、倒序(-)
    /**
     * @var string
     */
    public $sortByDirection;

    // 排序字段
    /**
     * @var string
     */
    public $sortBy;

    // 爬取开始时间过滤
    /**
     * @var int
     */
    public $crawlerTimeStartFilter;

    // 爬取结束时间过滤
    /**
     * @var int
     */
    public $crawlerTimeEndFilter;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'mediaSubTypes'          => 'media_sub_types',
        'expiredTime'            => 'expired_time',
        'sortByDirection'        => 'sort_by_direction',
        'sortBy'                 => 'sort_by',
        'crawlerTimeStartFilter' => 'crawler_time_start_filter',
        'crawlerTimeEndFilter'   => 'crawler_time_end_filter',
    ];

    public function validate()
    {
        Model::validateRequired('mediaSubTypes', $this->mediaSubTypes, true);
        Model::validateRequired('expiredTime', $this->expiredTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->mediaSubTypes) {
            $res['media_sub_types'] = $this->mediaSubTypes;
        }
        if (null !== $this->expiredTime) {
            $res['expired_time'] = $this->expiredTime;
        }
        if (null !== $this->sortByDirection) {
            $res['sort_by_direction'] = $this->sortByDirection;
        }
        if (null !== $this->sortBy) {
            $res['sort_by'] = $this->sortBy;
        }
        if (null !== $this->crawlerTimeStartFilter) {
            $res['crawler_time_start_filter'] = $this->crawlerTimeStartFilter;
        }
        if (null !== $this->crawlerTimeEndFilter) {
            $res['crawler_time_end_filter'] = $this->crawlerTimeEndFilter;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitHotspotTaskRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['media_sub_types'])) {
            if (!empty($map['media_sub_types'])) {
                $model->mediaSubTypes = $map['media_sub_types'];
            }
        }
        if (isset($map['expired_time'])) {
            $model->expiredTime = $map['expired_time'];
        }
        if (isset($map['sort_by_direction'])) {
            $model->sortByDirection = $map['sort_by_direction'];
        }
        if (isset($map['sort_by'])) {
            $model->sortBy = $map['sort_by'];
        }
        if (isset($map['crawler_time_start_filter'])) {
            $model->crawlerTimeStartFilter = $map['crawler_time_start_filter'];
        }
        if (isset($map['crawler_time_end_filter'])) {
            $model->crawlerTimeEndFilter = $map['crawler_time_end_filter'];
        }

        return $model;
    }
}
