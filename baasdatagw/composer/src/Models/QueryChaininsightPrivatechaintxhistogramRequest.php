<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class QueryChaininsightPrivatechaintxhistogramRequest extends Model
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

    // 联盟ID
    /**
     * @var string
     */
    public $unionId;

    // 链ID列表
    /**
     * @var string[]
     */
    public $bizIds;

    // 开始时间戳
    /**
     * @var int
     */
    public $startTime;

    // 结束时间戳
    /**
     * @var int
     */
    public $endTime;

    // 点集类型，枚举：Amount、Increment、GrowthRate，默认为Amount
    /**
     * @var string
     */
    public $type;

    // 统计间隔
    /**
     * @var int
     */
    public $interval;

    // 枚举值，统计间隔的时间单位：Second / Hour / Day / Month / Year
    /**
     * @var string
     */
    public $intervalUnit;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'unionId'           => 'union_id',
        'bizIds'            => 'biz_ids',
        'startTime'         => 'start_time',
        'endTime'           => 'end_time',
        'type'              => 'type',
        'interval'          => 'interval',
        'intervalUnit'      => 'interval_unit',
    ];

    public function validate()
    {
        Model::validateRequired('unionId', $this->unionId, true);
        Model::validateRequired('bizIds', $this->bizIds, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
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
        if (null !== $this->unionId) {
            $res['union_id'] = $this->unionId;
        }
        if (null !== $this->bizIds) {
            $res['biz_ids'] = $this->bizIds;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->interval) {
            $res['interval'] = $this->interval;
        }
        if (null !== $this->intervalUnit) {
            $res['interval_unit'] = $this->intervalUnit;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryChaininsightPrivatechaintxhistogramRequest
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
        if (isset($map['union_id'])) {
            $model->unionId = $map['union_id'];
        }
        if (isset($map['biz_ids'])) {
            if (!empty($map['biz_ids'])) {
                $model->bizIds = $map['biz_ids'];
            }
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['interval'])) {
            $model->interval = $map['interval'];
        }
        if (isset($map['interval_unit'])) {
            $model->intervalUnit = $map['interval_unit'];
        }

        return $model;
    }
}
