<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UpdateWorkspaceSettingRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // workspace_name
    /**
     * @var string
     */
    public $workspaceName;

    // workspace_setting_detail
    /**
     * @var WorkspaceSettingDetail
     */
    public $workspaceSettingDetail;
    protected $_name = [
        'authToken'              => 'auth_token',
        'workspaceName'          => 'workspace_name',
        'workspaceSettingDetail' => 'workspace_setting_detail',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('workspaceSettingDetail', $this->workspaceSettingDetail, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->workspaceSettingDetail) {
            $res['workspace_setting_detail'] = null !== $this->workspaceSettingDetail ? $this->workspaceSettingDetail->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateWorkspaceSettingRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['workspace_setting_detail'])) {
            $model->workspaceSettingDetail = WorkspaceSettingDetail::fromMap($map['workspace_setting_detail']);
        }

        return $model;
    }
}
