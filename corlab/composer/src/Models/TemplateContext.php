<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CORLAB\Models;

use AlibabaCloud\Tea\Model;

class TemplateContext extends Model
{
    // 模版header头
    /**
     * @example bizCode
     *
     * @var string
     */
    public $headName;

    // 字段描述
    /**
     * @example 加密身份id
     *
     * @var string
     */
    public $remark;

    // 是否为必填:REQUIRED,ONE_OF
    /**
     * @example ONE_OF
     *
     * @var string
     */
    public $requireType;
    protected $_name = [
        'headName'    => 'head_name',
        'remark'      => 'remark',
        'requireType' => 'require_type',
    ];

    public function validate()
    {
        Model::validateRequired('headName', $this->headName, true);
        Model::validateRequired('requireType', $this->requireType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->headName) {
            $res['head_name'] = $this->headName;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->requireType) {
            $res['require_type'] = $this->requireType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TemplateContext
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['head_name'])) {
            $model->headName = $map['head_name'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }
        if (isset($map['require_type'])) {
            $model->requireType = $map['require_type'];
        }

        return $model;
    }
}
