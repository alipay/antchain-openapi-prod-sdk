<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ComputerImportVO extends Model
{
    // computer iaaas id
    /**
     * @example i-464864321sagfasd***
     *
     * @var string
     */
    public $iaasId;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // zone identity
    /**
     * @example hangzhou-a
     *
     * @var string
     */
    public $zoneIaasId;

    // zone name
    /**
     * @example hangzhou-a
     *
     * @var string
     */
    public $zoneName;

    // description
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // private ip
    /**
     * @example 10.167.5.194
     *
     * @var string
     */
    public $privateIp;

    // public ip
    /**
     * @example 10.167.5.194
     *
     * @var string
     */
    public $publicIp;

    // elasticIp
    /**
     * @example 10.167.5.194
     *
     * @var string
     */
    public $elasticIp;

    // vpcIaasId
    /**
     * @example vpc24sfs4fs354fs***
     *
     * @var string
     */
    public $vpcIaasId;

    // joined security group infos
    /**
     * @example
     *
     * @var JoinedSecurityGroupVO[]
     */
    public $joinedSecurityGroup;

    // creation time
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcCreate;

    // import info
    /**
     * @example
     *
     * @var ImportVO
     */
    public $importInfo;
    protected $_name = [
        'iaasId'              => 'iaas_id',
        'name'                => 'name',
        'zoneIaasId'          => 'zone_iaas_id',
        'zoneName'            => 'zone_name',
        'description'         => 'description',
        'privateIp'           => 'private_ip',
        'publicIp'            => 'public_ip',
        'elasticIp'           => 'elastic_ip',
        'vpcIaasId'           => 'vpc_iaas_id',
        'joinedSecurityGroup' => 'joined_security_group',
        'utcCreate'           => 'utc_create',
        'importInfo'          => 'import_info',
    ];

    public function validate()
    {
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->iaasId) {
            $res['iaas_id'] = $this->iaasId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->zoneIaasId) {
            $res['zone_iaas_id'] = $this->zoneIaasId;
        }
        if (null !== $this->zoneName) {
            $res['zone_name'] = $this->zoneName;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->privateIp) {
            $res['private_ip'] = $this->privateIp;
        }
        if (null !== $this->publicIp) {
            $res['public_ip'] = $this->publicIp;
        }
        if (null !== $this->elasticIp) {
            $res['elastic_ip'] = $this->elasticIp;
        }
        if (null !== $this->vpcIaasId) {
            $res['vpc_iaas_id'] = $this->vpcIaasId;
        }
        if (null !== $this->joinedSecurityGroup) {
            $res['joined_security_group'] = [];
            if (null !== $this->joinedSecurityGroup && \is_array($this->joinedSecurityGroup)) {
                $n = 0;
                foreach ($this->joinedSecurityGroup as $item) {
                    $res['joined_security_group'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->importInfo) {
            $res['import_info'] = null !== $this->importInfo ? $this->importInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ComputerImportVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['iaas_id'])) {
            $model->iaasId = $map['iaas_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['zone_iaas_id'])) {
            $model->zoneIaasId = $map['zone_iaas_id'];
        }
        if (isset($map['zone_name'])) {
            $model->zoneName = $map['zone_name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['private_ip'])) {
            $model->privateIp = $map['private_ip'];
        }
        if (isset($map['public_ip'])) {
            $model->publicIp = $map['public_ip'];
        }
        if (isset($map['elastic_ip'])) {
            $model->elasticIp = $map['elastic_ip'];
        }
        if (isset($map['vpc_iaas_id'])) {
            $model->vpcIaasId = $map['vpc_iaas_id'];
        }
        if (isset($map['joined_security_group'])) {
            if (!empty($map['joined_security_group'])) {
                $model->joinedSecurityGroup = [];
                $n                          = 0;
                foreach ($map['joined_security_group'] as $item) {
                    $model->joinedSecurityGroup[$n++] = null !== $item ? JoinedSecurityGroupVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['import_info'])) {
            $model->importInfo = ImportVO::fromMap($map['import_info']);
        }

        return $model;
    }
}
