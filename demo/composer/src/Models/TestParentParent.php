<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class TestParentParent extends Model
{
    // fff
    /**
     * @example fff
     *
     * @var TestParent
     */
    public $ssss;
    protected $_name = [
        'ssss' => 'ssss',
    ];

    public function validate()
    {
        Model::validateRequired('ssss', $this->ssss, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ssss) {
            $res['ssss'] = null !== $this->ssss ? $this->ssss->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TestParentParent
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ssss'])) {
            $model->ssss = TestParent::fromMap($map['ssss']);
        }

        return $model;
    }
}
