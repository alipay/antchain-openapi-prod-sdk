<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ZOLOZFACEVERIFY\Models;

use AlibabaCloud\Tea\Model;

class RecognizeFaceauthOcrResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // Map的json格式,预留
    /**
     * @var string
     */
    public $externInfo;

    // Map的json格式：里面存储ocr识别的结果：
    //
    // name:姓名
    //
    // sex：性别
    //
    // num：身份证号码
    //
    // birth：出生年月日
    //
    // address：地址
    //
    // nationality：名族
    //
    // start_date：身份证有效期开始时间
    //
    // end_date：身份证有效期截止时间
    //
    // issue：备案公安局
    /**
     * @var string
     */
    public $ocrInfo;

    // 返回码
    /**
     * @var string
     */
    public $retCode;

    // 业务返回码
    //
    /**
     * @var string
     */
    public $retCodeSub;

    // 业务返回码描述
    //
    /**
     * @var string
     */
    public $retMessageSub;

    // face: 身份证正面 back: 身份证反面 缺省值是：face
    //
    /**
     * @var string
     */
    public $side;

    // zimid
    /**
     * @var string
     */
    public $zimId;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'externInfo'    => 'extern_info',
        'ocrInfo'       => 'ocr_info',
        'retCode'       => 'ret_code',
        'retCodeSub'    => 'ret_code_sub',
        'retMessageSub' => 'ret_message_sub',
        'side'          => 'side',
        'zimId'         => 'zim_id',
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
        if (null !== $this->externInfo) {
            $res['extern_info'] = $this->externInfo;
        }
        if (null !== $this->ocrInfo) {
            $res['ocr_info'] = $this->ocrInfo;
        }
        if (null !== $this->retCode) {
            $res['ret_code'] = $this->retCode;
        }
        if (null !== $this->retCodeSub) {
            $res['ret_code_sub'] = $this->retCodeSub;
        }
        if (null !== $this->retMessageSub) {
            $res['ret_message_sub'] = $this->retMessageSub;
        }
        if (null !== $this->side) {
            $res['side'] = $this->side;
        }
        if (null !== $this->zimId) {
            $res['zim_id'] = $this->zimId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RecognizeFaceauthOcrResponse
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
        if (isset($map['extern_info'])) {
            $model->externInfo = $map['extern_info'];
        }
        if (isset($map['ocr_info'])) {
            $model->ocrInfo = $map['ocr_info'];
        }
        if (isset($map['ret_code'])) {
            $model->retCode = $map['ret_code'];
        }
        if (isset($map['ret_code_sub'])) {
            $model->retCodeSub = $map['ret_code_sub'];
        }
        if (isset($map['ret_message_sub'])) {
            $model->retMessageSub = $map['ret_message_sub'];
        }
        if (isset($map['side'])) {
            $model->side = $map['side'];
        }
        if (isset($map['zim_id'])) {
            $model->zimId = $map['zim_id'];
        }

        return $model;
    }
}
