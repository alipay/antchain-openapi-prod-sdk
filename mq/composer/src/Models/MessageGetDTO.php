<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class MessageGetDTO extends Model
{
    // 消息体
    /**
     * @example SGVsbG8gTVEg5raT7oWf5p6D5ai05ayt55iv
     *
     * @var string
     */
    public $body;

    // 消息体 CRC 校验值
    /**
     * @example 914112295
     *
     * @var int
     */
    public $bodyCrc;

    // 生成该消息的客户端实例
    /**
     * @example 42.120.**.**:64646
     *
     * @var string
     */
    public $bornHost;

    // 生成时间戳
    /**
     * @example 1570761026630
     *
     * @var int
     */
    public $bornTimestamp;

    // 实例 ID
    /**
     * @example MQ_INST_111111111111_DOxxxxxx
     *
     * @var string
     */
    public $instanceId;

    // 消息 ID，即 Message ID
    /**
     * @example 1E0578FE110F18B4AAC235C0C8460BA2
     *
     * @var string
     */
    public $msgId;

    // 消息属性列表
    /**
     * @example
     *
     * @var MessagePropertyDTO[]
     */
    public $propertyList;

    // 消息重试消费的次数
    /**
     * @example 1
     *
     * @var int
     */
    public $reconsumeTimes;

    // 存储该消息的服务器实例
    /**
     * @example 11.220.***.***:10911
     *
     * @var string
     */
    public $storeHost;

    // 消息大小
    /**
     * @example 407
     *
     * @var int
     */
    public $storeSize;

    // 被服务端存储的时间戳
    /**
     * @example 1570761026708
     *
     * @var int
     */
    public $storeTimestamp;

    // 消息的 Topic
    /**
     * @example test-mq_topic
     *
     * @var string
     */
    public $topic;

    // 消息的SchemaID
    /**
     * @example 7071278368768762234
     *
     * @var string
     */
    public $schemaId;
    protected $_name = [
        'body'           => 'body',
        'bodyCrc'        => 'body_crc',
        'bornHost'       => 'born_host',
        'bornTimestamp'  => 'born_timestamp',
        'instanceId'     => 'instance_id',
        'msgId'          => 'msg_id',
        'propertyList'   => 'property_list',
        'reconsumeTimes' => 'reconsume_times',
        'storeHost'      => 'store_host',
        'storeSize'      => 'store_size',
        'storeTimestamp' => 'store_timestamp',
        'topic'          => 'topic',
        'schemaId'       => 'schema_id',
    ];

    public function validate()
    {
        Model::validateRequired('body', $this->body, true);
        Model::validateRequired('bodyCrc', $this->bodyCrc, true);
        Model::validateRequired('bornHost', $this->bornHost, true);
        Model::validateRequired('bornTimestamp', $this->bornTimestamp, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('msgId', $this->msgId, true);
        Model::validateRequired('propertyList', $this->propertyList, true);
        Model::validateRequired('reconsumeTimes', $this->reconsumeTimes, true);
        Model::validateRequired('storeHost', $this->storeHost, true);
        Model::validateRequired('storeSize', $this->storeSize, true);
        Model::validateRequired('storeTimestamp', $this->storeTimestamp, true);
        Model::validateRequired('topic', $this->topic, true);
        Model::validateRequired('schemaId', $this->schemaId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->body) {
            $res['body'] = $this->body;
        }
        if (null !== $this->bodyCrc) {
            $res['body_crc'] = $this->bodyCrc;
        }
        if (null !== $this->bornHost) {
            $res['born_host'] = $this->bornHost;
        }
        if (null !== $this->bornTimestamp) {
            $res['born_timestamp'] = $this->bornTimestamp;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->msgId) {
            $res['msg_id'] = $this->msgId;
        }
        if (null !== $this->propertyList) {
            $res['property_list'] = [];
            if (null !== $this->propertyList && \is_array($this->propertyList)) {
                $n = 0;
                foreach ($this->propertyList as $item) {
                    $res['property_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->reconsumeTimes) {
            $res['reconsume_times'] = $this->reconsumeTimes;
        }
        if (null !== $this->storeHost) {
            $res['store_host'] = $this->storeHost;
        }
        if (null !== $this->storeSize) {
            $res['store_size'] = $this->storeSize;
        }
        if (null !== $this->storeTimestamp) {
            $res['store_timestamp'] = $this->storeTimestamp;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }
        if (null !== $this->schemaId) {
            $res['schema_id'] = $this->schemaId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MessageGetDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['body'])) {
            $model->body = $map['body'];
        }
        if (isset($map['body_crc'])) {
            $model->bodyCrc = $map['body_crc'];
        }
        if (isset($map['born_host'])) {
            $model->bornHost = $map['born_host'];
        }
        if (isset($map['born_timestamp'])) {
            $model->bornTimestamp = $map['born_timestamp'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['msg_id'])) {
            $model->msgId = $map['msg_id'];
        }
        if (isset($map['property_list'])) {
            if (!empty($map['property_list'])) {
                $model->propertyList = [];
                $n                   = 0;
                foreach ($map['property_list'] as $item) {
                    $model->propertyList[$n++] = null !== $item ? MessagePropertyDTO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['reconsume_times'])) {
            $model->reconsumeTimes = $map['reconsume_times'];
        }
        if (isset($map['store_host'])) {
            $model->storeHost = $map['store_host'];
        }
        if (isset($map['store_size'])) {
            $model->storeSize = $map['store_size'];
        }
        if (isset($map['store_timestamp'])) {
            $model->storeTimestamp = $map['store_timestamp'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }
        if (isset($map['schema_id'])) {
            $model->schemaId = $map['schema_id'];
        }

        return $model;
    }
}
