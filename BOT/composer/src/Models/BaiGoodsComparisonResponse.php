<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class BaiGoodsComparisonResponse extends Model
{
    // 鉴定结果（REAL：为真   FAKE：为假   UNABLE_IDENTIFY：无法鉴定）
    /**
     * @example REAL
     *
     * @var string
     */
    public $identificationResult;

    // 鉴定补充信息
    /**
     * @example 鉴定成功
     *
     * @var string
     */
    public $identificationMessage;

    // 鉴定信息code
    /**
     * @example 200
     *
     * @var string
     */
    public $identificationCode;
    protected $_name = [
        'identificationResult'  => 'identification_result',
        'identificationMessage' => 'identification_message',
        'identificationCode'    => 'identification_code',
    ];

    public function validate()
    {
        Model::validateRequired('identificationResult', $this->identificationResult, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->identificationResult) {
            $res['identification_result'] = $this->identificationResult;
        }
        if (null !== $this->identificationMessage) {
            $res['identification_message'] = $this->identificationMessage;
        }
        if (null !== $this->identificationCode) {
            $res['identification_code'] = $this->identificationCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BaiGoodsComparisonResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['identification_result'])) {
            $model->identificationResult = $map['identification_result'];
        }
        if (isset($map['identification_message'])) {
            $model->identificationMessage = $map['identification_message'];
        }
        if (isset($map['identification_code'])) {
            $model->identificationCode = $map['identification_code'];
        }

        return $model;
    }
}
