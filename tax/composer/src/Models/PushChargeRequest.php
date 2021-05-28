<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class PushChargeRequest extends Model
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

    // 租户
    /**
     * @var string
     */
    public $bizTenant;

    // 平台分发,子业务类型，对应原来的authType.
    /**
     * @var string
     */
    public $bizType;

    // 用户ID，根据业务对主体定义决定，比如票据业务的纳税人识别号
    /**
     * @var string
     */
    public $customerId;

    // 系统编码,平台分发，定义枚举，全局用
    /**
     * @var string
     */
    public $systemCode;

    // 请求id
    /**
     * @var string
     */
    public $taskRequestId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizTenant'         => 'biz_tenant',
        'bizType'           => 'biz_type',
        'customerId'        => 'customer_id',
        'systemCode'        => 'system_code',
        'taskRequestId'     => 'task_request_id',
    ];

    public function validate()
    {
        Model::validateRequired('bizTenant', $this->bizTenant, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('customerId', $this->customerId, true);
        Model::validateRequired('systemCode', $this->systemCode, true);
        Model::validateRequired('taskRequestId', $this->taskRequestId, true);
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
        if (null !== $this->bizTenant) {
            $res['biz_tenant'] = $this->bizTenant;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->systemCode) {
            $res['system_code'] = $this->systemCode;
        }
        if (null !== $this->taskRequestId) {
            $res['task_request_id'] = $this->taskRequestId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushChargeRequest
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
        if (isset($map['biz_tenant'])) {
            $model->bizTenant = $map['biz_tenant'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['customer_id'])) {
            $model->customerId = $map['customer_id'];
        }
        if (isset($map['system_code'])) {
            $model->systemCode = $map['system_code'];
        }
        if (isset($map['task_request_id'])) {
            $model->taskRequestId = $map['task_request_id'];
        }

        return $model;
    }
}
