<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UnbindAppserviceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 应用名称
    /**
     * @var string
     */
    public $applicationName;

    // 应用服务名称
    /**
     * @var string
     */
    public $appServiceName;

    // 部署单元名称列表。 n代表第n个应用的名称，n从1开始，最大100。每个部署单元名称最大60个UTF-8字符。如果要输入多个部署单元，使用如下形式：cell_ids.1=RZ01A&cell_ids.2=RZ02B
    /**
     * @var string[]
     */
    public $cellIds;

    // 工作空间名称
    /**
     * @var string
     */
    public $workspace;
    protected $_name = [
        'authToken'       => 'auth_token',
        'applicationName' => 'application_name',
        'appServiceName'  => 'app_service_name',
        'cellIds'         => 'cell_ids',
        'workspace'       => 'workspace',
    ];

    public function validate()
    {
        Model::validateRequired('applicationName', $this->applicationName, true);
        Model::validateRequired('appServiceName', $this->appServiceName, true);
        Model::validateRequired('cellIds', $this->cellIds, true);
        Model::validateRequired('workspace', $this->workspace, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->applicationName) {
            $res['application_name'] = $this->applicationName;
        }
        if (null !== $this->appServiceName) {
            $res['app_service_name'] = $this->appServiceName;
        }
        if (null !== $this->cellIds) {
            $res['cell_ids'] = $this->cellIds;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UnbindAppserviceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['application_name'])) {
            $model->applicationName = $map['application_name'];
        }
        if (isset($map['app_service_name'])) {
            $model->appServiceName = $map['app_service_name'];
        }
        if (isset($map['cell_ids'])) {
            if (!empty($map['cell_ids'])) {
                $model->cellIds = $map['cell_ids'];
            }
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}
