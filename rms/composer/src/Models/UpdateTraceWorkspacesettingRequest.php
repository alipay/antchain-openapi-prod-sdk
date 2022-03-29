<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UpdateTraceWorkspacesettingRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间配置
    /**
     * @var TraceWorkspaceSetting[]
     */
    public $traceWorkspaceSettings;

    // 工作空间，用来鉴权
    /**
     * @var string
     */
    public $workspaceName;
    protected $_name = [
        'authToken'              => 'auth_token',
        'traceWorkspaceSettings' => 'trace_workspace_settings',
        'workspaceName'          => 'workspace_name',
    ];

    public function validate()
    {
        Model::validateRequired('traceWorkspaceSettings', $this->traceWorkspaceSettings, true);
        Model::validateRequired('workspaceName', $this->workspaceName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->traceWorkspaceSettings) {
            $res['trace_workspace_settings'] = [];
            if (null !== $this->traceWorkspaceSettings && \is_array($this->traceWorkspaceSettings)) {
                $n = 0;
                foreach ($this->traceWorkspaceSettings as $item) {
                    $res['trace_workspace_settings'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateTraceWorkspacesettingRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['trace_workspace_settings'])) {
            if (!empty($map['trace_workspace_settings'])) {
                $model->traceWorkspaceSettings = [];
                $n                             = 0;
                foreach ($map['trace_workspace_settings'] as $item) {
                    $model->traceWorkspaceSettings[$n++] = null !== $item ? TraceWorkspaceSetting::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }

        return $model;
    }
}
