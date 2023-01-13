<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ChainInsightStatisticTask extends Model
{
    // 统计任务ID
    /**
     * @example yurjzxc
     *
     * @var string
     */
    public $id;

    // 统计任务类型
    /**
     * @example ContractStatistic
     *
     * @var string
     */
    public $type;

    // 所属链ID
    /**
     * @example 3bb5caa2df9946abb8d16f3a14ec11d4
     *
     * @var string
     */
    public $bizId;

    // 统计的链上合约地址
    /**
     * @example 605f39005ab0c064243b743960e304b5edb78f37d155b0da5fb83ef73311a3c4
     *
     * @var string
     */
    public $address;

    // 任务产出的指标信息
    /**
     * @example
     *
     * @var ChainInsightStatisticMetricMeta[]
     */
    public $metrics;

    // 任务创建时间，毫秒时间戳
    /**
     * @example 1666263972000
     *
     * @var int
     */
    public $createTime;

    // 任务修改时间，毫秒时间戳
    /**
     * @example 1666263972000
     *
     * @var int
     */
    public $modifyTime;

    // 任务状态：Running： 运行中； Paused: 已暂停
    /**
     * @example Running
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'id'         => 'id',
        'type'       => 'type',
        'bizId'      => 'biz_id',
        'address'    => 'address',
        'metrics'    => 'metrics',
        'createTime' => 'create_time',
        'modifyTime' => 'modify_time',
        'status'     => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('metrics', $this->metrics, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->metrics) {
            $res['metrics'] = [];
            if (null !== $this->metrics && \is_array($this->metrics)) {
                $n = 0;
                foreach ($this->metrics as $item) {
                    $res['metrics'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->modifyTime) {
            $res['modify_time'] = $this->modifyTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainInsightStatisticTask
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['metrics'])) {
            if (!empty($map['metrics'])) {
                $model->metrics = [];
                $n              = 0;
                foreach ($map['metrics'] as $item) {
                    $model->metrics[$n++] = null !== $item ? ChainInsightStatisticMetricMeta::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['modify_time'])) {
            $model->modifyTime = $map['modify_time'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
