<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class TraasEntityFieldDto extends Model
{
    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // display_name
    /**
     * @example display_name
     *
     * @var string
     */
    public $displayName;
    protected $_name = [
        'name'        => 'name',
        'displayName' => 'display_name',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('displayName', $this->displayName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TraasEntityFieldDto
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }

        return $model;
    }
}
