<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class UpdateApplicationRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // appDomainId
    /**
     * @var string
     */
    public $appDomainId;

    // appExtraInfos
    /**
     * @var AppExtraInfo[]
     */
    public $appExtraInfos;

    // 应用等级
    /**
     * @var AppLevel
     */
    public $appLevel;

    // appOwner
    /**
     * @var AppOwner
     */
    public $appOwner;

    // archetype
    /**
     * @var ScmSofaArchetype
     */
    public $archetype;

    // buildpackVersion
    /**
     * @var string
     */
    public $buildpackVersion;

    // 中文名称
    /**
     * @var string
     */
    public $chineseName;

    // 代码库
    /**
     * @var CodeRepository
     */
    public $codeRepository;

    // 描述
    /**
     * @var string
     */
    public $description;

    // 额外信息
    /**
     * @var string
     */
    public $extraParams;

    // id
    /**
     * @var string
     */
    public $id;

    // isService
    /**
     * @var bool
     */
    public $isService;

    // name
    /**
     * @var string
     */
    public $name;

    // ownerId
    /**
     * @var string
     */
    public $ownerId;

    // stack_id
    /**
     * @var string
     */
    public $stackId;

    // 状态
    /**
     * @var string
     */
    public $status;

    // tags
    /**
     * @var string
     */
    public $tags;

    // 创建时间
    /**
     * @var string
     */
    public $utcCreate;

    // 修改时间
    /**
     * @var string
     */
    public $utcModified;

    // workspace_id
    /**
     * @var string
     */
    public $workspaceId;
    protected $_name = [
        'authToken'        => 'auth_token',
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
        'utcCreate'        => 'utc_create',
        'utcModified'      => 'utc_modified',
        'workspaceId'      => 'workspace_id',
    ];

    public function validate()
    {
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateApplicationRequest
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
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['utc_modified'])) {
            $model->utcModified = $map['utc_modified'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }

        return $model;
    }
}
