<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class InstanceProgressInfo extends Model
{
    // 操作人
    /**
     * @example 张三
     *
     * @var string
     */
    public $operator;

    // 操作时间
    /**
     * @example 1690166971465
     *
     * @var int
     */
    public $time;

    // 合约部署进度类型
    /**
     * @example SERVICE_START
     *
     * @var string
     */
    public $type;

    // 部署状态
    /**
     * @example INIT
     *
     * @var string
     */
    public $status;

    // 合约部署进度名称
    /**
     * @example 部署合约服务
     *
     * @var string
     */
    public $typeName;

    // 额外参数
    /**
     * @example {json}
     *
     * @var string
     */
    public $data;
    protected $_name = [
        'operator' => 'operator',
        'time'     => 'time',
        'type'     => 'type',
        'status'   => 'status',
        'typeName' => 'type_name',
        'data'     => 'data',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->time) {
            $res['time'] = $this->time;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->typeName) {
            $res['type_name'] = $this->typeName;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InstanceProgressInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['time'])) {
            $model->time = $map['time'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['type_name'])) {
            $model->typeName = $map['type_name'];
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }

        return $model;
    }
}
