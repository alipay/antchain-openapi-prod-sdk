<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class AirInfoCodes extends Model
{
    // infoCode
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // infoCode描述
    /**
     * @example xxx
     *
     * @var string
     */
    public $description;
    protected $_name = [
        'name'        => 'name',
        'description' => 'description',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AirInfoCodes
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }

        return $model;
    }
}
