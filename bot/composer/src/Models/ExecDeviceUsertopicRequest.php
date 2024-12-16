<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ExecDeviceUsertopicRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 设备did
    /**
     * @var string
     */
    public $deviceDid;

    // 使用Hmac-SHA256 哈希算法对对deviceDid进行加签， key 为deviceSecret
    // Hmac-SHA256(deviceDid,deviceSecret)
    /**
     * @var string
     */
    public $signature;

    // 自定义topic名称
    /**
     * @var string
     */
    public $topicIdentifer;

    // FORWARD
    /**
     * @var string
     */
    public $userTopicCmdType;

    // 指令内容
    /**
     * @var string
     */
    public $cmdContent;

    // 业务场景
    /**
     * @var string
     */
    public $bizScene;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceDid'         => 'device_did',
        'signature'         => 'signature',
        'topicIdentifer'    => 'topic_identifer',
        'userTopicCmdType'  => 'user_topic_cmd_type',
        'cmdContent'        => 'cmd_content',
        'bizScene'          => 'biz_scene',
    ];

    public function validate()
    {
        Model::validateRequired('deviceDid', $this->deviceDid, true);
        Model::validateRequired('signature', $this->signature, true);
        Model::validateRequired('topicIdentifer', $this->topicIdentifer, true);
        Model::validateRequired('userTopicCmdType', $this->userTopicCmdType, true);
        Model::validateRequired('cmdContent', $this->cmdContent, true);
        Model::validateRequired('bizScene', $this->bizScene, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->deviceDid) {
            $res['device_did'] = $this->deviceDid;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }
        if (null !== $this->topicIdentifer) {
            $res['topic_identifer'] = $this->topicIdentifer;
        }
        if (null !== $this->userTopicCmdType) {
            $res['user_topic_cmd_type'] = $this->userTopicCmdType;
        }
        if (null !== $this->cmdContent) {
            $res['cmd_content'] = $this->cmdContent;
        }
        if (null !== $this->bizScene) {
            $res['biz_scene'] = $this->bizScene;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecDeviceUsertopicRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['device_did'])) {
            $model->deviceDid = $map['device_did'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }
        if (isset($map['topic_identifer'])) {
            $model->topicIdentifer = $map['topic_identifer'];
        }
        if (isset($map['user_topic_cmd_type'])) {
            $model->userTopicCmdType = $map['user_topic_cmd_type'];
        }
        if (isset($map['cmd_content'])) {
            $model->cmdContent = $map['cmd_content'];
        }
        if (isset($map['biz_scene'])) {
            $model->bizScene = $map['biz_scene'];
        }

        return $model;
    }
}
