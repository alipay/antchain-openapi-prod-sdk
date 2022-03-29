<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class ApiMeta extends Model
{
    // api名字
    /**
     * @example test
     *
     * @var string
     */
    public $name;

    // api简介
    /**
     * @example test
     *
     * @var string
     */
    public $summary;

    // api负责人
    /**
     * @example linyao.lin
     *
     * @var string
     */
    public $owner;

    // 为true时，不签约的情况下也可以调用
    /**
     * @example true, false
     *
     * @var bool
     */
    public $activationDisabled;

    // 是否对外展示
    /**
     * @example
     *
     * @var bool
     */
    public $internal;

    // unique_id
    /**
     * @example null
     *
     * @var string
     */
    public $defaultUniqueId;

    // 调用路径
    /**
     * @example /iot/reportDeviceEvent
     *
     * @var string
     */
    public $defaultHttpPath;

    // 允许使用的用户类型
    /**
     * @example NULL
     *
     * @var string
     */
    public $allowedUserType;

    // 是否是第三方授权
    /**
     * @example true, false
     *
     * @var bool
     */
    public $thirdPartyAuth;

    // 动作名称
    /**
     * @example NULL
     *
     * @var string
     */
    public $actionName;

    // 角色名称
    /**
     * @example NULL
     *
     * @var string
     */
    public $roleName;

    // api描述
    /**
     * @example test
     *
     * @var string
     */
    public $description;

    // api状态
    /**
     * @example INIT
     *
     * @var string
     */
    public $status;

    // 产品码
    /**
     * @example ABC
     *
     * @var string
     */
    public $providerId;

    // 分组id
    /**
     * @example demo-sit
     *
     * @var string
     */
    public $groupId;

    // 套件id
    /**
     * @example test
     *
     * @var string
     */
    public $apiSuiteId;

    // 扩展参数
    /**
     * @example test
     *
     * @var string
     */
    public $extAttribute;
    protected $_name = [
        'name'               => 'name',
        'summary'            => 'summary',
        'owner'              => 'owner',
        'activationDisabled' => 'activation_disabled',
        'internal'           => 'internal',
        'defaultUniqueId'    => 'default_unique_id',
        'defaultHttpPath'    => 'default_http_path',
        'allowedUserType'    => 'allowed_user_type',
        'thirdPartyAuth'     => 'third_party_auth',
        'actionName'         => 'action_name',
        'roleName'           => 'role_name',
        'description'        => 'description',
        'status'             => 'status',
        'providerId'         => 'provider_id',
        'groupId'            => 'group_id',
        'apiSuiteId'         => 'api_suite_id',
        'extAttribute'       => 'ext_attribute',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('summary', $this->summary, true);
        Model::validateRequired('owner', $this->owner, true);
        Model::validateRequired('activationDisabled', $this->activationDisabled, true);
        Model::validateRequired('internal', $this->internal, true);
        Model::validateRequired('thirdPartyAuth', $this->thirdPartyAuth, true);
        Model::validateRequired('actionName', $this->actionName, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('providerId', $this->providerId, true);
        Model::validateRequired('groupId', $this->groupId, true);
        Model::validateRequired('apiSuiteId', $this->apiSuiteId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->summary) {
            $res['summary'] = $this->summary;
        }
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }
        if (null !== $this->activationDisabled) {
            $res['activation_disabled'] = $this->activationDisabled;
        }
        if (null !== $this->internal) {
            $res['internal'] = $this->internal;
        }
        if (null !== $this->defaultUniqueId) {
            $res['default_unique_id'] = $this->defaultUniqueId;
        }
        if (null !== $this->defaultHttpPath) {
            $res['default_http_path'] = $this->defaultHttpPath;
        }
        if (null !== $this->allowedUserType) {
            $res['allowed_user_type'] = $this->allowedUserType;
        }
        if (null !== $this->thirdPartyAuth) {
            $res['third_party_auth'] = $this->thirdPartyAuth;
        }
        if (null !== $this->actionName) {
            $res['action_name'] = $this->actionName;
        }
        if (null !== $this->roleName) {
            $res['role_name'] = $this->roleName;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->providerId) {
            $res['provider_id'] = $this->providerId;
        }
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }
        if (null !== $this->apiSuiteId) {
            $res['api_suite_id'] = $this->apiSuiteId;
        }
        if (null !== $this->extAttribute) {
            $res['ext_attribute'] = $this->extAttribute;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiMeta
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['summary'])) {
            $model->summary = $map['summary'];
        }
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }
        if (isset($map['activation_disabled'])) {
            $model->activationDisabled = $map['activation_disabled'];
        }
        if (isset($map['internal'])) {
            $model->internal = $map['internal'];
        }
        if (isset($map['default_unique_id'])) {
            $model->defaultUniqueId = $map['default_unique_id'];
        }
        if (isset($map['default_http_path'])) {
            $model->defaultHttpPath = $map['default_http_path'];
        }
        if (isset($map['allowed_user_type'])) {
            $model->allowedUserType = $map['allowed_user_type'];
        }
        if (isset($map['third_party_auth'])) {
            $model->thirdPartyAuth = $map['third_party_auth'];
        }
        if (isset($map['action_name'])) {
            $model->actionName = $map['action_name'];
        }
        if (isset($map['role_name'])) {
            $model->roleName = $map['role_name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['provider_id'])) {
            $model->providerId = $map['provider_id'];
        }
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }
        if (isset($map['api_suite_id'])) {
            $model->apiSuiteId = $map['api_suite_id'];
        }
        if (isset($map['ext_attribute'])) {
            $model->extAttribute = $map['ext_attribute'];
        }

        return $model;
    }
}
