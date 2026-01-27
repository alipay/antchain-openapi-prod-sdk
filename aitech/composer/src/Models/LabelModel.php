<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class LabelModel extends Model
{
    // 一级标签
    /**
     * @example 正常
     *
     * @var string
     */
    public $label;

    // 子标签
    /**
     * @example
     *
     * @var SubLabelModel[]
     */
    public $subLabels;
    protected $_name = [
        'label'     => 'label',
        'subLabels' => 'sub_labels',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->label) {
            $res['label'] = $this->label;
        }
        if (null !== $this->subLabels) {
            $res['sub_labels'] = [];
            if (null !== $this->subLabels && \is_array($this->subLabels)) {
                $n = 0;
                foreach ($this->subLabels as $item) {
                    $res['sub_labels'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LabelModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['label'])) {
            $model->label = $map['label'];
        }
        if (isset($map['sub_labels'])) {
            if (!empty($map['sub_labels'])) {
                $model->subLabels = [];
                $n                = 0;
                foreach ($map['sub_labels'] as $item) {
                    $model->subLabels[$n++] = null !== $item ? SubLabelModel::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
