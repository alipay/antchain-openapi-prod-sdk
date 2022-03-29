<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class SpiConfig extends Model
{
    // end_point或token
    /**
     * @example http://1.1.1.1/app
     *
     * @var string
     */
    public $endPoint;

    // 创建时间
    /**
     * @example 2018-10-10 10:10:00
     *
     * @var string
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example 2018-10-10 10:10:00
     *
     * @var string
     */
    public $gmtModified;

    // last_editor
    /**
     * @example 1
     *
     * @var string
     */
    public $lastEditor;

    // 字段格式
    /**
     * @example CamelCase
     *
     * @var string
     */
    public $fieldNamingStrategy;

    // 云厂商类型
    /**
     * @example alicloud
     *
     * @var string
     */
    public $cloudVendorType;
    protected $_name = [
        'endPoint'            => 'end_point',
        'gmtCreate'           => 'gmt_create',
        'gmtModified'         => 'gmt_modified',
        'lastEditor'          => 'last_editor',
        'fieldNamingStrategy' => 'field_naming_strategy',
        'cloudVendorType'     => 'cloud_vendor_type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->endPoint) {
            $res['end_point'] = $this->endPoint;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->lastEditor) {
            $res['last_editor'] = $this->lastEditor;
        }
        if (null !== $this->fieldNamingStrategy) {
            $res['field_naming_strategy'] = $this->fieldNamingStrategy;
        }
        if (null !== $this->cloudVendorType) {
            $res['cloud_vendor_type'] = $this->cloudVendorType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SpiConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['end_point'])) {
            $model->endPoint = $map['end_point'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['last_editor'])) {
            $model->lastEditor = $map['last_editor'];
        }
        if (isset($map['field_naming_strategy'])) {
            $model->fieldNamingStrategy = $map['field_naming_strategy'];
        }
        if (isset($map['cloud_vendor_type'])) {
            $model->cloudVendorType = $map['cloud_vendor_type'];
        }

        return $model;
    }
}
