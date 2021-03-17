<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class HqOrder extends Model
{
    // 房产链房产查询单号
    /**
     * @example 20200810001220100000000000000001
     *
     * @var string
     */
    public $houseQueryOrderNo;

    // 房产链房产查询单状态
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $status;

    // 房产查询场景,NO_AUTH_QUERY=无授权直查
    /**
     * @example NO_AUTH_QUERY
     *
     * @var string
     */
    public $scene;

    // 2334898983498394838C
    /**
     * @example 机构侧业务单据号
     *
     * @var string
     */
    public $outBizNo;

    // 助贷平台
    /**
     * @example JIEBEI
     *
     * @var string
     */
    public $loanAssistPlatform;

    // 房产链内部银行编号
    /**
     * @example 20200810001220100000000000000001
     *
     * @var string
     */
    public $bankNo;

    // 银行名称
    /**
     * @example 宁波银行
     *
     * @var string
     */
    public $bankName;

    // 房产链内部不动产中心编号
    /**
     * @example 20200810001220100000000000000001
     *
     * @var string
     */
    public $rtcNo;

    // 不动产中心名称
    /**
     * @example 宁波不动产中心
     *
     * @var string
     */
    public $rtcName;

    // 房产权证类型
    /**
     * @example HOUSE_OWNERSHIP_CERT
     *
     * @var string
     */
    public $houseCertType;

    // 权证编号(短号)
    /**
     * @example 201301343
     *
     * @var string
     */
    public $houseCertNo;

    // 房产查询单生成时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $startTime;

    // 房产查询单结束时间
    /**
     * @example 房产查询单生成时间
     *
     * @var string
     */
    public $endTime;

    // 房产查询失败原因，MF_REALTY_NOT_EXISTS=房产信息不存在
    /**
     * @example MF_REALTY_NOT_EXISTS
     *
     * @var string
     */
    public $failCode;

    // 房产查询失败描述
    /**
     * @example 查无此房
     *
     * @var string
     */
    public $failDesc;

    // 业务办理分支行
    /**
     * @example
     *
     * @var Bank
     */
    public $branchBank;

    // 房产信息
    /**
     * @example
     *
     * @var House
     */
    public $house;
    protected $_name = [
        'houseQueryOrderNo'  => 'house_query_order_no',
        'status'             => 'status',
        'scene'              => 'scene',
        'outBizNo'           => 'out_biz_no',
        'loanAssistPlatform' => 'loan_assist_platform',
        'bankNo'             => 'bank_no',
        'bankName'           => 'bank_name',
        'rtcNo'              => 'rtc_no',
        'rtcName'            => 'rtc_name',
        'houseCertType'      => 'house_cert_type',
        'houseCertNo'        => 'house_cert_no',
        'startTime'          => 'start_time',
        'endTime'            => 'end_time',
        'failCode'           => 'fail_code',
        'failDesc'           => 'fail_desc',
        'branchBank'         => 'branch_bank',
        'house'              => 'house',
    ];

    public function validate()
    {
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->houseQueryOrderNo) {
            $res['house_query_order_no'] = $this->houseQueryOrderNo;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }
        if (null !== $this->loanAssistPlatform) {
            $res['loan_assist_platform'] = $this->loanAssistPlatform;
        }
        if (null !== $this->bankNo) {
            $res['bank_no'] = $this->bankNo;
        }
        if (null !== $this->bankName) {
            $res['bank_name'] = $this->bankName;
        }
        if (null !== $this->rtcNo) {
            $res['rtc_no'] = $this->rtcNo;
        }
        if (null !== $this->rtcName) {
            $res['rtc_name'] = $this->rtcName;
        }
        if (null !== $this->houseCertType) {
            $res['house_cert_type'] = $this->houseCertType;
        }
        if (null !== $this->houseCertNo) {
            $res['house_cert_no'] = $this->houseCertNo;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->failCode) {
            $res['fail_code'] = $this->failCode;
        }
        if (null !== $this->failDesc) {
            $res['fail_desc'] = $this->failDesc;
        }
        if (null !== $this->branchBank) {
            $res['branch_bank'] = null !== $this->branchBank ? $this->branchBank->toMap() : null;
        }
        if (null !== $this->house) {
            $res['house'] = null !== $this->house ? $this->house->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HqOrder
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['house_query_order_no'])) {
            $model->houseQueryOrderNo = $map['house_query_order_no'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['out_biz_no'])) {
            $model->outBizNo = $map['out_biz_no'];
        }
        if (isset($map['loan_assist_platform'])) {
            $model->loanAssistPlatform = $map['loan_assist_platform'];
        }
        if (isset($map['bank_no'])) {
            $model->bankNo = $map['bank_no'];
        }
        if (isset($map['bank_name'])) {
            $model->bankName = $map['bank_name'];
        }
        if (isset($map['rtc_no'])) {
            $model->rtcNo = $map['rtc_no'];
        }
        if (isset($map['rtc_name'])) {
            $model->rtcName = $map['rtc_name'];
        }
        if (isset($map['house_cert_type'])) {
            $model->houseCertType = $map['house_cert_type'];
        }
        if (isset($map['house_cert_no'])) {
            $model->houseCertNo = $map['house_cert_no'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['fail_code'])) {
            $model->failCode = $map['fail_code'];
        }
        if (isset($map['fail_desc'])) {
            $model->failDesc = $map['fail_desc'];
        }
        if (isset($map['branch_bank'])) {
            $model->branchBank = Bank::fromMap($map['branch_bank']);
        }
        if (isset($map['house'])) {
            $model->house = House::fromMap($map['house']);
        }

        return $model;
    }
}
