<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class LcaCarbonDatum extends Model
{
    // LCA碳排放总量
    /**
     * @example 2323.22
     *
     * @var string
     */
    public $lcaCarbonAmount;

    // 足迹报告pdf文件下载地址（30分钟内下载有效）
    /**
     * @example http://oss.com/lca/lca_report.pdf
     *
     * @var string
     */
    public $lcaReportFileUrl;

    // 足迹分析结果详情文件地址（30分钟内下载有效）
    /**
     * @example http://oss.com/lca/lca_detail.pdf
     *
     * @var string
     */
    public $lcaDetailFileUrl;

    // B2B-从摇篮到大门，B2C-从摇篮到坟墓
    /**
     * @example B2B
     *
     * @var string
     */
    public $lifeCycleBoundary;

    // 足迹开始时间，格式：yyyyMMdd
    /**
     * @example 20231223
     *
     * @var string
     */
    public $lcaStartDate;

    // 足迹结束时间 格式：yyyyMMdd
    /**
     * @example 20231202
     *
     * @var string
     */
    public $lcaEndDate;

    // 分阶段碳排放量列表
    /**
     * @example
     *
     * @var LcaStageCarbonItem[]
     */
    public $lcaStageCarbonDatum;
    protected $_name = [
        'lcaCarbonAmount'     => 'lca_carbon_amount',
        'lcaReportFileUrl'    => 'lca_report_file_url',
        'lcaDetailFileUrl'    => 'lca_detail_file_url',
        'lifeCycleBoundary'   => 'life_cycle_boundary',
        'lcaStartDate'        => 'lca_start_date',
        'lcaEndDate'          => 'lca_end_date',
        'lcaStageCarbonDatum' => 'lca_stage_carbon_datum',
    ];

    public function validate()
    {
        Model::validateRequired('lcaCarbonAmount', $this->lcaCarbonAmount, true);
        Model::validateRequired('lcaReportFileUrl', $this->lcaReportFileUrl, true);
        Model::validateRequired('lcaDetailFileUrl', $this->lcaDetailFileUrl, true);
        Model::validateRequired('lifeCycleBoundary', $this->lifeCycleBoundary, true);
        Model::validateRequired('lcaStartDate', $this->lcaStartDate, true);
        Model::validateRequired('lcaEndDate', $this->lcaEndDate, true);
        Model::validateRequired('lcaStageCarbonDatum', $this->lcaStageCarbonDatum, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->lcaCarbonAmount) {
            $res['lca_carbon_amount'] = $this->lcaCarbonAmount;
        }
        if (null !== $this->lcaReportFileUrl) {
            $res['lca_report_file_url'] = $this->lcaReportFileUrl;
        }
        if (null !== $this->lcaDetailFileUrl) {
            $res['lca_detail_file_url'] = $this->lcaDetailFileUrl;
        }
        if (null !== $this->lifeCycleBoundary) {
            $res['life_cycle_boundary'] = $this->lifeCycleBoundary;
        }
        if (null !== $this->lcaStartDate) {
            $res['lca_start_date'] = $this->lcaStartDate;
        }
        if (null !== $this->lcaEndDate) {
            $res['lca_end_date'] = $this->lcaEndDate;
        }
        if (null !== $this->lcaStageCarbonDatum) {
            $res['lca_stage_carbon_datum'] = [];
            if (null !== $this->lcaStageCarbonDatum && \is_array($this->lcaStageCarbonDatum)) {
                $n = 0;
                foreach ($this->lcaStageCarbonDatum as $item) {
                    $res['lca_stage_carbon_datum'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LcaCarbonDatum
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['lca_carbon_amount'])) {
            $model->lcaCarbonAmount = $map['lca_carbon_amount'];
        }
        if (isset($map['lca_report_file_url'])) {
            $model->lcaReportFileUrl = $map['lca_report_file_url'];
        }
        if (isset($map['lca_detail_file_url'])) {
            $model->lcaDetailFileUrl = $map['lca_detail_file_url'];
        }
        if (isset($map['life_cycle_boundary'])) {
            $model->lifeCycleBoundary = $map['life_cycle_boundary'];
        }
        if (isset($map['lca_start_date'])) {
            $model->lcaStartDate = $map['lca_start_date'];
        }
        if (isset($map['lca_end_date'])) {
            $model->lcaEndDate = $map['lca_end_date'];
        }
        if (isset($map['lca_stage_carbon_datum'])) {
            if (!empty($map['lca_stage_carbon_datum'])) {
                $model->lcaStageCarbonDatum = [];
                $n                          = 0;
                foreach ($map['lca_stage_carbon_datum'] as $item) {
                    $model->lcaStageCarbonDatum[$n++] = null !== $item ? LcaStageCarbonItem::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
