<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class SendUmktCardsmsBatchResponse extends Model
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

    // 卡片短信回执id
    /**
     * @var string
     */
    public $bizCardId;

    // 支持的手机号
    /**
     * @var string
     */
    public $mediaMobiles;

    // 不支持的手机号
    /**
     * @var string
     */
    public $notMediaMobiles;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'bizCardId'       => 'biz_card_id',
        'mediaMobiles'    => 'media_mobiles',
        'notMediaMobiles' => 'not_media_mobiles',
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
        if (null !== $this->bizCardId) {
            $res['biz_card_id'] = $this->bizCardId;
        }
        if (null !== $this->mediaMobiles) {
            $res['media_mobiles'] = $this->mediaMobiles;
        }
        if (null !== $this->notMediaMobiles) {
            $res['not_media_mobiles'] = $this->notMediaMobiles;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendUmktCardsmsBatchResponse
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
        if (isset($map['biz_card_id'])) {
            $model->bizCardId = $map['biz_card_id'];
        }
        if (isset($map['media_mobiles'])) {
            $model->mediaMobiles = $map['media_mobiles'];
        }
        if (isset($map['not_media_mobiles'])) {
            $model->notMediaMobiles = $map['not_media_mobiles'];
        }

        return $model;
    }
}
