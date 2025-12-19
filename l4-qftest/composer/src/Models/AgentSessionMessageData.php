<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\QFTEST\Models;

use AlibabaCloud\Tea\Model;

class AgentSessionMessageData extends Model
{
    // 会话id
    /**
     * @example 会话id
     *
     * @var string
     */
    public $sessionId;

    // 消息编号
    /**
     * @example 消息编号
     *
     * @var string
     */
    public $messageId;

    // 创建时间
    /**
     * @example 2024-10-31 00:00:00
     *
     * @var string
     */
    public $gmtCreate;

    // 对话请求内容
    /**
     * @example 对话请求内容
     *
     * @var string
     */
    public $request;

    // 对话响应内容
    /**
     * @example 对话响应内容
     *
     * @var string
     */
    public $response;

    // 对话状态
    /**
     * @example 对话状态
     *
     * @var string
     */
    public $status;

    // 会话结果(错误)信息
    /**
     * @example 会话结果(错误)信息
     *
     * @var string
     */
    public $resultMsg;

    // 卡片编辑的业务数据
    /**
     * @example {}
     *
     * @var string
     */
    public $customData;

    // 卡片编辑后的内容
    /**
     * @example {}
     *
     * @var string
     */
    public $customResponse;

    // 是否可编辑
    /**
     * @example true, false
     *
     * @var bool
     */
    public $editable;
    protected $_name = [
        'sessionId'      => 'session_id',
        'messageId'      => 'message_id',
        'gmtCreate'      => 'gmt_create',
        'request'        => 'request',
        'response'       => 'response',
        'status'         => 'status',
        'resultMsg'      => 'result_msg',
        'customData'     => 'custom_data',
        'customResponse' => 'custom_response',
        'editable'       => 'editable',
    ];

    public function validate()
    {
        Model::validateRequired('sessionId', $this->sessionId, true);
        Model::validateRequired('messageId', $this->messageId, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('request', $this->request, true);
        Model::validateRequired('response', $this->response, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('resultMsg', $this->resultMsg, true);
        Model::validateRequired('customData', $this->customData, true);
        Model::validateRequired('customResponse', $this->customResponse, true);
        Model::validateRequired('editable', $this->editable, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->messageId) {
            $res['message_id'] = $this->messageId;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->request) {
            $res['request'] = $this->request;
        }
        if (null !== $this->response) {
            $res['response'] = $this->response;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->customData) {
            $res['custom_data'] = $this->customData;
        }
        if (null !== $this->customResponse) {
            $res['custom_response'] = $this->customResponse;
        }
        if (null !== $this->editable) {
            $res['editable'] = $this->editable;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AgentSessionMessageData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['session_id'])) {
            $model->sessionId = $map['session_id'];
        }
        if (isset($map['message_id'])) {
            $model->messageId = $map['message_id'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['request'])) {
            $model->request = $map['request'];
        }
        if (isset($map['response'])) {
            $model->response = $map['response'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['custom_data'])) {
            $model->customData = $map['custom_data'];
        }
        if (isset($map['custom_response'])) {
            $model->customResponse = $map['custom_response'];
        }
        if (isset($map['editable'])) {
            $model->editable = $map['editable'];
        }

        return $model;
    }
}
