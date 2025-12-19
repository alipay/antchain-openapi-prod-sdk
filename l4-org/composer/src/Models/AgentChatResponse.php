<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ORG\Models;

use AlibabaCloud\Tea\Model;

class AgentChatResponse extends Model
{
    // 是否结束
    /**
     * @example true, false
     *
     * @var bool
     */
    public $success;

    // 对话data数据
    /**
     * @example
     *
     * @var AgentChatData
     */
    public $data;
    protected $_name = [
        'success' => 'success',
        'data'    => 'data',
    ];

    public function validate()
    {
        Model::validateRequired('success', $this->success, true);
        Model::validateRequired('data', $this->data, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->data) {
            $res['data'] = null !== $this->data ? $this->data->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AgentChatResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['data'])) {
            $model->data = AgentChatData::fromMap($map['data']);
        }

        return $model;
    }
}
