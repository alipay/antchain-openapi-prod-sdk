<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models;

use AlibabaCloud\Tea\Model;

class CustomerAuthResult extends Model
{
    // 账户ID
    /**
     * @example xxx
     *
     * @var string
     */
    public $accId;

    // 返回code 0:核验成功 1:企业信息有误 2:企业非正常营业
    /**
     * @example 0
     *
     * @var string
     */
    public $code;

    // 客户ID
    /**
     * @example xxx
     *
     * @var string
     */
    public $customerId;

    // 客户did
    /**
     * @example xxx
     *
     * @var string
     */
    public $did;

    // 验证状态
    /**
     * @example 营业
     *
     * @var string
     */
    public $enterpriseStatus;

    // 开业时间
    /**
     * @example 2019-09-27/长期
     *
     * @var string
     */
    public $openTime;

    // 认证结果，是否通过
    /**
     * @example true, false
     *
     * @var bool
     */
    public $pass;

    // 业务ID
    /**
     * @example xxx
     *
     * @var string
     */
    public $disReqMsgId;
    protected $_name = [
        'accId'            => 'acc_id',
        'code'             => 'code',
        'customerId'       => 'customer_id',
        'did'              => 'did',
        'enterpriseStatus' => 'enterprise_status',
        'openTime'         => 'open_time',
        'pass'             => 'pass',
        'disReqMsgId'      => 'dis_req_msg_id',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('openTime', $this->openTime, true);
        Model::validateRequired('pass', $this->pass, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accId) {
            $res['acc_id'] = $this->accId;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->enterpriseStatus) {
            $res['enterprise_status'] = $this->enterpriseStatus;
        }
        if (null !== $this->openTime) {
            $res['open_time'] = $this->openTime;
        }
        if (null !== $this->pass) {
            $res['pass'] = $this->pass;
        }
        if (null !== $this->disReqMsgId) {
            $res['dis_req_msg_id'] = $this->disReqMsgId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CustomerAuthResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['acc_id'])) {
            $model->accId = $map['acc_id'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['customer_id'])) {
            $model->customerId = $map['customer_id'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['enterprise_status'])) {
            $model->enterpriseStatus = $map['enterprise_status'];
        }
        if (isset($map['open_time'])) {
            $model->openTime = $map['open_time'];
        }
        if (isset($map['pass'])) {
            $model->pass = $map['pass'];
        }
        if (isset($map['dis_req_msg_id'])) {
            $model->disReqMsgId = $map['dis_req_msg_id'];
        }

        return $model;
    }
}
