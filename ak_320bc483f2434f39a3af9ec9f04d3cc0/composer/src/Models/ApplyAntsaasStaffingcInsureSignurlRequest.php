<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class ApplyAntsaasStaffingcInsureSignurlRequest extends Model
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

    // 企业名称
    /**
     * @var string
     */
    public $enterpriseName;

    // 社会信用代码
    /**
     * @var string
     */
    public $socialCreditCode;

    // 签约支付宝账号（企业支付宝是邮箱）
    /**
     * @var string
     */
    public $authAccount;

    // 联系手机号（用于接收投保失败等短信通知）
    /**
     * @var string
     */
    public $mobile;

    // 外部业务号(64长度以内）
    //
    /**
     * @var string
     */
    public $outBizNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'enterpriseName'    => 'enterprise_name',
        'socialCreditCode'  => 'social_credit_code',
        'authAccount'       => 'auth_account',
        'mobile'            => 'mobile',
        'outBizNo'          => 'out_biz_no',
    ];

    public function validate()
    {
        Model::validateRequired('enterpriseName', $this->enterpriseName, true);
        Model::validateRequired('socialCreditCode', $this->socialCreditCode, true);
        Model::validateRequired('authAccount', $this->authAccount, true);
        Model::validateRequired('outBizNo', $this->outBizNo, true);
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
        if (null !== $this->enterpriseName) {
            $res['enterprise_name'] = $this->enterpriseName;
        }
        if (null !== $this->socialCreditCode) {
            $res['social_credit_code'] = $this->socialCreditCode;
        }
        if (null !== $this->authAccount) {
            $res['auth_account'] = $this->authAccount;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyAntsaasStaffingcInsureSignurlRequest
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
        if (isset($map['enterprise_name'])) {
            $model->enterpriseName = $map['enterprise_name'];
        }
        if (isset($map['social_credit_code'])) {
            $model->socialCreditCode = $map['social_credit_code'];
        }
        if (isset($map['auth_account'])) {
            $model->authAccount = $map['auth_account'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['out_biz_no'])) {
            $model->outBizNo = $map['out_biz_no'];
        }

        return $model;
    }
}
