<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DiskSpec extends Model
{
    // id
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $id;

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

    // iaas id
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $iaasId;

    // providerId
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $providerId;

    // iaasType
    /**
     * @example Aliyun
     *
     * @var string
     */
    public $iaasType;

    // enable
    /**
     * @example true, false
     *
     * @var bool
     */
    public $enable;

    // minSize
    /**
     * @example
     *
     * @var int
     */
    public $minSize;

    // maxSize
    /**
     * @example
     *
     * @var int
     */
    public $maxSize;
    protected $_name = [
        'id'          => 'id',
        'name'        => 'name',
        'description' => 'description',
        'iaasId'      => 'iaas_id',
        'providerId'  => 'provider_id',
        'iaasType'    => 'iaas_type',
        'enable'      => 'enable',
        'minSize'     => 'min_size',
        'maxSize'     => 'max_size',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->iaasId) {
            $res['iaas_id'] = $this->iaasId;
        }
        if (null !== $this->providerId) {
            $res['provider_id'] = $this->providerId;
        }
        if (null !== $this->iaasType) {
            $res['iaas_type'] = $this->iaasType;
        }
        if (null !== $this->enable) {
            $res['enable'] = $this->enable;
        }
        if (null !== $this->minSize) {
            $res['min_size'] = $this->minSize;
        }
        if (null !== $this->maxSize) {
            $res['max_size'] = $this->maxSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DiskSpec
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['iaas_id'])) {
            $model->iaasId = $map['iaas_id'];
        }
        if (isset($map['provider_id'])) {
            $model->providerId = $map['provider_id'];
        }
        if (isset($map['iaas_type'])) {
            $model->iaasType = $map['iaas_type'];
        }
        if (isset($map['enable'])) {
            $model->enable = $map['enable'];
        }
        if (isset($map['min_size'])) {
            $model->minSize = $map['min_size'];
        }
        if (isset($map['max_size'])) {
            $model->maxSize = $map['max_size'];
        }

        return $model;
    }
}
