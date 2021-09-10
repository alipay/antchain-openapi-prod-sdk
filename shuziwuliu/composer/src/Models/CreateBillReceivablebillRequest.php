<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CreateBillReceivablebillRequest extends Model
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

    // 账单总金额，单位（元），周期内应向发货方收取的运费总金额，不超过2位小数的数字
    /**
     * @var string
     */
    public $billAmount;

    // 账单生成时间，13位毫秒级时间戳
    /**
     * @var int
     */
    public $billCreateTime;

    // 账单期限，单位（天），合同约定的结算周期，需填写1到360的整数
    /**
     * @var int
     */
    public $billDeadline;

    // 账单id，客户生成的账单唯一编号
    /**
     * @var string
     */
    public $billId;

    // 收款方did，账单的收款方数字身份
    /**
     * @var string
     */
    public $billPayeeDid;

    // 付款方did，账单的付款方数字身份
    /**
     * @var string
     */
    public $billPayerDid;

    // 账单起始日期，13位毫秒级时间戳
    /**
     * @var int
     */
    public $billStartTime;

    // 关联合同编号，账单关联的合同编号，如为合同物流请填写
    //
    /**
     * @var string
     */
    public $contractCode;

    // 账单到期日期，13位毫秒级时间戳
    /**
     * @var int
     */
    public $deadline;

    // 账单关联运单号数组，元素个数不能超过1000个
    /**
     * @var string[]
     */
    public $waybillIds;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'billAmount'        => 'bill_amount',
        'billCreateTime'    => 'bill_create_time',
        'billDeadline'      => 'bill_deadline',
        'billId'            => 'bill_id',
        'billPayeeDid'      => 'bill_payee_did',
        'billPayerDid'      => 'bill_payer_did',
        'billStartTime'     => 'bill_start_time',
        'contractCode'      => 'contract_code',
        'deadline'          => 'deadline',
        'waybillIds'        => 'waybill_ids',
    ];

    public function validate()
    {
        Model::validateRequired('billAmount', $this->billAmount, true);
        Model::validateRequired('billCreateTime', $this->billCreateTime, true);
        Model::validateRequired('billDeadline', $this->billDeadline, true);
        Model::validateRequired('billId', $this->billId, true);
        Model::validateRequired('billPayeeDid', $this->billPayeeDid, true);
        Model::validateRequired('billPayerDid', $this->billPayerDid, true);
        Model::validateRequired('billStartTime', $this->billStartTime, true);
        Model::validateRequired('deadline', $this->deadline, true);
        Model::validateRequired('waybillIds', $this->waybillIds, true);
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
        if (null !== $this->billAmount) {
            $res['bill_amount'] = $this->billAmount;
        }
        if (null !== $this->billCreateTime) {
            $res['bill_create_time'] = $this->billCreateTime;
        }
        if (null !== $this->billDeadline) {
            $res['bill_deadline'] = $this->billDeadline;
        }
        if (null !== $this->billId) {
            $res['bill_id'] = $this->billId;
        }
        if (null !== $this->billPayeeDid) {
            $res['bill_payee_did'] = $this->billPayeeDid;
        }
        if (null !== $this->billPayerDid) {
            $res['bill_payer_did'] = $this->billPayerDid;
        }
        if (null !== $this->billStartTime) {
            $res['bill_start_time'] = $this->billStartTime;
        }
        if (null !== $this->contractCode) {
            $res['contract_code'] = $this->contractCode;
        }
        if (null !== $this->deadline) {
            $res['deadline'] = $this->deadline;
        }
        if (null !== $this->waybillIds) {
            $res['waybill_ids'] = $this->waybillIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateBillReceivablebillRequest
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
        if (isset($map['bill_amount'])) {
            $model->billAmount = $map['bill_amount'];
        }
        if (isset($map['bill_create_time'])) {
            $model->billCreateTime = $map['bill_create_time'];
        }
        if (isset($map['bill_deadline'])) {
            $model->billDeadline = $map['bill_deadline'];
        }
        if (isset($map['bill_id'])) {
            $model->billId = $map['bill_id'];
        }
        if (isset($map['bill_payee_did'])) {
            $model->billPayeeDid = $map['bill_payee_did'];
        }
        if (isset($map['bill_payer_did'])) {
            $model->billPayerDid = $map['bill_payer_did'];
        }
        if (isset($map['bill_start_time'])) {
            $model->billStartTime = $map['bill_start_time'];
        }
        if (isset($map['contract_code'])) {
            $model->contractCode = $map['contract_code'];
        }
        if (isset($map['deadline'])) {
            $model->deadline = $map['deadline'];
        }
        if (isset($map['waybill_ids'])) {
            if (!empty($map['waybill_ids'])) {
                $model->waybillIds = $map['waybill_ids'];
            }
        }

        return $model;
    }
}
