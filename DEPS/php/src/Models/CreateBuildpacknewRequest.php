<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\BuildpackParamTemplate;
use AntChain\Deps\Models\BuildCommandParams;
use AntChain\Deps\Models\BuildpackRegionRelation;
use AntChain\Deps\Models\Techstack;

class CreateBuildpacknewRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'availableTenantNames' => 'available_tenant_names',
        'buildpackParams' => 'buildpack_params',
        'buildCommand' => 'build_command',
        'buildCommandParams' => 'build_command_params',
        'contactInfo' => 'contact_info',
        'debugMode' => 'debug_mode',
        'description' => 'description',
        'fullVersion' => 'full_version',
        'majorVersion' => 'major_version',
        'minorVersion' => 'minor_version',
        'patchVersion' => 'patch_version',
        'scope' => 'scope',
        'storageUploadEndpoints' => 'storage_upload_endpoints',
        'supportedOs' => 'supported_os',
        'supportedRegions' => 'supported_regions',
        'techstackId' => 'techstack_id',
        'techstack' => 'techstack',
        'status' => 'status',
        'id' => 'id',
    ];
    public function validate() {}
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
        if (null !== $this->debugMode) {
            $res['debug_mode'] = $this->debugMode;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->fullVersion) {
            $res['full_version'] = $this->fullVersion;
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
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->storageUploadEndpoints) {
            $res['storage_upload_endpoints'] = $this->storageUploadEndpoints;
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
        if (null !== $this->techstackId) {
            $res['techstack_id'] = $this->techstackId;
        }
        if (null !== $this->techstack) {
            $res['techstack'] = null !== $this->techstack ? $this->techstack->toMap() : null;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateBuildpacknewRequest
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
        if(isset($map['debug_mode'])){
            $model->debugMode = $map['debug_mode'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['full_version'])){
            $model->fullVersion = $map['full_version'];
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
        if(isset($map['scope'])){
            $model->scope = $map['scope'];
        }
        if(isset($map['storage_upload_endpoints'])){
            $model->storageUploadEndpoints = $map['storage_upload_endpoints'];
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
        if(isset($map['techstack_id'])){
            $model->techstackId = $map['techstack_id'];
        }
        if(isset($map['techstack'])){
            $model->techstack = Techstack::fromMap($map['techstack']);
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
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

    // availableTenantNames
    /**
     * @var string[]
     */
    public $availableTenantNames;

    // buildpackParams
    /**
     * @var BuildpackParamTemplate[]
     */
    public $buildpackParams;

    // buildCommand
    /**
     * @var string
     */
    public $buildCommand;

    // buildCommandParams
    /**
     * @var BuildCommandParams[]
     */
    public $buildCommandParams;

    // contact_info
    // 
    /**
     * @var string
     */
    public $contactInfo;

    // debug_mode
    // 
    /**
     * @var bool
     */
    public $debugMode;

    // description
    /**
     * @var string
     */
    public $description;

    // full_version
    // 
    /**
     * @var string
     */
    public $fullVersion;

    // major_version
    // 
    /**
     * @var int
     */
    public $majorVersion;

    // minor_version
    // 
    /**
     * @var int
     */
    public $minorVersion;

    // patch_version
    // 
    /**
     * @var int
     */
    public $patchVersion;

    // scope
    // 
    /**
     * @var string
     */
    public $scope;

    // StorageUploadEndpoint
    /**
     * @var string
     */
    public $storageUploadEndpoints;

    // supported_os
    // 
    /**
     * @var int[]
     */
    public $supportedOs;

    // supported_regions
    // 
    /**
     * @var BuildpackRegionRelation[]
     */
    public $supportedRegions;

    // techstack_id
    // 
    /**
     * @var int
     */
    public $techstackId;

    // techstack
    /**
     * @var Techstack
     */
    public $techstack;

    // status
    /**
     * @var string
     */
    public $status;

    // id
    /**
     * @var string
     */
    public $id;

}
