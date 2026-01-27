<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class FieldModel extends Model
{
    // 领域一级标签
    /**
     * @example 金融
     *
     * @var string
     */
    public $fieldCategory;

    // 领域二级标签
    /**
     * @example 金融
     *
     * @var string
     */
    public $fieldLabel;

    // 领域一级标签的等级分数
    /**
     * @example
     *
     * @var int
     */
    public $fieldScore;
    protected $_name = [
        'fieldCategory' => 'field_category',
        'fieldLabel'    => 'field_label',
        'fieldScore'    => 'field_score',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fieldCategory) {
            $res['field_category'] = $this->fieldCategory;
        }
        if (null !== $this->fieldLabel) {
            $res['field_label'] = $this->fieldLabel;
        }
        if (null !== $this->fieldScore) {
            $res['field_score'] = $this->fieldScore;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FieldModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['field_category'])) {
            $model->fieldCategory = $map['field_category'];
        }
        if (isset($map['field_label'])) {
            $model->fieldLabel = $map['field_label'];
        }
        if (isset($map['field_score'])) {
            $model->fieldScore = $map['field_score'];
        }

        return $model;
    }
}
