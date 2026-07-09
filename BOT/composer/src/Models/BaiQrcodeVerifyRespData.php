<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class BaiQrcodeVerifyRespData extends Model
{
    // 鉴定结果
    // REAL：通过
    // UNABLE_IDENTIFY：无法鉴定
    /**
     * @example REAL
     *
     * @var string
     */
    public $identificationResult;

    // 辅助识别结果码
    /**
     * @example 700
     *
     * @var string
     */
    public $identificationCode;

    // 辅助识别信息
    /**
     * @example 二维码不符合标准
     *
     * @var string
     */
    public $identificationMessage;

    // 无法鉴定时的解决方案
    /**
     * @example 请重新印刷
     *
     * @var string
     */
    public $unableIdentifySolution;
    protected $_name = [
        'identificationResult'   => 'identification_result',
        'identificationCode'     => 'identification_code',
        'identificationMessage'  => 'identification_message',
        'unableIdentifySolution' => 'unable_identify_solution',
    ];

    public function validate()
    {
        Model::validateRequired('identificationResult', $this->identificationResult, true);
        Model::validateRequired('identificationCode', $this->identificationCode, true);
        Model::validateRequired('identificationMessage', $this->identificationMessage, true);
        Model::validateRequired('unableIdentifySolution', $this->unableIdentifySolution, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->identificationResult) {
            $res['identification_result'] = $this->identificationResult;
        }
        if (null !== $this->identificationCode) {
            $res['identification_code'] = $this->identificationCode;
        }
        if (null !== $this->identificationMessage) {
            $res['identification_message'] = $this->identificationMessage;
        }
        if (null !== $this->unableIdentifySolution) {
            $res['unable_identify_solution'] = $this->unableIdentifySolution;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BaiQrcodeVerifyRespData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['identification_result'])) {
            $model->identificationResult = $map['identification_result'];
        }
        if (isset($map['identification_code'])) {
            $model->identificationCode = $map['identification_code'];
        }
        if (isset($map['identification_message'])) {
            $model->identificationMessage = $map['identification_message'];
        }
        if (isset($map['unable_identify_solution'])) {
            $model->unableIdentifySolution = $map['unable_identify_solution'];
        }

        return $model;
    }
}
