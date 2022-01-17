<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ApiflowOutputVO extends Model
{
    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // mapping_name
    /**
     * @example mapping_name
     *
     * @var string
     */
    public $mappingName;
    protected $_name = [
        'name'        => 'name',
        'mappingName' => 'mapping_name',
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
        if (null !== $this->mappingName) {
            $res['mapping_name'] = $this->mappingName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiflowOutputVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['mapping_name'])) {
            $model->mappingName = $map['mapping_name'];
        }

        return $model;
    }
}
