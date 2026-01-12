<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

class UploadUmktOfflinedecisionRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 离线圈客计划id
    /**
     * @var int
     */
    public $offlineDecisionPlanId;

    // 文件模版信息
    /**
     * @var string
     */
    public $fileTemplate;

    // 文件id，网关文件上传自动装填
    /**
     * @description 待上传文件
     *
     * @var Stream
     */
    public $fileObject;

    /**
     * @description 待上传文件名
     *
     * @var string
     */
    public $fileObjectName;

    /**
     * @var string
     */
    public $fileId;

    // 非必填, 默认OFFLINE_DECISION
    /**
     * @var string
     */
    public $relationType;

    // 任务执行uuid
    /**
     * @var string
     */
    public $taskUuid;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'offlineDecisionPlanId' => 'offline_decision_plan_id',
        'fileTemplate'          => 'file_template',
        'fileId'                => 'file_id',
        'relationType'          => 'relation_type',
        'taskUuid'              => 'task_uuid',
    ];

    public function validate()
    {
        Model::validateRequired('offlineDecisionPlanId', $this->offlineDecisionPlanId, true);
        Model::validateRequired('fileTemplate', $this->fileTemplate, true);
        Model::validateRequired('fileId', $this->fileId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->offlineDecisionPlanId) {
            $res['offline_decision_plan_id'] = $this->offlineDecisionPlanId;
        }
        if (null !== $this->fileTemplate) {
            $res['file_template'] = $this->fileTemplate;
        }
        if (null !== $this->fileObject) {
            $res['fileObject'] = $this->fileObject;
        }
        if (null !== $this->fileObjectName) {
            $res['fileObjectName'] = $this->fileObjectName;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->relationType) {
            $res['relation_type'] = $this->relationType;
        }
        if (null !== $this->taskUuid) {
            $res['task_uuid'] = $this->taskUuid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadUmktOfflinedecisionRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['offline_decision_plan_id'])) {
            $model->offlineDecisionPlanId = $map['offline_decision_plan_id'];
        }
        if (isset($map['file_template'])) {
            $model->fileTemplate = $map['file_template'];
        }
        if (isset($map['fileObject'])) {
            $model->fileObject = $map['fileObject'];
        }
        if (isset($map['fileObjectName'])) {
            $model->fileObjectName = $map['fileObjectName'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['relation_type'])) {
            $model->relationType = $map['relation_type'];
        }
        if (isset($map['task_uuid'])) {
            $model->taskUuid = $map['task_uuid'];
        }

        return $model;
    }
}
