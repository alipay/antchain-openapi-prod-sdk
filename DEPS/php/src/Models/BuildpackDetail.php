<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\BuildpackOS;
use AntChain\Deps\Models\BuildpackRegionRelationDetail;
use AntChain\Deps\Models\Techstack;

class BuildpackDetail extends Model {
    protected $_name = [
        'appServiceCount' => 'app_service_count',
        'availableTenantNames' => 'available_tenant_names',
        'buildCommand' => 'build_command',
        'contactInfo' => 'contact_info',
        'createdFrom' => 'created_from',
        'creationChain' => 'creation_chain',
        'creationTime' => 'creation_time',
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
        'publicationTimeDate' => 'publication_time_date',
        'scope' => 'scope',
        'status' => 'status',
        'supportedOs' => 'supported_os',
        'supportedRegions' => 'supported_regions',
        'supportedRegionsList' => 'supported_regions_list',
        'techstack' => 'techstack',
        'techstackId' => 'techstack_id',
        'tenantId' => 'tenant_id',
    ];
    public function validate() {
        Model::validatePattern('creationTime', $this->creationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('modificationTime', $this->modificationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('publicationTimeDate', $this->publicationTimeDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->appServiceCount) {
            $res['app_service_count'] = $this->appServiceCount;
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
        if (null !== $this->createdFrom) {
            $res['created_from'] = $this->createdFrom;
        }
        if (null !== $this->creationChain) {
            $res['creation_chain'] = $this->creationChain;
        }
        if (null !== $this->creationTime) {
            $res['creation_time'] = $this->creationTime;
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
        if (null !== $this->publicationTimeDate) {
            $res['publication_time_date'] = $this->publicationTimeDate;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->supportedOs) {
            $res['supported_os'] = [];
            if(null !== $this->supportedOs && is_array($this->supportedOs)){
                $n = 0;
                foreach($this->supportedOs as $item){
                    $res['supported_os'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->supportedRegions) {
            $res['supported_regions'] = $this->supportedRegions;
        }
        if (null !== $this->supportedRegionsList) {
            $res['supported_regions_list'] = [];
            if(null !== $this->supportedRegionsList && is_array($this->supportedRegionsList)){
                $n = 0;
                foreach($this->supportedRegionsList as $item){
                    $res['supported_regions_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->techstack) {
            $res['techstack'] = null !== $this->techstack ? $this->techstack->toMap() : null;
        }
        if (null !== $this->techstackId) {
            $res['techstack_id'] = $this->techstackId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return BuildpackDetail
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
        if(isset($map['build_command'])){
            $model->buildCommand = $map['build_command'];
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
        if(isset($map['publication_time_date'])){
            $model->publicationTimeDate = $map['publication_time_date'];
        }
        if(isset($map['scope'])){
            $model->scope = $map['scope'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['supported_os'])){
            if(!empty($map['supported_os'])){
                $model->supportedOs = [];
                $n = 0;
                foreach($map['supported_os'] as $item) {
                    $model->supportedOs[$n++] = null !== $item ? BuildpackOS::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['supported_regions'])){
            if(!empty($map['supported_regions'])){
                $model->supportedRegions = $map['supported_regions'];
            }
        }
        if(isset($map['supported_regions_list'])){
            if(!empty($map['supported_regions_list'])){
                $model->supportedRegionsList = [];
                $n = 0;
                foreach($map['supported_regions_list'] as $item) {
                    $model->supportedRegionsList[$n++] = null !== $item ? BuildpackRegionRelationDetail::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['techstack'])){
            $model->techstack = Techstack::fromMap($map['techstack']);
        }
        if(isset($map['techstack_id'])){
            $model->techstackId = $map['techstack_id'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        return $model;
    }
    // 使用该技术栈版本的appservice的数量
    /**
     * @example 2
     * @var int
     */
    public $appServiceCount;

    // 可以使用该技术栈版本的租户ID
    /**
     * @example 
     * @var string[]
     */
    public $availableTenantNames;

    // buildCommand
    /**
     * @example buildCommand
     * @var string
     */
    public $buildCommand;

    // 分享给其他租户留下的联系信息
    /**
     * @example 
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

    // 当前技术栈版本是否是debug模式
    /**
     * @example 
     * @var bool
     */
    public $debugMode;

    // 废弃技术栈版本的原因
    /**
     * @example 
     * @var string
     */
    public $depracationNote;

    // 描述
    /**
     * @example 
     * @var string
     */
    public $description;

    // extraInfo
    /**
     * @example extraInfo
     * @var string
     */
    public $extraInfo;

    // 技术栈版本号
    /**
     * @example 
     * @var string
     */
    public $fullVersion;

    // 技术栈版本ID
    /**
     * @example 
     * @var string
     */
    public $id;

    // 行业标志,I(金区)或者N(非金区)
    /**
     * @example 
     * @var string
     */
    public $industryLabel;

    // 主要版本号
    /**
     * @example 
     * @var int
     */
    public $majorVersion;

    // 次要版本号
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

    // 原始类型
    /**
     * @example 
     * @var string
     */
    public $originType;

    // 补丁版本号
    /**
     * @example 
     * @var int
     */
    public $patchVersion;

    // 发布时间
    /**
     * @example 2019-01-01T20:00:00
     * @var string
     */
    public $publicationTime;

    // 发布时间，日期格式
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $publicationTimeDate;

    // 技术栈版本提供方所在域
    /**
     * @example 
     * @var string
     */
    public $scope;

    // 技术栈版本的状态
    /**
     * @example 
     * @var string
     */
    public $status;

    // 支持的操作系统列表
    /**
     * @example 
     * @var BuildpackOS[]
     */
    public $supportedOs;

    // 支持的地域ID列表
    /**
     * @example 
     * @var string[]
     */
    public $supportedRegions;

    // 支持的地域列表
    /**
     * @example 
     * @var BuildpackRegionRelationDetail[]
     */
    public $supportedRegionsList;

    // techstack
    /**
     * @example 
     * @var Techstack
     */
    public $techstack;

    // 关联的 Techstack ID
    /**
     * @example 
     * @var int
     */
    public $techstackId;

    // tenantId
    /**
     * @example tenantId
     * @var string
     */
    public $tenantId;

}
