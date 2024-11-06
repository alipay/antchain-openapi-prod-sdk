<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ApplyInsuranceYzbreportRequest extends Model
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

    // 调用方生成的唯一编码，格式为 yyyyMMdd_身份标识_其他编码，系统会根据该流水号做防重、幂等判断逻辑。
    // yyyyMMdd请传递当前时间。
    // 身份标识可自定义。
    // 其他编码建议为随机值。
    // 当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
    /**
     * @var string
     */
    public $tradeNo;

    // 保司编码，PAIC---平安、CPIC---太保
    /**
     * @var string
     */
    public $externalChannelCode;

    // 险种编码，05-驿站宝
    /**
     * @var string
     */
    public $externalProductCode;

    // 保单号，申请理赔的保单号
    /**
     * @var string
     */
    public $policyNo;

    // 报案号，用于报案材料更新
    /**
     * @var string
     */
    public $reportNo;

    // 报案唯一标识，申请理赔所关联的订单号，如一个订单会存在多次理赔，请用唯一标识
    /**
     * @var string
     */
    public $reportUniqueKey;

    // 理赔申请人
    /**
     * @var string
     */
    public $claimApplyPerson;

    // 报案人名称
    /**
     * @var string
     */
    public $reporterName;

    // 报案人联系方式
    /**
     * @var string
     */
    public $reporterContact;

    // 出险时间，发生损失的时间 yyyy-mm-dd hh:mm:ss
    /**
     * @var string
     */
    public $accidentTime;

    // 出险城市编码，国家地理位置编码6位城市编码
    /**
     * @var string
     */
    public $accidentCityCode;

    // 出险区县编码，国家地理位置编码6位城市编码
    /**
     * @var string
     */
    public $accidentDistrictCode;

    // 出险详细地址，事发出险地的详细地址
    /**
     * @var string
     */
    public $accidentAddress;

    // 出险原因代码，包裹破损丢失-R3028，火灾-R3025，爆炸-R3026，水湿-R3036，自燃-R3038，其他意外-R3039
    /**
     * @var string
     */
    public $accidentCauseCode;

    // 出险详细经过
    /**
     * @var string
     */
    public $accidentDetail;

    // 损失预估总金额，单位（元），最多支持2位小数
    /**
     * @var string
     */
    public $lossEstimateTotalAmount;

    // 损失类型，1-人伤，2-车损,，3-物损，6-其它损失，多种损失以英文逗号分隔
    /**
     * @var string
     */
    public $lossType;

    // 快递公司，申请理赔所关联的快递公司名称，包裹出险可填
    /**
     * @var string
     */
    public $courierCompany;

    // 投诉工单号，申请理赔所关联的投诉工单号，包裹出险可填
    /**
     * @var string
     */
    public $complaintJobNo;

    // 运单号，申请理赔所关联的运单号，包裹出险可填
    /**
     * @var string
     */
    public $wayBillNo;

    // 支付信息
    /**
     * @var PaymentInfo
     */
    public $paymentInfo;

    // 人员伤残情况
    /**
     * @var PersonLoss
     */
    public $personLoss;

    // 车辆损失详情
    /**
     * @var CarLoss
     */
    public $carLoss;

    // 货物损失详情
    /**
     * @var CargoLoss
     */
    public $cargoLoss;

    // 文档信息
    /**
     * @var Document[]
     */
    public $documents;

    // 判责工单号
    /**
     * @var string
     */
    public $dutyWorkNo;

    // 快递或包裹进入驿站仓储时间，yyyy-mm-dd hh:mm:ss
    /**
     * @var string
     */
    public $pkgInDate;

    // 驿站针对快递或包裹的出库时间（配送上门传送待签收时间），yyyy-mm-dd hh:mm:ss
    /**
     * @var string
     */
    public $pkgOutDate;

    // 发票工单投诉时间，yyyy-mm-dd hh:mm:ss
    /**
     * @var string
     */
    public $genWorkDate;

    // 工单类型
    /**
     * @var string
     */
    public $workType;

    // 是否星级站点，0是，1否
    /**
     * @var string
     */
    public $isStarStation;

    // 被保人姓名，实际的保险被保人名称
    /**
     * @var string
     */
    public $bbrName;

    // 被保人证件类型，01--居民身份证、03--营业执照
    /**
     * @var string
     */
    public $bbrIdType;

    // 被保人证件号码
    /**
     * @var string
     */
    public $bbrIdNo;

    // 保险起期，格式：yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $insureStart;

    // 保险止期，格式：yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $insureEnd;
    protected $_name = [
        'authToken'               => 'auth_token',
        'productInstanceId'       => 'product_instance_id',
        'tradeNo'                 => 'trade_no',
        'externalChannelCode'     => 'external_channel_code',
        'externalProductCode'     => 'external_product_code',
        'policyNo'                => 'policy_no',
        'reportNo'                => 'report_no',
        'reportUniqueKey'         => 'report_unique_key',
        'claimApplyPerson'        => 'claim_apply_person',
        'reporterName'            => 'reporter_name',
        'reporterContact'         => 'reporter_contact',
        'accidentTime'            => 'accident_time',
        'accidentCityCode'        => 'accident_city_code',
        'accidentDistrictCode'    => 'accident_district_code',
        'accidentAddress'         => 'accident_address',
        'accidentCauseCode'       => 'accident_cause_code',
        'accidentDetail'          => 'accident_detail',
        'lossEstimateTotalAmount' => 'loss_estimate_total_amount',
        'lossType'                => 'loss_type',
        'courierCompany'          => 'courier_company',
        'complaintJobNo'          => 'complaint_job_no',
        'wayBillNo'               => 'way_bill_no',
        'paymentInfo'             => 'payment_info',
        'personLoss'              => 'person_loss',
        'carLoss'                 => 'car_loss',
        'cargoLoss'               => 'cargo_loss',
        'documents'               => 'documents',
        'dutyWorkNo'              => 'duty_work_no',
        'pkgInDate'               => 'pkg_in_date',
        'pkgOutDate'              => 'pkg_out_date',
        'genWorkDate'             => 'gen_work_date',
        'workType'                => 'work_type',
        'isStarStation'           => 'is_star_station',
        'bbrName'                 => 'bbr_name',
        'bbrIdType'               => 'bbr_id_type',
        'bbrIdNo'                 => 'bbr_id_no',
        'insureStart'             => 'insure_start',
        'insureEnd'               => 'insure_end',
    ];

    public function validate()
    {
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('externalChannelCode', $this->externalChannelCode, true);
        Model::validateRequired('externalProductCode', $this->externalProductCode, true);
        Model::validateRequired('policyNo', $this->policyNo, true);
        Model::validateRequired('reportUniqueKey', $this->reportUniqueKey, true);
        Model::validateRequired('claimApplyPerson', $this->claimApplyPerson, true);
        Model::validateRequired('reporterName', $this->reporterName, true);
        Model::validateRequired('reporterContact', $this->reporterContact, true);
        Model::validateRequired('accidentTime', $this->accidentTime, true);
        Model::validateRequired('accidentCityCode', $this->accidentCityCode, true);
        Model::validateRequired('accidentDistrictCode', $this->accidentDistrictCode, true);
        Model::validateRequired('accidentAddress', $this->accidentAddress, true);
        Model::validateRequired('accidentCauseCode', $this->accidentCauseCode, true);
        Model::validateRequired('accidentDetail', $this->accidentDetail, true);
        Model::validateRequired('lossEstimateTotalAmount', $this->lossEstimateTotalAmount, true);
        Model::validateRequired('lossType', $this->lossType, true);
        Model::validateMaxLength('tradeNo', $this->tradeNo, 50);
        Model::validateMaxLength('externalChannelCode', $this->externalChannelCode, 10);
        Model::validateMaxLength('externalProductCode', $this->externalProductCode, 2);
        Model::validateMaxLength('policyNo', $this->policyNo, 200);
        Model::validateMaxLength('reportUniqueKey', $this->reportUniqueKey, 200);
        Model::validateMaxLength('claimApplyPerson', $this->claimApplyPerson, 100);
        Model::validateMaxLength('reporterName', $this->reporterName, 100);
        Model::validateMaxLength('reporterContact', $this->reporterContact, 20);
        Model::validateMaxLength('accidentCityCode', $this->accidentCityCode, 10);
        Model::validateMaxLength('accidentDistrictCode', $this->accidentDistrictCode, 10);
        Model::validateMaxLength('accidentAddress', $this->accidentAddress, 500);
        Model::validateMaxLength('accidentCauseCode', $this->accidentCauseCode, 10);
        Model::validateMaxLength('accidentDetail', $this->accidentDetail, 500);
        Model::validateMaxLength('lossType', $this->lossType, 50);
        Model::validateMaxLength('courierCompany', $this->courierCompany, 200);
        Model::validateMaxLength('complaintJobNo', $this->complaintJobNo, 100);
        Model::validateMaxLength('wayBillNo', $this->wayBillNo, 100);
        Model::validateMaxLength('dutyWorkNo', $this->dutyWorkNo, 100);
        Model::validateMaxLength('pkgInDate', $this->pkgInDate, 20);
        Model::validateMaxLength('pkgOutDate', $this->pkgOutDate, 20);
        Model::validateMaxLength('genWorkDate', $this->genWorkDate, 20);
        Model::validateMaxLength('workType', $this->workType, 20);
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
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->externalChannelCode) {
            $res['external_channel_code'] = $this->externalChannelCode;
        }
        if (null !== $this->externalProductCode) {
            $res['external_product_code'] = $this->externalProductCode;
        }
        if (null !== $this->policyNo) {
            $res['policy_no'] = $this->policyNo;
        }
        if (null !== $this->reportNo) {
            $res['report_no'] = $this->reportNo;
        }
        if (null !== $this->reportUniqueKey) {
            $res['report_unique_key'] = $this->reportUniqueKey;
        }
        if (null !== $this->claimApplyPerson) {
            $res['claim_apply_person'] = $this->claimApplyPerson;
        }
        if (null !== $this->reporterName) {
            $res['reporter_name'] = $this->reporterName;
        }
        if (null !== $this->reporterContact) {
            $res['reporter_contact'] = $this->reporterContact;
        }
        if (null !== $this->accidentTime) {
            $res['accident_time'] = $this->accidentTime;
        }
        if (null !== $this->accidentCityCode) {
            $res['accident_city_code'] = $this->accidentCityCode;
        }
        if (null !== $this->accidentDistrictCode) {
            $res['accident_district_code'] = $this->accidentDistrictCode;
        }
        if (null !== $this->accidentAddress) {
            $res['accident_address'] = $this->accidentAddress;
        }
        if (null !== $this->accidentCauseCode) {
            $res['accident_cause_code'] = $this->accidentCauseCode;
        }
        if (null !== $this->accidentDetail) {
            $res['accident_detail'] = $this->accidentDetail;
        }
        if (null !== $this->lossEstimateTotalAmount) {
            $res['loss_estimate_total_amount'] = $this->lossEstimateTotalAmount;
        }
        if (null !== $this->lossType) {
            $res['loss_type'] = $this->lossType;
        }
        if (null !== $this->courierCompany) {
            $res['courier_company'] = $this->courierCompany;
        }
        if (null !== $this->complaintJobNo) {
            $res['complaint_job_no'] = $this->complaintJobNo;
        }
        if (null !== $this->wayBillNo) {
            $res['way_bill_no'] = $this->wayBillNo;
        }
        if (null !== $this->paymentInfo) {
            $res['payment_info'] = null !== $this->paymentInfo ? $this->paymentInfo->toMap() : null;
        }
        if (null !== $this->personLoss) {
            $res['person_loss'] = null !== $this->personLoss ? $this->personLoss->toMap() : null;
        }
        if (null !== $this->carLoss) {
            $res['car_loss'] = null !== $this->carLoss ? $this->carLoss->toMap() : null;
        }
        if (null !== $this->cargoLoss) {
            $res['cargo_loss'] = null !== $this->cargoLoss ? $this->cargoLoss->toMap() : null;
        }
        if (null !== $this->documents) {
            $res['documents'] = [];
            if (null !== $this->documents && \is_array($this->documents)) {
                $n = 0;
                foreach ($this->documents as $item) {
                    $res['documents'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->dutyWorkNo) {
            $res['duty_work_no'] = $this->dutyWorkNo;
        }
        if (null !== $this->pkgInDate) {
            $res['pkg_in_date'] = $this->pkgInDate;
        }
        if (null !== $this->pkgOutDate) {
            $res['pkg_out_date'] = $this->pkgOutDate;
        }
        if (null !== $this->genWorkDate) {
            $res['gen_work_date'] = $this->genWorkDate;
        }
        if (null !== $this->workType) {
            $res['work_type'] = $this->workType;
        }
        if (null !== $this->isStarStation) {
            $res['is_star_station'] = $this->isStarStation;
        }
        if (null !== $this->bbrName) {
            $res['bbr_name'] = $this->bbrName;
        }
        if (null !== $this->bbrIdType) {
            $res['bbr_id_type'] = $this->bbrIdType;
        }
        if (null !== $this->bbrIdNo) {
            $res['bbr_id_no'] = $this->bbrIdNo;
        }
        if (null !== $this->insureStart) {
            $res['insure_start'] = $this->insureStart;
        }
        if (null !== $this->insureEnd) {
            $res['insure_end'] = $this->insureEnd;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyInsuranceYzbreportRequest
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
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }
        if (isset($map['external_channel_code'])) {
            $model->externalChannelCode = $map['external_channel_code'];
        }
        if (isset($map['external_product_code'])) {
            $model->externalProductCode = $map['external_product_code'];
        }
        if (isset($map['policy_no'])) {
            $model->policyNo = $map['policy_no'];
        }
        if (isset($map['report_no'])) {
            $model->reportNo = $map['report_no'];
        }
        if (isset($map['report_unique_key'])) {
            $model->reportUniqueKey = $map['report_unique_key'];
        }
        if (isset($map['claim_apply_person'])) {
            $model->claimApplyPerson = $map['claim_apply_person'];
        }
        if (isset($map['reporter_name'])) {
            $model->reporterName = $map['reporter_name'];
        }
        if (isset($map['reporter_contact'])) {
            $model->reporterContact = $map['reporter_contact'];
        }
        if (isset($map['accident_time'])) {
            $model->accidentTime = $map['accident_time'];
        }
        if (isset($map['accident_city_code'])) {
            $model->accidentCityCode = $map['accident_city_code'];
        }
        if (isset($map['accident_district_code'])) {
            $model->accidentDistrictCode = $map['accident_district_code'];
        }
        if (isset($map['accident_address'])) {
            $model->accidentAddress = $map['accident_address'];
        }
        if (isset($map['accident_cause_code'])) {
            $model->accidentCauseCode = $map['accident_cause_code'];
        }
        if (isset($map['accident_detail'])) {
            $model->accidentDetail = $map['accident_detail'];
        }
        if (isset($map['loss_estimate_total_amount'])) {
            $model->lossEstimateTotalAmount = $map['loss_estimate_total_amount'];
        }
        if (isset($map['loss_type'])) {
            $model->lossType = $map['loss_type'];
        }
        if (isset($map['courier_company'])) {
            $model->courierCompany = $map['courier_company'];
        }
        if (isset($map['complaint_job_no'])) {
            $model->complaintJobNo = $map['complaint_job_no'];
        }
        if (isset($map['way_bill_no'])) {
            $model->wayBillNo = $map['way_bill_no'];
        }
        if (isset($map['payment_info'])) {
            $model->paymentInfo = PaymentInfo::fromMap($map['payment_info']);
        }
        if (isset($map['person_loss'])) {
            $model->personLoss = PersonLoss::fromMap($map['person_loss']);
        }
        if (isset($map['car_loss'])) {
            $model->carLoss = CarLoss::fromMap($map['car_loss']);
        }
        if (isset($map['cargo_loss'])) {
            $model->cargoLoss = CargoLoss::fromMap($map['cargo_loss']);
        }
        if (isset($map['documents'])) {
            if (!empty($map['documents'])) {
                $model->documents = [];
                $n                = 0;
                foreach ($map['documents'] as $item) {
                    $model->documents[$n++] = null !== $item ? Document::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['duty_work_no'])) {
            $model->dutyWorkNo = $map['duty_work_no'];
        }
        if (isset($map['pkg_in_date'])) {
            $model->pkgInDate = $map['pkg_in_date'];
        }
        if (isset($map['pkg_out_date'])) {
            $model->pkgOutDate = $map['pkg_out_date'];
        }
        if (isset($map['gen_work_date'])) {
            $model->genWorkDate = $map['gen_work_date'];
        }
        if (isset($map['work_type'])) {
            $model->workType = $map['work_type'];
        }
        if (isset($map['is_star_station'])) {
            $model->isStarStation = $map['is_star_station'];
        }
        if (isset($map['bbr_name'])) {
            $model->bbrName = $map['bbr_name'];
        }
        if (isset($map['bbr_id_type'])) {
            $model->bbrIdType = $map['bbr_id_type'];
        }
        if (isset($map['bbr_id_no'])) {
            $model->bbrIdNo = $map['bbr_id_no'];
        }
        if (isset($map['insure_start'])) {
            $model->insureStart = $map['insure_start'];
        }
        if (isset($map['insure_end'])) {
            $model->insureEnd = $map['insure_end'];
        }

        return $model;
    }
}
