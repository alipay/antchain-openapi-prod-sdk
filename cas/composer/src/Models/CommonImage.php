<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CommonImage extends Model
{
    // description
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // is enable
    /**
     * @example true, false
     *
     * @var bool
     */
    public $enable;

    // iaas id
    /**
     * @example m-zm0e1v58t0rxikjh58***
     *
     * @var string
     */
    public $iaasId;

    // iaas type
    /**
     * @example Aliyun
     *
     * @var string
     */
    public $iaasType;

    // id
    /**
     * @example 0100310001
     *
     * @var string
     */
    public $id;

    // 是否仅杭州金区 vpc 可用镜像
    /**
     * @example true, false
     *
     * @var bool
     */
    public $onlyHzFinVpcSupported;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // os
    /**
     * @example centos
     *
     * @var string
     */
    public $os;

    // os bit取值：32，64
    /**
     * @example 64
     *
     * @var int
     */
    public $osBit;

    // os version
    /**
     * @example 7.2
     *
     * @var string
     */
    public $osVersion;

    // provider id
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $providerId;

    // region id
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $regionId;

    // status
    /**
     * @example AVAILABLE
     *
     * @var string
     */
    public $status;

    // system disk size(GB)
    /**
     * @example 100
     *
     * @var int
     */
    public $systemDiskSize;
    protected $_name = [
        'description'           => 'description',
        'enable'                => 'enable',
        'iaasId'                => 'iaas_id',
        'iaasType'              => 'iaas_type',
        'id'                    => 'id',
        'onlyHzFinVpcSupported' => 'only_hz_fin_vpc_supported',
        'name'                  => 'name',
        'os'                    => 'os',
        'osBit'                 => 'os_bit',
        'osVersion'             => 'os_version',
        'providerId'            => 'provider_id',
        'regionId'              => 'region_id',
        'status'                => 'status',
        'systemDiskSize'        => 'system_disk_size',
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
        if (null !== $this->enable) {
            $res['enable'] = $this->enable;
        }
        if (null !== $this->iaasId) {
            $res['iaas_id'] = $this->iaasId;
        }
        if (null !== $this->iaasType) {
            $res['iaas_type'] = $this->iaasType;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->onlyHzFinVpcSupported) {
            $res['only_hz_fin_vpc_supported'] = $this->onlyHzFinVpcSupported;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->os) {
            $res['os'] = $this->os;
        }
        if (null !== $this->osBit) {
            $res['os_bit'] = $this->osBit;
        }
        if (null !== $this->osVersion) {
            $res['os_version'] = $this->osVersion;
        }
        if (null !== $this->providerId) {
            $res['provider_id'] = $this->providerId;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->systemDiskSize) {
            $res['system_disk_size'] = $this->systemDiskSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CommonImage
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['enable'])) {
            $model->enable = $map['enable'];
        }
        if (isset($map['iaas_id'])) {
            $model->iaasId = $map['iaas_id'];
        }
        if (isset($map['iaas_type'])) {
            $model->iaasType = $map['iaas_type'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['only_hz_fin_vpc_supported'])) {
            $model->onlyHzFinVpcSupported = $map['only_hz_fin_vpc_supported'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['os'])) {
            $model->os = $map['os'];
        }
        if (isset($map['os_bit'])) {
            $model->osBit = $map['os_bit'];
        }
        if (isset($map['os_version'])) {
            $model->osVersion = $map['os_version'];
        }
        if (isset($map['provider_id'])) {
            $model->providerId = $map['provider_id'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['system_disk_size'])) {
            $model->systemDiskSize = $map['system_disk_size'];
        }

        return $model;
    }
}
