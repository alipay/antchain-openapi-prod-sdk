<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ComputerParam extends Model
{
    // description
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // image_id
    /**
     * @example image_id
     *
     * @var string
     */
    public $imageId;

    // instance_type
    /**
     * @example instance_type
     *
     * @var string
     */
    public $instanceType;

    // region_id
    /**
     * @example region_id
     *
     * @var string
     */
    public $regionId;

    // security_group_id
    /**
     * @example security_group_id
     *
     * @var string
     */
    public $securityGroupId;

    // instance_name
    /**
     * @example instance_name
     *
     * @var string
     */
    public $instanceName;

    // zone_id
    /**
     * @example zone_id
     *
     * @var string
     */
    public $zoneId;
    protected $_name = [
        'description'     => 'description',
        'name'            => 'name',
        'imageId'         => 'image_id',
        'instanceType'    => 'instance_type',
        'regionId'        => 'region_id',
        'securityGroupId' => 'security_group_id',
        'instanceName'    => 'instance_name',
        'zoneId'          => 'zone_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->imageId) {
            $res['image_id'] = $this->imageId;
        }
        if (null !== $this->instanceType) {
            $res['instance_type'] = $this->instanceType;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->securityGroupId) {
            $res['security_group_id'] = $this->securityGroupId;
        }
        if (null !== $this->instanceName) {
            $res['instance_name'] = $this->instanceName;
        }
        if (null !== $this->zoneId) {
            $res['zone_id'] = $this->zoneId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ComputerParam
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['image_id'])) {
            $model->imageId = $map['image_id'];
        }
        if (isset($map['instance_type'])) {
            $model->instanceType = $map['instance_type'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['security_group_id'])) {
            $model->securityGroupId = $map['security_group_id'];
        }
        if (isset($map['instance_name'])) {
            $model->instanceName = $map['instance_name'];
        }
        if (isset($map['zone_id'])) {
            $model->zoneId = $map['zone_id'];
        }

        return $model;
    }
}
