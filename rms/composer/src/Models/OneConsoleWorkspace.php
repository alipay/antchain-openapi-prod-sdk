<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class OneConsoleWorkspace extends Model
{
    // ws id
    /**
     * @example ws id
     *
     * @var string
     */
    public $id;

    // identity
    /**
     * @example identity
     *
     * @var string
     */
    public $identity;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;
    protected $_name = [
        'id'       => 'id',
        'identity' => 'identity',
        'name'     => 'name',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('identity', $this->identity, true);
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OneConsoleWorkspace
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['identity'])) {
            $model->identity = $map['identity'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
