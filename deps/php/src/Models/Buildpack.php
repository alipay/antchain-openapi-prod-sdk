<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class Buildpack extends Model {
    protected $_name = [
        'availableTenantNames' => 'available_tenant_names',
        'buildCommand' => 'build_command',
        'contactInfo' => 'contact_info',
        'debugMode' => 'debug_mode',
        'depracationNote' => 'depracation_note',
        'description' => 'description',
        'fullVersion' => 'full_version',
        'id' => 'id',
        'industryLabel' => 'industry_label',
        'majorVersion' => 'major_version',
        'minorVersion' => 'minor_version',
        'patchVersion' => 'patch_version',
        'publicationTime' => 'publication_time',
        'scope' => 'scope',
        'status' => 'status',
    ];
    public function validate() {
        Model::validatePattern('publicationTime', $this->publicationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
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
        if (null !== $this->depracationNote) {
            $res['depracation_note'] = $this->depracationNote;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
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
        if (null !== $this->patchVersion) {
            $res['patch_version'] = $this->patchVersion;
        }
        if (null !== $this->publicationTime) {
            $res['publication_time'] = $this->publicationTime;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Buildpack
     */
    public static function fromMap($map = []) {
        $model = new self();
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
        if(isset($map['depracation_note'])){
            $model->depracationNote = $map['depracation_note'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
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
        if(isset($map['patch_version'])){
            $model->patchVersion = $map['patch_version'];
        }
        if(isset($map['publication_time'])){
            $model->publicationTime = $map['publication_time'];
        }
        if(isset($map['scope'])){
            $model->scope = $map['scope'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        return $model;
    }
    // 可以使用该技术栈版本的租户名称
    /**
     * @example 
     * @var string[]
     */
    public $availableTenantNames;

    // 技术栈版本的编译打包命令
    /**
     * @example 
     * @var string
     */
    public $buildCommand;

    // 分享给其他租户时留下的联系信息
    /**
     * @example 
     * @var string
     */
    public $contactInfo;

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

    // 技术栈的版本号
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

    // 补丁版本号
    /**
     * @example 
     * @var int
     */
    public $patchVersion;

    // 发布时间
    /**
     * @example 
     * @var string
     */
    public $publicationTime;

    // 技术栈版本是系统系统的还是用户自定义的
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

}
