<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class ReportInfo extends Model
{
    // 项目报告ID
    /**
     * @example 3ddd08df30f143afad0aa49d96dc81c8
     *
     * @var string
     */
    public $reportId;

    // 项目报告名
    /**
     * @example 香港债券市场代币化
     *
     * @var string
     */
    public $reportName;

    // 报告文件ID
    /**
     * @example 1cce12eea6c34ed79944f5d11a846a3e
     *
     * @var string
     */
    public $fileId;

    // 项目报告创建时间戳
    /**
     * @example 1726292715000
     *
     * @var int
     */
    public $gmtCreated;
    protected $_name = [
        'reportId'   => 'report_id',
        'reportName' => 'report_name',
        'fileId'     => 'file_id',
        'gmtCreated' => 'gmt_created',
    ];

    public function validate()
    {
        Model::validateRequired('reportId', $this->reportId, true);
        Model::validateRequired('reportName', $this->reportName, true);
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('gmtCreated', $this->gmtCreated, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reportId) {
            $res['report_id'] = $this->reportId;
        }
        if (null !== $this->reportName) {
            $res['report_name'] = $this->reportName;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->gmtCreated) {
            $res['gmt_created'] = $this->gmtCreated;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReportInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['report_id'])) {
            $model->reportId = $map['report_id'];
        }
        if (isset($map['report_name'])) {
            $model->reportName = $map['report_name'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['gmt_created'])) {
            $model->gmtCreated = $map['gmt_created'];
        }

        return $model;
    }
}
