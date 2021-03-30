<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class FlowInfo extends Model
{
    // 备注
    /**
     * @example comment
     *
     * @var string
     */
    public $comment;

    // 操作时间
    /**
     * @example operateTime
     *
     * @var string
     */
    public $operateTime;

    // 操作人
    /**
     * @example operator
     *
     * @var string
     */
    public $operator;

    // 操作状态【NONE,WAITING,AGREED,REJECTED,CANCELED,ALL】
    /**
     * @example WAITING
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'comment'     => 'comment',
        'operateTime' => 'operate_time',
        'operator'    => 'operator',
        'status'      => 'status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->comment) {
            $res['comment'] = $this->comment;
        }
        if (null !== $this->operateTime) {
            $res['operate_time'] = $this->operateTime;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FlowInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['comment'])) {
            $model->comment = $map['comment'];
        }
        if (isset($map['operate_time'])) {
            $model->operateTime = $map['operate_time'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
