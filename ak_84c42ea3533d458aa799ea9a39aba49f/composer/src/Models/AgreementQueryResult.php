<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_84c42ea3533d458aa799ea9a39aba49f\Models;

use AlibabaCloud\Tea\Model;

class AgreementQueryResult extends Model
{
    // 会员所属业务平台在智能科技的会员ID
    /**
     * @example 268800000000001
     *
     * @var string
     */
    public $platformMemberId;

    // 外部业务平台的用户ID
    /**
     * @example 8899900004655511
     *
     * @var string
     */
    public $outMemberId;

    // 签约产品的产品码
    /**
     * @example YQF_PRODUCT
     *
     * @var string
     */
    public $productCode;

    // 签约产品的产品名称
    /**
     * @example 云企付
     *
     * @var string
     */
    public $productName;

    // 签约的产品类型
    //
    /**
     * @example YQF
     *
     * @var string
     */
    public $productType;

    // 签约时间
    //
    /**
     * @example 2011-11-11
     *
     * @var string
     */
    public $signingTime;

    // 到期时间
    /**
     * @example 2011-11-11
     *
     * @var string
     */
    public $endTime;

    // 是否有效
    //
    /**
     * @example true, false
     *
     * @var bool
     */
    public $activeFlag;

    // 业务错误码(为空表示成功，否则为业务错误码)
    /**
     * @example PARAM_MISSING
     *
     * @var string
     */
    public $subCode;

    // 业务错误描述
    /**
     * @example 参数不全
     *
     * @var string
     */
    public $subMsg;
    protected $_name = [
        'platformMemberId' => 'platform_member_id',
        'outMemberId'      => 'out_member_id',
        'productCode'      => 'product_code',
        'productName'      => 'product_name',
        'productType'      => 'product_type',
        'signingTime'      => 'signing_time',
        'endTime'          => 'end_time',
        'activeFlag'       => 'active_flag',
        'subCode'          => 'sub_code',
        'subMsg'           => 'sub_msg',
    ];

    public function validate()
    {
        Model::validateRequired('platformMemberId', $this->platformMemberId, true);
        Model::validateRequired('outMemberId', $this->outMemberId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->platformMemberId) {
            $res['platform_member_id'] = $this->platformMemberId;
        }
        if (null !== $this->outMemberId) {
            $res['out_member_id'] = $this->outMemberId;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->productType) {
            $res['product_type'] = $this->productType;
        }
        if (null !== $this->signingTime) {
            $res['signing_time'] = $this->signingTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->activeFlag) {
            $res['active_flag'] = $this->activeFlag;
        }
        if (null !== $this->subCode) {
            $res['sub_code'] = $this->subCode;
        }
        if (null !== $this->subMsg) {
            $res['sub_msg'] = $this->subMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AgreementQueryResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['platform_member_id'])) {
            $model->platformMemberId = $map['platform_member_id'];
        }
        if (isset($map['out_member_id'])) {
            $model->outMemberId = $map['out_member_id'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['product_type'])) {
            $model->productType = $map['product_type'];
        }
        if (isset($map['signing_time'])) {
            $model->signingTime = $map['signing_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['active_flag'])) {
            $model->activeFlag = $map['active_flag'];
        }
        if (isset($map['sub_code'])) {
            $model->subCode = $map['sub_code'];
        }
        if (isset($map['sub_msg'])) {
            $model->subMsg = $map['sub_msg'];
        }

        return $model;
    }
}
