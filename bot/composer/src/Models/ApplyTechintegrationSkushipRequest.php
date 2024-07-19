<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ApplyTechintegrationSkushipRequest extends Model
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

    // 产品型号
    /**
     * @var string
     */
    public $deviceModel;

    // 出货数量，上限8
    /**
     * @var int
     */
    public $quota;

    // 产品类型
    /**
     * @var string
     */
    public $productType;

    // 安全方案
    /**
     * @var string
     */
    public $securityMechanism;

    // 证书类型
    /**
     * @var string
     */
    public $certType;

    // 凭证种类
    /**
     * @var string[]
     */
    public $features;

    // 证书拉取任务ID
    /**
     * @var string
     */
    public $taskId;

    // 证书拉取任务批次
    /**
     * @var string
     */
    public $taskBatchNum;

    // 重试标志
    /**
     * @var bool
     */
    public $retryFlag;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceModel'       => 'device_model',
        'quota'             => 'quota',
        'productType'       => 'product_type',
        'securityMechanism' => 'security_mechanism',
        'certType'          => 'cert_type',
        'features'          => 'features',
        'taskId'            => 'task_id',
        'taskBatchNum'      => 'task_batch_num',
        'retryFlag'         => 'retry_flag',
    ];

    public function validate()
    {
        Model::validateRequired('deviceModel', $this->deviceModel, true);
        Model::validateRequired('quota', $this->quota, true);
        Model::validateRequired('productType', $this->productType, true);
        Model::validateRequired('securityMechanism', $this->securityMechanism, true);
        Model::validateRequired('certType', $this->certType, true);
        Model::validateRequired('features', $this->features, true);
        Model::validateMaximum('quota', $this->quota, 8);
        Model::validateMinimum('quota', $this->quota, 1);
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
        if (null !== $this->deviceModel) {
            $res['device_model'] = $this->deviceModel;
        }
        if (null !== $this->quota) {
            $res['quota'] = $this->quota;
        }
        if (null !== $this->productType) {
            $res['product_type'] = $this->productType;
        }
        if (null !== $this->securityMechanism) {
            $res['security_mechanism'] = $this->securityMechanism;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->features) {
            $res['features'] = $this->features;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->taskBatchNum) {
            $res['task_batch_num'] = $this->taskBatchNum;
        }
        if (null !== $this->retryFlag) {
            $res['retry_flag'] = $this->retryFlag;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyTechintegrationSkushipRequest
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
        if (isset($map['device_model'])) {
            $model->deviceModel = $map['device_model'];
        }
        if (isset($map['quota'])) {
            $model->quota = $map['quota'];
        }
        if (isset($map['product_type'])) {
            $model->productType = $map['product_type'];
        }
        if (isset($map['security_mechanism'])) {
            $model->securityMechanism = $map['security_mechanism'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['features'])) {
            if (!empty($map['features'])) {
                $model->features = $map['features'];
            }
        }
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['task_batch_num'])) {
            $model->taskBatchNum = $map['task_batch_num'];
        }
        if (isset($map['retry_flag'])) {
            $model->retryFlag = $map['retry_flag'];
        }

        return $model;
    }
}
