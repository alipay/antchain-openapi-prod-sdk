<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class BaiQrcodeGenerateRespData extends Model
{
    // 二维码的base64字符串
    /**
     * @example /9j/4QyXRXhpZgAATU0AKgAAAAgABwESAAMAAAABAAEAAAEa......
     *
     * @var string
     */
    public $generateResult;

    // 生成结果码
    /**
     * @example 200
     *
     * @var string
     */
    public $generateCode;

    // 用于异常场景下细化错误信息
    /**
     * @example 码值不正确
     *
     * @var string
     */
    public $generateMessage;

    // 生成失败时的解决方案，用于异常场景下细化错误信息
    /**
     * @example 请调整码值重试
     *
     * @var string
     */
    public $unableGenerateSolution;
    protected $_name = [
        'generateResult'         => 'generate_result',
        'generateCode'           => 'generate_code',
        'generateMessage'        => 'generate_message',
        'unableGenerateSolution' => 'unable_generate_solution',
    ];

    public function validate()
    {
        Model::validateRequired('generateResult', $this->generateResult, true);
        Model::validateRequired('generateCode', $this->generateCode, true);
        Model::validateRequired('generateMessage', $this->generateMessage, true);
        Model::validateRequired('unableGenerateSolution', $this->unableGenerateSolution, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->generateResult) {
            $res['generate_result'] = $this->generateResult;
        }
        if (null !== $this->generateCode) {
            $res['generate_code'] = $this->generateCode;
        }
        if (null !== $this->generateMessage) {
            $res['generate_message'] = $this->generateMessage;
        }
        if (null !== $this->unableGenerateSolution) {
            $res['unable_generate_solution'] = $this->unableGenerateSolution;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BaiQrcodeGenerateRespData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['generate_result'])) {
            $model->generateResult = $map['generate_result'];
        }
        if (isset($map['generate_code'])) {
            $model->generateCode = $map['generate_code'];
        }
        if (isset($map['generate_message'])) {
            $model->generateMessage = $map['generate_message'];
        }
        if (isset($map['unable_generate_solution'])) {
            $model->unableGenerateSolution = $map['unable_generate_solution'];
        }

        return $model;
    }
}
