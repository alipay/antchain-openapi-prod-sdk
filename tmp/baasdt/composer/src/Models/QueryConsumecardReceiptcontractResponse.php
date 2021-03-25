<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryConsumecardReceiptcontractResponse extends Model
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

    // 签约ID= platform_tenant_id+product_code+certification_id+sales_plan(分库分表路由)
    /**
     * @var string
     */
    public $uid;

    // 平台租户ID
    /**
     * @var string
     */
    public $platformTenantId;

    // 场景码(需要申请)
    /**
     * @var string
     */
    public $productCode;

    // 认证平台ID，本期支付宝用户ID（分库分表路由字段）
    /**
     * @var string
     */
    public $certificationId;

    // 合同编号
    /**
     * @var string
     */
    public $contractNumber;

    // 证件编号
    /**
     * @var string
     */
    public $idNumber;

    // 证件类型
    /**
     * @var int
     */
    public $idType;

    // 用户姓名/企业名称
    /**
     * @var string
     */
    public $name;

    // 客户编号（链上账号）
    //
    // 已经创建成功的链上账户
    /**
     * @var string
     */
    public $accountId;

    // 客户编号（业务系统）
    //
    // 平台业务系统IP
    /**
     * @var string
     */
    public $userId;

    // 签约状态
    //
    // 0：未签约 1：已签约 2：已解约（主动解约、过期解约）
    /**
     * @var int
     */
    public $status;

    // 签约日期
    //
    /**
     * @var string
     */
    public $signDate;

    // 解约日期
    //
    //
    /**
     * @var string
     */
    public $cancelDate;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'uid'              => 'uid',
        'platformTenantId' => 'platform_tenant_id',
        'productCode'      => 'product_code',
        'certificationId'  => 'certification_id',
        'contractNumber'   => 'contract_number',
        'idNumber'         => 'id_number',
        'idType'           => 'id_type',
        'name'             => 'name',
        'accountId'        => 'account_id',
        'userId'           => 'user_id',
        'status'           => 'status',
        'signDate'         => 'sign_date',
        'cancelDate'       => 'cancel_date',
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
        if (null !== $this->uid) {
            $res['uid'] = $this->uid;
        }
        if (null !== $this->platformTenantId) {
            $res['platform_tenant_id'] = $this->platformTenantId;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->certificationId) {
            $res['certification_id'] = $this->certificationId;
        }
        if (null !== $this->contractNumber) {
            $res['contract_number'] = $this->contractNumber;
        }
        if (null !== $this->idNumber) {
            $res['id_number'] = $this->idNumber;
        }
        if (null !== $this->idType) {
            $res['id_type'] = $this->idType;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->signDate) {
            $res['sign_date'] = $this->signDate;
        }
        if (null !== $this->cancelDate) {
            $res['cancel_date'] = $this->cancelDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryConsumecardReceiptcontractResponse
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
        if (isset($map['uid'])) {
            $model->uid = $map['uid'];
        }
        if (isset($map['platform_tenant_id'])) {
            $model->platformTenantId = $map['platform_tenant_id'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['certification_id'])) {
            $model->certificationId = $map['certification_id'];
        }
        if (isset($map['contract_number'])) {
            $model->contractNumber = $map['contract_number'];
        }
        if (isset($map['id_number'])) {
            $model->idNumber = $map['id_number'];
        }
        if (isset($map['id_type'])) {
            $model->idType = $map['id_type'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['sign_date'])) {
            $model->signDate = $map['sign_date'];
        }
        if (isset($map['cancel_date'])) {
            $model->cancelDate = $map['cancel_date'];
        }

        return $model;
    }
}
