<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class SaveTenantconfigTokenRequest extends Model
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

    // configKey对应值
    /**
     * @var string
     */
    public $entityName;

    // token值
    /**
     * @var string
     */
    public $token;
    protected $_name = [
        'authToken'     => 'auth_token',
        'workspaceName' => 'workspace_name',
        'entityName'    => 'entity_name',
        'token'         => 'token',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('entityName', $this->entityName, true);
        Model::validateRequired('token', $this->token, true);
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
        if (null !== $this->entityName) {
            $res['entity_name'] = $this->entityName;
        }
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveTenantconfigTokenRequest
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
        if (isset($map['entity_name'])) {
            $model->entityName = $map['entity_name'];
        }
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }

        return $model;
    }
}
