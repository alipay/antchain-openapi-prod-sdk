<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTEGRATION_MACHINE\Models;

use AlibabaCloud\Tea\Model;

class AntigenInfo extends Model
{
    // 抗原检测状态
    /**
     * @example 123
     *
     * @var string
     */
    public $antigenResult;

    // 抗原检测时间戳
    /**
     * @example 1654570807000
     *
     * @var int
     */
    public $antigenTimestamp;
    protected $_name = [
        'antigenResult'    => 'antigen_result',
        'antigenTimestamp' => 'antigen_timestamp',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->antigenResult) {
            $res['antigen_result'] = $this->antigenResult;
        }
        if (null !== $this->antigenTimestamp) {
            $res['antigen_timestamp'] = $this->antigenTimestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AntigenInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['antigen_result'])) {
            $model->antigenResult = $map['antigen_result'];
        }
        if (isset($map['antigen_timestamp'])) {
            $model->antigenTimestamp = $map['antigen_timestamp'];
        }

        return $model;
    }
}
