<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class AppService extends Model
{
    // 应用英文名。
    /**
     * @example aciamcore
     *
     * @var string
     */
    public $appName;

    // 应用版本
    /**
     * @example aciamcore
     *
     * @var string
     */
    public $appVersion;

    // 单元ID
    /**
     * @example 730420180509155727452700000
     *
     * @var string
     */
    public $cellId;

    // 部署单元名称，产品实例下唯一。
    /**
     * @example default
     *
     * @var string
     */
    public $deployUnit;

    // 部署域。
    /**
     * @example default-zone
     *
     * @var string
     */
    public $deployZone;

    // 环境唯一标识
    /**
     * @example
     *
     * @var string
     */
    public $envId;

    // 应用服务实例唯一标识。
    /**
     * @example 73040008193020
     *
     * @var string
     */
    public $id;

    // 应用所属的产品的产品码
    /**
     * @example
     *
     * @var string
     */
    public $productCode;

    // 应用服务实例状态。DEPLOYING: 部署中；UPGRADING: 升级中；ROLL_BACKING: 回滚中；ACTIVE：可用；FAILED: 部署失败；ROLLBACKED: 已回滚。
    /**
     * @example ACTIVE
     *
     * @var string
     */
    public $status;

    // 应用类型：BUSINESS | JOB | CONTROLLER
    /**
     * @example BUSINESS
     *
     * @var string
     */
    public $appType;

    // 应用显示名称，云游资产使用
    /**
     * @example aciamcore
     *
     * @var string
     */
    public $appDisplayName;

    // 应用等级，云游资产使用
    /**
     * @example A1-4
     *
     * @var string
     */
    public $appLevel;

    // 租户信息，云游资产使用。
    /**
     * @example antcloud
     *
     * @var string
     */
    public $tenantId;

    // 产品码--应用名
    /**
     * @example IAM--aciamcore
     *
     * @var string
     */
    public $productApp;

    // 产品Owner
    /**
     * @example
     *
     * @var Owner
     */
    public $owner;

    // 应用SRE信息
    /**
     * @example
     *
     * @var Admin
     */
    public $admin;
    protected $_name = [
        'appName'        => 'app_name',
        'appVersion'     => 'app_version',
        'cellId'         => 'cell_id',
        'deployUnit'     => 'deploy_unit',
        'deployZone'     => 'deploy_zone',
        'envId'          => 'env_id',
        'id'             => 'id',
        'productCode'    => 'product_code',
        'status'         => 'status',
        'appType'        => 'app_type',
        'appDisplayName' => 'app_display_name',
        'appLevel'       => 'app_level',
        'tenantId'       => 'tenant_id',
        'productApp'     => 'product_app',
        'owner'          => 'owner',
        'admin'          => 'admin',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->appVersion) {
            $res['app_version'] = $this->appVersion;
        }
        if (null !== $this->cellId) {
            $res['cell_id'] = $this->cellId;
        }
        if (null !== $this->deployUnit) {
            $res['deploy_unit'] = $this->deployUnit;
        }
        if (null !== $this->deployZone) {
            $res['deploy_zone'] = $this->deployZone;
        }
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->appType) {
            $res['app_type'] = $this->appType;
        }
        if (null !== $this->appDisplayName) {
            $res['app_display_name'] = $this->appDisplayName;
        }
        if (null !== $this->appLevel) {
            $res['app_level'] = $this->appLevel;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->productApp) {
            $res['product_app'] = $this->productApp;
        }
        if (null !== $this->owner) {
            $res['owner'] = null !== $this->owner ? $this->owner->toMap() : null;
        }
        if (null !== $this->admin) {
            $res['admin'] = null !== $this->admin ? $this->admin->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppService
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['app_version'])) {
            $model->appVersion = $map['app_version'];
        }
        if (isset($map['cell_id'])) {
            $model->cellId = $map['cell_id'];
        }
        if (isset($map['deploy_unit'])) {
            $model->deployUnit = $map['deploy_unit'];
        }
        if (isset($map['deploy_zone'])) {
            $model->deployZone = $map['deploy_zone'];
        }
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['app_type'])) {
            $model->appType = $map['app_type'];
        }
        if (isset($map['app_display_name'])) {
            $model->appDisplayName = $map['app_display_name'];
        }
        if (isset($map['app_level'])) {
            $model->appLevel = $map['app_level'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['product_app'])) {
            $model->productApp = $map['product_app'];
        }
        if (isset($map['owner'])) {
            $model->owner = Owner::fromMap($map['owner']);
        }
        if (isset($map['admin'])) {
            $model->admin = Admin::fromMap($map['admin']);
        }

        return $model;
    }
}
