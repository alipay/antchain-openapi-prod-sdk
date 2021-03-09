<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class Zone extends Model
{
    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // identity
    /**
     * @example identity
     *
     * @var string
     */
    public $identity;

    // description
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // instanceStatus: AVAILABLE  UNAVAILABLE  RETIRED  DELETED
    /**
     * @example AVAILABLE
     *
     * @var string
     */
    public $instancestatus;

    // region name
    /**
     * @example shanghai
     *
     * @var string
     */
    public $region;

    // properties
    /**
     * @example properties
     *
     * @var Property[]
     */
    public $properties;
    protected $_name = [
        'name'           => 'name',
        'identity'       => 'identity',
        'description'    => 'description',
        'instancestatus' => 'instancestatus',
        'region'         => 'region',
        'properties'     => 'properties',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('identity', $this->identity, true);
        Model::validateRequired('instancestatus', $this->instancestatus, true);
        Model::validateRequired('region', $this->region, true);
        Model::validateRequired('properties', $this->properties, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->instancestatus) {
            $res['instancestatus'] = $this->instancestatus;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
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
     * @return Zone
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['identity'])) {
            $model->identity = $map['identity'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['instancestatus'])) {
            $model->instancestatus = $map['instancestatus'];
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
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
