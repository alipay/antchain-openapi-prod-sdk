<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryUmktRtTailmarketingRequest extends Model
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

    // 营销计划id
    /**
     * @var string
     */
    public $planId;

    //
    // 用户列表传输模版
    /**
     * @var string
     */
    public $queryTemplate;

    //
    // 用户查询凭证列表
    /**
     * @var string[]
     */
    public $customerKeys;

    // 业务方流水号
    /**
     * @var string
     */
    public $bizSerialNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'planId'            => 'plan_id',
        'queryTemplate'     => 'query_template',
        'customerKeys'      => 'customer_keys',
        'bizSerialNo'       => 'biz_serial_no',
    ];

    public function validate()
    {
        Model::validateRequired('planId', $this->planId, true);
        Model::validateRequired('queryTemplate', $this->queryTemplate, true);
        Model::validateRequired('customerKeys', $this->customerKeys, true);
        Model::validateRequired('bizSerialNo', $this->bizSerialNo, true);
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
        if (null !== $this->planId) {
            $res['plan_id'] = $this->planId;
        }
        if (null !== $this->queryTemplate) {
            $res['query_template'] = $this->queryTemplate;
        }
        if (null !== $this->customerKeys) {
            $res['customer_keys'] = $this->customerKeys;
        }
        if (null !== $this->bizSerialNo) {
            $res['biz_serial_no'] = $this->bizSerialNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryUmktRtTailmarketingRequest
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
        if (isset($map['plan_id'])) {
            $model->planId = $map['plan_id'];
        }
        if (isset($map['query_template'])) {
            $model->queryTemplate = $map['query_template'];
        }
        if (isset($map['customer_keys'])) {
            if (!empty($map['customer_keys'])) {
                $model->customerKeys = $map['customer_keys'];
            }
        }
        if (isset($map['biz_serial_no'])) {
            $model->bizSerialNo = $map['biz_serial_no'];
        }

        return $model;
    }
}
