<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class SubmitInvestigateCaseRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 报案号 - 外部唯一ID
    /**
     * @var string
     */
    public $reportNo;

    // 外部单据号
    /**
     * @var string
     */
    public $outCaseNo;

    // 案件号
    /**
     * @var string
     */
    public $policyNo;

    // 委托的保司ID
    /**
     * @var string
     */
    public $entrustInsuranceCompanyId;

    // 要求完成时间，时间戳
    /**
     * @var int
     */
    public $investEndTime;

    // 委托联系人
    /**
     * @var string
     */
    public $entrustName;

    // 委托联系人电话
    /**
     * @var string
     */
    public $entrustTel;

    // 委托时间，时间戳
    /**
     * @var int
     */
    public $entrustTime;

    // 出险人电话号码
    /**
     * @var string
     */
    public $accidentTel;

    // 出险人姓名
    /**
     * @var string
     */
    public $accidentName;

    // 出险人证件号
    /**
     * @var string
     */
    public $accidentCardNo;

    // 出险人证件类型，10-身份证/11-户口本/13-军官证/17-港澳通行证/18-台湾通行证/51-护照/99-其他
    /**
     * @var string
     */
    public $accidentCardType;

    // 出险经过
    /**
     * @var string
     */
    public $accidentDesc;

    // 出险人地址中文名
    /**
     * @var string
     */
    public $accidentAddressInfo;

    // 出险人详细住址
    /**
     * @var string
     */
    public $accidentAddressDetail;

    // 出险日期，时间戳
    /**
     * @var int
     */
    public $accidentTime;

    // 报案人电话号码
    /**
     * @var string
     */
    public $reporterTel;

    // 报案人姓名
    /**
     * @var string
     */
    public $reporterName;

    // 报案人证件号
    /**
     * @var string
     */
    public $reporterCardNo;

    // 报案人证件类型，10-身份证/11-户口本/13-军官证/17-港澳通行证/18-台湾通行证/51-护照/99-其他
    /**
     * @var string
     */
    public $reporterCardType;

    // 报案人与出险人的关系
    // 1本人，2配偶，3父母，4子女，5其他
    /**
     * @var string
     */
    public $reporterRelationToAccident;

    // 报案时间，时间戳
    /**
     * @var int
     */
    public $reportTime;

    // 事故发生地址中文名，格式：省-市-区，如浙江省-杭州市-西湖区
    /**
     * @var string
     */
    public $eventAddressInfo;

    // 事故发生详细地点
    /**
     * @var string
     */
    public $eventAddressDetail;

    // 确诊医院
    /**
     * @var string
     */
    public $confirmHospital;

    // 确诊医院地址信息，格式：省-市-区，如浙江省-杭州市-西湖区
    /**
     * @var string
     */
    public $confirmHospitalAddressInfo;

    // 确诊疾病名称
    /**
     * @var string
     */
    public $confirmIllnessName;

    // 产品大类 重疾或者医疗险
    /**
     * @var string
     */
    public $productType;

    // 文件列表
    /**
     * @var FileNode[]
     */
    public $fileList;

    // 委托险种集合信息
    /**
     * @var EntrustGuaranteeProduct[]
     */
    public $entrustGuaranteeProductList;
    protected $_name = [
        'authToken'                   => 'auth_token',
        'reportNo'                    => 'report_no',
        'outCaseNo'                   => 'out_case_no',
        'policyNo'                    => 'policy_no',
        'entrustInsuranceCompanyId'   => 'entrust_insurance_company_id',
        'investEndTime'               => 'invest_end_time',
        'entrustName'                 => 'entrust_name',
        'entrustTel'                  => 'entrust_tel',
        'entrustTime'                 => 'entrust_time',
        'accidentTel'                 => 'accident_tel',
        'accidentName'                => 'accident_name',
        'accidentCardNo'              => 'accident_card_no',
        'accidentCardType'            => 'accident_card_type',
        'accidentDesc'                => 'accident_desc',
        'accidentAddressInfo'         => 'accident_address_info',
        'accidentAddressDetail'       => 'accident_address_detail',
        'accidentTime'                => 'accident_time',
        'reporterTel'                 => 'reporter_tel',
        'reporterName'                => 'reporter_name',
        'reporterCardNo'              => 'reporter_card_no',
        'reporterCardType'            => 'reporter_card_type',
        'reporterRelationToAccident'  => 'reporter_relation_to_accident',
        'reportTime'                  => 'report_time',
        'eventAddressInfo'            => 'event_address_info',
        'eventAddressDetail'          => 'event_address_detail',
        'confirmHospital'             => 'confirm_hospital',
        'confirmHospitalAddressInfo'  => 'confirm_hospital_address_info',
        'confirmIllnessName'          => 'confirm_illness_name',
        'productType'                 => 'product_type',
        'fileList'                    => 'file_list',
        'entrustGuaranteeProductList' => 'entrust_guarantee_product_list',
    ];

    public function validate()
    {
        Model::validateRequired('reportNo', $this->reportNo, true);
        Model::validateRequired('outCaseNo', $this->outCaseNo, true);
        Model::validateRequired('entrustInsuranceCompanyId', $this->entrustInsuranceCompanyId, true);
        Model::validateRequired('investEndTime', $this->investEndTime, true);
        Model::validateRequired('entrustName', $this->entrustName, true);
        Model::validateRequired('entrustTel', $this->entrustTel, true);
        Model::validateRequired('entrustTime', $this->entrustTime, true);
        Model::validateRequired('accidentTel', $this->accidentTel, true);
        Model::validateRequired('accidentName', $this->accidentName, true);
        Model::validateRequired('accidentCardNo', $this->accidentCardNo, true);
        Model::validateRequired('accidentCardType', $this->accidentCardType, true);
        Model::validateRequired('accidentDesc', $this->accidentDesc, true);
        Model::validateRequired('accidentAddressInfo', $this->accidentAddressInfo, true);
        Model::validateRequired('accidentAddressDetail', $this->accidentAddressDetail, true);
        Model::validateRequired('accidentTime', $this->accidentTime, true);
        Model::validateRequired('reporterTel', $this->reporterTel, true);
        Model::validateRequired('reporterName', $this->reporterName, true);
        Model::validateRequired('reporterCardNo', $this->reporterCardNo, true);
        Model::validateRequired('reporterCardType', $this->reporterCardType, true);
        Model::validateRequired('reporterRelationToAccident', $this->reporterRelationToAccident, true);
        Model::validateRequired('eventAddressInfo', $this->eventAddressInfo, true);
        Model::validateRequired('eventAddressDetail', $this->eventAddressDetail, true);
        Model::validateRequired('confirmHospital', $this->confirmHospital, true);
        Model::validateRequired('confirmHospitalAddressInfo', $this->confirmHospitalAddressInfo, true);
        Model::validateRequired('confirmIllnessName', $this->confirmIllnessName, true);
        Model::validateRequired('productType', $this->productType, true);
        Model::validateRequired('fileList', $this->fileList, true);
        Model::validateRequired('entrustGuaranteeProductList', $this->entrustGuaranteeProductList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->reportNo) {
            $res['report_no'] = $this->reportNo;
        }
        if (null !== $this->outCaseNo) {
            $res['out_case_no'] = $this->outCaseNo;
        }
        if (null !== $this->policyNo) {
            $res['policy_no'] = $this->policyNo;
        }
        if (null !== $this->entrustInsuranceCompanyId) {
            $res['entrust_insurance_company_id'] = $this->entrustInsuranceCompanyId;
        }
        if (null !== $this->investEndTime) {
            $res['invest_end_time'] = $this->investEndTime;
        }
        if (null !== $this->entrustName) {
            $res['entrust_name'] = $this->entrustName;
        }
        if (null !== $this->entrustTel) {
            $res['entrust_tel'] = $this->entrustTel;
        }
        if (null !== $this->entrustTime) {
            $res['entrust_time'] = $this->entrustTime;
        }
        if (null !== $this->accidentTel) {
            $res['accident_tel'] = $this->accidentTel;
        }
        if (null !== $this->accidentName) {
            $res['accident_name'] = $this->accidentName;
        }
        if (null !== $this->accidentCardNo) {
            $res['accident_card_no'] = $this->accidentCardNo;
        }
        if (null !== $this->accidentCardType) {
            $res['accident_card_type'] = $this->accidentCardType;
        }
        if (null !== $this->accidentDesc) {
            $res['accident_desc'] = $this->accidentDesc;
        }
        if (null !== $this->accidentAddressInfo) {
            $res['accident_address_info'] = $this->accidentAddressInfo;
        }
        if (null !== $this->accidentAddressDetail) {
            $res['accident_address_detail'] = $this->accidentAddressDetail;
        }
        if (null !== $this->accidentTime) {
            $res['accident_time'] = $this->accidentTime;
        }
        if (null !== $this->reporterTel) {
            $res['reporter_tel'] = $this->reporterTel;
        }
        if (null !== $this->reporterName) {
            $res['reporter_name'] = $this->reporterName;
        }
        if (null !== $this->reporterCardNo) {
            $res['reporter_card_no'] = $this->reporterCardNo;
        }
        if (null !== $this->reporterCardType) {
            $res['reporter_card_type'] = $this->reporterCardType;
        }
        if (null !== $this->reporterRelationToAccident) {
            $res['reporter_relation_to_accident'] = $this->reporterRelationToAccident;
        }
        if (null !== $this->reportTime) {
            $res['report_time'] = $this->reportTime;
        }
        if (null !== $this->eventAddressInfo) {
            $res['event_address_info'] = $this->eventAddressInfo;
        }
        if (null !== $this->eventAddressDetail) {
            $res['event_address_detail'] = $this->eventAddressDetail;
        }
        if (null !== $this->confirmHospital) {
            $res['confirm_hospital'] = $this->confirmHospital;
        }
        if (null !== $this->confirmHospitalAddressInfo) {
            $res['confirm_hospital_address_info'] = $this->confirmHospitalAddressInfo;
        }
        if (null !== $this->confirmIllnessName) {
            $res['confirm_illness_name'] = $this->confirmIllnessName;
        }
        if (null !== $this->productType) {
            $res['product_type'] = $this->productType;
        }
        if (null !== $this->fileList) {
            $res['file_list'] = [];
            if (null !== $this->fileList && \is_array($this->fileList)) {
                $n = 0;
                foreach ($this->fileList as $item) {
                    $res['file_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->entrustGuaranteeProductList) {
            $res['entrust_guarantee_product_list'] = [];
            if (null !== $this->entrustGuaranteeProductList && \is_array($this->entrustGuaranteeProductList)) {
                $n = 0;
                foreach ($this->entrustGuaranteeProductList as $item) {
                    $res['entrust_guarantee_product_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitInvestigateCaseRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['report_no'])) {
            $model->reportNo = $map['report_no'];
        }
        if (isset($map['out_case_no'])) {
            $model->outCaseNo = $map['out_case_no'];
        }
        if (isset($map['policy_no'])) {
            $model->policyNo = $map['policy_no'];
        }
        if (isset($map['entrust_insurance_company_id'])) {
            $model->entrustInsuranceCompanyId = $map['entrust_insurance_company_id'];
        }
        if (isset($map['invest_end_time'])) {
            $model->investEndTime = $map['invest_end_time'];
        }
        if (isset($map['entrust_name'])) {
            $model->entrustName = $map['entrust_name'];
        }
        if (isset($map['entrust_tel'])) {
            $model->entrustTel = $map['entrust_tel'];
        }
        if (isset($map['entrust_time'])) {
            $model->entrustTime = $map['entrust_time'];
        }
        if (isset($map['accident_tel'])) {
            $model->accidentTel = $map['accident_tel'];
        }
        if (isset($map['accident_name'])) {
            $model->accidentName = $map['accident_name'];
        }
        if (isset($map['accident_card_no'])) {
            $model->accidentCardNo = $map['accident_card_no'];
        }
        if (isset($map['accident_card_type'])) {
            $model->accidentCardType = $map['accident_card_type'];
        }
        if (isset($map['accident_desc'])) {
            $model->accidentDesc = $map['accident_desc'];
        }
        if (isset($map['accident_address_info'])) {
            $model->accidentAddressInfo = $map['accident_address_info'];
        }
        if (isset($map['accident_address_detail'])) {
            $model->accidentAddressDetail = $map['accident_address_detail'];
        }
        if (isset($map['accident_time'])) {
            $model->accidentTime = $map['accident_time'];
        }
        if (isset($map['reporter_tel'])) {
            $model->reporterTel = $map['reporter_tel'];
        }
        if (isset($map['reporter_name'])) {
            $model->reporterName = $map['reporter_name'];
        }
        if (isset($map['reporter_card_no'])) {
            $model->reporterCardNo = $map['reporter_card_no'];
        }
        if (isset($map['reporter_card_type'])) {
            $model->reporterCardType = $map['reporter_card_type'];
        }
        if (isset($map['reporter_relation_to_accident'])) {
            $model->reporterRelationToAccident = $map['reporter_relation_to_accident'];
        }
        if (isset($map['report_time'])) {
            $model->reportTime = $map['report_time'];
        }
        if (isset($map['event_address_info'])) {
            $model->eventAddressInfo = $map['event_address_info'];
        }
        if (isset($map['event_address_detail'])) {
            $model->eventAddressDetail = $map['event_address_detail'];
        }
        if (isset($map['confirm_hospital'])) {
            $model->confirmHospital = $map['confirm_hospital'];
        }
        if (isset($map['confirm_hospital_address_info'])) {
            $model->confirmHospitalAddressInfo = $map['confirm_hospital_address_info'];
        }
        if (isset($map['confirm_illness_name'])) {
            $model->confirmIllnessName = $map['confirm_illness_name'];
        }
        if (isset($map['product_type'])) {
            $model->productType = $map['product_type'];
        }
        if (isset($map['file_list'])) {
            if (!empty($map['file_list'])) {
                $model->fileList = [];
                $n               = 0;
                foreach ($map['file_list'] as $item) {
                    $model->fileList[$n++] = null !== $item ? FileNode::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['entrust_guarantee_product_list'])) {
            if (!empty($map['entrust_guarantee_product_list'])) {
                $model->entrustGuaranteeProductList = [];
                $n                                  = 0;
                foreach ($map['entrust_guarantee_product_list'] as $item) {
                    $model->entrustGuaranteeProductList[$n++] = null !== $item ? EntrustGuaranteeProduct::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
