<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QuerySidecaropsReleaseinfoRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 应用名称（借花场景即为应用服务名）
    /**
     * @var string
     */
    public $appName;

    // sidecar类型
    /**
     * @var string
     */
    public $sidecarType;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;

    // 命名空间
    /**
     * @var string
     */
    public $namespace;

    // 变更单号
    /**
     * @var string
     */
    public $orderNum;

    // 应用服务发布sidecar的版本号，每次发布程序会自己分配一个，可用于作为查询key
    /**
     * @var string
     */
    public $releaseVersion;
    protected $_name = [
        'authToken'      => 'auth_token',
        'appName'        => 'app_name',
        'sidecarType'    => 'sidecar_type',
        'workspaceGroup' => 'workspace_group',
        'namespace'      => 'namespace',
        'orderNum'       => 'order_num',
        'releaseVersion' => 'release_version',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('sidecarType', $this->sidecarType, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('namespace', $this->namespace, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->sidecarType) {
            $res['sidecar_type'] = $this->sidecarType;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->orderNum) {
            $res['order_num'] = $this->orderNum;
        }
        if (null !== $this->releaseVersion) {
            $res['release_version'] = $this->releaseVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySidecaropsReleaseinfoRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['sidecar_type'])) {
            $model->sidecarType = $map['sidecar_type'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['order_num'])) {
            $model->orderNum = $map['order_num'];
        }
        if (isset($map['release_version'])) {
            $model->releaseVersion = $map['release_version'];
        }

        return $model;
    }
}
