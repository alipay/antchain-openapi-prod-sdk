<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CodeRepository extends Model
{
    // 代码仓库ID
    /**
     * @example 123
     *
     * @var string
     */
    public $id;

    // 名称
    /**
     * @example gitlab
     *
     * @var string
     */
    public $name;

    // VCS源代码管理系统
    /**
     * @example git | svn
     *
     * @var string
     */
    public $type;

    // 负责人
    /**
     * @example owner name
     *
     * @var string
     */
    public $owner;

    // 源代码地址
    /**
     * @example gitlab
     *
     * @var string
     */
    public $sourceLocation;

    // 被SCM管理的远程仓库ID
    /**
     * @example 123
     *
     * @var string
     */
    public $remoteRepoId;

    // 流程标记id(可选参数)
    /**
     * @example 1234
     *
     * @var string
     */
    public $instanceId;

    // 是否初始化目录(可选参数，目前金融云传与不传都不初始化)
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isInitStandardPath;

    // 代码库是否可复用(默认为不复用 0)
    /**
     * @example "0"
     *
     * @var string
     */
    public $repoReuse;

    // 父代码库名称(reposReuse为0时可以不传)
    /**
     * @example test
     *
     * @var string
     */
    public $parentReposName;

    // 代码仓库状态
    /**
     * @example CREATING, CREATE_FAILED, GENERATING_CODE, GENERATING_CODE_FAILED, FINISHED
     *
     * @var string
     */
    public $status;

    // 扩展参数，JSON字符串
    /**
     * @example "{}"
     *
     * @var string
     */
    public $extraParams;

    // 是否使用已有仓库
    /**
     * @example true, false
     *
     * @var bool
     */
    public $useExist;

    // 分组名称
    /**
     * @example test
     *
     * @var string
     */
    public $groupName;
    protected $_name = [
        'id'                 => 'id',
        'name'               => 'name',
        'type'               => 'type',
        'owner'              => 'owner',
        'sourceLocation'     => 'source_location',
        'remoteRepoId'       => 'remote_repo_id',
        'instanceId'         => 'instance_id',
        'isInitStandardPath' => 'is_init_standard_path',
        'repoReuse'          => 'repo_reuse',
        'parentReposName'    => 'parent_repos_name',
        'status'             => 'status',
        'extraParams'        => 'extra_params',
        'useExist'           => 'use_exist',
        'groupName'          => 'group_name',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }
        if (null !== $this->sourceLocation) {
            $res['source_location'] = $this->sourceLocation;
        }
        if (null !== $this->remoteRepoId) {
            $res['remote_repo_id'] = $this->remoteRepoId;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->isInitStandardPath) {
            $res['is_init_standard_path'] = $this->isInitStandardPath;
        }
        if (null !== $this->repoReuse) {
            $res['repo_reuse'] = $this->repoReuse;
        }
        if (null !== $this->parentReposName) {
            $res['parent_repos_name'] = $this->parentReposName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->extraParams) {
            $res['extra_params'] = $this->extraParams;
        }
        if (null !== $this->useExist) {
            $res['use_exist'] = $this->useExist;
        }
        if (null !== $this->groupName) {
            $res['group_name'] = $this->groupName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CodeRepository
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }
        if (isset($map['source_location'])) {
            $model->sourceLocation = $map['source_location'];
        }
        if (isset($map['remote_repo_id'])) {
            $model->remoteRepoId = $map['remote_repo_id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['is_init_standard_path'])) {
            $model->isInitStandardPath = $map['is_init_standard_path'];
        }
        if (isset($map['repo_reuse'])) {
            $model->repoReuse = $map['repo_reuse'];
        }
        if (isset($map['parent_repos_name'])) {
            $model->parentReposName = $map['parent_repos_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['extra_params'])) {
            $model->extraParams = $map['extra_params'];
        }
        if (isset($map['use_exist'])) {
            $model->useExist = $map['use_exist'];
        }
        if (isset($map['group_name'])) {
            $model->groupName = $map['group_name'];
        }

        return $model;
    }
}
