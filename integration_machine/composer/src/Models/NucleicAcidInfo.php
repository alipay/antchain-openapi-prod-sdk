<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTEGRATION_MACHINE\Models;

use AlibabaCloud\Tea\Model;

class NucleicAcidInfo extends Model
{
    // 检测类型
    /**
     * @example 1
     *
     * @var string
     */
    public $reportType;

    // 检测结果
    /**
     * @example 24H阳性
     *
     * @var string
     */
    public $reportResult;

    // 检测机构
    /**
     * @example 123
     *
     * @var string
     */
    public $reportOrganization;

    // 检测时间戳(单位: ms)
    /**
     * @example 1654570807000
     *
     * @var int
     */
    public $reportTimestamp;
    protected $_name = [
        'reportType'         => 'report_type',
        'reportResult'       => 'report_result',
        'reportOrganization' => 'report_organization',
        'reportTimestamp'    => 'report_timestamp',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reportType) {
            $res['report_type'] = $this->reportType;
        }
        if (null !== $this->reportResult) {
            $res['report_result'] = $this->reportResult;
        }
        if (null !== $this->reportOrganization) {
            $res['report_organization'] = $this->reportOrganization;
        }
        if (null !== $this->reportTimestamp) {
            $res['report_timestamp'] = $this->reportTimestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NucleicAcidInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['report_type'])) {
            $model->reportType = $map['report_type'];
        }
        if (isset($map['report_result'])) {
            $model->reportResult = $map['report_result'];
        }
        if (isset($map['report_organization'])) {
            $model->reportOrganization = $map['report_organization'];
        }
        if (isset($map['report_timestamp'])) {
            $model->reportTimestamp = $map['report_timestamp'];
        }

        return $model;
    }
}
