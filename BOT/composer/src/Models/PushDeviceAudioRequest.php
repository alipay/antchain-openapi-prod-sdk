<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class PushDeviceAudioRequest extends Model
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

    // 设备序列化
    /**
     * @var string
     */
    public $deviceSn;

    // 设备厂商
    /**
     * @var string
     */
    public $deviceCorp;

    // 推送消息主题
    /**
     * @var string
     */
    public $topicIdentifer;

    // 推送消息类型
    /**
     * @var string
     */
    public $mesageType;

    // 消息内容
    /**
     * @var string
     */
    public $messageContent;

    // 业务场景-项目
    /**
     * @var string
     */
    public $bizScene;

    // 设备唯一ID
    /**
     * @var string
     */
    public $deviceDid;

    // kyt硬件唯一ID
    /**
     * @var string
     */
    public $tuid;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceSn'          => 'device_sn',
        'deviceCorp'        => 'device_corp',
        'topicIdentifer'    => 'topic_identifer',
        'mesageType'        => 'mesage_type',
        'messageContent'    => 'message_content',
        'bizScene'          => 'biz_scene',
        'deviceDid'         => 'device_did',
        'tuid'              => 'tuid',
    ];

    public function validate()
    {
        Model::validateRequired('topicIdentifer', $this->topicIdentifer, true);
        Model::validateRequired('mesageType', $this->mesageType, true);
        Model::validateRequired('messageContent', $this->messageContent, true);
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
        if (null !== $this->deviceSn) {
            $res['device_sn'] = $this->deviceSn;
        }
        if (null !== $this->deviceCorp) {
            $res['device_corp'] = $this->deviceCorp;
        }
        if (null !== $this->topicIdentifer) {
            $res['topic_identifer'] = $this->topicIdentifer;
        }
        if (null !== $this->mesageType) {
            $res['mesage_type'] = $this->mesageType;
        }
        if (null !== $this->messageContent) {
            $res['message_content'] = $this->messageContent;
        }
        if (null !== $this->bizScene) {
            $res['biz_scene'] = $this->bizScene;
        }
        if (null !== $this->deviceDid) {
            $res['device_did'] = $this->deviceDid;
        }
        if (null !== $this->tuid) {
            $res['tuid'] = $this->tuid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushDeviceAudioRequest
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
        if (isset($map['device_sn'])) {
            $model->deviceSn = $map['device_sn'];
        }
        if (isset($map['device_corp'])) {
            $model->deviceCorp = $map['device_corp'];
        }
        if (isset($map['topic_identifer'])) {
            $model->topicIdentifer = $map['topic_identifer'];
        }
        if (isset($map['mesage_type'])) {
            $model->mesageType = $map['mesage_type'];
        }
        if (isset($map['message_content'])) {
            $model->messageContent = $map['message_content'];
        }
        if (isset($map['biz_scene'])) {
            $model->bizScene = $map['biz_scene'];
        }
        if (isset($map['device_did'])) {
            $model->deviceDid = $map['device_did'];
        }
        if (isset($map['tuid'])) {
            $model->tuid = $map['tuid'];
        }

        return $model;
    }
}
