<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class AgentChatHistoryPreviewVO extends Model
{
    // 对话历史列表
    /**
     * @example
     *
     * @var SingleAgentChatHistoryPreview[]
     */
    public $sessionList;
    protected $_name = [
        'sessionList' => 'session_list',
    ];

    public function validate()
    {
        Model::validateRequired('sessionList', $this->sessionList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sessionList) {
            $res['session_list'] = [];
            if (null !== $this->sessionList && \is_array($this->sessionList)) {
                $n = 0;
                foreach ($this->sessionList as $item) {
                    $res['session_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AgentChatHistoryPreviewVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['session_list'])) {
            if (!empty($map['session_list'])) {
                $model->sessionList = [];
                $n                  = 0;
                foreach ($map['session_list'] as $item) {
                    $model->sessionList[$n++] = null !== $item ? SingleAgentChatHistoryPreview::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
