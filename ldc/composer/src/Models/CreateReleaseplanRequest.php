<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CreateReleaseplanRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 创建发布单需要的应用服务信息
    /**
     * @var ReleasePlanSpecAppService[]
     */
    public $appServices;

    // 命名空间
    /**
     * @var string
     */
    public $namespace;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;

    // 是否自动执行
    /**
     * @var bool
     */
    public $isAutoExecute;

    // 发布单标题
    /**
     * @var string
     */
    public $title;

    // 默认CLOUD_NATIVE_GROUP_RELEASE
    /**
     * @var string
     */
    public $opsType;
    protected $_name = [
        'authToken'      => 'auth_token',
        'appServices'    => 'app_services',
        'namespace'      => 'namespace',
        'workspaceGroup' => 'workspace_group',
        'isAutoExecute'  => 'is_auto_execute',
        'title'          => 'title',
        'opsType'        => 'ops_type',
    ];

    public function validate()
    {
        Model::validateRequired('appServices', $this->appServices, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('title', $this->title, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appServices) {
            $res['app_services'] = [];
            if (null !== $this->appServices && \is_array($this->appServices)) {
                $n = 0;
                foreach ($this->appServices as $item) {
                    $res['app_services'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->isAutoExecute) {
            $res['is_auto_execute'] = $this->isAutoExecute;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->opsType) {
            $res['ops_type'] = $this->opsType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateReleaseplanRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['app_services'])) {
            if (!empty($map['app_services'])) {
                $model->appServices = [];
                $n                  = 0;
                foreach ($map['app_services'] as $item) {
                    $model->appServices[$n++] = null !== $item ? ReleasePlanSpecAppService::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['is_auto_execute'])) {
            $model->isAutoExecute = $map['is_auto_execute'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['ops_type'])) {
            $model->opsType = $map['ops_type'];
        }

        return $model;
    }
}
