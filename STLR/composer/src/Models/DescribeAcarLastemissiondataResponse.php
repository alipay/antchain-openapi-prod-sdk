<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class DescribeAcarLastemissiondataResponse extends Model
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

    // 主体活动编码
    /**
     * @var string
     */
    public $enterpriseNo;

    // 盘查范围编码
    /**
     * @var string
     */
    public $inventoryScopeNo;

    // 盘查范围名称
    /**
     * @var string
     */
    public $inventoryScopeName;

    // 排放类型编码
    /**
     * @var string
     */
    public $emissionCategoryNo;

    // 排放类型名称
    /**
     * @var string
     */
    public $emissionCategoryName;

    // 排放源编码
    /**
     * @var string
     */
    public $emissionSourceNo;

    // 排放源名称
    /**
     * @var string
     */
    public $emissionSourceName;

    // 活动场馆编码
    /**
     * @var string
     */
    public $enterpriseWorkspaceNo;

    // 活动场馆名称
    /**
     * @var string
     */
    public $enterpriseWorkspaceName;

    // 排放量计算要素编码
    /**
     * @var string
     */
    public $emissionsAnalysisFactorNo;

    // 排放量计算要素值
    /**
     * @var string
     */
    public $emissionsAnalysisFactorValue;

    // 发生日期
    /**
     * @var string
     */
    public $occurrenceDate;

    // 排放数据录入明细编码
    /**
     * @var string
     */
    public $emissionDataEntryItemNo;

    // 排放源用量
    /**
     * @var int
     */
    public $emissionDourceDosage;

    // 用量单位：
    // WNm3("万Nm3","天然气消耗用量单位"),
    // GJ("GJ","燃烧产生的热量单位或外购热力单位"),
    // t("t","制冷剂、灭火器填充剂、化石燃料消耗的质量单位，或者化粪池BOD产生量单位"),
    // MWh("MWh","外购电力或数据中心用电量单位"),
    // km("km","公里，通勤用车或员工差旅旅程单位"),
    // tCO2e("tCO2e","吨二氧化碳当量，排放气体产生的二氧化碳当量"),
    // PCT("%","百分比，如碳氧化率，或者气体逸散率");
    /**
     * @var string
     */
    public $dosageUnit;

    // 数据录入人账号
    /**
     * @var string
     */
    public $submitterNo;

    // 提交人姓名
    /**
     * @var string
     */
    public $submitterName;

    // 数据录入时间
    /**
     * @var string
     */
    public $submissionTime;

    // 盘查排放类型的数据录入方式：
    // ManualEntry("手动录入方式"),
    // FileUpload("文件导入方式"),
    // AutoGeneration("自动产生");
    /**
     * @var string
     */
    public $dataEntryType;
    protected $_name = [
        'reqMsgId'                     => 'req_msg_id',
        'resultCode'                   => 'result_code',
        'resultMsg'                    => 'result_msg',
        'enterpriseNo'                 => 'enterprise_no',
        'inventoryScopeNo'             => 'inventory_scope_no',
        'inventoryScopeName'           => 'inventory_scope_name',
        'emissionCategoryNo'           => 'emission_category_no',
        'emissionCategoryName'         => 'emission_category_name',
        'emissionSourceNo'             => 'emission_source_no',
        'emissionSourceName'           => 'emission_source_name',
        'enterpriseWorkspaceNo'        => 'enterprise_workspace_no',
        'enterpriseWorkspaceName'      => 'enterprise_workspace_name',
        'emissionsAnalysisFactorNo'    => 'emissions_analysis_factor_no',
        'emissionsAnalysisFactorValue' => 'emissions_analysis_factor_value',
        'occurrenceDate'               => 'occurrence_date',
        'emissionDataEntryItemNo'      => 'emission_data_entry_item_no',
        'emissionDourceDosage'         => 'emission_dource_dosage',
        'dosageUnit'                   => 'dosage_unit',
        'submitterNo'                  => 'submitter_no',
        'submitterName'                => 'submitter_name',
        'submissionTime'               => 'submission_time',
        'dataEntryType'                => 'data_entry_type',
    ];

    public function validate()
    {
        Model::validatePattern('submissionTime', $this->submissionTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->enterpriseNo) {
            $res['enterprise_no'] = $this->enterpriseNo;
        }
        if (null !== $this->inventoryScopeNo) {
            $res['inventory_scope_no'] = $this->inventoryScopeNo;
        }
        if (null !== $this->inventoryScopeName) {
            $res['inventory_scope_name'] = $this->inventoryScopeName;
        }
        if (null !== $this->emissionCategoryNo) {
            $res['emission_category_no'] = $this->emissionCategoryNo;
        }
        if (null !== $this->emissionCategoryName) {
            $res['emission_category_name'] = $this->emissionCategoryName;
        }
        if (null !== $this->emissionSourceNo) {
            $res['emission_source_no'] = $this->emissionSourceNo;
        }
        if (null !== $this->emissionSourceName) {
            $res['emission_source_name'] = $this->emissionSourceName;
        }
        if (null !== $this->enterpriseWorkspaceNo) {
            $res['enterprise_workspace_no'] = $this->enterpriseWorkspaceNo;
        }
        if (null !== $this->enterpriseWorkspaceName) {
            $res['enterprise_workspace_name'] = $this->enterpriseWorkspaceName;
        }
        if (null !== $this->emissionsAnalysisFactorNo) {
            $res['emissions_analysis_factor_no'] = $this->emissionsAnalysisFactorNo;
        }
        if (null !== $this->emissionsAnalysisFactorValue) {
            $res['emissions_analysis_factor_value'] = $this->emissionsAnalysisFactorValue;
        }
        if (null !== $this->occurrenceDate) {
            $res['occurrence_date'] = $this->occurrenceDate;
        }
        if (null !== $this->emissionDataEntryItemNo) {
            $res['emission_data_entry_item_no'] = $this->emissionDataEntryItemNo;
        }
        if (null !== $this->emissionDourceDosage) {
            $res['emission_dource_dosage'] = $this->emissionDourceDosage;
        }
        if (null !== $this->dosageUnit) {
            $res['dosage_unit'] = $this->dosageUnit;
        }
        if (null !== $this->submitterNo) {
            $res['submitter_no'] = $this->submitterNo;
        }
        if (null !== $this->submitterName) {
            $res['submitter_name'] = $this->submitterName;
        }
        if (null !== $this->submissionTime) {
            $res['submission_time'] = $this->submissionTime;
        }
        if (null !== $this->dataEntryType) {
            $res['data_entry_type'] = $this->dataEntryType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DescribeAcarLastemissiondataResponse
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
        if (isset($map['enterprise_no'])) {
            $model->enterpriseNo = $map['enterprise_no'];
        }
        if (isset($map['inventory_scope_no'])) {
            $model->inventoryScopeNo = $map['inventory_scope_no'];
        }
        if (isset($map['inventory_scope_name'])) {
            $model->inventoryScopeName = $map['inventory_scope_name'];
        }
        if (isset($map['emission_category_no'])) {
            $model->emissionCategoryNo = $map['emission_category_no'];
        }
        if (isset($map['emission_category_name'])) {
            $model->emissionCategoryName = $map['emission_category_name'];
        }
        if (isset($map['emission_source_no'])) {
            $model->emissionSourceNo = $map['emission_source_no'];
        }
        if (isset($map['emission_source_name'])) {
            $model->emissionSourceName = $map['emission_source_name'];
        }
        if (isset($map['enterprise_workspace_no'])) {
            $model->enterpriseWorkspaceNo = $map['enterprise_workspace_no'];
        }
        if (isset($map['enterprise_workspace_name'])) {
            $model->enterpriseWorkspaceName = $map['enterprise_workspace_name'];
        }
        if (isset($map['emissions_analysis_factor_no'])) {
            $model->emissionsAnalysisFactorNo = $map['emissions_analysis_factor_no'];
        }
        if (isset($map['emissions_analysis_factor_value'])) {
            $model->emissionsAnalysisFactorValue = $map['emissions_analysis_factor_value'];
        }
        if (isset($map['occurrence_date'])) {
            $model->occurrenceDate = $map['occurrence_date'];
        }
        if (isset($map['emission_data_entry_item_no'])) {
            $model->emissionDataEntryItemNo = $map['emission_data_entry_item_no'];
        }
        if (isset($map['emission_dource_dosage'])) {
            $model->emissionDourceDosage = $map['emission_dource_dosage'];
        }
        if (isset($map['dosage_unit'])) {
            $model->dosageUnit = $map['dosage_unit'];
        }
        if (isset($map['submitter_no'])) {
            $model->submitterNo = $map['submitter_no'];
        }
        if (isset($map['submitter_name'])) {
            $model->submitterName = $map['submitter_name'];
        }
        if (isset($map['submission_time'])) {
            $model->submissionTime = $map['submission_time'];
        }
        if (isset($map['data_entry_type'])) {
            $model->dataEntryType = $map['data_entry_type'];
        }

        return $model;
    }
}
