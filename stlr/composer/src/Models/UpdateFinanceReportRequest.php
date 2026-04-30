<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class UpdateFinanceReportRequest extends Model
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

    // 银行碳账号
    /**
     * @var string
     */
    public $enterpriseNo;

    // 报告盖章人
    /**
     * @var string
     */
    public $reportSinger;

    // 可以直接公网可以下载的oss地址
    /**
     * @var string
     */
    public $reportOssUrl;

    // 社会统一信用参数
    /**
     * @var string
     */
    public $companyId;

    // 是否盖章
    /**
     * @var bool
     */
    public $isSeal;

    // 报告年份
    /**
     * @var string
     */
    public $reportYear;

    // 基准年份
    /**
     * @var string
     */
    public $baseYear;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'enterpriseNo'      => 'enterprise_no',
        'reportSinger'      => 'report_singer',
        'reportOssUrl'      => 'report_oss_url',
        'companyId'         => 'company_id',
        'isSeal'            => 'is_seal',
        'reportYear'        => 'report_year',
        'baseYear'          => 'base_year',
    ];

    public function validate()
    {
        Model::validateRequired('enterpriseNo', $this->enterpriseNo, true);
        Model::validateRequired('reportSinger', $this->reportSinger, true);
        Model::validateRequired('reportOssUrl', $this->reportOssUrl, true);
        Model::validateRequired('companyId', $this->companyId, true);
        Model::validateRequired('isSeal', $this->isSeal, true);
        Model::validateRequired('reportYear', $this->reportYear, true);
        Model::validateRequired('baseYear', $this->baseYear, true);
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
        if (null !== $this->enterpriseNo) {
            $res['enterprise_no'] = $this->enterpriseNo;
        }
        if (null !== $this->reportSinger) {
            $res['report_singer'] = $this->reportSinger;
        }
        if (null !== $this->reportOssUrl) {
            $res['report_oss_url'] = $this->reportOssUrl;
        }
        if (null !== $this->companyId) {
            $res['company_id'] = $this->companyId;
        }
        if (null !== $this->isSeal) {
            $res['is_seal'] = $this->isSeal;
        }
        if (null !== $this->reportYear) {
            $res['report_year'] = $this->reportYear;
        }
        if (null !== $this->baseYear) {
            $res['base_year'] = $this->baseYear;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateFinanceReportRequest
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
        if (isset($map['enterprise_no'])) {
            $model->enterpriseNo = $map['enterprise_no'];
        }
        if (isset($map['report_singer'])) {
            $model->reportSinger = $map['report_singer'];
        }
        if (isset($map['report_oss_url'])) {
            $model->reportOssUrl = $map['report_oss_url'];
        }
        if (isset($map['company_id'])) {
            $model->companyId = $map['company_id'];
        }
        if (isset($map['is_seal'])) {
            $model->isSeal = $map['is_seal'];
        }
        if (isset($map['report_year'])) {
            $model->reportYear = $map['report_year'];
        }
        if (isset($map['base_year'])) {
            $model->baseYear = $map['base_year'];
        }

        return $model;
    }
}
