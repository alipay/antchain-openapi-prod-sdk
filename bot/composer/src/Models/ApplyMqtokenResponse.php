<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ApplyMqtokenResponse extends Model
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

    // 服务端返回的Token值，用于阿里云 MQTT连接
    /**
     * @var string
     */
    public $token;

    // 接入阿里云LMQ的所需的accessKey
    /**
     * @var string
     */
    public $accessKey;

    // mqtt的instanceId
    /**
     * @var string
     */
    public $instanceId;

    // mqtt的topic
    /**
     * @var string
     */
    public $subTopic;

    // mqtt的topic
    /**
     * @var string
     */
    public $pubTopic;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'token'      => 'token',
        'accessKey'  => 'access_key',
        'instanceId' => 'instance_id',
        'subTopic'   => 'sub_topic',
        'pubTopic'   => 'pub_topic',
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
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        if (null !== $this->accessKey) {
            $res['access_key'] = $this->accessKey;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->subTopic) {
            $res['sub_topic'] = $this->subTopic;
        }
        if (null !== $this->pubTopic) {
            $res['pub_topic'] = $this->pubTopic;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyMqtokenResponse
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
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }
        if (isset($map['access_key'])) {
            $model->accessKey = $map['access_key'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['sub_topic'])) {
            $model->subTopic = $map['sub_topic'];
        }
        if (isset($map['pub_topic'])) {
            $model->pubTopic = $map['pub_topic'];
        }

        return $model;
    }
}
