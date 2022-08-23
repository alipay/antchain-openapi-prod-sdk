<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class ProdMetaInfo extends Model
{
    // 环境id
    /**
     * @example 73040000001
     *
     * @var string
     */
    public $envId;

    // 产品码
    /**
     * @example YUNYOUDEV
     *
     * @var string
     */
    public $prodCode;

    // 产品版本
    /**
     * @example 1.1.0
     *
     * @var string
     */
    public $prodVersion;

    // 产品部署拓扑标识id
    /**
     * @example DEPLOY_TOPO_202204131639100996
     *
     * @var string
     */
    public $deployTopologyIdentity;

    // 产品部署规格标识id
    /**
     * @example DS_202011271431020756
     *
     * @var string
     */
    public $deploySpecIdentity;

    // 产品基线状态：AVTIVE、FAILED、UPGRADING
    /**
     * @example ACTIVE
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'envId'                  => 'env_id',
        'prodCode'               => 'prod_code',
        'prodVersion'            => 'prod_version',
        'deployTopologyIdentity' => 'deploy_topology_identity',
        'deploySpecIdentity'     => 'deploy_spec_identity',
        'status'                 => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('envId', $this->envId, true);
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('prodVersion', $this->prodVersion, true);
        Model::validateRequired('deployTopologyIdentity', $this->deployTopologyIdentity, true);
        Model::validateRequired('deploySpecIdentity', $this->deploySpecIdentity, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->prodVersion) {
            $res['prod_version'] = $this->prodVersion;
        }
        if (null !== $this->deployTopologyIdentity) {
            $res['deploy_topology_identity'] = $this->deployTopologyIdentity;
        }
        if (null !== $this->deploySpecIdentity) {
            $res['deploy_spec_identity'] = $this->deploySpecIdentity;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProdMetaInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }
        if (isset($map['prod_version'])) {
            $model->prodVersion = $map['prod_version'];
        }
        if (isset($map['deploy_topology_identity'])) {
            $model->deployTopologyIdentity = $map['deploy_topology_identity'];
        }
        if (isset($map['deploy_spec_identity'])) {
            $model->deploySpecIdentity = $map['deploy_spec_identity'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
