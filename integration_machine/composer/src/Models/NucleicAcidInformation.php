<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTEGRATION_MACHINE\Models;

use AlibabaCloud\Tea\Model;

class NucleicAcidInformation extends Model
{
    // 核酸结果
    /**
     * @example 阴性
     *
     * @var string
     */
    public $nucleicAcidResult;

    // 核酸时间
    /**
     * @example 2022-07-07 12:12:12
     *
     * @var string
     */
    public $nucleicAcidTime;
    protected $_name = [
        'nucleicAcidResult' => 'nucleic_acid_result',
        'nucleicAcidTime'   => 'nucleic_acid_time',
    ];

    public function validate()
    {
        Model::validateRequired('nucleicAcidResult', $this->nucleicAcidResult, true);
        Model::validateRequired('nucleicAcidTime', $this->nucleicAcidTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->nucleicAcidResult) {
            $res['nucleic_acid_result'] = $this->nucleicAcidResult;
        }
        if (null !== $this->nucleicAcidTime) {
            $res['nucleic_acid_time'] = $this->nucleicAcidTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NucleicAcidInformation
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['nucleic_acid_result'])) {
            $model->nucleicAcidResult = $map['nucleic_acid_result'];
        }
        if (isset($map['nucleic_acid_time'])) {
            $model->nucleicAcidTime = $map['nucleic_acid_time'];
        }

        return $model;
    }
}
