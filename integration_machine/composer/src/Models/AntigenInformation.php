<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTEGRATION_MACHINE\Models;

use AlibabaCloud\Tea\Model;

class AntigenInformation extends Model
{
    // 抗原结果
    /**
     * @example 阴性
     *
     * @var string
     */
    public $antigenResult;

    // 抗原时间
    /**
     * @example 2022-07-07 12:12:12
     *
     * @var string
     */
    public $antigenTime;
    protected $_name = [
        'antigenResult' => 'antigen_result',
        'antigenTime'   => 'antigen_time',
    ];

    public function validate()
    {
        Model::validateRequired('antigenResult', $this->antigenResult, true);
        Model::validateRequired('antigenTime', $this->antigenTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->antigenResult) {
            $res['antigen_result'] = $this->antigenResult;
        }
        if (null !== $this->antigenTime) {
            $res['antigen_time'] = $this->antigenTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AntigenInformation
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['antigen_result'])) {
            $model->antigenResult = $map['antigen_result'];
        }
        if (isset($map['antigen_time'])) {
            $model->antigenTime = $map['antigen_time'];
        }

        return $model;
    }
}
