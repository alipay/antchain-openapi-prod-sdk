<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateStubClearingRequest extends Model
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

    // 流程id
    /**
     * @var string
     */
    public $flowId;

    // 待分账金额，单位：分。如传100，即为100分，1元
    /**
     * @var int
     */
    public $stubAmount;

    // 清分状态，CLEARING_SUCCESS（清分成功）；CLEARING_FAIL（清分失败）；CLEARING_NONEED（不需要进行清分）
    /**
     * @var string
     */
    public $clearingStatus;

    // 数字票根计量字段，当clearing_status为CLEARING_SUCCESS时，该字段必填
    /**
     * @var MetricInfo
     */
    public $metricInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'flowId'            => 'flow_id',
        'stubAmount'        => 'stub_amount',
        'clearingStatus'    => 'clearing_status',
        'metricInfo'        => 'metric_info',
    ];

    public function validate()
    {
        Model::validateRequired('flowId', $this->flowId, true);
        Model::validateRequired('stubAmount', $this->stubAmount, true);
        Model::validateRequired('clearingStatus', $this->clearingStatus, true);
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
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->stubAmount) {
            $res['stub_amount'] = $this->stubAmount;
        }
        if (null !== $this->clearingStatus) {
            $res['clearing_status'] = $this->clearingStatus;
        }
        if (null !== $this->metricInfo) {
            $res['metric_info'] = null !== $this->metricInfo ? $this->metricInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateStubClearingRequest
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
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['stub_amount'])) {
            $model->stubAmount = $map['stub_amount'];
        }
        if (isset($map['clearing_status'])) {
            $model->clearingStatus = $map['clearing_status'];
        }
        if (isset($map['metric_info'])) {
            $model->metricInfo = MetricInfo::fromMap($map['metric_info']);
        }

        return $model;
    }
}
