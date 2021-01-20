<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\BuildpackParamTemplate;
use AntChain\Deps\Models\BuildpackRegionRelation;

class CreateBuildpackRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'availableTenantNames' => 'available_tenant_names',
        'buildCommand' => 'build_command',
        'contactInfo' => 'contact_info',
        'debugMode' => 'debug_mode',
        'description' => 'description',
        'envParams' => 'env_params',
        'fullVersion' => 'full_version',
        'majorVersion' => 'major_version',
        'minorVersion' => 'minor_version',
        'patchVersion' => 'patch_version',
        'scope' => 'scope',
        'supportedOs' => 'supported_os',
        'supportedRegions' => 'supported_regions',
        'techstackId' => 'techstack_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->availableTenantNames) {
            $res['available_tenant_names'] = $this->availableTenantNames;
        }
        if (null !== $this->buildCommand) {
            $res['build_command'] = $this->buildCommand;
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
        return $res;
    }
    /**
     * @param array $map
     * @return CreateBuildpackRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['available_tenant_names'])){
            if(!empty($map['available_tenant_names'])){
                $model->availableTenantNames = $map['available_tenant_names'];
            }
        }
        if(isset($map['build_command'])){
            $model->buildCommand = $map['build_command'];
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
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 技术栈所支持的租户名称列表
    /**
     * @var string[]
     */
    public $availableTenantNames;

    // 技术栈的编译打包命令
    /**
     * @var string
     */
    public $buildCommand;

    // 分享给其他租户时留下的联系信息
    /**
     * @var string
     */
    public $contactInfo;

    // 当前技术栈是否是debug模式
    /**
     * @var bool
     */
    public $debugMode;

    // 描述
    /**
     * @var string
     */
    public $description;

    // 环境变量
    /**
     * @var BuildpackParamTemplate[]
     */
    public $envParams;

    // 技术栈的版本号
    /**
     * @var string
     */
    public $fullVersion;

    // 主版本号
    /**
     * @var int
     */
    public $majorVersion;

    // 次版本号
    /**
     * @var int
     */
    public $minorVersion;

    // 补丁版本号
    /**
     * @var int
     */
    public $patchVersion;

    // 技术栈的作用域，可以是SYSTEM或者CUSTOM
    /**
     * @var string
     */
    public $scope;

    // 支持的操作系统ID
    /**
     * @var int[]
     */
    public $supportedOs;

    // 技术栈支持的地域信息
    /**
     * @var BuildpackRegionRelation[]
     */
    public $supportedRegions;

    // 技术栈大类的id
    /**
     * @var int
     */
    public $techstackId;

}
