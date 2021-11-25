<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class CreateContractBaseRequest extends Model
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

    // 项目编号
    /**
     * @var string
     */
    public $projectCode;

    // 合同信息id
    /**
     * @var int
     */
    public $contractInfoId;

    // 合同编号
    /**
     * @var string
     */
    public $contractInfoCode;

    // 合同名称
    /**
     * @var string
     */
    public $contractName;

    // 合同版本,从1起
    /**
     * @var int
     */
    public $contractVersion;

    // 变更原因（第一版不传值）
    /**
     * @var string
     */
    public $changeReason;

    // 合同类型
    /**
     * @var string
     */
    public $contractType;

    // 甲方统一社会信用代码
    /**
     * @var string
     */
    public $partyABidderCode;

    // 甲方名称
    /**
     * @var string
     */
    public $partyAName;

    // 甲方授权代表Did
    /**
     * @var string
     */
    public $partyAAuditDid;

    // 乙方集合
    /**
     * @var PartyBFirmDto[]
     */
    public $partyBFirmDtoList;

    // 合同金额
    /**
     * @var string
     */
    public $contractMoney;

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

    // 拟开工时间
    /**
     * @var string
     */
    public $startDate;

    // 拟建成时间
    /**
     * @var string
     */
    public $endDate;

    // 合同签署时间
    /**
     * @var string
     */
    public $contractSignTime;

    // 创建人Did
    /**
     * @var string
     */
    public $createdDid;

    // 合同文件
    /**
     * @var string
     */
    public $contractFile;

    // 文件存证
    /**
     * @var string
     */
    public $evidence;

    // 存证txHash
    /**
     * @var string
     */
    public $txHash;

    // 数据时间戳
    /**
     * @var string
     */
    public $dataTimestamp;

    // 保证金对象集合
    /**
     * @var SecurityFundDto[]
     */
    public $securityFundDtoList;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'projectCode'         => 'project_code',
        'contractInfoId'      => 'contract_info_id',
        'contractInfoCode'    => 'contract_info_code',
        'contractName'        => 'contract_name',
        'contractVersion'     => 'contract_version',
        'changeReason'        => 'change_reason',
        'contractType'        => 'contract_type',
        'partyABidderCode'    => 'party_a_bidder_code',
        'partyAName'          => 'party_a_name',
        'partyAAuditDid'      => 'party_a_audit_did',
        'partyBFirmDtoList'   => 'party_b_firm_dto_list',
        'contractMoney'       => 'contract_money',
        'priceCurrency'       => 'price_currency',
        'priceUnit'           => 'price_unit',
        'startDate'           => 'start_date',
        'endDate'             => 'end_date',
        'contractSignTime'    => 'contract_sign_time',
        'createdDid'          => 'created_did',
        'contractFile'        => 'contract_file',
        'evidence'            => 'evidence',
        'txHash'              => 'tx_hash',
        'dataTimestamp'       => 'data_timestamp',
        'securityFundDtoList' => 'security_fund_dto_list',
    ];

    public function validate()
    {
        Model::validateRequired('projectCode', $this->projectCode, true);
        Model::validateRequired('contractInfoId', $this->contractInfoId, true);
        Model::validateRequired('contractInfoCode', $this->contractInfoCode, true);
        Model::validateRequired('contractName', $this->contractName, true);
        Model::validateRequired('contractVersion', $this->contractVersion, true);
        Model::validateRequired('contractType', $this->contractType, true);
        Model::validateRequired('partyABidderCode', $this->partyABidderCode, true);
        Model::validateRequired('partyAName', $this->partyAName, true);
        Model::validateRequired('partyAAuditDid', $this->partyAAuditDid, true);
        Model::validateRequired('partyBFirmDtoList', $this->partyBFirmDtoList, true);
        Model::validateRequired('contractMoney', $this->contractMoney, true);
        Model::validateRequired('priceCurrency', $this->priceCurrency, true);
        Model::validateRequired('priceUnit', $this->priceUnit, true);
        Model::validateRequired('startDate', $this->startDate, true);
        Model::validateRequired('endDate', $this->endDate, true);
        Model::validateRequired('contractSignTime', $this->contractSignTime, true);
        Model::validateRequired('createdDid', $this->createdDid, true);
        Model::validateRequired('contractFile', $this->contractFile, true);
        Model::validateRequired('evidence', $this->evidence, true);
        Model::validateRequired('dataTimestamp', $this->dataTimestamp, true);
        Model::validatePattern('startDate', $this->startDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('endDate', $this->endDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('contractSignTime', $this->contractSignTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->projectCode) {
            $res['project_code'] = $this->projectCode;
        }
        if (null !== $this->contractInfoId) {
            $res['contract_info_id'] = $this->contractInfoId;
        }
        if (null !== $this->contractInfoCode) {
            $res['contract_info_code'] = $this->contractInfoCode;
        }
        if (null !== $this->contractName) {
            $res['contract_name'] = $this->contractName;
        }
        if (null !== $this->contractVersion) {
            $res['contract_version'] = $this->contractVersion;
        }
        if (null !== $this->changeReason) {
            $res['change_reason'] = $this->changeReason;
        }
        if (null !== $this->contractType) {
            $res['contract_type'] = $this->contractType;
        }
        if (null !== $this->partyABidderCode) {
            $res['party_a_bidder_code'] = $this->partyABidderCode;
        }
        if (null !== $this->partyAName) {
            $res['party_a_name'] = $this->partyAName;
        }
        if (null !== $this->partyAAuditDid) {
            $res['party_a_audit_did'] = $this->partyAAuditDid;
        }
        if (null !== $this->partyBFirmDtoList) {
            $res['party_b_firm_dto_list'] = [];
            if (null !== $this->partyBFirmDtoList && \is_array($this->partyBFirmDtoList)) {
                $n = 0;
                foreach ($this->partyBFirmDtoList as $item) {
                    $res['party_b_firm_dto_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->contractMoney) {
            $res['contract_money'] = $this->contractMoney;
        }
        if (null !== $this->priceCurrency) {
            $res['price_currency'] = $this->priceCurrency;
        }
        if (null !== $this->priceUnit) {
            $res['price_unit'] = $this->priceUnit;
        }
        if (null !== $this->startDate) {
            $res['start_date'] = $this->startDate;
        }
        if (null !== $this->endDate) {
            $res['end_date'] = $this->endDate;
        }
        if (null !== $this->contractSignTime) {
            $res['contract_sign_time'] = $this->contractSignTime;
        }
        if (null !== $this->createdDid) {
            $res['created_did'] = $this->createdDid;
        }
        if (null !== $this->contractFile) {
            $res['contract_file'] = $this->contractFile;
        }
        if (null !== $this->evidence) {
            $res['evidence'] = $this->evidence;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->dataTimestamp) {
            $res['data_timestamp'] = $this->dataTimestamp;
        }
        if (null !== $this->securityFundDtoList) {
            $res['security_fund_dto_list'] = [];
            if (null !== $this->securityFundDtoList && \is_array($this->securityFundDtoList)) {
                $n = 0;
                foreach ($this->securityFundDtoList as $item) {
                    $res['security_fund_dto_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateContractBaseRequest
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
        if (isset($map['project_code'])) {
            $model->projectCode = $map['project_code'];
        }
        if (isset($map['contract_info_id'])) {
            $model->contractInfoId = $map['contract_info_id'];
        }
        if (isset($map['contract_info_code'])) {
            $model->contractInfoCode = $map['contract_info_code'];
        }
        if (isset($map['contract_name'])) {
            $model->contractName = $map['contract_name'];
        }
        if (isset($map['contract_version'])) {
            $model->contractVersion = $map['contract_version'];
        }
        if (isset($map['change_reason'])) {
            $model->changeReason = $map['change_reason'];
        }
        if (isset($map['contract_type'])) {
            $model->contractType = $map['contract_type'];
        }
        if (isset($map['party_a_bidder_code'])) {
            $model->partyABidderCode = $map['party_a_bidder_code'];
        }
        if (isset($map['party_a_name'])) {
            $model->partyAName = $map['party_a_name'];
        }
        if (isset($map['party_a_audit_did'])) {
            $model->partyAAuditDid = $map['party_a_audit_did'];
        }
        if (isset($map['party_b_firm_dto_list'])) {
            if (!empty($map['party_b_firm_dto_list'])) {
                $model->partyBFirmDtoList = [];
                $n                        = 0;
                foreach ($map['party_b_firm_dto_list'] as $item) {
                    $model->partyBFirmDtoList[$n++] = null !== $item ? PartyBFirmDto::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['contract_money'])) {
            $model->contractMoney = $map['contract_money'];
        }
        if (isset($map['price_currency'])) {
            $model->priceCurrency = $map['price_currency'];
        }
        if (isset($map['price_unit'])) {
            $model->priceUnit = $map['price_unit'];
        }
        if (isset($map['start_date'])) {
            $model->startDate = $map['start_date'];
        }
        if (isset($map['end_date'])) {
            $model->endDate = $map['end_date'];
        }
        if (isset($map['contract_sign_time'])) {
            $model->contractSignTime = $map['contract_sign_time'];
        }
        if (isset($map['created_did'])) {
            $model->createdDid = $map['created_did'];
        }
        if (isset($map['contract_file'])) {
            $model->contractFile = $map['contract_file'];
        }
        if (isset($map['evidence'])) {
            $model->evidence = $map['evidence'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['data_timestamp'])) {
            $model->dataTimestamp = $map['data_timestamp'];
        }
        if (isset($map['security_fund_dto_list'])) {
            if (!empty($map['security_fund_dto_list'])) {
                $model->securityFundDtoList = [];
                $n                          = 0;
                foreach ($map['security_fund_dto_list'] as $item) {
                    $model->securityFundDtoList[$n++] = null !== $item ? SecurityFundDto::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
