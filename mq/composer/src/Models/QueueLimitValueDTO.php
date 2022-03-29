<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class QueueLimitValueDTO extends Model
{
    // 条件模式
    /**
     * @example { value:_1_, text: _QPS_ }
     *
     * @var string
     */
    public $cMode;

    // 限流域值id(新增限流规则时不填）
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 限流规则id(新增限流规则时不填）
    /**
     * @example rule_id
     *
     * @var int
     */
    public $limitId;

    // 限流域值
    /**
     * @example l_value
     *
     * @var string
     */
    public $lValue;

    // 单位时间
    /**
     * @example u_time
     *
     * @var string
     */
    public $uTime;
    protected $_name = [
        'cMode'   => 'c_mode',
        'id'      => 'id',
        'limitId' => 'limit_id',
        'lValue'  => 'l_value',
        'uTime'   => 'u_time',
    ];

    public function validate()
    {
        Model::validateRequired('cMode', $this->cMode, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('limitId', $this->limitId, true);
        Model::validateRequired('lValue', $this->lValue, true);
        Model::validateRequired('uTime', $this->uTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cMode) {
            $res['c_mode'] = $this->cMode;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->limitId) {
            $res['limit_id'] = $this->limitId;
        }
        if (null !== $this->lValue) {
            $res['l_value'] = $this->lValue;
        }
        if (null !== $this->uTime) {
            $res['u_time'] = $this->uTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueueLimitValueDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['c_mode'])) {
            $model->cMode = $map['c_mode'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['limit_id'])) {
            $model->limitId = $map['limit_id'];
        }
        if (isset($map['l_value'])) {
            $model->lValue = $map['l_value'];
        }
        if (isset($map['u_time'])) {
            $model->uTime = $map['u_time'];
        }

        return $model;
    }
}
