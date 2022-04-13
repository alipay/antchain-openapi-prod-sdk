<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CellInfo extends Model
{
    // cell display name
    /**
     * @example 部署单元A
     *
     * @var string
     */
    public $displayName;
    protected $_name = [
        'displayName' => 'display_name',
    ];

    public function validate()
    {
        Model::validateRequired('displayName', $this->displayName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CellInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }

        return $model;
    }
}
