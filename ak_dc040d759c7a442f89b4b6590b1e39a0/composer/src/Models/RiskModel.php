<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models;

use AlibabaCloud\Tea\Model;

class RiskModel extends Model
{
    // 标签名称
    /**
     * @example ekyt_risk_tag_100
     *
     * @var string
     */
    public $modelName;

    // 风险值
    /**
     * @example 1
     *
     * @var string
     */
    public $modelValue;

    // 风险标签描述
    /**
     * @example 中风险
     *
     * @var string
     */
    public $modelComment;
    protected $_name = [
        'modelName'    => 'model_name',
        'modelValue'   => 'model_value',
        'modelComment' => 'model_comment',
    ];

    public function validate()
    {
        Model::validateRequired('modelName', $this->modelName, true);
        Model::validateRequired('modelValue', $this->modelValue, true);
        Model::validateRequired('modelComment', $this->modelComment, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->modelName) {
            $res['model_name'] = $this->modelName;
        }
        if (null !== $this->modelValue) {
            $res['model_value'] = $this->modelValue;
        }
        if (null !== $this->modelComment) {
            $res['model_comment'] = $this->modelComment;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RiskModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['model_name'])) {
            $model->modelName = $map['model_name'];
        }
        if (isset($map['model_value'])) {
            $model->modelValue = $map['model_value'];
        }
        if (isset($map['model_comment'])) {
            $model->modelComment = $map['model_comment'];
        }

        return $model;
    }
}
