<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class StateCount extends Model
{
    // state
    /**
     * @example state
     *
     * @var string
     */
    public $state;

    // count
    /**
     * @example
     *
     * @var int
     */
    public $count;
    protected $_name = [
        'state' => 'state',
        'count' => 'count',
    ];

    public function validate()
    {
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('count', $this->count, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StateCount
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }

        return $model;
    }
}
