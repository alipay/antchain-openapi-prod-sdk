<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class VpcImport extends Model
{
    // cidr block
    /**
     * @example 192.168.0.1/24
     *
     * @var string
     */
    public $cidrBlock;

    // vpc描述信息
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // vpc iaas id
    /**
     * @example vpc-gx6g87kvj8cv0p7rq7nj8
     *
     * @var string
     */
    public $iaasId;

    // import workspace info
    /**
     * @example
     *
     * @var ImportInfo
     */
    public $importInfo;

    // vpc name
    /**
     * @example vpcName
     *
     * @var string
     */
    public $name;

    // vpc status
    /**
     * @example Available
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'cidrBlock'   => 'cidr_block',
        'description' => 'description',
        'iaasId'      => 'iaas_id',
        'importInfo'  => 'import_info',
        'name'        => 'name',
        'status'      => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('iaasId', $this->iaasId, true);
        Model::validateRequired('importInfo', $this->importInfo, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cidrBlock) {
            $res['cidr_block'] = $this->cidrBlock;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->iaasId) {
            $res['iaas_id'] = $this->iaasId;
        }
        if (null !== $this->importInfo) {
            $res['import_info'] = null !== $this->importInfo ? $this->importInfo->toMap() : null;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VpcImport
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cidr_block'])) {
            $model->cidrBlock = $map['cidr_block'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['iaas_id'])) {
            $model->iaasId = $map['iaas_id'];
        }
        if (isset($map['import_info'])) {
            $model->importInfo = ImportInfo::fromMap($map['import_info']);
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
