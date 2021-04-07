<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AppView extends Model
{
    // 应用组id
    /**
     * @example 123
     *
     * @var string
     */
    public $appDomainId;

    // 应用扩展信息
    /**
     * @example
     *
     * @var AppExtraInfo[]
     */
    public $appExtraInfos;

    // 应用等级
    /**
     * @example {}
     *
     * @var AppLevel
     */
    public $appLevel;

    // 应用负责人
    /**
     * @example
     *
     * @var AppOwner
     */
    public $appOwner;

    // scm sofa archetype
    /**
     * @example
     *
     * @var ScmSofaArchetype
     */
    public $archetype;

    // 技术栈版本
    /**
     * @example 123
     *
     * @var string
     */
    public $buildpackVersion;

    // 中文名称
    /**
     * @example test
     *
     * @var string
     */
    public $chineseName;

    // 代码仓库
    /**
     * @example gitlab
     *
     * @var CodeRepository
     */
    public $codeRepository;

    // 描述信息
    /**
     * @example 描述信息
     *
     * @var string
     */
    public $description;

    // 扩展参数，JSOn字符串
    /**
     * @example "{}"
     *
     * @var string
     */
    public $extraParams;

    // 应用ID
    /**
     * @example 123
     *
     * @var string
     */
    public $id;

    // 是否组件中心应用
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isService;

    // 应用名称
    /**
     * @example test
     *
     * @var string
     */
    public $name;

    // 负责人ID
    /**
     * @example 123
     *
     * @var string
     */
    public $ownerId;

    // 技术栈所属分类ID
    /**
     * @example 123
     *
     * @var string
     */
    public $stackId;

    // 应用状态
    /**
     * @example CREATING, CREATED, CREATE_FAILED, DELETING, DELETED, DELETE_FAILED, UPDATING, UPDATE_CODE_REPO_FAILED, INIT_CODE_REPO_FAILED
     *
     * @var string
     */
    public $status;

    // 应用标签，JSOn字符串
    /**
     * @example "{}"
     *
     * @var string
     */
    public $tags;

    // 租户ID
    /**
     * @example 123
     *
     * @var string
     */
    public $tenantId;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcCreate;

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcModified;

    // 工作空间ID
    /**
     * @example 123
     *
     * @var string
     */
    public $workspaceId;

    // 负责人名称
    /**
     * @example test
     *
     * @var string
     */
    public $ownerName;

    // 应用负责人真实名称
    /**
     * @example test
     *
     * @var string
     */
    public $realOwnerName;

    // 应用域路径名
    /**
     * @example
     *
     * @var string[]
     */
    public $domainNames;

    // 应用分组名称
    /**
     * @example test
     *
     * @var string
     */
    public $appDomainName;

    // 应用等级名称
    /**
     * @example test
     *
     * @var string
     */
    public $appLevelName;

    // 技术栈名称
    /**
     * @example test
     *
     * @var string
     */
    public $stackName;

    // 技术栈版本
    /**
     * @example test
     *
     * @var string
     */
    public $stackVersion;

    // 服务器数量
    /**
     * @example
     *
     * @var int
     */
    public $containerCount;

    // 数据库个数
    /**
     * @example
     *
     * @var int
     */
    public $databaseCount;

    // SLB个数
    /**
     * @example
     *
     * @var int
     */
    public $slbCount;

    // ocs个数
    /**
     * @example
     *
     * @var int
     */
    public $ocsCount;

    // 发布包个数
    /**
     * @example
     *
     * @var int
     */
    public $packageCount;

    // 生命周期信息
    /**
     * @example
     *
     * @var AppLifeCycle
     */
    public $lifeCycle;
    protected $_name = [
        'appDomainId'      => 'app_domain_id',
        'appExtraInfos'    => 'app_extra_infos',
        'appLevel'         => 'app_level',
        'appOwner'         => 'app_owner',
        'archetype'        => 'archetype',
        'buildpackVersion' => 'buildpack_version',
        'chineseName'      => 'chinese_name',
        'codeRepository'   => 'code_repository',
        'description'      => 'description',
        'extraParams'      => 'extra_params',
        'id'               => 'id',
        'isService'        => 'is_service',
        'name'             => 'name',
        'ownerId'          => 'owner_id',
        'stackId'          => 'stack_id',
        'status'           => 'status',
        'tags'             => 'tags',
        'tenantId'         => 'tenant_id',
        'utcCreate'        => 'utc_create',
        'utcModified'      => 'utc_modified',
        'workspaceId'      => 'workspace_id',
        'ownerName'        => 'owner_name',
        'realOwnerName'    => 'real_owner_name',
        'domainNames'      => 'domain_names',
        'appDomainName'    => 'app_domain_name',
        'appLevelName'     => 'app_level_name',
        'stackName'        => 'stack_name',
        'stackVersion'     => 'stack_version',
        'containerCount'   => 'container_count',
        'databaseCount'    => 'database_count',
        'slbCount'         => 'slb_count',
        'ocsCount'         => 'ocs_count',
        'packageCount'     => 'package_count',
        'lifeCycle'        => 'life_cycle',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('stackId', $this->stackId, true);
        Model::validateRequired('realOwnerName', $this->realOwnerName, true);
        Model::validateRequired('appDomainName', $this->appDomainName, true);
        Model::validateRequired('appLevelName', $this->appLevelName, true);
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appDomainId) {
            $res['app_domain_id'] = $this->appDomainId;
        }
        if (null !== $this->appExtraInfos) {
            $res['app_extra_infos'] = [];
            if (null !== $this->appExtraInfos && \is_array($this->appExtraInfos)) {
                $n = 0;
                foreach ($this->appExtraInfos as $item) {
                    $res['app_extra_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->appLevel) {
            $res['app_level'] = null !== $this->appLevel ? $this->appLevel->toMap() : null;
        }
        if (null !== $this->appOwner) {
            $res['app_owner'] = null !== $this->appOwner ? $this->appOwner->toMap() : null;
        }
        if (null !== $this->archetype) {
            $res['archetype'] = null !== $this->archetype ? $this->archetype->toMap() : null;
        }
        if (null !== $this->buildpackVersion) {
            $res['buildpack_version'] = $this->buildpackVersion;
        }
        if (null !== $this->chineseName) {
            $res['chinese_name'] = $this->chineseName;
        }
        if (null !== $this->codeRepository) {
            $res['code_repository'] = null !== $this->codeRepository ? $this->codeRepository->toMap() : null;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->extraParams) {
            $res['extra_params'] = $this->extraParams;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->isService) {
            $res['is_service'] = $this->isService;
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tags) {
            $res['tags'] = $this->tags;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->ownerName) {
            $res['owner_name'] = $this->ownerName;
        }
        if (null !== $this->realOwnerName) {
            $res['real_owner_name'] = $this->realOwnerName;
        }
        if (null !== $this->domainNames) {
            $res['domain_names'] = $this->domainNames;
        }
        if (null !== $this->appDomainName) {
            $res['app_domain_name'] = $this->appDomainName;
        }
        if (null !== $this->appLevelName) {
            $res['app_level_name'] = $this->appLevelName;
        }
        if (null !== $this->stackName) {
            $res['stack_name'] = $this->stackName;
        }
        if (null !== $this->stackVersion) {
            $res['stack_version'] = $this->stackVersion;
        }
        if (null !== $this->containerCount) {
            $res['container_count'] = $this->containerCount;
        }
        if (null !== $this->databaseCount) {
            $res['database_count'] = $this->databaseCount;
        }
        if (null !== $this->slbCount) {
            $res['slb_count'] = $this->slbCount;
        }
        if (null !== $this->ocsCount) {
            $res['ocs_count'] = $this->ocsCount;
        }
        if (null !== $this->packageCount) {
            $res['package_count'] = $this->packageCount;
        }
        if (null !== $this->lifeCycle) {
            $res['life_cycle'] = null !== $this->lifeCycle ? $this->lifeCycle->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppView
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_domain_id'])) {
            $model->appDomainId = $map['app_domain_id'];
        }
        if (isset($map['app_extra_infos'])) {
            if (!empty($map['app_extra_infos'])) {
                $model->appExtraInfos = [];
                $n                    = 0;
                foreach ($map['app_extra_infos'] as $item) {
                    $model->appExtraInfos[$n++] = null !== $item ? AppExtraInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['app_level'])) {
            $model->appLevel = AppLevel::fromMap($map['app_level']);
        }
        if (isset($map['app_owner'])) {
            $model->appOwner = AppOwner::fromMap($map['app_owner']);
        }
        if (isset($map['archetype'])) {
            $model->archetype = ScmSofaArchetype::fromMap($map['archetype']);
        }
        if (isset($map['buildpack_version'])) {
            $model->buildpackVersion = $map['buildpack_version'];
        }
        if (isset($map['chinese_name'])) {
            $model->chineseName = $map['chinese_name'];
        }
        if (isset($map['code_repository'])) {
            $model->codeRepository = CodeRepository::fromMap($map['code_repository']);
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['extra_params'])) {
            $model->extraParams = $map['extra_params'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['is_service'])) {
            $model->isService = $map['is_service'];
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
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['tags'])) {
            $model->tags = $map['tags'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['utc_modified'])) {
            $model->utcModified = $map['utc_modified'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['owner_name'])) {
            $model->ownerName = $map['owner_name'];
        }
        if (isset($map['real_owner_name'])) {
            $model->realOwnerName = $map['real_owner_name'];
        }
        if (isset($map['domain_names'])) {
            if (!empty($map['domain_names'])) {
                $model->domainNames = $map['domain_names'];
            }
        }
        if (isset($map['app_domain_name'])) {
            $model->appDomainName = $map['app_domain_name'];
        }
        if (isset($map['app_level_name'])) {
            $model->appLevelName = $map['app_level_name'];
        }
        if (isset($map['stack_name'])) {
            $model->stackName = $map['stack_name'];
        }
        if (isset($map['stack_version'])) {
            $model->stackVersion = $map['stack_version'];
        }
        if (isset($map['container_count'])) {
            $model->containerCount = $map['container_count'];
        }
        if (isset($map['database_count'])) {
            $model->databaseCount = $map['database_count'];
        }
        if (isset($map['slb_count'])) {
            $model->slbCount = $map['slb_count'];
        }
        if (isset($map['ocs_count'])) {
            $model->ocsCount = $map['ocs_count'];
        }
        if (isset($map['package_count'])) {
            $model->packageCount = $map['package_count'];
        }
        if (isset($map['life_cycle'])) {
            $model->lifeCycle = AppLifeCycle::fromMap($map['life_cycle']);
        }

        return $model;
    }
}
