<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\SidecarScopeDetail;
use AntChain\Deps\Models\SidecarTemplateConfig;

class SidecarReleaseVersion extends Model {
    protected $_name = [
        'description' => 'description',
        'gmtCreated' => 'gmt_created',
        'gmtModified' => 'gmt_modified',
        'releaseNote' => 'release_note',
        'scopeDetail' => 'scope_detail',
        'sidecarName' => 'sidecar_name',
        'sidecarReleaseVersionId' => 'sidecar_release_version_id',
        'sidecarVersion' => 'sidecar_version',
        'status' => 'status',
        'statusReason' => 'status_reason',
        'template' => 'template',
        'templateConfigs' => 'template_configs',
        'type' => 'type',
        'versionPeriod' => 'version_period',
    ];
    public function validate() {
        Model::validatePattern('gmtCreated', $this->gmtCreated, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->gmtCreated) {
            $res['gmt_created'] = $this->gmtCreated;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->releaseNote) {
            $res['release_note'] = $this->releaseNote;
        }
        if (null !== $this->scopeDetail) {
            $res['scope_detail'] = null !== $this->scopeDetail ? $this->scopeDetail->toMap() : null;
        }
        if (null !== $this->sidecarName) {
            $res['sidecar_name'] = $this->sidecarName;
        }
        if (null !== $this->sidecarReleaseVersionId) {
            $res['sidecar_release_version_id'] = $this->sidecarReleaseVersionId;
        }
        if (null !== $this->sidecarVersion) {
            $res['sidecar_version'] = $this->sidecarVersion;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->statusReason) {
            $res['status_reason'] = $this->statusReason;
        }
        if (null !== $this->template) {
            $res['template'] = $this->template;
        }
        if (null !== $this->templateConfigs) {
            $res['template_configs'] = [];
            if(null !== $this->templateConfigs && is_array($this->templateConfigs)){
                $n = 0;
                foreach($this->templateConfigs as $item){
                    $res['template_configs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->versionPeriod) {
            $res['version_period'] = $this->versionPeriod;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SidecarReleaseVersion
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['gmt_created'])){
            $model->gmtCreated = $map['gmt_created'];
        }
        if(isset($map['gmt_modified'])){
            $model->gmtModified = $map['gmt_modified'];
        }
        if(isset($map['release_note'])){
            $model->releaseNote = $map['release_note'];
        }
        if(isset($map['scope_detail'])){
            $model->scopeDetail = SidecarScopeDetail::fromMap($map['scope_detail']);
        }
        if(isset($map['sidecar_name'])){
            $model->sidecarName = $map['sidecar_name'];
        }
        if(isset($map['sidecar_release_version_id'])){
            $model->sidecarReleaseVersionId = $map['sidecar_release_version_id'];
        }
        if(isset($map['sidecar_version'])){
            $model->sidecarVersion = $map['sidecar_version'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['status_reason'])){
            $model->statusReason = $map['status_reason'];
        }
        if(isset($map['template'])){
            $model->template = $map['template'];
        }
        if(isset($map['template_configs'])){
            if(!empty($map['template_configs'])){
                $model->templateConfigs = [];
                $n = 0;
                foreach($map['template_configs'] as $item) {
                    $model->templateConfigs[$n++] = null !== $item ? SidecarTemplateConfig::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['version_period'])){
            $model->versionPeriod = $map['version_period'];
        }
        return $model;
    }
    // sidecar版本描述
    /**
     * @example "主站版本"
     * @var string
     */
    public $description;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $gmtCreated;

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $gmtModified;

    // release note
    /**
     * @example "版本特性"
     * @var string
     */
    public $releaseNote;

    // scope生效范围详情
    /**
     * @example 
     * @var SidecarScopeDetail
     */
    public $scopeDetail;

    // sidecar名称
    /**
     * @example mosn
     * @var string
     */
    public $sidecarName;

    // sidecar版本id
    /**
     * @example 00012
     * @var string
     */
    public $sidecarReleaseVersionId;

    // sidecar版本号
    /**
     * @example v1.0
     * @var string
     */
    public $sidecarVersion;

    // 版本状态
    /**
     * @example 1
     * @var int
     */
    public $status;

    // 发布、下线、废弃原因
    /**
     * @example 版本已废弃
     * @var string
     */
    public $statusReason;

    // sidecar模板内容
    /**
     * @example "container:xxx"
     * @var string
     */
    public $template;

    // sidecar模板配置
    /**
     * @example 
     * @var SidecarTemplateConfig[]
     */
    public $templateConfigs;

    // sidecar版本类型
    /**
     * @example container
     * @var string
     */
    public $type;

    // 版本周期：alpha/beta/release
    /**
     * @example alpha
     * @var string
     */
    public $versionPeriod;

}
