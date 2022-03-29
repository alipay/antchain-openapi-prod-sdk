<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class SetAgentVersionstrategyRequest extends Model
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

    // TENANT、WORKSPACE
    /**
     * @var string
     */
    public $scope;

    // agent 地址，容器为镜像地址，经典为 OSS 地址
    /**
     * @var string
     */
    public $agentUrl;

    // 版本号
    /**
     * @var string
     */
    public $agentVersion;
    protected $_name = [
        'authToken'     => 'auth_token',
        'workspaceName' => 'workspace_name',
        'type'          => 'type',
        'scope'         => 'scope',
        'agentUrl'      => 'agent_url',
        'agentVersion'  => 'agent_version',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('scope', $this->scope, true);
        Model::validateRequired('agentUrl', $this->agentUrl, true);
        Model::validateRequired('agentVersion', $this->agentVersion, true);
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
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->agentUrl) {
            $res['agent_url'] = $this->agentUrl;
        }
        if (null !== $this->agentVersion) {
            $res['agent_version'] = $this->agentVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SetAgentVersionstrategyRequest
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
        if (isset($map['scope'])) {
            $model->scope = $map['scope'];
        }
        if (isset($map['agent_url'])) {
            $model->agentUrl = $map['agent_url'];
        }
        if (isset($map['agent_version'])) {
            $model->agentVersion = $map['agent_version'];
        }

        return $model;
    }
}
