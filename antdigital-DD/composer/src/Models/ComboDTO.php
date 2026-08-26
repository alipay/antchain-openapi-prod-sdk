<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class ComboDTO extends Model {
    protected $_name = [
        'id' => 'id',
        'name' => 'name',
        'description' => 'description',
        'status' => 'status',
        'code' => 'code',
        'vid' => 'vid',
        'parentVid' => 'parent_vid',
        'extendsConfig' => 'extends_config',
        'creator' => 'creator',
        'modify' => 'modify',
        'auditProcessId' => 'audit_process_id',
        'auditStatus' => 'audit_status',
        'quotationId' => 'quotation_id',
        'projectId' => 'project_id',
        'extendsInfo' => 'extends_info',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->vid) {
            $res['vid'] = $this->vid;
        }
        if (null !== $this->parentVid) {
            $res['parent_vid'] = $this->parentVid;
        }
        if (null !== $this->extendsConfig) {
            $res['extends_config'] = $this->extendsConfig;
        }
        if (null !== $this->creator) {
            $res['creator'] = $this->creator;
        }
        if (null !== $this->modify) {
            $res['modify'] = $this->modify;
        }
        if (null !== $this->auditProcessId) {
            $res['audit_process_id'] = $this->auditProcessId;
        }
        if (null !== $this->auditStatus) {
            $res['audit_status'] = $this->auditStatus;
        }
        if (null !== $this->quotationId) {
            $res['quotation_id'] = $this->quotationId;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->extendsInfo) {
            $res['extends_info'] = $this->extendsInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ComboDTO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['code'])){
            $model->code = $map['code'];
        }
        if(isset($map['vid'])){
            $model->vid = $map['vid'];
        }
        if(isset($map['parent_vid'])){
            $model->parentVid = $map['parent_vid'];
        }
        if(isset($map['extends_config'])){
            $model->extendsConfig = $map['extends_config'];
        }
        if(isset($map['creator'])){
            $model->creator = $map['creator'];
        }
        if(isset($map['modify'])){
            $model->modify = $map['modify'];
        }
        if(isset($map['audit_process_id'])){
            $model->auditProcessId = $map['audit_process_id'];
        }
        if(isset($map['audit_status'])){
            $model->auditStatus = $map['audit_status'];
        }
        if(isset($map['quotation_id'])){
            $model->quotationId = $map['quotation_id'];
        }
        if(isset($map['project_id'])){
            $model->projectId = $map['project_id'];
        }
        if(isset($map['extends_info'])){
            $model->extendsInfo = $map['extends_info'];
        }
        return $model;
    }
    // 主键id
    /**
     * @example 123
     * @var int
     */
    public $id;

    // 套餐名称
    /**
     * @example 套餐名称xxx
     * @var string
     */
    public $name;

    // 套餐描述
    /**
     * @example 套餐描述
     * @var string
     */
    public $description;

    // 套餐状态 DRAFT("DRAFT", "草稿"), ONLINE("ONLINE", "已上架"),OFFLINE("OFFLINE", "已下架");
    /**
     * @example DRAFT
     * @var string
     */
    public $status;

    // 套餐编码
    /**
     * @example C00250884
     * @var string
     */
    public $code;

    // 套餐唯一版本号，模板变更时更新
    /**
     * @example CV00252581
     * @var string
     */
    public $vid;

    // 父版本号
    /**
     * @example 1232456
     * @var string
     */
    public $parentVid;

    // 扩展配置
    /**
     * @example {}
     * @var string
     */
    public $extendsConfig;

    // 创建人
    /**
     * @example 012111
     * @var string
     */
    public $creator;

    // 修改人
    /**
     * @example 0121111
     * @var string
     */
    public $modify;

    // 审批流程ID
    /**
     * @example 123212312
     * @var string
     */
    public $auditProcessId;

    // 审批状态
    /**
     * @example PASS
     * @var string
     */
    public $auditStatus;

    // 合同ID
    /**
     * @example 20883519xxxxxxxx
     * @var string
     */
    public $quotationId;

    // 项目ID
    /**
     * @example 102876
     * @var string
     */
    public $projectId;

    // 其他扩展信息
    /**
     * @example {}
     * @var string
     */
    public $extendsInfo;

}
