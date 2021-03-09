<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CreateApplicationRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 应用分组 id
    /**
     * @var string
     */
    public $appDomainId;

    // 应用等级 id
    /**
     * @var string
     */
    public $appLevelId;

    // 页面请求用户无需自行填写此字段。此字段用于代码库的创建权限认证。为 iam 返回的 authorization 值。
    /**
     * @var string
     */
    public $authorization;

    // 技术栈版本
    /**
     * @var string
     */
    public $buildpackVersion;

    // 应用中文名称
    /**
     * @var string
     */
    public $chineseName;

    // 使用已有的代码库。默认为否。
    /**
     * @var bool
     */
    public $codeRepositoryExisted;

    // 代码库 group 名称
    /**
     * @var string
     */
    public $codeRepositoryGroupName;

    // 默认无需填写。代码库名称。默认无需关联代码库。
    /**
     * @var string
     */
    public $codeRepositoryName;

    // 默认为 GITLAB。无代码库时，无需填写。
    /**
     * @var string
     */
    public $codeRepositoryType;

    // 应用描述
    /**
     * @var string
     */
    public $description;

    // 应用名称
    /**
     * @var string
     */
    public $name;

    // 应用负责人 id
    /**
     * @var string
     */
    public $ownerId;

    // 技术栈 id
    /**
     * @var string
     */
    public $stackId;

    // 当设置代码库时，需设置此字段
    /**
     * @var string
     */
    public $workspace;
    protected $_name = [
        'authToken'               => 'auth_token',
        'appDomainId'             => 'app_domain_id',
        'appLevelId'              => 'app_level_id',
        'authorization'           => 'authorization',
        'buildpackVersion'        => 'buildpack_version',
        'chineseName'             => 'chinese_name',
        'codeRepositoryExisted'   => 'code_repository_existed',
        'codeRepositoryGroupName' => 'code_repository_group_name',
        'codeRepositoryName'      => 'code_repository_name',
        'codeRepositoryType'      => 'code_repository_type',
        'description'             => 'description',
        'name'                    => 'name',
        'ownerId'                 => 'owner_id',
        'stackId'                 => 'stack_id',
        'workspace'               => 'workspace',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appDomainId) {
            $res['app_domain_id'] = $this->appDomainId;
        }
        if (null !== $this->appLevelId) {
            $res['app_level_id'] = $this->appLevelId;
        }
        if (null !== $this->authorization) {
            $res['authorization'] = $this->authorization;
        }
        if (null !== $this->buildpackVersion) {
            $res['buildpack_version'] = $this->buildpackVersion;
        }
        if (null !== $this->chineseName) {
            $res['chinese_name'] = $this->chineseName;
        }
        if (null !== $this->codeRepositoryExisted) {
            $res['code_repository_existed'] = $this->codeRepositoryExisted;
        }
        if (null !== $this->codeRepositoryGroupName) {
            $res['code_repository_group_name'] = $this->codeRepositoryGroupName;
        }
        if (null !== $this->codeRepositoryName) {
            $res['code_repository_name'] = $this->codeRepositoryName;
        }
        if (null !== $this->codeRepositoryType) {
            $res['code_repository_type'] = $this->codeRepositoryType;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->ownerId) {
            $res['owner_id'] = $this->ownerId;
        }
        if (null !== $this->stackId) {
            $res['stack_id'] = $this->stackId;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateApplicationRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['app_domain_id'])) {
            $model->appDomainId = $map['app_domain_id'];
        }
        if (isset($map['app_level_id'])) {
            $model->appLevelId = $map['app_level_id'];
        }
        if (isset($map['authorization'])) {
            $model->authorization = $map['authorization'];
        }
        if (isset($map['buildpack_version'])) {
            $model->buildpackVersion = $map['buildpack_version'];
        }
        if (isset($map['chinese_name'])) {
            $model->chineseName = $map['chinese_name'];
        }
        if (isset($map['code_repository_existed'])) {
            $model->codeRepositoryExisted = $map['code_repository_existed'];
        }
        if (isset($map['code_repository_group_name'])) {
            $model->codeRepositoryGroupName = $map['code_repository_group_name'];
        }
        if (isset($map['code_repository_name'])) {
            $model->codeRepositoryName = $map['code_repository_name'];
        }
        if (isset($map['code_repository_type'])) {
            $model->codeRepositoryType = $map['code_repository_type'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['owner_id'])) {
            $model->ownerId = $map['owner_id'];
        }
        if (isset($map['stack_id'])) {
            $model->stackId = $map['stack_id'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}
