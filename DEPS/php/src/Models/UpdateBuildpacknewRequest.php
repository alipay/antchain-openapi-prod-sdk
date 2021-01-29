<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\BuildpackParamTemplate;
use AntChain\Deps\Models\BuildpackRegionRelation;
use AntChain\Deps\Models\Techstack;
use AntChain\Deps\Models\BuildCommandParams;
use AntChain\Deps\Models\UserDTO;

class UpdateBuildpacknewRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'availableTenantNames' => 'available_tenant_names',
        'buildpackId' => 'buildpack_id',
        'buildpackParams' => 'buildpack_params',
        'contactInfo' => 'contact_info',
        'description' => 'description',
        'envParams' => 'env_params',
        'fullVersion' => 'full_version',
        'id' => 'id',
        'scope' => 'scope',
        'status' => 'status',
        'supportedOs' => 'supported_os',
        'supportedRegions' => 'supported_regions',
        'techstack' => 'techstack',
        'techstackId' => 'techstack_id',
        'buildCommandParams' => 'build_command_params',
        'creator' => 'creator',
        'publisher' => 'publisher',
        'originType' => 'origin_type',
        'appServiceCount' => 'app_service_count',
        'debugMode' => 'debug_mode',
        'majorVersion' => 'major_version',
        'minorVersion' => 'minor_version',
        'patchVersion' => 'patch_version',
        'buildCommand' => 'build_command',
        'createdFrom' => 'created_from',
        'publicationTime' => 'publication_time',
        'creationChain' => 'creation_chain',
        'extraInfo' => 'extra_info',
        'depracationNote' => 'depracation_note',
        'industryLabel' => 'industry_label',
        'creationTime' => 'creation_time',
        'modificationTime' => 'modification_time',
    ];
    public function validate() {
        Model::validatePattern('publicationTime', $this->publicationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('creationTime', $this->creationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('modificationTime', $this->modificationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->availableTenantNames) {
            $res['available_tenant_names'] = $this->availableTenantNames;
        }
        if (null !== $this->buildpackId) {
            $res['buildpack_id'] = $this->buildpackId;
        }
        if (null !== $this->buildpackParams) {
            $res['buildpack_params'] = [];
            if(null !== $this->buildpackParams && is_array($this->buildpackParams)){
                $n = 0;
                foreach($this->buildpackParams as $item){
                    $res['buildpack_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->contactInfo) {
            $res['contact_info'] = $this->contactInfo;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->envParams) {
            $res['env_params'] = [];
            if(null !== $this->envParams && is_array($this->envParams)){
                $n = 0;
                foreach($this->envParams as $item){
                    $res['env_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->fullVersion) {
            $res['full_version'] = $this->fullVersion;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->supportedOs) {
            $res['supported_os'] = $this->supportedOs;
        }
        if (null !== $this->supportedRegions) {
            $res['supported_regions'] = [];
            if(null !== $this->supportedRegions && is_array($this->supportedRegions)){
                $n = 0;
                foreach($this->supportedRegions as $item){
                    $res['supported_regions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->techstack) {
            $res['techstack'] = null !== $this->techstack ? $this->techstack->toMap() : null;
        }
        if (null !== $this->techstackId) {
            $res['techstack_id'] = $this->techstackId;
        }
        if (null !== $this->buildCommandParams) {
            $res['build_command_params'] = [];
            if(null !== $this->buildCommandParams && is_array($this->buildCommandParams)){
                $n = 0;
                foreach($this->buildCommandParams as $item){
                    $res['build_command_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->creator) {
            $res['creator'] = null !== $this->creator ? $this->creator->toMap() : null;
        }
        if (null !== $this->publisher) {
            $res['publisher'] = null !== $this->publisher ? $this->publisher->toMap() : null;
        }
        if (null !== $this->originType) {
            $res['origin_type'] = $this->originType;
        }
        if (null !== $this->appServiceCount) {
            $res['app_service_count'] = $this->appServiceCount;
        }
        if (null !== $this->debugMode) {
            $res['debug_mode'] = $this->debugMode;
        }
        if (null !== $this->majorVersion) {
            $res['major_version'] = $this->majorVersion;
        }
        if (null !== $this->minorVersion) {
            $res['minor_version'] = $this->minorVersion;
        }
        if (null !== $this->patchVersion) {
            $res['patch_version'] = $this->patchVersion;
        }
        if (null !== $this->buildCommand) {
            $res['build_command'] = $this->buildCommand;
        }
        if (null !== $this->createdFrom) {
            $res['created_from'] = $this->createdFrom;
        }
        if (null !== $this->publicationTime) {
            $res['publication_time'] = $this->publicationTime;
        }
        if (null !== $this->creationChain) {
            $res['creation_chain'] = $this->creationChain;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->depracationNote) {
            $res['depracation_note'] = $this->depracationNote;
        }
        if (null !== $this->industryLabel) {
            $res['industry_label'] = $this->industryLabel;
        }
        if (null !== $this->creationTime) {
            $res['creation_time'] = $this->creationTime;
        }
        if (null !== $this->modificationTime) {
            $res['modification_time'] = $this->modificationTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateBuildpacknewRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['available_tenant_names'])){
            if(!empty($map['available_tenant_names'])){
                $model->availableTenantNames = $map['available_tenant_names'];
            }
        }
        if(isset($map['buildpack_id'])){
            $model->buildpackId = $map['buildpack_id'];
        }
        if(isset($map['buildpack_params'])){
            if(!empty($map['buildpack_params'])){
                $model->buildpackParams = [];
                $n = 0;
                foreach($map['buildpack_params'] as $item) {
                    $model->buildpackParams[$n++] = null !== $item ? BuildpackParamTemplate::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['contact_info'])){
            $model->contactInfo = $map['contact_info'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['env_params'])){
            if(!empty($map['env_params'])){
                $model->envParams = [];
                $n = 0;
                foreach($map['env_params'] as $item) {
                    $model->envParams[$n++] = null !== $item ? BuildpackParamTemplate::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['full_version'])){
            $model->fullVersion = $map['full_version'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['scope'])){
            $model->scope = $map['scope'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['supported_os'])){
            if(!empty($map['supported_os'])){
                $model->supportedOs = $map['supported_os'];
            }
        }
        if(isset($map['supported_regions'])){
            if(!empty($map['supported_regions'])){
                $model->supportedRegions = [];
                $n = 0;
                foreach($map['supported_regions'] as $item) {
                    $model->supportedRegions[$n++] = null !== $item ? BuildpackRegionRelation::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['techstack'])){
            $model->techstack = Techstack::fromMap($map['techstack']);
        }
        if(isset($map['techstack_id'])){
            $model->techstackId = $map['techstack_id'];
        }
        if(isset($map['build_command_params'])){
            if(!empty($map['build_command_params'])){
                $model->buildCommandParams = [];
                $n = 0;
                foreach($map['build_command_params'] as $item) {
                    $model->buildCommandParams[$n++] = null !== $item ? BuildCommandParams::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['creator'])){
            $model->creator = UserDTO::fromMap($map['creator']);
        }
        if(isset($map['publisher'])){
            $model->publisher = UserDTO::fromMap($map['publisher']);
        }
        if(isset($map['origin_type'])){
            $model->originType = $map['origin_type'];
        }
        if(isset($map['app_service_count'])){
            $model->appServiceCount = $map['app_service_count'];
        }
        if(isset($map['debug_mode'])){
            $model->debugMode = $map['debug_mode'];
        }
        if(isset($map['major_version'])){
            $model->majorVersion = $map['major_version'];
        }
        if(isset($map['minor_version'])){
            $model->minorVersion = $map['minor_version'];
        }
        if(isset($map['patch_version'])){
            $model->patchVersion = $map['patch_version'];
        }
        if(isset($map['build_command'])){
            $model->buildCommand = $map['build_command'];
        }
        if(isset($map['created_from'])){
            $model->createdFrom = $map['created_from'];
        }
        if(isset($map['publication_time'])){
            $model->publicationTime = $map['publication_time'];
        }
        if(isset($map['creation_chain'])){
            if(!empty($map['creation_chain'])){
                $model->creationChain = $map['creation_chain'];
            }
        }
        if(isset($map['extra_info'])){
            $model->extraInfo = $map['extra_info'];
        }
        if(isset($map['depracation_note'])){
            $model->depracationNote = $map['depracation_note'];
        }
        if(isset($map['industry_label'])){
            $model->industryLabel = $map['industry_label'];
        }
        if(isset($map['creation_time'])){
            $model->creationTime = $map['creation_time'];
        }
        if(isset($map['modification_time'])){
            $model->modificationTime = $map['modification_time'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

    // available_tenant_names
    /**
     * @var string[]
     */
    public $availableTenantNames;

    // buildpack_id
    /**
     * @var string
     */
    public $buildpackId;

    // buildpack_params
    /**
     * @var BuildpackParamTemplate[]
     */
    public $buildpackParams;

    // contactInfo
    /**
     * @var string
     */
    public $contactInfo;

    // description
    /**
     * @var string
     */
    public $description;

    // envParams
    /**
     * @var BuildpackParamTemplate[]
     */
    public $envParams;

    // fullVersion
    /**
     * @var string
     */
    public $fullVersion;

    // id
    /**
     * @var string
     */
    public $id;

    // scope
    /**
     * @var string
     */
    public $scope;

    // status
    /**
     * @var string
     */
    public $status;

    // supportedOs
    /**
     * @var int[]
     */
    public $supportedOs;

    // supported_regions
    /**
     * @var BuildpackRegionRelation[]
     */
    public $supportedRegions;

    // techstack
    /**
     * @var Techstack
     */
    public $techstack;

    // techstack_id
    /**
     * @var string
     */
    public $techstackId;

    // BuildCommandParams
    /**
     * @var BuildCommandParams[]
     */
    public $buildCommandParams;

    // creator
    /**
     * @var UserDTO
     */
    public $creator;

    // publisher
    /**
     * @var UserDTO
     */
    public $publisher;

    // originType
    /**
     * @var string
     */
    public $originType;

    // appServiceCount
    /**
     * @var int
     */
    public $appServiceCount;

    // debugMode
    /**
     * @var bool
     */
    public $debugMode;

    // majorVersion
    /**
     * @var int
     */
    public $majorVersion;

    // minorVersion
    /**
     * @var int
     */
    public $minorVersion;

    // patchVersion
    /**
     * @var int
     */
    public $patchVersion;

    // buildCommand
    /**
     * @var string
     */
    public $buildCommand;

    // createdFrom
    /**
     * @var string
     */
    public $createdFrom;

    // publicationTime
    /**
     * @var string
     */
    public $publicationTime;

    // creationChain
    /**
     * @var string[]
     */
    public $creationChain;

    // extraInfo
    /**
     * @var string
     */
    public $extraInfo;

    // depracationNote
    /**
     * @var string
     */
    public $depracationNote;

    // industryLabel
    /**
     * @var string
     */
    public $industryLabel;

    // creationTime
    /**
     * @var string
     */
    public $creationTime;

    // modificationTime
    /**
     * @var string
     */
    public $modificationTime;

}
