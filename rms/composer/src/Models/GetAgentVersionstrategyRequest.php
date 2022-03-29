<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class GetAgentVersionstrategyRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间名称
    /**
     * @var string
     */
    public $workspaceName;

    // 0 容器，1经典
    /**
     * @var int
     */
    public $type;
    protected $_name = [
        'authToken'     => 'auth_token',
        'workspaceName' => 'workspace_name',
        'type'          => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('type', $this->type, true);
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
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAgentVersionstrategyRequest
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
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
