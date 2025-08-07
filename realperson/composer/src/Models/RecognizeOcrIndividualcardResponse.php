<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class RecognizeOcrIndividualcardResponse extends Model
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

    // 识别结果，为JSON串。如果入参resp_enc_type=1则是经过AES加密后的JSON串。
    /**
     * @var OcrInfo
     */
    public $ocrInfo;

    // 防伪结果，为JSON串。如果入参resp_enc_type=1则是经过AES加密后的JSON串。 如果不启用防伪，则不返回该字段。
    /**
     * @var RiskInfo
     */
    public $riskInfo;

    // 扩展信息JSON串。
    /**
     * @var string
     */
    public $extInfo;

    // 加密后的识别结果
    /**
     * @var string
     */
    public $ocrInfoEncrypt;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'ocrInfo'        => 'ocr_info',
        'riskInfo'       => 'risk_info',
        'extInfo'        => 'ext_info',
        'ocrInfoEncrypt' => 'ocr_info_encrypt',
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
        if (null !== $this->ocrInfo) {
            $res['ocr_info'] = null !== $this->ocrInfo ? $this->ocrInfo->toMap() : null;
        }
        if (null !== $this->riskInfo) {
            $res['risk_info'] = null !== $this->riskInfo ? $this->riskInfo->toMap() : null;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->ocrInfoEncrypt) {
            $res['ocr_info_encrypt'] = $this->ocrInfoEncrypt;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RecognizeOcrIndividualcardResponse
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
        if (isset($map['ocr_info'])) {
            $model->ocrInfo = OcrInfo::fromMap($map['ocr_info']);
        }
        if (isset($map['risk_info'])) {
            $model->riskInfo = RiskInfo::fromMap($map['risk_info']);
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }
        if (isset($map['ocr_info_encrypt'])) {
            $model->ocrInfoEncrypt = $map['ocr_info_encrypt'];
        }

        return $model;
    }
}
