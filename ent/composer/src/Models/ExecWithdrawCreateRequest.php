<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class ExecWithdrawCreateRequest extends Model
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

    // project_id，合约对应的项目id
    /**
     * @var string
     */
    public $projectId;

    // 兑现Token个数
    /**
     * @var string
     */
    public $withdrawToken;

    // 兑现总额 单位：分
    /**
     * @var int
     */
    public $withdrawAmountCent;

    // Token单价 单位：分
    /**
     * @var int
     */
    public $withdrawTokenPriceCent;

    // 业务单号，同一调用方全局唯一
    /**
     * @var string
     */
    public $withdrawRequestId;

    // 用户账号类型：PHONE / ALIPAY_LOGON_ID / ALIPAY_UID
    /**
     * @var string
     */
    public $userIdType;

    // 回跳地址（签约税优使用，使用小程序页面地址）
    /**
     * @var string
     */
    public $backUrl;

    // 支付宝用户唯一标识
    /**
     * @var string
     */
    public $userIdNo;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'projectId'              => 'project_id',
        'withdrawToken'          => 'withdraw_token',
        'withdrawAmountCent'     => 'withdraw_amount_cent',
        'withdrawTokenPriceCent' => 'withdraw_token_price_cent',
        'withdrawRequestId'      => 'withdraw_request_id',
        'userIdType'             => 'user_id_type',
        'backUrl'                => 'back_url',
        'userIdNo'               => 'user_id_no',
    ];

    public function validate()
    {
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('withdrawToken', $this->withdrawToken, true);
        Model::validateRequired('withdrawAmountCent', $this->withdrawAmountCent, true);
        Model::validateRequired('withdrawTokenPriceCent', $this->withdrawTokenPriceCent, true);
        Model::validateRequired('withdrawRequestId', $this->withdrawRequestId, true);
        Model::validateRequired('userIdType', $this->userIdType, true);
        Model::validateRequired('backUrl', $this->backUrl, true);
        Model::validateRequired('userIdNo', $this->userIdNo, true);
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
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->withdrawToken) {
            $res['withdraw_token'] = $this->withdrawToken;
        }
        if (null !== $this->withdrawAmountCent) {
            $res['withdraw_amount_cent'] = $this->withdrawAmountCent;
        }
        if (null !== $this->withdrawTokenPriceCent) {
            $res['withdraw_token_price_cent'] = $this->withdrawTokenPriceCent;
        }
        if (null !== $this->withdrawRequestId) {
            $res['withdraw_request_id'] = $this->withdrawRequestId;
        }
        if (null !== $this->userIdType) {
            $res['user_id_type'] = $this->userIdType;
        }
        if (null !== $this->backUrl) {
            $res['back_url'] = $this->backUrl;
        }
        if (null !== $this->userIdNo) {
            $res['user_id_no'] = $this->userIdNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecWithdrawCreateRequest
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
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['withdraw_token'])) {
            $model->withdrawToken = $map['withdraw_token'];
        }
        if (isset($map['withdraw_amount_cent'])) {
            $model->withdrawAmountCent = $map['withdraw_amount_cent'];
        }
        if (isset($map['withdraw_token_price_cent'])) {
            $model->withdrawTokenPriceCent = $map['withdraw_token_price_cent'];
        }
        if (isset($map['withdraw_request_id'])) {
            $model->withdrawRequestId = $map['withdraw_request_id'];
        }
        if (isset($map['user_id_type'])) {
            $model->userIdType = $map['user_id_type'];
        }
        if (isset($map['back_url'])) {
            $model->backUrl = $map['back_url'];
        }
        if (isset($map['user_id_no'])) {
            $model->userIdNo = $map['user_id_no'];
        }

        return $model;
    }
}
