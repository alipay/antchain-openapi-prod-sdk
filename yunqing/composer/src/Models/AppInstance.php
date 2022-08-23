<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class AppInstance extends Model
{
    // 环境id
    /**
     * @example 7304000001
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

    // 应用名称
    /**
     * @example yunyoudev
     *
     * @var string
     */
    public $appName;

    // 应用版本
    /**
     * @example 1.11.1
     *
     * @var string
     */
    public $appVersion;

    // 应用镜像名
    /**
     * @example acs-reg.xxxxx
     *
     * @var string
     */
    public $image;

    // 应用基线状态：ACTIVE、FAILED、UPGRADING
    /**
     * @example ACTIVE
     *
     * @var string
     */
    public $status;

    // 部署单元标识id
    /**
     * @example default
     *
     * @var string
     */
    public $deploymentUnitIdentity;

    // 部署单元实例id
    /**
     * @example default
     *
     * @var string
     */
    public $deploymentUnitInstanceIdentity;

    // 应用期望实例数
    /**
     * @example 1
     *
     * @var string
     */
    public $expectReplica;
    protected $_name = [
        'envId'                          => 'env_id',
        'prodCode'                       => 'prod_code',
        'appName'                        => 'app_name',
        'appVersion'                     => 'app_version',
        'image'                          => 'image',
        'status'                         => 'status',
        'deploymentUnitIdentity'         => 'deployment_unit_identity',
        'deploymentUnitInstanceIdentity' => 'deployment_unit_instance_identity',
        'expectReplica'                  => 'expect_replica',
    ];

    public function validate()
    {
        Model::validateRequired('envId', $this->envId, true);
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('appVersion', $this->appVersion, true);
        Model::validateRequired('image', $this->image, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('expectReplica', $this->expectReplica, true);
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
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->appVersion) {
            $res['app_version'] = $this->appVersion;
        }
        if (null !== $this->image) {
            $res['image'] = $this->image;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->deploymentUnitIdentity) {
            $res['deployment_unit_identity'] = $this->deploymentUnitIdentity;
        }
        if (null !== $this->deploymentUnitInstanceIdentity) {
            $res['deployment_unit_instance_identity'] = $this->deploymentUnitInstanceIdentity;
        }
        if (null !== $this->expectReplica) {
            $res['expect_replica'] = $this->expectReplica;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppInstance
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
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['app_version'])) {
            $model->appVersion = $map['app_version'];
        }
        if (isset($map['image'])) {
            $model->image = $map['image'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['deployment_unit_identity'])) {
            $model->deploymentUnitIdentity = $map['deployment_unit_identity'];
        }
        if (isset($map['deployment_unit_instance_identity'])) {
            $model->deploymentUnitInstanceIdentity = $map['deployment_unit_instance_identity'];
        }
        if (isset($map['expect_replica'])) {
            $model->expectReplica = $map['expect_replica'];
        }

        return $model;
    }
}
