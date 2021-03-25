<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class AppService extends Model {
    protected $_name = [
        'applicationName' => 'application_name',
        'cellIds' => 'cell_ids',
        'description' => 'description',
        'extraInfos' => 'extra_infos',
        'latestOperationId' => 'latest_operation_id',
        'latestOperationType' => 'latest_operation_type',
        'latestVersionNo' => 'latest_version_no',
        'serviceName' => 'service_name',
        'workspace' => 'workspace',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->applicationName) {
            $res['application_name'] = $this->applicationName;
        }
        if (null !== $this->cellIds) {
            $res['cell_ids'] = $this->cellIds;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->extraInfos) {
            $res['extra_infos'] = $this->extraInfos;
        }
        if (null !== $this->latestOperationId) {
            $res['latest_operation_id'] = $this->latestOperationId;
        }
        if (null !== $this->latestOperationType) {
            $res['latest_operation_type'] = $this->latestOperationType;
        }
        if (null !== $this->latestVersionNo) {
            $res['latest_version_no'] = $this->latestVersionNo;
        }
        if (null !== $this->serviceName) {
            $res['service_name'] = $this->serviceName;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AppService
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['application_name'])){
            $model->applicationName = $map['application_name'];
        }
        if(isset($map['cell_ids'])){
            if(!empty($map['cell_ids'])){
                $model->cellIds = $map['cell_ids'];
            }
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['extra_infos'])){
            $model->extraInfos = $map['extra_infos'];
        }
        if(isset($map['latest_operation_id'])){
            $model->latestOperationId = $map['latest_operation_id'];
        }
        if(isset($map['latest_operation_type'])){
            $model->latestOperationType = $map['latest_operation_type'];
        }
        if(isset($map['latest_version_no'])){
            $model->latestVersionNo = $map['latest_version_no'];
        }
        if(isset($map['service_name'])){
            $model->serviceName = $map['service_name'];
        }
        if(isset($map['workspace'])){
            $model->workspace = $map['workspace'];
        }
        return $model;
    }
    // 应用名称
    /**
     * @example 
     * @var string
     */
    public $applicationName;

    // 关联的部署单元
    /**
     * @example 
     * @var string[]
     */
    public $cellIds;

    // 服务实例描述
    /**
     * @example 
     * @var string
     */
    public $description;

    // 用户自定义的扩展属性
    /**
     * @example 
     * @var string
     */
    public $extraInfos;

    // 最近一次执行的运维操作单号
    /**
     * @example 
     * @var string
     */
    public $latestOperationId;

    // 最近一次执行的运维操作类型。取值列表：
    // DEPLOYMENT：部署操作
    // 
    /**
     * @example 
     * @var string
     */
    public $latestOperationType;

    // 最近成功部署的版本号
    /**
     * @example 
     * @var string
     */
    public $latestVersionNo;

    // 服务实例名称
    /**
     * @example 
     * @var string
     */
    public $serviceName;

    // 环境名称
    /**
     * @example 
     * @var string
     */
    public $workspace;

}
