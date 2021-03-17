<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateLeaseSupplierdynamicinfoRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 合约id
    /**
     * @var string
     */
    public $applicationId;

    // 签收记录哈希，已签收需要必填
    /**
     * @var string
     */
    public $arriveConfirmHash;

    // 用户签收时间，格式为2019-8-31 12:00:00，已签收需要必填
    /**
     * @var string
     */
    public $arriveConfirmTime;

    // 签收记录存证哈希，已签收需要必填
    /**
     * @var string
     */
    public $arriveConfirmTxHash;

    // 签收记录对应的url，已签收需要必填
    /**
     * @var string
     */
    public $arriveConfirmUrl;

    // 物流状态额外信息
    /**
     * @var string
     */
    public $extraInfo;

    // 物流状态，1.已发货 2运输中 3已签收 0其他
    /**
     * @var string
     */
    public $logisticStatus;

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 阶段名称
    /**
     * @var string
     */
    public $phase;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'applicationId'       => 'application_id',
        'arriveConfirmHash'   => 'arrive_confirm_hash',
        'arriveConfirmTime'   => 'arrive_confirm_time',
        'arriveConfirmTxHash' => 'arrive_confirm_tx_hash',
        'arriveConfirmUrl'    => 'arrive_confirm_url',
        'extraInfo'           => 'extra_info',
        'logisticStatus'      => 'logistic_status',
        'orderId'             => 'order_id',
        'phase'               => 'phase',
    ];

    public function validate()
    {
        Model::validateRequired('applicationId', $this->applicationId, true);
        Model::validateRequired('logisticStatus', $this->logisticStatus, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('phase', $this->phase, true);
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
        if (null !== $this->applicationId) {
            $res['application_id'] = $this->applicationId;
        }
        if (null !== $this->arriveConfirmHash) {
            $res['arrive_confirm_hash'] = $this->arriveConfirmHash;
        }
        if (null !== $this->arriveConfirmTime) {
            $res['arrive_confirm_time'] = $this->arriveConfirmTime;
        }
        if (null !== $this->arriveConfirmTxHash) {
            $res['arrive_confirm_tx_hash'] = $this->arriveConfirmTxHash;
        }
        if (null !== $this->arriveConfirmUrl) {
            $res['arrive_confirm_url'] = $this->arriveConfirmUrl;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->logisticStatus) {
            $res['logistic_status'] = $this->logisticStatus;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->phase) {
            $res['phase'] = $this->phase;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLeaseSupplierdynamicinfoRequest
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
        if (isset($map['application_id'])) {
            $model->applicationId = $map['application_id'];
        }
        if (isset($map['arrive_confirm_hash'])) {
            $model->arriveConfirmHash = $map['arrive_confirm_hash'];
        }
        if (isset($map['arrive_confirm_time'])) {
            $model->arriveConfirmTime = $map['arrive_confirm_time'];
        }
        if (isset($map['arrive_confirm_tx_hash'])) {
            $model->arriveConfirmTxHash = $map['arrive_confirm_tx_hash'];
        }
        if (isset($map['arrive_confirm_url'])) {
            $model->arriveConfirmUrl = $map['arrive_confirm_url'];
        }
        if (isset($map['extra_info'])) {
            $model->extraInfo = $map['extra_info'];
        }
        if (isset($map['logistic_status'])) {
            $model->logisticStatus = $map['logistic_status'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['phase'])) {
            $model->phase = $map['phase'];
        }

        return $model;
    }
}
