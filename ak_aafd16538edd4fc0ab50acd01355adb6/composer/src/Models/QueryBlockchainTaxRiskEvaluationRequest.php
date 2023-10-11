<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_aafd16538edd4fc0ab50acd01355adb6\Models;

use AlibabaCloud\Tea\Model;

class QueryBlockchainTaxRiskEvaluationRequest extends Model
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

    // 请求流水号(必填),调用方保证每次请求号唯一，受理方用来校验唯一性，同一受理号返回请求结果一致
    /**
     * @var string
     */
    public $bizRequestId;

    // 信贷用户的纳税人识别号或者身份证号
    /**
     * @var string
     */
    public $identityId;

    // 授权类型
    /**
     * @var string
     */
    public $authType;

    // 授权订单号
    /**
     * @var string
     */
    public $orderNo;

    // 机构编码
    /**
     * @var string
     */
    public $instCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizRequestId'      => 'biz_request_id',
        'identityId'        => 'identity_id',
        'authType'          => 'auth_type',
        'orderNo'           => 'order_no',
        'instCode'          => 'inst_code',
    ];

    public function validate()
    {
        Model::validateRequired('bizRequestId', $this->bizRequestId, true);
        Model::validateRequired('identityId', $this->identityId, true);
        Model::validateRequired('authType', $this->authType, true);
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('instCode', $this->instCode, true);
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
        if (null !== $this->bizRequestId) {
            $res['biz_request_id'] = $this->bizRequestId;
        }
        if (null !== $this->identityId) {
            $res['identity_id'] = $this->identityId;
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->instCode) {
            $res['inst_code'] = $this->instCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBlockchainTaxRiskEvaluationRequest
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
        if (isset($map['biz_request_id'])) {
            $model->bizRequestId = $map['biz_request_id'];
        }
        if (isset($map['identity_id'])) {
            $model->identityId = $map['identity_id'];
        }
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['inst_code'])) {
            $model->instCode = $map['inst_code'];
        }

        return $model;
    }
}
