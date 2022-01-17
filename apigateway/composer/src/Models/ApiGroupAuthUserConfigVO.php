<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ApiGroupAuthUserConfigVO extends Model
{
    // api授权管理开关
    /**
     * @example api_auth_user_switch
     *
     * @var string
     */
    public $apiAuthUserSwitch;

    // 是否是管理员
    /**
     * @example
     *
     * @var bool
     */
    public $checkMaster;

    // 需要api授权管理
    /**
     * @example true/false
     *
     * @var bool
     */
    public $needApiAuthUser;

    // tenant_id
    /**
     * @example tenant_id
     *
     * @var string
     */
    public $tenantId;

    // workspace_id
    /**
     * @example workspace_id
     *
     * @var string
     */
    public $workspaceId;
    protected $_name = [
        'apiAuthUserSwitch' => 'api_auth_user_switch',
        'checkMaster'       => 'check_master',
        'needApiAuthUser'   => 'need_api_auth_user',
        'tenantId'          => 'tenant_id',
        'workspaceId'       => 'workspace_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->apiAuthUserSwitch) {
            $res['api_auth_user_switch'] = $this->apiAuthUserSwitch;
        }
        if (null !== $this->checkMaster) {
            $res['check_master'] = $this->checkMaster;
        }
        if (null !== $this->needApiAuthUser) {
            $res['need_api_auth_user'] = $this->needApiAuthUser;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiGroupAuthUserConfigVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['api_auth_user_switch'])) {
            $model->apiAuthUserSwitch = $map['api_auth_user_switch'];
        }
        if (isset($map['check_master'])) {
            $model->checkMaster = $map['check_master'];
        }
        if (isset($map['need_api_auth_user'])) {
            $model->needApiAuthUser = $map['need_api_auth_user'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }

        return $model;
    }
}
