<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class FinanceReportDetail extends Model
{
    // 文件
    /**
     * @example
     *
     * @var EnterpriseDocumentFile
     */
    public $file;

    // 报告编号
    /**
     * @example xxx
     *
     * @var string
     */
    public $reportNo;

    // 报告名称
    /**
     * @example xxx
     *
     * @var string
     */
    public $reportName;

    // 是否盖章
    /**
     * @example true, false
     *
     * @var bool
     */
    public $hasSealed;

    // 报告时间
    /**
     * @example 2025-01-20
     *
     * @var string
     */
    public $reportTime;

    // 报告提交人
    /**
     * @example 张三
     *
     * @var string
     */
    public $reportSubmitter;

    // 报告生成方式
    /**
     * @example MANUAL , INTERFACE
     *
     * @var string
     */
    public $generateType;

    // 对比年，报告年
    /**
     * @example 2025
     *
     * @var string
     */
    public $compareYear;

    // 基准年
    /**
     * @example 2024
     *
     * @var string
     */
    public $baseYear;

    // 企业名称
    /**
     * @example xxx
     *
     * @var string
     */
    public $companyName;

    // 区域名称
    /**
     * @example 北京
     *
     * @var string
     */
    public $areaName;

    // 行业名称
    /**
     * @example 能源
     *
     * @var string
     */
    public $industryName;

    // 社会统一信用代码
    /**
     * @example 28382372323232434
     *
     * @var string
     */
    public $companyId;
    protected $_name = [
        'file'            => 'file',
        'reportNo'        => 'report_no',
        'reportName'      => 'report_name',
        'hasSealed'       => 'has_sealed',
        'reportTime'      => 'report_time',
        'reportSubmitter' => 'report_submitter',
        'generateType'    => 'generate_type',
        'compareYear'     => 'compare_year',
        'baseYear'        => 'base_year',
        'companyName'     => 'company_name',
        'areaName'        => 'area_name',
        'industryName'    => 'industry_name',
        'companyId'       => 'company_id',
    ];

    public function validate()
    {
        Model::validateRequired('file', $this->file, true);
        Model::validateRequired('reportNo', $this->reportNo, true);
        Model::validateRequired('reportName', $this->reportName, true);
        Model::validateRequired('hasSealed', $this->hasSealed, true);
        Model::validateRequired('reportTime', $this->reportTime, true);
        Model::validateRequired('reportSubmitter', $this->reportSubmitter, true);
        Model::validateRequired('generateType', $this->generateType, true);
        Model::validateRequired('compareYear', $this->compareYear, true);
        Model::validateRequired('baseYear', $this->baseYear, true);
        Model::validateRequired('companyName', $this->companyName, true);
        Model::validateRequired('areaName', $this->areaName, true);
        Model::validateRequired('industryName', $this->industryName, true);
        Model::validateRequired('companyId', $this->companyId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->file) {
            $res['file'] = null !== $this->file ? $this->file->toMap() : null;
        }
        if (null !== $this->reportNo) {
            $res['report_no'] = $this->reportNo;
        }
        if (null !== $this->reportName) {
            $res['report_name'] = $this->reportName;
        }
        if (null !== $this->hasSealed) {
            $res['has_sealed'] = $this->hasSealed;
        }
        if (null !== $this->reportTime) {
            $res['report_time'] = $this->reportTime;
        }
        if (null !== $this->reportSubmitter) {
            $res['report_submitter'] = $this->reportSubmitter;
        }
        if (null !== $this->generateType) {
            $res['generate_type'] = $this->generateType;
        }
        if (null !== $this->compareYear) {
            $res['compare_year'] = $this->compareYear;
        }
        if (null !== $this->baseYear) {
            $res['base_year'] = $this->baseYear;
        }
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
        }
        if (null !== $this->areaName) {
            $res['area_name'] = $this->areaName;
        }
        if (null !== $this->industryName) {
            $res['industry_name'] = $this->industryName;
        }
        if (null !== $this->companyId) {
            $res['company_id'] = $this->companyId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FinanceReportDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['file'])) {
            $model->file = EnterpriseDocumentFile::fromMap($map['file']);
        }
        if (isset($map['report_no'])) {
            $model->reportNo = $map['report_no'];
        }
        if (isset($map['report_name'])) {
            $model->reportName = $map['report_name'];
        }
        if (isset($map['has_sealed'])) {
            $model->hasSealed = $map['has_sealed'];
        }
        if (isset($map['report_time'])) {
            $model->reportTime = $map['report_time'];
        }
        if (isset($map['report_submitter'])) {
            $model->reportSubmitter = $map['report_submitter'];
        }
        if (isset($map['generate_type'])) {
            $model->generateType = $map['generate_type'];
        }
        if (isset($map['compare_year'])) {
            $model->compareYear = $map['compare_year'];
        }
        if (isset($map['base_year'])) {
            $model->baseYear = $map['base_year'];
        }
        if (isset($map['company_name'])) {
            $model->companyName = $map['company_name'];
        }
        if (isset($map['area_name'])) {
            $model->areaName = $map['area_name'];
        }
        if (isset($map['industry_name'])) {
            $model->industryName = $map['industry_name'];
        }
        if (isset($map['company_id'])) {
            $model->companyId = $map['company_id'];
        }

        return $model;
    }
}
