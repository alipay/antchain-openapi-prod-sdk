<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateTraasmetaWorkspacegroupRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // workspace_groups
    /**
     * @var TraasWorkspaceGroupDto[]
     */
    public $workspaceGroups;
    protected $_name = [
        'authToken'       => 'auth_token',
        'workspaceGroups' => 'workspace_groups',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceGroups', $this->workspaceGroups, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceGroups) {
            $res['workspace_groups'] = [];
            if (null !== $this->workspaceGroups && \is_array($this->workspaceGroups)) {
                $n = 0;
                foreach ($this->workspaceGroups as $item) {
                    $res['workspace_groups'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateTraasmetaWorkspacegroupRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_groups'])) {
            if (!empty($map['workspace_groups'])) {
                $model->workspaceGroups = [];
                $n                      = 0;
                foreach ($map['workspace_groups'] as $item) {
                    $model->workspaceGroups[$n++] = null !== $item ? TraasWorkspaceGroupDto::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
