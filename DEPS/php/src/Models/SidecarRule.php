<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\SidecarScopeDetail;

class SidecarRule extends Model {
    protected $_name = [
        'description' => 'description',
        'gmtCreated' => 'gmt_created',
        'gmtModified' => 'gmt_modified',
        'instanceName' => 'instance_name',
        'level' => 'level',
        'scopeDetail' => 'scope_detail',
        'sidecarVersionInstanceId' => 'sidecar_version_instance_id',
        'status' => 'status',
        'statusReason' => 'status_reason',
    ];
    public function validate() {
        Model::validateRequired('gmtCreated', $this->gmtCreated, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('instanceName', $this->instanceName, true);
        Model::validateRequired('level', $this->level, true);
        Model::validateRequired('scopeDetail', $this->scopeDetail, true);
        Model::validateRequired('sidecarVersionInstanceId', $this->sidecarVersionInstanceId, true);
        Model::validateRequired('status', $this->status, true);
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
        if (null !== $this->instanceName) {
            $res['instance_name'] = $this->instanceName;
        }
        if (null !== $this->level) {
            $res['level'] = $this->level;
        }
        if (null !== $this->scopeDetail) {
            $res['scope_detail'] = null !== $this->scopeDetail ? $this->scopeDetail->toMap() : null;
        }
        if (null !== $this->sidecarVersionInstanceId) {
            $res['sidecar_version_instance_id'] = $this->sidecarVersionInstanceId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->statusReason) {
            $res['status_reason'] = $this->statusReason;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SidecarRule
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
        if(isset($map['instance_name'])){
            $model->instanceName = $map['instance_name'];
        }
        if(isset($map['level'])){
            $model->level = $map['level'];
        }
        if(isset($map['scope_detail'])){
            $model->scopeDetail = SidecarScopeDetail::fromMap($map['scope_detail']);
        }
        if(isset($map['sidecar_version_instance_id'])){
            $model->sidecarVersionInstanceId = $map['sidecar_version_instance_id'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['status_reason'])){
            $model->statusReason = $map['status_reason'];
        }
        return $model;
    }
    // sidecar规则描述
    /**
     * @example 张家口预发环境
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

    // 版本实例名称
    /**
     * @example mosn_1.0_zjk
     * @var string
     */
    public $instanceName;

    // 规则优先级
    /**
     * @example 0
     * @var int
     */
    public $level;

    // scope生效范围详情
    /**
     * @example 
     * @var SidecarScopeDetail
     */
    public $scopeDetail;

    // sidecar版本实例id
    /**
     * @example 0012
     * @var string
     */
    public $sidecarVersionInstanceId;

    // 规则状态
    /**
     * @example 1
     * @var int
     */
    public $status;

    // 发布、下线、废弃原因
    // 
    /**
     * @example 版本已废弃
     * @var string
     */
    public $statusReason;

}
