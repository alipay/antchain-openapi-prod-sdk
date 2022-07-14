<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTEGRATION_MACHINE\Models;

use AlibabaCloud\Tea\Model;

class VaccinationInformation extends Model
{
    // 疫苗接种状态(0查询失败 1未接种 2已接种一针 3完成接种)
    /**
     * @example 1
     *
     * @var string
     */
    public $vaccinationStatus;

    // 疫苗接种时间
    /**
     * @example 2022-07-07 12:12:12
     *
     * @var string
     */
    public $vaccinationTime;
    protected $_name = [
        'vaccinationStatus' => 'vaccination_status',
        'vaccinationTime'   => 'vaccination_time',
    ];

    public function validate()
    {
        Model::validateRequired('vaccinationStatus', $this->vaccinationStatus, true);
        Model::validateRequired('vaccinationTime', $this->vaccinationTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->vaccinationStatus) {
            $res['vaccination_status'] = $this->vaccinationStatus;
        }
        if (null !== $this->vaccinationTime) {
            $res['vaccination_time'] = $this->vaccinationTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VaccinationInformation
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['vaccination_status'])) {
            $model->vaccinationStatus = $map['vaccination_status'];
        }
        if (isset($map['vaccination_time'])) {
            $model->vaccinationTime = $map['vaccination_time'];
        }

        return $model;
    }
}
