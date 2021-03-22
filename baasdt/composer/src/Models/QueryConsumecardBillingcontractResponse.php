<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryConsumecardBillingcontractResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 基础响应对象
    /**
     * @var BaseResponseData
     */
    public $baseResponse;

    // 商家名称
    /**
     * @var string
     */
    public $name;

    // 商家链上账户ID
    /**
     * @var string
     */
    public $accountId;

    // 认证平台ID 例如：支付宝用户ID
    /**
     * @var string
     */
    public $certificationId;

    // 场景码(需要申请)
    /**
     * @var string
     */
    public $productCode;

    // 签约时间
    /**
     * @var string
     */
    public $signTime;

    // 解约时间
    /**
     * @var string
     */
    public $invalidTime;

    // 签约链接
    /**
     * @var string
     */
    public $arrangementUrl;

    // 签约状态
    /**
     * @var int
     */
    public $status;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'baseResponse'    => 'base_response',
        'name'            => 'name',
        'accountId'       => 'account_id',
        'certificationId' => 'certification_id',
        'productCode'     => 'product_code',
        'signTime'        => 'sign_time',
        'invalidTime'     => 'invalid_time',
        'arrangementUrl'  => 'arrangement_url',
        'status'          => 'status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->baseResponse) {
            $res['base_response'] = null !== $this->baseResponse ? $this->baseResponse->toMap() : null;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->certificationId) {
            $res['certification_id'] = $this->certificationId;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->signTime) {
            $res['sign_time'] = $this->signTime;
        }
        if (null !== $this->invalidTime) {
            $res['invalid_time'] = $this->invalidTime;
        }
        if (null !== $this->arrangementUrl) {
            $res['arrangement_url'] = $this->arrangementUrl;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryConsumecardBillingcontractResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['base_response'])) {
            $model->baseResponse = BaseResponseData::fromMap($map['base_response']);
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['certification_id'])) {
            $model->certificationId = $map['certification_id'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['sign_time'])) {
            $model->signTime = $map['sign_time'];
        }
        if (isset($map['invalid_time'])) {
            $model->invalidTime = $map['invalid_time'];
        }
        if (isset($map['arrangement_url'])) {
            $model->arrangementUrl = $map['arrangement_url'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
