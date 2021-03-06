<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ReleaseBlockchainOrderLogicalResponse extends Model
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

    // bid
    /**
     * @var string
     */
    public $bid;

    // country
    /**
     * @var string
     */
    public $country;

    // data
    /**
     * @var bool
     */
    public $data;

    // gmt_wakeup
    /**
     * @var string
     */
    public $gmtWakeup;

    // hid
    /**
     * @var int
     */
    public $hid;

    // interrupt
    /**
     * @var bool
     */
    public $interrupt;

    // invoker
    /**
     * @var string
     */
    public $invoker;

    // level
    /**
     * @var int
     */
    public $level;

    // message
    /**
     * @var string
     */
    public $message;

    // pk
    /**
     * @var string
     */
    public $pk;

    // prompt
    /**
     * @var string
     */
    public $prompt;

    // reques_id
    /**
     * @var string
     */
    public $requesId;

    // 阿里云请求返回结果
    /**
     * @var ALiYunDeleteResource
     */
    public $result;

    // task_extra_data
    /**
     * @var string
     */
    public $taskExtraData;

    // task_identifier
    /**
     * @var string
     */
    public $taskIdentifier;

    // url
    /**
     * @var string
     */
    public $url;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'bid'            => 'bid',
        'country'        => 'country',
        'data'           => 'data',
        'gmtWakeup'      => 'gmt_wakeup',
        'hid'            => 'hid',
        'interrupt'      => 'interrupt',
        'invoker'        => 'invoker',
        'level'          => 'level',
        'message'        => 'message',
        'pk'             => 'pk',
        'prompt'         => 'prompt',
        'requesId'       => 'reques_id',
        'result'         => 'result',
        'taskExtraData'  => 'task_extra_data',
        'taskIdentifier' => 'task_identifier',
        'url'            => 'url',
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
        if (null !== $this->bid) {
            $res['bid'] = $this->bid;
        }
        if (null !== $this->country) {
            $res['country'] = $this->country;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->gmtWakeup) {
            $res['gmt_wakeup'] = $this->gmtWakeup;
        }
        if (null !== $this->hid) {
            $res['hid'] = $this->hid;
        }
        if (null !== $this->interrupt) {
            $res['interrupt'] = $this->interrupt;
        }
        if (null !== $this->invoker) {
            $res['invoker'] = $this->invoker;
        }
        if (null !== $this->level) {
            $res['level'] = $this->level;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->pk) {
            $res['pk'] = $this->pk;
        }
        if (null !== $this->prompt) {
            $res['prompt'] = $this->prompt;
        }
        if (null !== $this->requesId) {
            $res['reques_id'] = $this->requesId;
        }
        if (null !== $this->result) {
            $res['result'] = null !== $this->result ? $this->result->toMap() : null;
        }
        if (null !== $this->taskExtraData) {
            $res['task_extra_data'] = $this->taskExtraData;
        }
        if (null !== $this->taskIdentifier) {
            $res['task_identifier'] = $this->taskIdentifier;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReleaseBlockchainOrderLogicalResponse
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
        if (isset($map['bid'])) {
            $model->bid = $map['bid'];
        }
        if (isset($map['country'])) {
            $model->country = $map['country'];
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['gmt_wakeup'])) {
            $model->gmtWakeup = $map['gmt_wakeup'];
        }
        if (isset($map['hid'])) {
            $model->hid = $map['hid'];
        }
        if (isset($map['interrupt'])) {
            $model->interrupt = $map['interrupt'];
        }
        if (isset($map['invoker'])) {
            $model->invoker = $map['invoker'];
        }
        if (isset($map['level'])) {
            $model->level = $map['level'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['pk'])) {
            $model->pk = $map['pk'];
        }
        if (isset($map['prompt'])) {
            $model->prompt = $map['prompt'];
        }
        if (isset($map['reques_id'])) {
            $model->requesId = $map['reques_id'];
        }
        if (isset($map['result'])) {
            $model->result = ALiYunDeleteResource::fromMap($map['result']);
        }
        if (isset($map['task_extra_data'])) {
            $model->taskExtraData = $map['task_extra_data'];
        }
        if (isset($map['task_identifier'])) {
            $model->taskIdentifier = $map['task_identifier'];
        }
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }

        return $model;
    }
}
