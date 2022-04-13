<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class PodAffinityTerm extends Model
{
    // labelSelctor
    /**
     * @example
     *
     * @var LabelSelector
     */
    public $labelSelector;

    // namespaces
    /**
     * @example
     *
     * @var string[]
     */
    public $namespaces;
    protected $_name = [
        'labelSelector' => 'label_selector',
        'namespaces'    => 'namespaces',
    ];

    public function validate()
    {
        Model::validateRequired('labelSelector', $this->labelSelector, true);
        Model::validateRequired('namespaces', $this->namespaces, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->labelSelector) {
            $res['label_selector'] = null !== $this->labelSelector ? $this->labelSelector->toMap() : null;
        }
        if (null !== $this->namespaces) {
            $res['namespaces'] = $this->namespaces;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PodAffinityTerm
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['label_selector'])) {
            $model->labelSelector = LabelSelector::fromMap($map['label_selector']);
        }
        if (isset($map['namespaces'])) {
            if (!empty($map['namespaces'])) {
                $model->namespaces = $map['namespaces'];
            }
        }

        return $model;
    }
}
