<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class SendAntsaasStaffingcInsureRefundRequest extends Model
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

    // 外部业务号
    /**
     * @var string
     */
    public $outBizNo;

    // 企业名称
    /**
     * @var string
     */
    public $enterpriseName;

    // 统一社会信用代码
    /**
     * @var string
     */
    public $socialCreditCode;

    // 退保订单号列表
    /**
     * @var int[]
     */
    public $orderNoList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outBizNo'          => 'out_biz_no',
        'enterpriseName'    => 'enterprise_name',
        'socialCreditCode'  => 'social_credit_code',
        'orderNoList'       => 'order_no_list',
    ];

    public function validate()
    {
        Model::validateRequired('outBizNo', $this->outBizNo, true);
        Model::validateRequired('enterpriseName', $this->enterpriseName, true);
        Model::validateRequired('socialCreditCode', $this->socialCreditCode, true);
        Model::validateRequired('orderNoList', $this->orderNoList, true);
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
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }
        if (null !== $this->enterpriseName) {
            $res['enterprise_name'] = $this->enterpriseName;
        }
        if (null !== $this->socialCreditCode) {
            $res['social_credit_code'] = $this->socialCreditCode;
        }
        if (null !== $this->orderNoList) {
            $res['order_no_list'] = $this->orderNoList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendAntsaasStaffingcInsureRefundRequest
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
        if (isset($map['out_biz_no'])) {
            $model->outBizNo = $map['out_biz_no'];
        }
        if (isset($map['enterprise_name'])) {
            $model->enterpriseName = $map['enterprise_name'];
        }
        if (isset($map['social_credit_code'])) {
            $model->socialCreditCode = $map['social_credit_code'];
        }
        if (isset($map['order_no_list'])) {
            if (!empty($map['order_no_list'])) {
                $model->orderNoList = $map['order_no_list'];
            }
        }

        return $model;
    }
}
