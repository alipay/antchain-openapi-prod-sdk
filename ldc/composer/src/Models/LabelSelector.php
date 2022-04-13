<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class LabelSelector extends Model
{
    // matchExpressions is a list of label selector requirements.
    /**
     * @example
     *
     * @var LabelSelectorRequirement[]
     */
    public $matchExpressions;

    // matchLabels is a map of {key,value} pairs
    /**
     * @example
     *
     * @var Label[]
     */
    public $matchLabels;
    protected $_name = [
        'matchExpressions' => 'match_expressions',
        'matchLabels'      => 'match_labels',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->matchExpressions) {
            $res['match_expressions'] = [];
            if (null !== $this->matchExpressions && \is_array($this->matchExpressions)) {
                $n = 0;
                foreach ($this->matchExpressions as $item) {
                    $res['match_expressions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->matchLabels) {
            $res['match_labels'] = [];
            if (null !== $this->matchLabels && \is_array($this->matchLabels)) {
                $n = 0;
                foreach ($this->matchLabels as $item) {
                    $res['match_labels'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LabelSelector
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['match_expressions'])) {
            if (!empty($map['match_expressions'])) {
                $model->matchExpressions = [];
                $n                       = 0;
                foreach ($map['match_expressions'] as $item) {
                    $model->matchExpressions[$n++] = null !== $item ? LabelSelectorRequirement::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['match_labels'])) {
            if (!empty($map['match_labels'])) {
                $model->matchLabels = [];
                $n                  = 0;
                foreach ($map['match_labels'] as $item) {
                    $model->matchLabels[$n++] = null !== $item ? Label::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
