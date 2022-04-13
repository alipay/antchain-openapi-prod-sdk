<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class TenantAppReleaseData extends Model
{
    // 是否成功
    /**
     * @example true, false
     *
     * @var bool
     */
    public $success;

    // 机构名称
    /**
     * @example ANTCLOUD
     *
     * @var string
     */
    public $tenant;

    // 发布单ID
    /**
     * @example 1000000000001
     *
     * @var string
     */
    public $releaseId;

    // 环境
    /**
     * @example dev
     *
     * @var string
     */
    public $workspaceGroup;
    protected $_name = [
        'success'        => 'success',
        'tenant'         => 'tenant',
        'releaseId'      => 'release_id',
        'workspaceGroup' => 'workspace_group',
    ];

    public function validate()
    {
        Model::validateRequired('success', $this->success, true);
        Model::validateRequired('tenant', $this->tenant, true);
        Model::validateRequired('releaseId', $this->releaseId, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->releaseId) {
            $res['release_id'] = $this->releaseId;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TenantAppReleaseData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['release_id'])) {
            $model->releaseId = $map['release_id'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }

        return $model;
    }
}
