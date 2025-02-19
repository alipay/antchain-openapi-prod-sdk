<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class UploadInnerRiskcallRequest extends Model
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

    // 幂等id
    /**
     * @var string
     */
    public $idempotentId;

    // 商户的支付宝唯一id
    /**
     * @var string
     */
    public $pid;

    // 计量值
    /**
     * @var int
     */
    public $serviceAmount;

    // 上报的数据开始时间，格式 yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $startTime;

    // 上报的数据结束时间，格式 yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $endTime;

    // 支付宝开放平台购买的实例 id
    /**
     * @var string
     */
    public $alipayInstanceId;

    // 扩展参数
    // jsonString
    /**
     * @var string
     */
    public $extInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'idempotentId'      => 'idempotent_id',
        'pid'               => 'pid',
        'serviceAmount'     => 'service_amount',
        'startTime'         => 'start_time',
        'endTime'           => 'end_time',
        'alipayInstanceId'  => 'alipay_instance_id',
        'extInfo'           => 'ext_info',
    ];

    public function validate()
    {
        Model::validateRequired('idempotentId', $this->idempotentId, true);
        Model::validateRequired('pid', $this->pid, true);
        Model::validateRequired('serviceAmount', $this->serviceAmount, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
        Model::validateRequired('alipayInstanceId', $this->alipayInstanceId, true);
        Model::validateMaxLength('idempotentId', $this->idempotentId, 32);
        Model::validateMaxLength('pid', $this->pid, 32);
        Model::validateMaxLength('startTime', $this->startTime, 32);
        Model::validateMaxLength('endTime', $this->endTime, 32);
        Model::validateMaxLength('alipayInstanceId', $this->alipayInstanceId, 64);
        Model::validateMinLength('idempotentId', $this->idempotentId, 1);
        Model::validateMinLength('pid', $this->pid, 1);
        Model::validateMinLength('startTime', $this->startTime, 1);
        Model::validateMinLength('endTime', $this->endTime, 1);
        Model::validateMinLength('alipayInstanceId', $this->alipayInstanceId, 1);
        Model::validateMinLength('extInfo', $this->extInfo, 1);
        Model::validateMinimum('serviceAmount', $this->serviceAmount, 1);
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
        if (null !== $this->idempotentId) {
            $res['idempotent_id'] = $this->idempotentId;
        }
        if (null !== $this->pid) {
            $res['pid'] = $this->pid;
        }
        if (null !== $this->serviceAmount) {
            $res['service_amount'] = $this->serviceAmount;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->alipayInstanceId) {
            $res['alipay_instance_id'] = $this->alipayInstanceId;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadInnerRiskcallRequest
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
        if (isset($map['idempotent_id'])) {
            $model->idempotentId = $map['idempotent_id'];
        }
        if (isset($map['pid'])) {
            $model->pid = $map['pid'];
        }
        if (isset($map['service_amount'])) {
            $model->serviceAmount = $map['service_amount'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['alipay_instance_id'])) {
            $model->alipayInstanceId = $map['alipay_instance_id'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }

        return $model;
    }
}
