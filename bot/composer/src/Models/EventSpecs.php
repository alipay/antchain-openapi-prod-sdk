<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class EventSpecs extends Model
{
    // 物模型事件ID
    /**
     * @example 7084744398341955584
     *
     * @var string
     */
    public $eventModelId;

    // 是否返回上链HASH，缺省值按false处理
    /**
     * @example true, false
     *
     * @var bool
     */
    public $returnHash;

    // 业务数据标识
    /**
     * @example ORDER
     *
     * @var string
     */
    public $bizType;

    // 提交日期
    /**
     * @example 2024-08-15
     *
     * @var string
     */
    public $submitDate;

    // 是否是补数据内容
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isRepaired;
    protected $_name = [
        'eventModelId' => 'event_model_id',
        'returnHash'   => 'return_hash',
        'bizType'      => 'biz_type',
        'submitDate'   => 'submit_date',
        'isRepaired'   => 'is_repaired',
    ];

    public function validate()
    {
        Model::validateRequired('eventModelId', $this->eventModelId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->eventModelId) {
            $res['event_model_id'] = $this->eventModelId;
        }
        if (null !== $this->returnHash) {
            $res['return_hash'] = $this->returnHash;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->submitDate) {
            $res['submit_date'] = $this->submitDate;
        }
        if (null !== $this->isRepaired) {
            $res['is_repaired'] = $this->isRepaired;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EventSpecs
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['event_model_id'])) {
            $model->eventModelId = $map['event_model_id'];
        }
        if (isset($map['return_hash'])) {
            $model->returnHash = $map['return_hash'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['submit_date'])) {
            $model->submitDate = $map['submit_date'];
        }
        if (isset($map['is_repaired'])) {
            $model->isRepaired = $map['is_repaired'];
        }

        return $model;
    }
}
