<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CellGroup extends Model
{
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

    // description
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // properties
    /**
     * @example properties
     *
     * @var Property[]
     */
    public $properties;

    // instancestatus
    /**
     * @example instancestatus
     *
     * @var string
     */
    public $instancestatus;
    protected $_name = [
        'identity'       => 'identity',
        'name'           => 'name',
        'description'    => 'description',
        'properties'     => 'properties',
        'instancestatus' => 'instancestatus',
    ];

    public function validate()
    {
        Model::validateRequired('identity', $this->identity, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('instancestatus', $this->instancestatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->properties) {
            $res['properties'] = [];
            if (null !== $this->properties && \is_array($this->properties)) {
                $n = 0;
                foreach ($this->properties as $item) {
                    $res['properties'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->instancestatus) {
            $res['instancestatus'] = $this->instancestatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CellGroup
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['identity'])) {
            $model->identity = $map['identity'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['properties'])) {
            if (!empty($map['properties'])) {
                $model->properties = [];
                $n                 = 0;
                foreach ($map['properties'] as $item) {
                    $model->properties[$n++] = null !== $item ? Property::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['instancestatus'])) {
            $model->instancestatus = $map['instancestatus'];
        }

        return $model;
    }
}
