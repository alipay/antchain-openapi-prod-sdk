<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class StackExpression extends Model
{
    // states
    /**
     * @example states
     *
     * @var StackState[]
     */
    public $states;

    // andor
    /**
     * @example true, false
     *
     * @var bool
     */
    public $andor;
    protected $_name = [
        'states' => 'states',
        'andor'  => 'andor',
    ];

    public function validate()
    {
        Model::validateRequired('states', $this->states, true);
        Model::validateRequired('andor', $this->andor, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->states) {
            $res['states'] = [];
            if (null !== $this->states && \is_array($this->states)) {
                $n = 0;
                foreach ($this->states as $item) {
                    $res['states'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->andor) {
            $res['andor'] = $this->andor;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StackExpression
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['states'])) {
            if (!empty($map['states'])) {
                $model->states = [];
                $n             = 0;
                foreach ($map['states'] as $item) {
                    $model->states[$n++] = null !== $item ? StackState::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['andor'])) {
            $model->andor = $map['andor'];
        }

        return $model;
    }
}
