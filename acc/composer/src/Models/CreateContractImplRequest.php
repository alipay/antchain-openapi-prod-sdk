<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class CreateContractImplRequest extends Model
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

    // 合同编号,(确定是哪个合同的收付款，需要唯一标识id)
    /**
     * @var string
     */
    public $contractInfoCode;

    // 收付款id
    /**
     * @var int
     */
    public $contractImplId;

    // 付款方统一社会信用代码
    /**
     * @var string
     */
    public $partyABidderCode;

    // 付款方审核人Did
    /**
     * @var string
     */
    public $partyAAuditDid;

    // 付款方名称
    /**
     * @var string
     */
    public $partyAName;

    // 收款方统一社会信用代码
    /**
     * @var string
     */
    public $partyBBidderCode;

    // 收款方审核人Did
    /**
     * @var string
     */
    public $partyBAuditDid;

    // 收款方名称
    /**
     * @var string
     */
    public $partyBName;

    // 拨付金额
    /**
     * @var string
     */
    public $payMoney;

    // 金额币种代码
    /**
     * @var string
     */
    public $priceCurrency;

    // 金额单位
    /**
     * @var string
     */
    public $priceUnit;

    // 支付说明
    /**
     * @var string
     */
    public $remarks;

    // 款项类型
    /**
     * @var string
     */
    public $paymentType;

    // 拨付时间
    /**
     * @var string
     */
    public $payTime;

    // 创建人Did
    /**
     * @var string
     */
    public $createdDid;

    // 付款凭证文件(文件Id)
    /**
     * @var string
     */
    public $file;

    // 数据时间戳
    /**
     * @var string
     */
    public $dataTimestamp;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'contractInfoCode'  => 'contract_info_code',
        'contractImplId'    => 'contract_impl_id',
        'partyABidderCode'  => 'party_a_bidder_code',
        'partyAAuditDid'    => 'party_a_audit_did',
        'partyAName'        => 'party_a_name',
        'partyBBidderCode'  => 'party_b_bidder_code',
        'partyBAuditDid'    => 'party_b_audit_did',
        'partyBName'        => 'party_b_name',
        'payMoney'          => 'pay_money',
        'priceCurrency'     => 'price_currency',
        'priceUnit'         => 'price_unit',
        'remarks'           => 'remarks',
        'paymentType'       => 'payment_type',
        'payTime'           => 'pay_time',
        'createdDid'        => 'created_did',
        'file'              => 'file',
        'dataTimestamp'     => 'data_timestamp',
    ];

    public function validate()
    {
        Model::validateRequired('contractInfoCode', $this->contractInfoCode, true);
        Model::validateRequired('contractImplId', $this->contractImplId, true);
        Model::validateRequired('partyABidderCode', $this->partyABidderCode, true);
        Model::validateRequired('partyAAuditDid', $this->partyAAuditDid, true);
        Model::validateRequired('partyAName', $this->partyAName, true);
        Model::validateRequired('partyBBidderCode', $this->partyBBidderCode, true);
        Model::validateRequired('partyBName', $this->partyBName, true);
        Model::validateRequired('payMoney', $this->payMoney, true);
        Model::validateRequired('priceCurrency', $this->priceCurrency, true);
        Model::validateRequired('priceUnit', $this->priceUnit, true);
        Model::validateRequired('remarks', $this->remarks, true);
        Model::validateRequired('paymentType', $this->paymentType, true);
        Model::validateRequired('payTime', $this->payTime, true);
        Model::validateRequired('createdDid', $this->createdDid, true);
        Model::validateRequired('file', $this->file, true);
        Model::validateRequired('dataTimestamp', $this->dataTimestamp, true);
        Model::validatePattern('payTime', $this->payTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('dataTimestamp', $this->dataTimestamp, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->contractInfoCode) {
            $res['contract_info_code'] = $this->contractInfoCode;
        }
        if (null !== $this->contractImplId) {
            $res['contract_impl_id'] = $this->contractImplId;
        }
        if (null !== $this->partyABidderCode) {
            $res['party_a_bidder_code'] = $this->partyABidderCode;
        }
        if (null !== $this->partyAAuditDid) {
            $res['party_a_audit_did'] = $this->partyAAuditDid;
        }
        if (null !== $this->partyAName) {
            $res['party_a_name'] = $this->partyAName;
        }
        if (null !== $this->partyBBidderCode) {
            $res['party_b_bidder_code'] = $this->partyBBidderCode;
        }
        if (null !== $this->partyBAuditDid) {
            $res['party_b_audit_did'] = $this->partyBAuditDid;
        }
        if (null !== $this->partyBName) {
            $res['party_b_name'] = $this->partyBName;
        }
        if (null !== $this->payMoney) {
            $res['pay_money'] = $this->payMoney;
        }
        if (null !== $this->priceCurrency) {
            $res['price_currency'] = $this->priceCurrency;
        }
        if (null !== $this->priceUnit) {
            $res['price_unit'] = $this->priceUnit;
        }
        if (null !== $this->remarks) {
            $res['remarks'] = $this->remarks;
        }
        if (null !== $this->paymentType) {
            $res['payment_type'] = $this->paymentType;
        }
        if (null !== $this->payTime) {
            $res['pay_time'] = $this->payTime;
        }
        if (null !== $this->createdDid) {
            $res['created_did'] = $this->createdDid;
        }
        if (null !== $this->file) {
            $res['file'] = $this->file;
        }
        if (null !== $this->dataTimestamp) {
            $res['data_timestamp'] = $this->dataTimestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateContractImplRequest
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
        if (isset($map['contract_info_code'])) {
            $model->contractInfoCode = $map['contract_info_code'];
        }
        if (isset($map['contract_impl_id'])) {
            $model->contractImplId = $map['contract_impl_id'];
        }
        if (isset($map['party_a_bidder_code'])) {
            $model->partyABidderCode = $map['party_a_bidder_code'];
        }
        if (isset($map['party_a_audit_did'])) {
            $model->partyAAuditDid = $map['party_a_audit_did'];
        }
        if (isset($map['party_a_name'])) {
            $model->partyAName = $map['party_a_name'];
        }
        if (isset($map['party_b_bidder_code'])) {
            $model->partyBBidderCode = $map['party_b_bidder_code'];
        }
        if (isset($map['party_b_audit_did'])) {
            $model->partyBAuditDid = $map['party_b_audit_did'];
        }
        if (isset($map['party_b_name'])) {
            $model->partyBName = $map['party_b_name'];
        }
        if (isset($map['pay_money'])) {
            $model->payMoney = $map['pay_money'];
        }
        if (isset($map['price_currency'])) {
            $model->priceCurrency = $map['price_currency'];
        }
        if (isset($map['price_unit'])) {
            $model->priceUnit = $map['price_unit'];
        }
        if (isset($map['remarks'])) {
            $model->remarks = $map['remarks'];
        }
        if (isset($map['payment_type'])) {
            $model->paymentType = $map['payment_type'];
        }
        if (isset($map['pay_time'])) {
            $model->payTime = $map['pay_time'];
        }
        if (isset($map['created_did'])) {
            $model->createdDid = $map['created_did'];
        }
        if (isset($map['file'])) {
            $model->file = $map['file'];
        }
        if (isset($map['data_timestamp'])) {
            $model->dataTimestamp = $map['data_timestamp'];
        }

        return $model;
    }
}
