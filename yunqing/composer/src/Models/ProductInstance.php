<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class ProductInstance extends Model
{
    // 单元ID
    /**
     * @example 1234567
     *
     * @var string
     */
    public $cellId;

    // 产品实例所在的环境唯一标识。
    /**
     * @example 730420180620120633447200000
     *
     * @var string
     */
    public $envId;

    // 产品码。
    /**
     * @example IAM
     *
     * @var string
     */
    public $productCode;

    // 产品版本。
    /**
     * @example 1.0.0
     *
     * @var string
     */
    public $productVersion;

    // 产品基线状态
    /**
     * @example ACTIVE
     *
     * @var string
     */
    public $status;

    // 产品创建时间
    /**
     * @example 2018-01-20 14:21:43
     *
     * @var string
     */
    public $utcCreate;

    // 产品修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcModified;

    // 产品拓扑id
    /**
     * @example TOPOLOGY_IDENTITY_201810101
     *
     * @var string
     */
    public $deployTopologyIdentity;

    // 部署规格id
    /**
     * @example DS_201804161203537729
     *
     * @var string
     */
    public $deploySpecIdentity;
    protected $_name = [
        'cellId'                 => 'cell_id',
        'envId'                  => 'env_id',
        'productCode'            => 'product_code',
        'productVersion'         => 'product_version',
        'status'                 => 'status',
        'utcCreate'              => 'utc_create',
        'utcModified'            => 'utc_modified',
        'deployTopologyIdentity' => 'deploy_topology_identity',
        'deploySpecIdentity'     => 'deploy_spec_identity',
    ];

    public function validate()
    {
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cellId) {
            $res['cell_id'] = $this->cellId;
        }
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->productVersion) {
            $res['product_version'] = $this->productVersion;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }
        if (null !== $this->deployTopologyIdentity) {
            $res['deploy_topology_identity'] = $this->deployTopologyIdentity;
        }
        if (null !== $this->deploySpecIdentity) {
            $res['deploy_spec_identity'] = $this->deploySpecIdentity;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProductInstance
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cell_id'])) {
            $model->cellId = $map['cell_id'];
        }
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['product_version'])) {
            $model->productVersion = $map['product_version'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['utc_modified'])) {
            $model->utcModified = $map['utc_modified'];
        }
        if (isset($map['deploy_topology_identity'])) {
            $model->deployTopologyIdentity = $map['deploy_topology_identity'];
        }
        if (isset($map['deploy_spec_identity'])) {
            $model->deploySpecIdentity = $map['deploy_spec_identity'];
        }

        return $model;
    }
}
