<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class OperateInnerAgreementterminatezfbdirectResponse extends Model
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

    // 支付宝是否直接解约
    // true: 直接解约
    // false: 不直接解约
    /**
     * @var bool
     */
    public $zfbDirectTerminate;

    // 判断是否ato处理解约
    // true:是
    // false:否
    /**
     * @var bool
     */
    public $atoHandle;

    // 解约弹窗文案
    /**
     * @var string
     */
    public $toastText;

    // 不直接解约场景的跳转地址
    // 1、ato无法解约跳转地址
    // 2、客服小程序解约跳转地址
    /**
     * @var string
     */
    public $jumpUrl;

    // 解约跳转地址右按钮文案
    /**
     * @var string
     */
    public $jumpUrlText;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'zfbDirectTerminate' => 'zfb_direct_terminate',
        'atoHandle'          => 'ato_handle',
        'toastText'          => 'toast_text',
        'jumpUrl'            => 'jump_url',
        'jumpUrlText'        => 'jump_url_text',
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
        if (null !== $this->zfbDirectTerminate) {
            $res['zfb_direct_terminate'] = $this->zfbDirectTerminate;
        }
        if (null !== $this->atoHandle) {
            $res['ato_handle'] = $this->atoHandle;
        }
        if (null !== $this->toastText) {
            $res['toast_text'] = $this->toastText;
        }
        if (null !== $this->jumpUrl) {
            $res['jump_url'] = $this->jumpUrl;
        }
        if (null !== $this->jumpUrlText) {
            $res['jump_url_text'] = $this->jumpUrlText;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateInnerAgreementterminatezfbdirectResponse
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
        if (isset($map['zfb_direct_terminate'])) {
            $model->zfbDirectTerminate = $map['zfb_direct_terminate'];
        }
        if (isset($map['ato_handle'])) {
            $model->atoHandle = $map['ato_handle'];
        }
        if (isset($map['toast_text'])) {
            $model->toastText = $map['toast_text'];
        }
        if (isset($map['jump_url'])) {
            $model->jumpUrl = $map['jump_url'];
        }
        if (isset($map['jump_url_text'])) {
            $model->jumpUrlText = $map['jump_url_text'];
        }

        return $model;
    }
}
