<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTC\Models;

use AlibabaCloud\Tea\Model;

class ApplyResourceFiletokenResponse extends Model
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

    // 临时token信息
    /**
     * @var string
     */
    public $massToken;

    // 上传地址
    /**
     * @var string
     */
    public $url;

    // afts-appid
    /**
     * @var string
     */
    public $appId;

    // afts-bizkey
    /**
     * @var string
     */
    public $bizKey;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'massToken'  => 'mass_token',
        'url'        => 'url',
        'appId'      => 'app_id',
        'bizKey'     => 'biz_key',
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
        if (null !== $this->massToken) {
            $res['mass_token'] = $this->massToken;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->bizKey) {
            $res['biz_key'] = $this->bizKey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyResourceFiletokenResponse
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
        if (isset($map['mass_token'])) {
            $model->massToken = $map['mass_token'];
        }
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['biz_key'])) {
            $model->bizKey = $map['biz_key'];
        }

        return $model;
    }
}
