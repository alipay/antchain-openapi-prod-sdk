<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class PushRbbCustomerStatusRequest extends Model
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

    // 统一社会信用代码
    /**
     * @var string
     */
    public $creditCode;

    // 相关产品id
    /**
     * @var string
     */
    public $productCode;

    // 企业名称
    /**
     * @var string
     */
    public $companyName;

    // 状态编号
    /**
     * @var string
     */
    public $statusCode;

    // 状态文本
    /**
     * @var string
     */
    public $status;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'creditCode'        => 'credit_code',
        'productCode'       => 'product_code',
        'companyName'       => 'company_name',
        'statusCode'        => 'status_code',
        'status'            => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('creditCode', $this->creditCode, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('companyName', $this->companyName, true);
        Model::validateRequired('statusCode', $this->statusCode, true);
        Model::validateRequired('status', $this->status, true);
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
        if (null !== $this->creditCode) {
            $res['credit_code'] = $this->creditCode;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
        }
        if (null !== $this->statusCode) {
            $res['status_code'] = $this->statusCode;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushRbbCustomerStatusRequest
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
        if (isset($map['credit_code'])) {
            $model->creditCode = $map['credit_code'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['company_name'])) {
            $model->companyName = $map['company_name'];
        }
        if (isset($map['status_code'])) {
            $model->statusCode = $map['status_code'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
