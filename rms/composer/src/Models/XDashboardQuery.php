<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XDashboardQuery extends Model
{
    /**
     * @example
     *
     * @var string
     */
    public $uuid;

    /**
     * @example
     *
     * @var string
     */
    public $parentUuid;

    /**
     * @example
     *
     * @var string
     */
    public $name;
    protected $_name = [
        'uuid'       => 'uuid',
        'parentUuid' => 'parent_uuid',
        'name'       => 'name',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->uuid) {
            $res['uuid'] = $this->uuid;
        }
        if (null !== $this->parentUuid) {
            $res['parent_uuid'] = $this->parentUuid;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XDashboardQuery
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['uuid'])) {
            $model->uuid = $map['uuid'];
        }
        if (isset($map['parent_uuid'])) {
            $model->parentUuid = $map['parent_uuid'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
