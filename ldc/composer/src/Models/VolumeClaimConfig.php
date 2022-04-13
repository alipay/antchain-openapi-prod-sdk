<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class VolumeClaimConfig extends Model
{
    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // storage_class
    /**
     * @example storage_class
     *
     * @var string
     */
    public $storageClass;

    // resourceRequirementConfig
    /**
     * @example
     *
     * @var ResourceRequirementConfig
     */
    public $resourceRequirementConfig;
    protected $_name = [
        'name'                      => 'name',
        'storageClass'              => 'storage_class',
        'resourceRequirementConfig' => 'resource_requirement_config',
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
        if (null !== $this->storageClass) {
            $res['storage_class'] = $this->storageClass;
        }
        if (null !== $this->resourceRequirementConfig) {
            $res['resource_requirement_config'] = null !== $this->resourceRequirementConfig ? $this->resourceRequirementConfig->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VolumeClaimConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['storage_class'])) {
            $model->storageClass = $map['storage_class'];
        }
        if (isset($map['resource_requirement_config'])) {
            $model->resourceRequirementConfig = ResourceRequirementConfig::fromMap($map['resource_requirement_config']);
        }

        return $model;
    }
}
