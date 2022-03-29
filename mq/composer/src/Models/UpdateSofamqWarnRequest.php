<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class UpdateSofamqWarnRequest extends Model
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

    // 报警时间范围
    /**
     * @var string
     */
    public $alertTime;

    // 报警通知人信息
    /**
     * @var string
     */
    public $contacts;

    // 延迟多少秒报警
    /**
     * @var int
     */
    public $delayTime;

    // 报警频率
    /**
     * @var int
     */
    public $frequency;

    // 实例 ID
    /**
     * @var string
     */
    public $instanceId;

    // 阈值
    /**
     * @var int
     */
    public $threshold;

    // 指定修改的报警规则
    /**
     * @var int
     */
    public $warnId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'alertTime'         => 'alert_time',
        'contacts'          => 'contacts',
        'delayTime'         => 'delay_time',
        'frequency'         => 'frequency',
        'instanceId'        => 'instance_id',
        'threshold'         => 'threshold',
        'warnId'            => 'warn_id',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('warnId', $this->warnId, true);
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
        if (null !== $this->alertTime) {
            $res['alert_time'] = $this->alertTime;
        }
        if (null !== $this->contacts) {
            $res['contacts'] = $this->contacts;
        }
        if (null !== $this->delayTime) {
            $res['delay_time'] = $this->delayTime;
        }
        if (null !== $this->frequency) {
            $res['frequency'] = $this->frequency;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->threshold) {
            $res['threshold'] = $this->threshold;
        }
        if (null !== $this->warnId) {
            $res['warn_id'] = $this->warnId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateSofamqWarnRequest
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
        if (isset($map['alert_time'])) {
            $model->alertTime = $map['alert_time'];
        }
        if (isset($map['contacts'])) {
            $model->contacts = $map['contacts'];
        }
        if (isset($map['delay_time'])) {
            $model->delayTime = $map['delay_time'];
        }
        if (isset($map['frequency'])) {
            $model->frequency = $map['frequency'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['threshold'])) {
            $model->threshold = $map['threshold'];
        }
        if (isset($map['warn_id'])) {
            $model->warnId = $map['warn_id'];
        }

        return $model;
    }
}
