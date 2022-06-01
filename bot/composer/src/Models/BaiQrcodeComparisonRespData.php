<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class BaiQrcodeComparisonRespData extends Model
{
    // 识别结果（REAL：真   FAKE：假   UNABLE_IDENTIFY：无法识别）
    /**
     * @example REAL
     *
     * @var string
     */
    public $identificationResult;

    // 辅助识别结果码
    /**
     * @example 200
     *
     * @var string
     */
    public $identificationCode;

    // 辅助识别信息
    /**
     * @example 识别成功
     *
     * @var string
     */
    public $identificationMessage;

    // 无法识别时提示的解决方案
    /**
     * @example 调整焦距
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
     * @return BaiQrcodeComparisonRespData
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
