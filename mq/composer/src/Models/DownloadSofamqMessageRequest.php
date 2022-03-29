<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class DownloadSofamqMessageRequest extends Model
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

    // 需配置的 Group ID 所对应的实例 ID
    /**
     * @var string
     */
    public $instanceId;

    // topic名
    /**
     * @var string
     */
    public $topic;

    // 需查询的消息的 ID，即 Message ID
    /**
     * @var string
     */
    public $msgId;

    // 需要查询的Cell名
    /**
     * @var string
     */
    public $cell;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instanceId'        => 'instance_id',
        'topic'             => 'topic',
        'msgId'             => 'msg_id',
        'cell'              => 'cell',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('topic', $this->topic, true);
        Model::validateRequired('msgId', $this->msgId, true);
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }
        if (null !== $this->msgId) {
            $res['msg_id'] = $this->msgId;
        }
        if (null !== $this->cell) {
            $res['cell'] = $this->cell;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DownloadSofamqMessageRequest
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }
        if (isset($map['msg_id'])) {
            $model->msgId = $map['msg_id'];
        }
        if (isset($map['cell'])) {
            $model->cell = $map['cell'];
        }

        return $model;
    }
}
