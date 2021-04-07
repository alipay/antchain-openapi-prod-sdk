<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class LoadBalancerImportVO extends Model
{
    // iaas_id
    /**
     * @example iaas_id
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

    // network_type
    /**
     * @example network_type
     *
     * @var string
     */
    public $networkType;

    // inner_ip_address
    /**
     * @example
     *
     * @var string[]
     */
    public $innerIpAddress;

    // public_ip_address
    /**
     * @example
     *
     * @var string[]
     */
    public $publicIpAddress;

    // utc_create
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcCreate;

    // import_info
    /**
     * @example
     *
     * @var ImportVO
     */
    public $importInfo;
    protected $_name = [
        'iaasId'          => 'iaas_id',
        'name'            => 'name',
        'networkType'     => 'network_type',
        'innerIpAddress'  => 'inner_ip_address',
        'publicIpAddress' => 'public_ip_address',
        'utcCreate'       => 'utc_create',
        'importInfo'      => 'import_info',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('importInfo', $this->importInfo, true);
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->networkType) {
            $res['network_type'] = $this->networkType;
        }
        if (null !== $this->innerIpAddress) {
            $res['inner_ip_address'] = $this->innerIpAddress;
        }
        if (null !== $this->publicIpAddress) {
            $res['public_ip_address'] = $this->publicIpAddress;
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
     * @return LoadBalancerImportVO
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
        if (isset($map['network_type'])) {
            $model->networkType = $map['network_type'];
        }
        if (isset($map['inner_ip_address'])) {
            if (!empty($map['inner_ip_address'])) {
                $model->innerIpAddress = $map['inner_ip_address'];
            }
        }
        if (isset($map['public_ip_address'])) {
            if (!empty($map['public_ip_address'])) {
                $model->publicIpAddress = $map['public_ip_address'];
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
