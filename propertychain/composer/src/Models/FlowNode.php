<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class FlowNode extends Model
{
    // 序号
    /**
     * @example 1
     *
     * @var int
     */
    public $index;

    // 操作类型【CREATE：创建入库申请，AUDIT：保管人审核，ALLOCATE：审核拒绝，STORAGE：入库，COMPLETE：完成】
    //
    //
    //
    /**
     * @example CREATE
     *
     * @var string
     */
    public $type;

    // 流程节点状态【 PASS：成功，FAIL：失败，ACTIVE：激活，INACTIVE：未激活】
    /**
     * @example PASS
     *
     * @var string
     */
    public $state;

    // 操作时间，单位：ms
    /**
     * @example 4343215412341
     *
     * @var int
     */
    public $operateTime;

    // 备注
    /**
     * @example comment
     *
     * @var string
     */
    public $comment;
    protected $_name = [
        'index'       => 'index',
        'type'        => 'type',
        'state'       => 'state',
        'operateTime' => 'operate_time',
        'comment'     => 'comment',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->index) {
            $res['index'] = $this->index;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->operateTime) {
            $res['operate_time'] = $this->operateTime;
        }
        if (null !== $this->comment) {
            $res['comment'] = $this->comment;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FlowNode
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['index'])) {
            $model->index = $map['index'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['operate_time'])) {
            $model->operateTime = $map['operate_time'];
        }
        if (isset($map['comment'])) {
            $model->comment = $map['comment'];
        }

        return $model;
    }
}
