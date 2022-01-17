<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ApiGroupVO extends Model
{
    // api数
    /**
     * @example
     *
     * @var int
     */
    public $apiCount;

    // 分组标识(全局唯一)
    /**
     * @example 3778911001abc
     *
     * @var string
     */
    public $apiGroupId;

    // 用户授权开关
    /**
     * @example ON/OFF
     *
     * @var string
     */
    public $authUserSwitch;

    // 是否可以删除
    /**
     * @example true, false
     *
     * @var bool
     */
    public $canDelete;

    // 描述
    /**
     * @example 这是一段描述信息
     *
     * @var string
     */
    public $description;

    // 域名
    /**
     * @example https://3grofekygwdqrddt.shprod.antfinapigw.com-east-2
     *
     * @var string
     */
    public $domainName;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 更改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // 分组名
    /**
     * @example test_group
     *
     * @var string
     */
    public $groupName;

    // need_api_auth_user
    /**
     * @example true, false
     *
     * @var bool
     */
    public $needApiAuthUser;

    // 创建人
    /**
     * @example scott
     *
     * @var string
     */
    public $operator;

    // 租户标识
    /**
     * @example TSCPDICNT
     *
     * @var string
     */
    public $tenantId;

    // 工作空间标识
    /**
     * @example default
     *
     * @var string
     */
    public $workspaceId;

    // 是否可操作
    /**
     * @example
     *
     * @var bool
     */
    public $operationPermission;

    // DEFAULT|CUSTOM
    /**
     * @example DEFAULT|CUSTOM
     *
     * @var string
     */
    public $domainType;

    // 自定义域名
    /**
     * @example
     *
     * @var ApiGroupDomainVO[]
     */
    public $domainList;
    protected $_name = [
        'apiCount'            => 'api_count',
        'apiGroupId'          => 'api_group_id',
        'authUserSwitch'      => 'auth_user_switch',
        'canDelete'           => 'can_delete',
        'description'         => 'description',
        'domainName'          => 'domain_name',
        'gmtCreate'           => 'gmt_create',
        'gmtModified'         => 'gmt_modified',
        'groupName'           => 'group_name',
        'needApiAuthUser'     => 'need_api_auth_user',
        'operator'            => 'operator',
        'tenantId'            => 'tenant_id',
        'workspaceId'         => 'workspace_id',
        'operationPermission' => 'operation_permission',
        'domainType'          => 'domain_type',
        'domainList'          => 'domain_list',
    ];

    public function validate()
    {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->apiCount) {
            $res['api_count'] = $this->apiCount;
        }
        if (null !== $this->apiGroupId) {
            $res['api_group_id'] = $this->apiGroupId;
        }
        if (null !== $this->authUserSwitch) {
            $res['auth_user_switch'] = $this->authUserSwitch;
        }
        if (null !== $this->canDelete) {
            $res['can_delete'] = $this->canDelete;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->domainName) {
            $res['domain_name'] = $this->domainName;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->groupName) {
            $res['group_name'] = $this->groupName;
        }
        if (null !== $this->needApiAuthUser) {
            $res['need_api_auth_user'] = $this->needApiAuthUser;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->operationPermission) {
            $res['operation_permission'] = $this->operationPermission;
        }
        if (null !== $this->domainType) {
            $res['domain_type'] = $this->domainType;
        }
        if (null !== $this->domainList) {
            $res['domain_list'] = [];
            if (null !== $this->domainList && \is_array($this->domainList)) {
                $n = 0;
                foreach ($this->domainList as $item) {
                    $res['domain_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiGroupVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['api_count'])) {
            $model->apiCount = $map['api_count'];
        }
        if (isset($map['api_group_id'])) {
            $model->apiGroupId = $map['api_group_id'];
        }
        if (isset($map['auth_user_switch'])) {
            $model->authUserSwitch = $map['auth_user_switch'];
        }
        if (isset($map['can_delete'])) {
            $model->canDelete = $map['can_delete'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['domain_name'])) {
            $model->domainName = $map['domain_name'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['group_name'])) {
            $model->groupName = $map['group_name'];
        }
        if (isset($map['need_api_auth_user'])) {
            $model->needApiAuthUser = $map['need_api_auth_user'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['operation_permission'])) {
            $model->operationPermission = $map['operation_permission'];
        }
        if (isset($map['domain_type'])) {
            $model->domainType = $map['domain_type'];
        }
        if (isset($map['domain_list'])) {
            if (!empty($map['domain_list'])) {
                $model->domainList = [];
                $n                 = 0;
                foreach ($map['domain_list'] as $item) {
                    $model->domainList[$n++] = null !== $item ? ApiGroupDomainVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
