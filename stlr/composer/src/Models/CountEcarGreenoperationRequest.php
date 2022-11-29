<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class CountEcarGreenoperationRequest extends Model
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

    // 绿色行为统计频率，可选值：
    // Monthly(分月统计),
    // Daily(按每日统计)
    //
    /**
     * @var string
     */
    public $statisticFrequence;

    // 统计数据的发生起始时间，格式应如：2021-07-21 12:11:11
    /**
     * @var string
     */
    public $occurrenceStartTime;

    // 统计数据的发生结束时间，格式应如：2021-07-21 12:11:11，不传为当日最近时间
    /**
     * @var string
     */
    public $occurrenceEndTime;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'statisticFrequence'  => 'statistic_frequence',
        'occurrenceStartTime' => 'occurrence_start_time',
        'occurrenceEndTime'   => 'occurrence_end_time',
    ];

    public function validate()
    {
        Model::validateRequired('statisticFrequence', $this->statisticFrequence, true);
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
        if (null !== $this->statisticFrequence) {
            $res['statistic_frequence'] = $this->statisticFrequence;
        }
        if (null !== $this->occurrenceStartTime) {
            $res['occurrence_start_time'] = $this->occurrenceStartTime;
        }
        if (null !== $this->occurrenceEndTime) {
            $res['occurrence_end_time'] = $this->occurrenceEndTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CountEcarGreenoperationRequest
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
        if (isset($map['statistic_frequence'])) {
            $model->statisticFrequence = $map['statistic_frequence'];
        }
        if (isset($map['occurrence_start_time'])) {
            $model->occurrenceStartTime = $map['occurrence_start_time'];
        }
        if (isset($map['occurrence_end_time'])) {
            $model->occurrenceEndTime = $map['occurrence_end_time'];
        }

        return $model;
    }
}
