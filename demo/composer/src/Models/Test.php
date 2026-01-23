<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

/**
 * @internal
 * @coversNothing
 */
class Test extends Model
{
    // d
    /**
     * @example d
     *
     * @var string
     */
    public $a;
    protected $_name = [
        'a' => 'a',
    ];

    public function validate()
    {
        Model::validateRequired('a', $this->a, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->a) {
            $res['a'] = $this->a;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Test
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['a'])) {
            $model->a = $map['a'];
        }

        return $model;
    }
}
