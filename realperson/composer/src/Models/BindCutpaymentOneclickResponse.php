<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class BindCutpaymentOneclickResponse extends Model
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

    // 跳转银行页面地址
    /**
     * @var string
     */
    public $url;

    // 渠道 ID
    /**
     * @var string
     */
    public $channelId;

    // 前端请求银行页面的请求方法
    /**
     * @var string
     */
    public $queryMethod;

    // 前端请求银行页面的请求参数key和vaule
    /**
     * @var string
     */
    public $queryValue;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'url'         => 'url',
        'channelId'   => 'channel_id',
        'queryMethod' => 'query_method',
        'queryValue'  => 'query_value',
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
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->channelId) {
            $res['channel_id'] = $this->channelId;
        }
        if (null !== $this->queryMethod) {
            $res['query_method'] = $this->queryMethod;
        }
        if (null !== $this->queryValue) {
            $res['query_value'] = $this->queryValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindCutpaymentOneclickResponse
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
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['channel_id'])) {
            $model->channelId = $map['channel_id'];
        }
        if (isset($map['query_method'])) {
            $model->queryMethod = $map['query_method'];
        }
        if (isset($map['query_value'])) {
            $model->queryValue = $map['query_value'];
        }

        return $model;
    }
}
