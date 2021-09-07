<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GOODSCHAIN\Models;

use AlibabaCloud\Tea\Model;

class TraceInfoDTO extends Model
{
    // 操作描述
    /**
     * @example 销毁
     *
     * @var string
     */
    public $operateTypeDesc;

    // 操作时间，时间戳
    /**
     * @example 123098733
     *
     * @var int
     */
    public $operateTime;

    // 操作人id
    /**
     * @example 123098
     *
     * @var string
     */
    public $operatorId;

    // 操作人名称
    /**
     * @example 张三
     *
     * @var string
     */
    public $operatorName;

    // 操作内容
    /**
     * @example 销毁xxx酒
     *
     * @var string
     */
    public $content;
    protected $_name = [
        'operateTypeDesc' => 'operate_type_desc',
        'operateTime'     => 'operate_time',
        'operatorId'      => 'operator_id',
        'operatorName'    => 'operator_name',
        'content'         => 'content',
    ];

    public function validate()
    {
        Model::validateRequired('operateTypeDesc', $this->operateTypeDesc, true);
        Model::validateRequired('operateTime', $this->operateTime, true);
        Model::validateRequired('operatorId', $this->operatorId, true);
        Model::validateRequired('operatorName', $this->operatorName, true);
        Model::validateRequired('content', $this->content, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->operateTypeDesc) {
            $res['operate_type_desc'] = $this->operateTypeDesc;
        }
        if (null !== $this->operateTime) {
            $res['operate_time'] = $this->operateTime;
        }
        if (null !== $this->operatorId) {
            $res['operator_id'] = $this->operatorId;
        }
        if (null !== $this->operatorName) {
            $res['operator_name'] = $this->operatorName;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TraceInfoDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['operate_type_desc'])) {
            $model->operateTypeDesc = $map['operate_type_desc'];
        }
        if (isset($map['operate_time'])) {
            $model->operateTime = $map['operate_time'];
        }
        if (isset($map['operator_id'])) {
            $model->operatorId = $map['operator_id'];
        }
        if (isset($map['operator_name'])) {
            $model->operatorName = $map['operator_name'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }

        return $model;
    }
}
