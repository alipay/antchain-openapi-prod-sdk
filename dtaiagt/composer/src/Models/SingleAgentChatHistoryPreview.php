<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class SingleAgentChatHistoryPreview extends Model
{
    // 数据库id
    //
    /**
     * @example
     *
     * @var int
     */
    public $id;

    // 会话id
    //
    /**
     * @example 123
     *
     * @var string
     */
    public $sessionId;

    // 会话开始时间
    //
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $askTime;

    // 前端展示的时间
    //
    /**
     * @example "2024-01-01 10:00:00"
     *
     * @var string
     */
    public $displayTime;

    // 会话在列表中的显示内容
    //
    /**
     * @example "会话标题"
     *
     * @var string
     */
    public $sessionIdentifier;

    // 消息类型（chat/pushMessage）
    //
    /**
     * @example chat
     *
     * @var string
     */
    public $type;

    // 推送的消息内容
    //
    /**
     * @example 推送的消息内容
     *
     * @var string
     */
    public $textResponse;

    // 推送时间
    //
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $timestampDisplay;

    // 返回类型
    //
    /**
     * @example 文本
     *
     * @var string
     */
    public $displayResponseType;

    // 附件文件
    //
    /**
     * @example
     *
     * @var AttachFile[]
     */
    public $files;
    protected $_name = [
        'id'                  => 'id',
        'sessionId'           => 'session_id',
        'askTime'             => 'ask_time',
        'displayTime'         => 'display_time',
        'sessionIdentifier'   => 'session_identifier',
        'type'                => 'type',
        'textResponse'        => 'text_response',
        'timestampDisplay'    => 'timestamp_display',
        'displayResponseType' => 'display_response_type',
        'files'               => 'files',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('sessionId', $this->sessionId, true);
        Model::validateRequired('askTime', $this->askTime, true);
        Model::validateRequired('displayTime', $this->displayTime, true);
        Model::validateRequired('sessionIdentifier', $this->sessionIdentifier, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('textResponse', $this->textResponse, true);
        Model::validateRequired('timestampDisplay', $this->timestampDisplay, true);
        Model::validateRequired('displayResponseType', $this->displayResponseType, true);
        Model::validateRequired('files', $this->files, true);
        Model::validatePattern('askTime', $this->askTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('timestampDisplay', $this->timestampDisplay, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->askTime) {
            $res['ask_time'] = $this->askTime;
        }
        if (null !== $this->displayTime) {
            $res['display_time'] = $this->displayTime;
        }
        if (null !== $this->sessionIdentifier) {
            $res['session_identifier'] = $this->sessionIdentifier;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->textResponse) {
            $res['text_response'] = $this->textResponse;
        }
        if (null !== $this->timestampDisplay) {
            $res['timestamp_display'] = $this->timestampDisplay;
        }
        if (null !== $this->displayResponseType) {
            $res['display_response_type'] = $this->displayResponseType;
        }
        if (null !== $this->files) {
            $res['files'] = [];
            if (null !== $this->files && \is_array($this->files)) {
                $n = 0;
                foreach ($this->files as $item) {
                    $res['files'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SingleAgentChatHistoryPreview
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['session_id'])) {
            $model->sessionId = $map['session_id'];
        }
        if (isset($map['ask_time'])) {
            $model->askTime = $map['ask_time'];
        }
        if (isset($map['display_time'])) {
            $model->displayTime = $map['display_time'];
        }
        if (isset($map['session_identifier'])) {
            $model->sessionIdentifier = $map['session_identifier'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['text_response'])) {
            $model->textResponse = $map['text_response'];
        }
        if (isset($map['timestamp_display'])) {
            $model->timestampDisplay = $map['timestamp_display'];
        }
        if (isset($map['display_response_type'])) {
            $model->displayResponseType = $map['display_response_type'];
        }
        if (isset($map['files'])) {
            if (!empty($map['files'])) {
                $model->files = [];
                $n            = 0;
                foreach ($map['files'] as $item) {
                    $model->files[$n++] = null !== $item ? AttachFile::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
