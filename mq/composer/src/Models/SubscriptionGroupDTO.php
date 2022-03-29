<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class SubscriptionGroupDTO extends Model
{
    // 消费者所属消费组
    /**
     * @example GID_test
     *
     * @var string
     */
    public $groupId;

    // 部署模型
    /**
     * @example CLUSTERING
     *
     * @var string
     */
    public $messageModel;

    // 订阅字符串
    /**
     * @example *
     *
     * @var string
     */
    public $subString;

    // group协议类型
    /**
     * @example http
     *
     * @var string
     */
    public $groupType;
    protected $_name = [
        'groupId'      => 'group_id',
        'messageModel' => 'message_model',
        'subString'    => 'sub_string',
        'groupType'    => 'group_type',
    ];

    public function validate()
    {
        Model::validateRequired('groupId', $this->groupId, true);
        Model::validateRequired('messageModel', $this->messageModel, true);
        Model::validateRequired('subString', $this->subString, true);
        Model::validateRequired('groupType', $this->groupType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }
        if (null !== $this->messageModel) {
            $res['message_model'] = $this->messageModel;
        }
        if (null !== $this->subString) {
            $res['sub_string'] = $this->subString;
        }
        if (null !== $this->groupType) {
            $res['group_type'] = $this->groupType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubscriptionGroupDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }
        if (isset($map['message_model'])) {
            $model->messageModel = $map['message_model'];
        }
        if (isset($map['sub_string'])) {
            $model->subString = $map['sub_string'];
        }
        if (isset($map['group_type'])) {
            $model->groupType = $map['group_type'];
        }

        return $model;
    }
}
