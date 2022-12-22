<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYTC\Models;

use AlibabaCloud\Tea\Model;

class CreateAntiQrcodeimageResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 生成的二维码图片的oss地址
    /**
     * @var string
     */
    public $qrcodeUrl;

    // 生成结果码，用于异常场景下细化错误信息
    /**
     * @var string
     */
    public $generateCode;

    // 生成结果码含义,用于异常场景下细化错误信息
    /**
     * @var string
     */
    public $generateMessage;

    // 生成失败时的解决方案,用于异常场景下细化错误信息
    /**
     * @var string
     */
    public $unableGenerateSolution;
    protected $_name = [
        'reqMsgId'               => 'req_msg_id',
        'resultCode'             => 'result_code',
        'resultMsg'              => 'result_msg',
        'qrcodeUrl'              => 'qrcode_url',
        'generateCode'           => 'generate_code',
        'generateMessage'        => 'generate_message',
        'unableGenerateSolution' => 'unable_generate_solution',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->qrcodeUrl) {
            $res['qrcode_url'] = $this->qrcodeUrl;
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
     * @return CreateAntiQrcodeimageResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['qrcode_url'])) {
            $model->qrcodeUrl = $map['qrcode_url'];
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
