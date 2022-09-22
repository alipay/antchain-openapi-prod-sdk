<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class AddContainerserviceLogpvRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // app名称
    /**
     * @var string[]
     */
    public $apps;

    // 环境信息
    /**
     * @var string
     */
    public $env;

    // PVC 名称
    /**
     * @var string
     */
    public $pvcName;

    // StorageClass
    /**
     * @var string
     */
    public $storageClass;

    // 存储大小
    /**
     * @var int
     */
    public $storageSize;

    // 挂载路径，默认/home/admin/logs
    /**
     * @var string
     */
    public $mountPath;

    // addDefaultInitContainer, 默认值false
    /**
     * @var bool
     */
    public $disableInitContainer;

    // Init Container名称
    /**
     * @var string
     */
    public $logInitContainerName;

    // 默认值添加Sidecar PV
    /**
     * @var bool
     */
    public $disableSidecarPv;
    protected $_name = [
        'authToken'            => 'auth_token',
        'apps'                 => 'apps',
        'env'                  => 'env',
        'pvcName'              => 'pvc_name',
        'storageClass'         => 'storage_class',
        'storageSize'          => 'storage_size',
        'mountPath'            => 'mount_path',
        'disableInitContainer' => 'disable_init_container',
        'logInitContainerName' => 'log_init_container_name',
        'disableSidecarPv'     => 'disable_sidecar_pv',
    ];

    public function validate()
    {
        Model::validateRequired('apps', $this->apps, true);
        Model::validateRequired('env', $this->env, true);
        Model::validateRequired('pvcName', $this->pvcName, true);
        Model::validateRequired('storageClass', $this->storageClass, true);
        Model::validateRequired('storageSize', $this->storageSize, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->apps) {
            $res['apps'] = $this->apps;
        }
        if (null !== $this->env) {
            $res['env'] = $this->env;
        }
        if (null !== $this->pvcName) {
            $res['pvc_name'] = $this->pvcName;
        }
        if (null !== $this->storageClass) {
            $res['storage_class'] = $this->storageClass;
        }
        if (null !== $this->storageSize) {
            $res['storage_size'] = $this->storageSize;
        }
        if (null !== $this->mountPath) {
            $res['mount_path'] = $this->mountPath;
        }
        if (null !== $this->disableInitContainer) {
            $res['disable_init_container'] = $this->disableInitContainer;
        }
        if (null !== $this->logInitContainerName) {
            $res['log_init_container_name'] = $this->logInitContainerName;
        }
        if (null !== $this->disableSidecarPv) {
            $res['disable_sidecar_pv'] = $this->disableSidecarPv;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddContainerserviceLogpvRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['apps'])) {
            if (!empty($map['apps'])) {
                $model->apps = $map['apps'];
            }
        }
        if (isset($map['env'])) {
            $model->env = $map['env'];
        }
        if (isset($map['pvc_name'])) {
            $model->pvcName = $map['pvc_name'];
        }
        if (isset($map['storage_class'])) {
            $model->storageClass = $map['storage_class'];
        }
        if (isset($map['storage_size'])) {
            $model->storageSize = $map['storage_size'];
        }
        if (isset($map['mount_path'])) {
            $model->mountPath = $map['mount_path'];
        }
        if (isset($map['disable_init_container'])) {
            $model->disableInitContainer = $map['disable_init_container'];
        }
        if (isset($map['log_init_container_name'])) {
            $model->logInitContainerName = $map['log_init_container_name'];
        }
        if (isset($map['disable_sidecar_pv'])) {
            $model->disableSidecarPv = $map['disable_sidecar_pv'];
        }

        return $model;
    }
}
