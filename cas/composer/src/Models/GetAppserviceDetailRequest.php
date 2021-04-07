<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class GetAppserviceDetailRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 应用服务id
    /**
     * @var string
     */
    public $appServiceId;

    // 工作空间id，用于鉴权
    /**
     * @var string
     */
    public $workspaceId;
    protected $_name = [
        'authToken'    => 'auth_token',
        'appServiceId' => 'app_service_id',
        'workspaceId'  => 'workspace_id',
    ];

    public function validate()
    {
        Model::validateRequired('appServiceId', $this->appServiceId, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appServiceId) {
            $res['app_service_id'] = $this->appServiceId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAppserviceDetailRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['app_service_id'])) {
            $model->appServiceId = $map['app_service_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }

        return $model;
    }
}
