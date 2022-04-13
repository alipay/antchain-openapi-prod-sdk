<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CreateGpaasReleaseRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // aig
    /**
     * @var string
     */
    public $appInstanceGroup;

    // 应用名字
    /**
     * @var string
     */
    public $appName;

    // 发布批次分组
    /**
     * @var ReleaseBatchObj[]
     */
    public $batches;

    // 是否是第一次发布
    /**
     * @var bool
     */
    public $isFirstRelease;

    // operator
    /**
     * @var string
     */
    public $operator;

    // 发布单名字，或者说标题
    /**
     * @var string
     */
    public $releaseName;

    // 发布版本信息，包括镜像等
    /**
     * @var ReleaseVersion
     */
    public $releaseVersion;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;
    protected $_name = [
        'authToken'        => 'auth_token',
        'appInstanceGroup' => 'app_instance_group',
        'appName'          => 'app_name',
        'batches'          => 'batches',
        'isFirstRelease'   => 'is_first_release',
        'operator'         => 'operator',
        'releaseName'      => 'release_name',
        'releaseVersion'   => 'release_version',
        'workspaceGroup'   => 'workspace_group',
    ];

    public function validate()
    {
        Model::validateRequired('appInstanceGroup', $this->appInstanceGroup, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('batches', $this->batches, true);
        Model::validateRequired('isFirstRelease', $this->isFirstRelease, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('releaseName', $this->releaseName, true);
        Model::validateRequired('releaseVersion', $this->releaseVersion, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appInstanceGroup) {
            $res['app_instance_group'] = $this->appInstanceGroup;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->batches) {
            $res['batches'] = [];
            if (null !== $this->batches && \is_array($this->batches)) {
                $n = 0;
                foreach ($this->batches as $item) {
                    $res['batches'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->isFirstRelease) {
            $res['is_first_release'] = $this->isFirstRelease;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->releaseName) {
            $res['release_name'] = $this->releaseName;
        }
        if (null !== $this->releaseVersion) {
            $res['release_version'] = null !== $this->releaseVersion ? $this->releaseVersion->toMap() : null;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateGpaasReleaseRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['app_instance_group'])) {
            $model->appInstanceGroup = $map['app_instance_group'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['batches'])) {
            if (!empty($map['batches'])) {
                $model->batches = [];
                $n              = 0;
                foreach ($map['batches'] as $item) {
                    $model->batches[$n++] = null !== $item ? ReleaseBatchObj::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['is_first_release'])) {
            $model->isFirstRelease = $map['is_first_release'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['release_name'])) {
            $model->releaseName = $map['release_name'];
        }
        if (isset($map['release_version'])) {
            $model->releaseVersion = ReleaseVersion::fromMap($map['release_version']);
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }

        return $model;
    }
}
