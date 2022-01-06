<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class Resource extends Model
{
    /**
     * @example undefined
     *
     * @var string
     */
    public $appName;

    /**
     * @example undefined
     *
     * @var Attribute[]
     */
    public $attributes;

    /**
     * @example undefined
     *
     * @var string
     */
    public $name;

    /**
     * @example undefined
     *
     * @var string
     */
    public $region;

    /**
     * @example undefined
     *
     * @var string
     */
    public $resourceId;
    protected $_name = [
        'appName'    => 'app_name',
        'attributes' => 'attributes',
        'name'       => 'name',
        'region'     => 'region',
        'resourceId' => 'resource_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->attributes) {
            $res['attributes'] = [];
            if (null !== $this->attributes && \is_array($this->attributes)) {
                $n = 0;
                foreach ($this->attributes as $item) {
                    $res['attributes'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return resource
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['attributes'])) {
            if (!empty($map['attributes'])) {
                $model->attributes = [];
                $n                 = 0;
                foreach ($map['attributes'] as $item) {
                    $model->attributes[$n++] = null !== $item ? Attribute::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }

        return $model;
    }
}
