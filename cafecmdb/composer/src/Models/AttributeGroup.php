<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAFECMDB\Models;

use AlibabaCloud\Tea\Model;

class AttributeGroup extends Model
{
    // id
    /**
     * @example id
     *
     * @var string
     */
    public $uniqueId;

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

    // display_properties
    /**
     * @example {"key":"value"}
     *
     * @var string
     */
    public $displayProperties;
    protected $_name = [
        'uniqueId'          => 'unique_id',
        'name'              => 'name',
        'displayName'       => 'display_name',
        'displayProperties' => 'display_properties',
    ];

    public function validate()
    {
        Model::validateRequired('uniqueId', $this->uniqueId, true);
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->uniqueId) {
            $res['unique_id'] = $this->uniqueId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->displayProperties) {
            $res['display_properties'] = $this->displayProperties;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AttributeGroup
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['unique_id'])) {
            $model->uniqueId = $map['unique_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['display_properties'])) {
            $model->displayProperties = $map['display_properties'];
        }

        return $model;
    }
}
