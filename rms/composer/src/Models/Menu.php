<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class Menu extends Model
{
    // id
    /**
     * @example test
     *
     * @var string
     */
    public $id;
    protected $_name = [
        'id' => 'id',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Menu
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }

        return $model;
    }
}
