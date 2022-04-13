<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class SidecarOperationTask extends Model
{
    // 业务流水号
    /**
     * @example biz12345
     *
     * @var string
     */
    public $bizId;

    // 操作人
    /**
     * @example 张三
     *
     * @var string
     */
    public $operator;

    // 名称
    /**
     * @example sidecar注入批次 0
     *
     * @var string
     */
    public $title;

    // sidecar运维内容上下文信息
    /**
     * @example
     *
     * @var SidecarOperationTaskContext
     */
    public $context;
    protected $_name = [
        'bizId'    => 'biz_id',
        'operator' => 'operator',
        'title'    => 'title',
        'context'  => 'context',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('context', $this->context, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->context) {
            $res['context'] = null !== $this->context ? $this->context->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SidecarOperationTask
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['context'])) {
            $model->context = SidecarOperationTaskContext::fromMap($map['context']);
        }

        return $model;
    }
}
