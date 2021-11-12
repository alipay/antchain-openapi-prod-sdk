<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class Tenant extends Model
{
    // 租户名
    /**
     * @example antcloud
     *
     * @var string
     */
    public $name;

    // 租户id
    /**
     * @example 00000000001
     *
     * @var string
     */
    public $tanentId;
    protected $_name = [
        'name'     => 'name',
        'tanentId' => 'tanent_id',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->tanentId) {
            $res['tanent_id'] = $this->tanentId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Tenant
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['tanent_id'])) {
            $model->tanentId = $map['tanent_id'];
        }

        return $model;
    }
}
