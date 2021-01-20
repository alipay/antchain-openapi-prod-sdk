<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class GetApplicationServiceResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'applicationName' => 'application_name',
        'buildpackVersion' => 'buildpack_version',
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
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->applicationName) {
            $res['application_name'] = $this->applicationName;
        }
        if (null !== $this->buildpackVersion) {
            $res['buildpack_version'] = $this->buildpackVersion;
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
     * @return GetApplicationServiceResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['application_name'])){
            $model->applicationName = $map['application_name'];
        }
        if(isset($map['buildpack_version'])){
            $model->buildpackVersion = $map['buildpack_version'];
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
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 应用名称
    /**
     * @var string
     */
    public $applicationName;

    // 技术栈版本
    /**
     * @var string
     */
    public $buildpackVersion;

    // 关联的部署单元
    /**
     * @var string[]
     */
    public $cellIds;

    // 服务实例描述
    /**
     * @var string
     */
    public $description;

    // 用户自定义的扩展属性
    /**
     * @var string
     */
    public $extraInfos;

    // 最近一次执行的运维操作单号
    /**
     * @var string
     */
    public $latestOperationId;

    // 最近一次执行的运维操作类型。取值列表：
    // DEPLOYMENT：部署操作
    // 
    /**
     * @var string
     */
    public $latestOperationType;

    // 最近成功部署的版本号
    /**
     * @var string
     */
    public $latestVersionNo;

    // 服务实例名称
    /**
     * @var string
     */
    public $serviceName;

    // 环境名称
    /**
     * @var string
     */
    public $workspace;

}
