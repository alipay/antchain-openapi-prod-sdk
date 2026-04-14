<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTCALL\Models;

use AlibabaCloud\Tea\Model;

class ImportAntcloudDtcallagentDispatcherOrderRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 请求唯一 ID，建议全局唯一
    /**
     * @var string
     */
    public $requestId;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 实例code
    /**
     * @var string
     */
    public $instanceCode;

    // 外呼任务编码
    /**
     * @var string
     */
    public $taskCode;

    // 外呼调度时间，实际拨打时间大于等于该时间，建议格式：yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $callTime;

    // 失效时间，建议格式：yyyy-MM-dd HH:mm:ss，默认 7 天
    /**
     * @var string
     */
    public $expirationTime;

    // 触达用户列表，单次上限 100
    /**
     * @var Customer[]
     */
    public $customerList;
    protected $_name = [
        'authToken'      => 'auth_token',
        'requestId'      => 'request_id',
        'tenantId'       => 'tenant_id',
        'instanceCode'   => 'instance_code',
        'taskCode'       => 'task_code',
        'callTime'       => 'call_time',
        'expirationTime' => 'expiration_time',
        'customerList'   => 'customer_list',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('instanceCode', $this->instanceCode, true);
        Model::validateRequired('taskCode', $this->taskCode, true);
        Model::validateRequired('callTime', $this->callTime, true);
        Model::validateRequired('customerList', $this->customerList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->instanceCode) {
            $res['instance_code'] = $this->instanceCode;
        }
        if (null !== $this->taskCode) {
            $res['task_code'] = $this->taskCode;
        }
        if (null !== $this->callTime) {
            $res['call_time'] = $this->callTime;
        }
        if (null !== $this->expirationTime) {
            $res['expiration_time'] = $this->expirationTime;
        }
        if (null !== $this->customerList) {
            $res['customer_list'] = [];
            if (null !== $this->customerList && \is_array($this->customerList)) {
                $n = 0;
                foreach ($this->customerList as $item) {
                    $res['customer_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportAntcloudDtcallagentDispatcherOrderRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['instance_code'])) {
            $model->instanceCode = $map['instance_code'];
        }
        if (isset($map['task_code'])) {
            $model->taskCode = $map['task_code'];
        }
        if (isset($map['call_time'])) {
            $model->callTime = $map['call_time'];
        }
        if (isset($map['expiration_time'])) {
            $model->expirationTime = $map['expiration_time'];
        }
        if (isset($map['customer_list'])) {
            if (!empty($map['customer_list'])) {
                $model->customerList = [];
                $n                   = 0;
                foreach ($map['customer_list'] as $item) {
                    $model->customerList[$n++] = null !== $item ? Customer::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
