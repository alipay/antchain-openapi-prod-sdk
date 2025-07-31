<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryInnerSaleschannelResponse extends Model
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

    // 渠道code
    /**
     * @var string
     */
    public $channelCode;

    // 渠道名称
    /**
     * @var string
     */
    public $channelName;

    //
    // 渠道链接
    /**
     * @var string
     */
    public $channelLink;

    // 渠道级别
    /**
     * @var int
     */
    public $channelLevel;

    // 子渠道列表，JSONArray
    /**
     * @var string
     */
    public $childChannelList;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'channelCode'      => 'channel_code',
        'channelName'      => 'channel_name',
        'channelLink'      => 'channel_link',
        'channelLevel'     => 'channel_level',
        'childChannelList' => 'child_channel_list',
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
        if (null !== $this->channelCode) {
            $res['channel_code'] = $this->channelCode;
        }
        if (null !== $this->channelName) {
            $res['channel_name'] = $this->channelName;
        }
        if (null !== $this->channelLink) {
            $res['channel_link'] = $this->channelLink;
        }
        if (null !== $this->channelLevel) {
            $res['channel_level'] = $this->channelLevel;
        }
        if (null !== $this->childChannelList) {
            $res['child_channel_list'] = $this->childChannelList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInnerSaleschannelResponse
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
        if (isset($map['channel_code'])) {
            $model->channelCode = $map['channel_code'];
        }
        if (isset($map['channel_name'])) {
            $model->channelName = $map['channel_name'];
        }
        if (isset($map['channel_link'])) {
            $model->channelLink = $map['channel_link'];
        }
        if (isset($map['channel_level'])) {
            $model->channelLevel = $map['channel_level'];
        }
        if (isset($map['child_channel_list'])) {
            $model->childChannelList = $map['child_channel_list'];
        }

        return $model;
    }
}
