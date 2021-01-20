<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\BuildpackParamTemplate;
use AntChain\Deps\Models\BuildCommandParams;
use AntChain\Deps\Models\UserDTO;
use AntChain\Deps\Models\UploadEndpoint;
use AntChain\Deps\Models\BuildpackOS;
use AntChain\Deps\Models\BuildpackRegionRelationDetail;
use AntChain\Deps\Models\Techstack;

class BuildpackDetailVO extends Model {
    protected $_name = [
        'appServiceCount' => 'app_service_count',
        'availableTenantNames' => 'available_tenant_names',
        'buildpackParams' => 'buildpack_params',
        'buildCommand' => 'build_command',
        'buildCommandParams' => 'build_command_params',
        'contactInfo' => 'contact_info',
        'createdFrom' => 'created_from',
        'creationChain' => 'creation_chain',
        'creationTime' => 'creation_time',
        'creator' => 'creator',
        'debugMode' => 'debug_mode',
        'depracationNote' => 'depracation_note',
        'description' => 'description',
        'extraInfo' => 'extra_info',
        'fullVersion' => 'full_version',
        'id' => 'id',
        'industryLabel' => 'industry_label',
        'majorVersion' => 'major_version',
        'minorVersion' => 'minor_version',
        'modificationTime' => 'modification_time',
        'originType' => 'origin_type',
        'patchVersion' => 'patch_version',
        'publicationTime' => 'publication_time',
        'publisher' => 'publisher',
        'scope' => 'scope',
        'status' => 'status',
        'storageUploadEndpoints' => 'storage_upload_endpoints',
        'supportedOS' => 'supported_o_s',
        'supportedRegions' => 'supported_regions',
        'techstack' => 'techstack',
        'tenantId' => 'tenant_id',
    ];
    public function validate() {
        Model::validatePattern('creationTime', $this->creationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('modificationTime', $this->modificationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('publicationTime', $this->publicationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->appServiceCount) {
            $res['app_service_count'] = $this->appServiceCount;
        }
        if (null !== $this->availableTenantNames) {
            $res['available_tenant_names'] = $this->availableTenantNames;
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
        if (null !== $this->buildCommand) {
            $res['build_command'] = $this->buildCommand;
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
        if (null !== $this->contactInfo) {
            $res['contact_info'] = $this->contactInfo;
        }
        if (null !== $this->createdFrom) {
            $res['created_from'] = $this->createdFrom;
        }
        if (null !== $this->creationChain) {
            $res['creation_chain'] = $this->creationChain;
        }
        if (null !== $this->creationTime) {
            $res['creation_time'] = $this->creationTime;
        }
        if (null !== $this->creator) {
            $res['creator'] = null !== $this->creator ? $this->creator->toMap() : null;
        }
        if (null !== $this->debugMode) {
            $res['debug_mode'] = $this->debugMode;
        }
        if (null !== $this->depracationNote) {
            $res['depracation_note'] = $this->depracationNote;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->fullVersion) {
            $res['full_version'] = $this->fullVersion;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->industryLabel) {
            $res['industry_label'] = $this->industryLabel;
        }
        if (null !== $this->majorVersion) {
            $res['major_version'] = $this->majorVersion;
        }
        if (null !== $this->minorVersion) {
            $res['minor_version'] = $this->minorVersion;
        }
        if (null !== $this->modificationTime) {
            $res['modification_time'] = $this->modificationTime;
        }
        if (null !== $this->originType) {
            $res['origin_type'] = $this->originType;
        }
        if (null !== $this->patchVersion) {
            $res['patch_version'] = $this->patchVersion;
        }
        if (null !== $this->publicationTime) {
            $res['publication_time'] = $this->publicationTime;
        }
        if (null !== $this->publisher) {
            $res['publisher'] = null !== $this->publisher ? $this->publisher->toMap() : null;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->storageUploadEndpoints) {
            $res['storage_upload_endpoints'] = [];
            if(null !== $this->storageUploadEndpoints && is_array($this->storageUploadEndpoints)){
                $n = 0;
                foreach($this->storageUploadEndpoints as $item){
                    $res['storage_upload_endpoints'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->supportedOS) {
            $res['supported_o_s'] = [];
            if(null !== $this->supportedOS && is_array($this->supportedOS)){
                $n = 0;
                foreach($this->supportedOS as $item){
                    $res['supported_o_s'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return BuildpackDetailVO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['app_service_count'])){
            $model->appServiceCount = $map['app_service_count'];
        }
        if(isset($map['available_tenant_names'])){
            if(!empty($map['available_tenant_names'])){
                $model->availableTenantNames = $map['available_tenant_names'];
            }
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
        if(isset($map['build_command'])){
            $model->buildCommand = $map['build_command'];
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
        if(isset($map['contact_info'])){
            $model->contactInfo = $map['contact_info'];
        }
        if(isset($map['created_from'])){
            $model->createdFrom = $map['created_from'];
        }
        if(isset($map['creation_chain'])){
            if(!empty($map['creation_chain'])){
                $model->creationChain = $map['creation_chain'];
            }
        }
        if(isset($map['creation_time'])){
            $model->creationTime = $map['creation_time'];
        }
        if(isset($map['creator'])){
            $model->creator = UserDTO::fromMap($map['creator']);
        }
        if(isset($map['debug_mode'])){
            $model->debugMode = $map['debug_mode'];
        }
        if(isset($map['depracation_note'])){
            $model->depracationNote = $map['depracation_note'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['extra_info'])){
            $model->extraInfo = $map['extra_info'];
        }
        if(isset($map['full_version'])){
            $model->fullVersion = $map['full_version'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['industry_label'])){
            $model->industryLabel = $map['industry_label'];
        }
        if(isset($map['major_version'])){
            $model->majorVersion = $map['major_version'];
        }
        if(isset($map['minor_version'])){
            $model->minorVersion = $map['minor_version'];
        }
        if(isset($map['modification_time'])){
            $model->modificationTime = $map['modification_time'];
        }
        if(isset($map['origin_type'])){
            $model->originType = $map['origin_type'];
        }
        if(isset($map['patch_version'])){
            $model->patchVersion = $map['patch_version'];
        }
        if(isset($map['publication_time'])){
            $model->publicationTime = $map['publication_time'];
        }
        if(isset($map['publisher'])){
            $model->publisher = UserDTO::fromMap($map['publisher']);
        }
        if(isset($map['scope'])){
            $model->scope = $map['scope'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['storage_upload_endpoints'])){
            if(!empty($map['storage_upload_endpoints'])){
                $model->storageUploadEndpoints = [];
                $n = 0;
                foreach($map['storage_upload_endpoints'] as $item) {
                    $model->storageUploadEndpoints[$n++] = null !== $item ? UploadEndpoint::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['supported_o_s'])){
            if(!empty($map['supported_o_s'])){
                $model->supportedOS = [];
                $n = 0;
                foreach($map['supported_o_s'] as $item) {
                    $model->supportedOS[$n++] = null !== $item ? BuildpackOS::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['supported_regions'])){
            if(!empty($map['supported_regions'])){
                $model->supportedRegions = [];
                $n = 0;
                foreach($map['supported_regions'] as $item) {
                    $model->supportedRegions[$n++] = null !== $item ? BuildpackRegionRelationDetail::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['techstack'])){
            $model->techstack = Techstack::fromMap($map['techstack']);
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        return $model;
    }
    // appServiceCount
    /**
     * @example 111
     * @var int
     */
    public $appServiceCount;

    // availableTenantNames
    /**
     * @example 
     * @var string[]
     */
    public $availableTenantNames;

    // buildpack_params
    /**
     * @example 
     * @var BuildpackParamTemplate[]
     */
    public $buildpackParams;

    // buildCommand
    /**
     * @example buildCommand
     * @var string
     */
    public $buildCommand;

    // build_commandp_params
    /**
     * @example 
     * @var BuildCommandParams[]
     */
    public $buildCommandParams;

    // contactInfo
    /**
     * @example contactInfo
     * @var string
     */
    public $contactInfo;

    // createdFrom
    /**
     * @example createdFrom
     * @var string
     */
    public $createdFrom;

    // creationChain
    /**
     * @example 
     * @var string[]
     */
    public $creationChain;

    // creationTime
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $creationTime;

    // creator
    /**
     * @example 
     * @var UserDTO
     */
    public $creator;

    // debugMode
    /**
     * @example true, false
     * @var bool
     */
    public $debugMode;

    // depracationNote
    /**
     * @example depracationNote
     * @var string
     */
    public $depracationNote;

    // description
    /**
     * @example description
     * @var string
     */
    public $description;

    // extraInfo
    /**
     * @example extraInfo
     * @var string
     */
    public $extraInfo;

    // fullVersion
    /**
     * @example fullVersion
     * @var string
     */
    public $fullVersion;

    // id
    /**
     * @example id
     * @var string
     */
    public $id;

    // industryLabel
    /**
     * @example industryLabel
     * @var string
     */
    public $industryLabel;

    // majorVersion
    /**
     * @example 
     * @var int
     */
    public $majorVersion;

    // minorVersion
    /**
     * @example 
     * @var int
     */
    public $minorVersion;

    // modificationTime
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $modificationTime;

    // originType
    /**
     * @example originType
     * @var string
     */
    public $originType;

    // patchVersion
    /**
     * @example 
     * @var int
     */
    public $patchVersion;

    // publicationTime
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $publicationTime;

    // publisher
    /**
     * @example 
     * @var UserDTO
     */
    public $publisher;

    // scope
    /**
     * @example scope
     * @var string
     */
    public $scope;

    // status
    /**
     * @example status
     * @var string
     */
    public $status;

    // storageUploadEndpoints
    /**
     * @example 
     * @var UploadEndpoint[]
     */
    public $storageUploadEndpoints;

    // supportedOS
    /**
     * @example 
     * @var BuildpackOS[]
     */
    public $supportedOS;

    // supportedRegions
    /**
     * @example 
     * @var BuildpackRegionRelationDetail[]
     */
    public $supportedRegions;

    // techstack
    /**
     * @example 
     * @var Techstack
     */
    public $techstack;

    // tenantId
    /**
     * @example tenantId
     * @var string
     */
    public $tenantId;

}
