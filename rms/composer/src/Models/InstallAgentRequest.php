<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class InstallAgentRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间
    /**
     * @var string
     */
    public $workspaceName;

    // 需要安装 agent 的目标列表
    /**
     * @var string[]
     */
    public $collectIds;

    // 0 容器，1经典
    /**
     * @var int
     */
    public $type;
    protected $_name = [
        'authToken'     => 'auth_token',
        'workspaceName' => 'workspace_name',
        'collectIds'    => 'collect_ids',
        'type'          => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
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
        if (null !== $this->collectIds) {
            $res['collect_ids'] = $this->collectIds;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InstallAgentRequest
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
        if (isset($map['collect_ids'])) {
            if (!empty($map['collect_ids'])) {
                $model->collectIds = $map['collect_ids'];
            }
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
