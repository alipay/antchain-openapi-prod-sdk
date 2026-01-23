<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class TestParent extends Model
{
    // d
    /**
     * @example d
     *
     * @var Test
     */
    public $bbb;
    protected $_name = [
        'bbb' => 'bbb',
    ];

    public function validate()
    {
        Model::validateRequired('bbb', $this->bbb, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bbb) {
            $res['bbb'] = null !== $this->bbb ? $this->bbb->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TestParent
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['bbb'])) {
            $model->bbb = Test::fromMap($map['bbb']);
        }

        return $model;
    }
}
