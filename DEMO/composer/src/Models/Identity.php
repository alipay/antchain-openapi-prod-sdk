<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class Identity extends Model
{
    // ak
    /**
     * @example test_0efe42463f8f
     *
     * @var string
     */
    public $ak;
    protected $_name = [
        'ak' => 'ak',
    ];

    public function validate()
    {
        Model::validateRequired('ak', $this->ak, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ak) {
            $res['ak'] = $this->ak;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Identity
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ak'])) {
            $model->ak = $map['ak'];
        }

        return $model;
    }
}
