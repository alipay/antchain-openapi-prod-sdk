<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeRiskinfoEnterprisescoreRequest extends Model
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

    // 统一信用代码
    /**
     * @var string
     */
    public $socialCreditCode;

    // 手机号
    /**
     * @var string
     */
    public $mobile;

    // 客户号
    /**
     * @var string
     */
    public $customerNo;

    // 渠道号
    /**
     * @var string
     */
    public $channelCode;

    // 手机号md5
    /**
     * @var string
     */
    public $mobileMd5;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'socialCreditCode'  => 'social_credit_code',
        'mobile'            => 'mobile',
        'customerNo'        => 'customer_no',
        'channelCode'       => 'channel_code',
        'mobileMd5'         => 'mobile_md5',
    ];

    public function validate()
    {
        Model::validateRequired('socialCreditCode', $this->socialCreditCode, true);
        Model::validateRequired('customerNo', $this->customerNo, true);
        Model::validateRequired('channelCode', $this->channelCode, true);
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
        if (null !== $this->socialCreditCode) {
            $res['social_credit_code'] = $this->socialCreditCode;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->customerNo) {
            $res['customer_no'] = $this->customerNo;
        }
        if (null !== $this->channelCode) {
            $res['channel_code'] = $this->channelCode;
        }
        if (null !== $this->mobileMd5) {
            $res['mobile_md5'] = $this->mobileMd5;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeRiskinfoEnterprisescoreRequest
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
        if (isset($map['social_credit_code'])) {
            $model->socialCreditCode = $map['social_credit_code'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['customer_no'])) {
            $model->customerNo = $map['customer_no'];
        }
        if (isset($map['channel_code'])) {
            $model->channelCode = $map['channel_code'];
        }
        if (isset($map['mobile_md5'])) {
            $model->mobileMd5 = $map['mobile_md5'];
        }

        return $model;
    }
}
