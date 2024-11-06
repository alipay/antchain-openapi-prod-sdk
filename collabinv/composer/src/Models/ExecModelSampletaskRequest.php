<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COLLABINV\Models;

use AlibabaCloud\Tea\Model;

class ExecModelSampletaskRequest extends Model
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

    // 租户编码
    /**
     * @var string
     */
    public $tenantCode;

    // 样本批次号，唯一，建议：租户code+时间戳
    /**
     * @var string
     */
    public $sampleCode;

    // 特征集编码或模型编码，依据类型使用
    /**
     * @var string
     */
    public $taskCode;

    // 任务类型：特征集 FEATURESET、模型分 MODEL
    /**
     * @var string
     */
    public $taskType;

    // 本次事件序号编码
    /**
     * @var string
     */
    public $sampleTaskCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantCode'        => 'tenant_code',
        'sampleCode'        => 'sample_code',
        'taskCode'          => 'task_code',
        'taskType'          => 'task_type',
        'sampleTaskCode'    => 'sample_task_code',
    ];

    public function validate()
    {
        Model::validateRequired('tenantCode', $this->tenantCode, true);
        Model::validateRequired('sampleCode', $this->sampleCode, true);
        Model::validateRequired('taskCode', $this->taskCode, true);
        Model::validateRequired('taskType', $this->taskType, true);
        Model::validateRequired('sampleTaskCode', $this->sampleTaskCode, true);
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
        if (null !== $this->tenantCode) {
            $res['tenant_code'] = $this->tenantCode;
        }
        if (null !== $this->sampleCode) {
            $res['sample_code'] = $this->sampleCode;
        }
        if (null !== $this->taskCode) {
            $res['task_code'] = $this->taskCode;
        }
        if (null !== $this->taskType) {
            $res['task_type'] = $this->taskType;
        }
        if (null !== $this->sampleTaskCode) {
            $res['sample_task_code'] = $this->sampleTaskCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecModelSampletaskRequest
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
        if (isset($map['tenant_code'])) {
            $model->tenantCode = $map['tenant_code'];
        }
        if (isset($map['sample_code'])) {
            $model->sampleCode = $map['sample_code'];
        }
        if (isset($map['task_code'])) {
            $model->taskCode = $map['task_code'];
        }
        if (isset($map['task_type'])) {
            $model->taskType = $map['task_type'];
        }
        if (isset($map['sample_task_code'])) {
            $model->sampleTaskCode = $map['sample_task_code'];
        }

        return $model;
    }
}
