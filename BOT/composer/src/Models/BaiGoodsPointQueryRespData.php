<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class BaiGoodsPointQueryRespData extends Model
{
    // 识别结果
    // true：识别到鉴定点
    // false：未识别到鉴定点
    /**
     * @example true
     *
     * @var bool
     */
    public $detection;

    // 鉴定结果
    // REAL：鉴定为真
    // FAKE：鉴定为假
    // UNABLE_IDENTIFY：无法鉴定
    /**
     * @example REAL
     *
     * @var string
     */
    public $identificationResult;
    protected $_name = [
        'detection'            => 'detection',
        'identificationResult' => 'identification_result',
    ];

    public function validate()
    {
        Model::validateRequired('detection', $this->detection, true);
        Model::validateRequired('identificationResult', $this->identificationResult, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->detection) {
            $res['detection'] = $this->detection;
        }
        if (null !== $this->identificationResult) {
            $res['identification_result'] = $this->identificationResult;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BaiGoodsPointQueryRespData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['detection'])) {
            $model->detection = $map['detection'];
        }
        if (isset($map['identification_result'])) {
            $model->identificationResult = $map['identification_result'];
        }

        return $model;
    }
}
