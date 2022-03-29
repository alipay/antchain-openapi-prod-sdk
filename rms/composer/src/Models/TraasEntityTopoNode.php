<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class TraasEntityTopoNode extends Model
{
    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // field
    /**
     * @example field
     *
     * @var string
     */
    public $field;
    protected $_name = [
        'name'  => 'name',
        'field' => 'field',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('field', $this->field, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->field) {
            $res['field'] = $this->field;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TraasEntityTopoNode
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['field'])) {
            $model->field = $map['field'];
        }

        return $model;
    }
}
