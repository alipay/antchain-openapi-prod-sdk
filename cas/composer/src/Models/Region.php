<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class Region extends Model
{
    // description
    /**
     * @example shanghai
     *
     * @var string
     */
    public $description;

    // identity
    /**
     * @example cn-shanghai
     *
     * @var string
     */
    public $identity;

    // instanceStatus: AVAILABLE  UNAVAILABLE  RETIRED  DELETED
    /**
     * @example AVAILABLE
     *
     * @var string
     */
    public $instancestatus;

    // name
    /**
     * @example shanghai
     *
     * @var string
     */
    public $name;

    // properties
    /**
     * @example
     *
     * @var Property[]
     */
    public $properties;
    protected $_name = [
        'description'    => 'description',
        'identity'       => 'identity',
        'instancestatus' => 'instancestatus',
        'name'           => 'name',
        'properties'     => 'properties',
    ];

    public function validate()
    {
        Model::validateRequired('identity', $this->identity, true);
        Model::validateRequired('instancestatus', $this->instancestatus, true);
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->instancestatus) {
            $res['instancestatus'] = $this->instancestatus;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Region
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['identity'])) {
            $model->identity = $map['identity'];
        }
        if (isset($map['instancestatus'])) {
            $model->instancestatus = $map['instancestatus'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
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

        return $model;
    }
}
