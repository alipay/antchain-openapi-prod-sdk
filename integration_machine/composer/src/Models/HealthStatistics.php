<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTEGRATION_MACHINE\Models;

use AlibabaCloud\Tea\Model;

class HealthStatistics extends Model
{
    // 统计日期
    /**
     * @example 2022-09-01
     *
     * @var string
     */
    public $statisticsDate;

    // 通行总数
    /**
     * @example 100
     *
     * @var int
     */
    public $totalCount;

    // 刷证数
    /**
     * @example 100
     *
     * @var int
     */
    public $certCount;

    // 刷脸数
    /**
     * @example 100
     *
     * @var int
     */
    public $faceCount;

    // 二维码反扫数
    /**
     * @example 100
     *
     * @var int
     */
    public $inverseCount;

    // 正常通行数
    /**
     * @example 100
     *
     * @var int
     */
    public $passCount;

    // 禁止通行数
    /**
     * @example 100
     *
     * @var int
     */
    public $stopCount;
    protected $_name = [
        'statisticsDate' => 'statistics_date',
        'totalCount'     => 'total_count',
        'certCount'      => 'cert_count',
        'faceCount'      => 'face_count',
        'inverseCount'   => 'inverse_count',
        'passCount'      => 'pass_count',
        'stopCount'      => 'stop_count',
    ];

    public function validate()
    {
        Model::validateRequired('statisticsDate', $this->statisticsDate, true);
        Model::validateRequired('totalCount', $this->totalCount, true);
        Model::validateRequired('certCount', $this->certCount, true);
        Model::validateRequired('faceCount', $this->faceCount, true);
        Model::validateRequired('inverseCount', $this->inverseCount, true);
        Model::validateRequired('passCount', $this->passCount, true);
        Model::validateRequired('stopCount', $this->stopCount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->statisticsDate) {
            $res['statistics_date'] = $this->statisticsDate;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->certCount) {
            $res['cert_count'] = $this->certCount;
        }
        if (null !== $this->faceCount) {
            $res['face_count'] = $this->faceCount;
        }
        if (null !== $this->inverseCount) {
            $res['inverse_count'] = $this->inverseCount;
        }
        if (null !== $this->passCount) {
            $res['pass_count'] = $this->passCount;
        }
        if (null !== $this->stopCount) {
            $res['stop_count'] = $this->stopCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HealthStatistics
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['statistics_date'])) {
            $model->statisticsDate = $map['statistics_date'];
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['cert_count'])) {
            $model->certCount = $map['cert_count'];
        }
        if (isset($map['face_count'])) {
            $model->faceCount = $map['face_count'];
        }
        if (isset($map['inverse_count'])) {
            $model->inverseCount = $map['inverse_count'];
        }
        if (isset($map['pass_count'])) {
            $model->passCount = $map['pass_count'];
        }
        if (isset($map['stop_count'])) {
            $model->stopCount = $map['stop_count'];
        }

        return $model;
    }
}
