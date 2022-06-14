<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTEGRATION_MACHINE\Models;

use AlibabaCloud\Tea\Model;

class VaccinationInfo extends Model
{
    // 疫苗接种信息：
    // 0:查询失败
    // 1:未接种
    // 2:已接种一针
    // 3:完成接种
    /**
     * @example 1
     *
     * @var string
     */
    public $vaccinationCode;

    // 疫苗接种信息
    /**
     * @example 123
     *
     * @var string
     */
    public $vaccinationDesc;

    // 疫苗接种时间戳（单位：ms）
    /**
     * @example 1654570807000
     *
     * @var int
     */
    public $vaccinationTimestamp;
    protected $_name = [
        'vaccinationCode'      => 'vaccination_code',
        'vaccinationDesc'      => 'vaccination_desc',
        'vaccinationTimestamp' => 'vaccination_timestamp',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->vaccinationCode) {
            $res['vaccination_code'] = $this->vaccinationCode;
        }
        if (null !== $this->vaccinationDesc) {
            $res['vaccination_desc'] = $this->vaccinationDesc;
        }
        if (null !== $this->vaccinationTimestamp) {
            $res['vaccination_timestamp'] = $this->vaccinationTimestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VaccinationInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['vaccination_code'])) {
            $model->vaccinationCode = $map['vaccination_code'];
        }
        if (isset($map['vaccination_desc'])) {
            $model->vaccinationDesc = $map['vaccination_desc'];
        }
        if (isset($map['vaccination_timestamp'])) {
            $model->vaccinationTimestamp = $map['vaccination_timestamp'];
        }

        return $model;
    }
}
