<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class PreferredSchedulingTerm extends Model
{
    // A null or empty node selector term matches no objects
    /**
     * @example
     *
     * @var NodeSelectorTerm
     */
    public $preference;

    // Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
    //
    /**
     * @example
     *
     * @var int
     */
    public $weight;
    protected $_name = [
        'preference' => 'preference',
        'weight'     => 'weight',
    ];

    public function validate()
    {
        Model::validateRequired('weight', $this->weight, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->preference) {
            $res['preference'] = null !== $this->preference ? $this->preference->toMap() : null;
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PreferredSchedulingTerm
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['preference'])) {
            $model->preference = NodeSelectorTerm::fromMap($map['preference']);
        }
        if (isset($map['weight'])) {
            $model->weight = $map['weight'];
        }

        return $model;
    }
}
