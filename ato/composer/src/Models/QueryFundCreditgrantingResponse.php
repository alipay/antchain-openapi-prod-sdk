<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryFundCreditgrantingResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 授信id
    /**
     * @var string
     */
    public $grantingId;

    // 授信授权id
    /**
     * @var string
     */
    public $authId;

    // 资方社会信用代码
    /**
     * @var string
     */
    public $fundId;

    // 商户社会信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 商户租户id
    //
    /**
     * @var string
     */
    public $tenantId;

    // 授信额度，单位为分
    /**
     * @var int
     */
    public $grantingLine;

    // 授信有效期开始时间(yyyy-MM-dd HH:mm:ss)
    /**
     * @var string
     */
    public $effectStartTime;

    // 授信有效期结束时间(yyyy-MM-dd HH:mm:ss)
    /**
     * @var string
     */
    public $effectEndTime;

    // 授信状态
    // CREDITED:已授信
    /**
     * @var string
     */
    public $status;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'grantingId'      => 'granting_id',
        'authId'          => 'auth_id',
        'fundId'          => 'fund_id',
        'merchantId'      => 'merchant_id',
        'tenantId'        => 'tenant_id',
        'grantingLine'    => 'granting_line',
        'effectStartTime' => 'effect_start_time',
        'effectEndTime'   => 'effect_end_time',
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
        if (null !== $this->grantingId) {
            $res['granting_id'] = $this->grantingId;
        }
        if (null !== $this->authId) {
            $res['auth_id'] = $this->authId;
        }
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->grantingLine) {
            $res['granting_line'] = $this->grantingLine;
        }
        if (null !== $this->effectStartTime) {
            $res['effect_start_time'] = $this->effectStartTime;
        }
        if (null !== $this->effectEndTime) {
            $res['effect_end_time'] = $this->effectEndTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryFundCreditgrantingResponse
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
        if (isset($map['granting_id'])) {
            $model->grantingId = $map['granting_id'];
        }
        if (isset($map['auth_id'])) {
            $model->authId = $map['auth_id'];
        }
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['granting_line'])) {
            $model->grantingLine = $map['granting_line'];
        }
        if (isset($map['effect_start_time'])) {
            $model->effectStartTime = $map['effect_start_time'];
        }
        if (isset($map['effect_end_time'])) {
            $model->effectEndTime = $map['effect_end_time'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
