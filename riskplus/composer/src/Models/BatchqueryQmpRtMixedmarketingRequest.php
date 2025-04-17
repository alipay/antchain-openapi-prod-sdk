<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryQmpRtMixedmarketingRequest extends Model
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

    // 圈客计划code列表
    /**
     * @var string[]
     */
    public $planCodes;

    // 计划集合code，对标圈客计划code列表，一般不可变
    /**
     * @var string
     */
    public $planSetCode;

    // 查询协议模版
    /**
     * @var string
     */
    public $queryTemplate;

    // 客群凭证和其他信息
    /**
     * @var CustomerInfo[]
     */
    public $customerDetails;

    // 客群共用参数
    /**
     * @var string
     */
    public $publicProperties;

    // 外部业务流水号
    /**
     * @var string
     */
    public $bizSerialNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'planCodes'         => 'plan_codes',
        'planSetCode'       => 'plan_set_code',
        'queryTemplate'     => 'query_template',
        'customerDetails'   => 'customer_details',
        'publicProperties'  => 'public_properties',
        'bizSerialNo'       => 'biz_serial_no',
    ];

    public function validate()
    {
        Model::validateRequired('planCodes', $this->planCodes, true);
        Model::validateRequired('queryTemplate', $this->queryTemplate, true);
        Model::validateRequired('customerDetails', $this->customerDetails, true);
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
        if (null !== $this->planCodes) {
            $res['plan_codes'] = $this->planCodes;
        }
        if (null !== $this->planSetCode) {
            $res['plan_set_code'] = $this->planSetCode;
        }
        if (null !== $this->queryTemplate) {
            $res['query_template'] = $this->queryTemplate;
        }
        if (null !== $this->customerDetails) {
            $res['customer_details'] = [];
            if (null !== $this->customerDetails && \is_array($this->customerDetails)) {
                $n = 0;
                foreach ($this->customerDetails as $item) {
                    $res['customer_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->publicProperties) {
            $res['public_properties'] = $this->publicProperties;
        }
        if (null !== $this->bizSerialNo) {
            $res['biz_serial_no'] = $this->bizSerialNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryQmpRtMixedmarketingRequest
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
        if (isset($map['plan_codes'])) {
            if (!empty($map['plan_codes'])) {
                $model->planCodes = $map['plan_codes'];
            }
        }
        if (isset($map['plan_set_code'])) {
            $model->planSetCode = $map['plan_set_code'];
        }
        if (isset($map['query_template'])) {
            $model->queryTemplate = $map['query_template'];
        }
        if (isset($map['customer_details'])) {
            if (!empty($map['customer_details'])) {
                $model->customerDetails = [];
                $n                      = 0;
                foreach ($map['customer_details'] as $item) {
                    $model->customerDetails[$n++] = null !== $item ? CustomerInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['public_properties'])) {
            $model->publicProperties = $map['public_properties'];
        }
        if (isset($map['biz_serial_no'])) {
            $model->bizSerialNo = $map['biz_serial_no'];
        }

        return $model;
    }
}
