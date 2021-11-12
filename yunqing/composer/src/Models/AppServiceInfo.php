<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class AppServiceInfo extends Model
{
    // 应用名称
    /**
     * @example aciamcore
     *
     * @var string
     */
    public $appName;

    // 应用版本
    /**
     * @example 1.0.0
     *
     * @var string
     */
    public $appVersion;

    // 所属单元ID
    /**
     * @example 730420180509155727452700000
     *
     * @var string
     */
    public $cellId;

    // 容器列表。
    /**
     * @example
     *
     * @var Container[]
     */
    public $containers;

    // 部署单元名称，产品实例下唯一。
    /**
     * @example default
     *
     * @var string
     */
    public $deployUnit;

    // 环境唯一标识。
    /**
     * @example 730420180716195514592500000
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

    // 产品码
    /**
     * @example IAM
     *
     * @var string
     */
    public $productCode;

    // 所属产品分组唯一标识。
    /**
     * @example PaaS
     *
     * @var string
     */
    public $productGroupIdentity;

    // 所属产品分组名称。
    /**
     * @example PaaS
     *
     * @var string
     */
    public $productGroupName;

    // 应用服务实例状态。DEPLOYING: 部署中；UPGRADING: 升级中；ROLL_BACKING: 回滚中；ACTIVE：可用；FAILED: 部署失败；ROLLBACKED: 已回滚。
    /**
     * @example ACTIVE
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'appName'              => 'app_name',
        'appVersion'           => 'app_version',
        'cellId'               => 'cell_id',
        'containers'           => 'containers',
        'deployUnit'           => 'deploy_unit',
        'envId'                => 'env_id',
        'id'                   => 'id',
        'productCode'          => 'product_code',
        'productGroupIdentity' => 'product_group_identity',
        'productGroupName'     => 'product_group_name',
        'status'               => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('cellId', $this->cellId, true);
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
        if (null !== $this->containers) {
            $res['containers'] = [];
            if (null !== $this->containers && \is_array($this->containers)) {
                $n = 0;
                foreach ($this->containers as $item) {
                    $res['containers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->deployUnit) {
            $res['deploy_unit'] = $this->deployUnit;
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
        if (null !== $this->productGroupIdentity) {
            $res['product_group_identity'] = $this->productGroupIdentity;
        }
        if (null !== $this->productGroupName) {
            $res['product_group_name'] = $this->productGroupName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppServiceInfo
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
        if (isset($map['containers'])) {
            if (!empty($map['containers'])) {
                $model->containers = [];
                $n                 = 0;
                foreach ($map['containers'] as $item) {
                    $model->containers[$n++] = null !== $item ? Container::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['deploy_unit'])) {
            $model->deployUnit = $map['deploy_unit'];
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
        if (isset($map['product_group_identity'])) {
            $model->productGroupIdentity = $map['product_group_identity'];
        }
        if (isset($map['product_group_name'])) {
            $model->productGroupName = $map['product_group_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
