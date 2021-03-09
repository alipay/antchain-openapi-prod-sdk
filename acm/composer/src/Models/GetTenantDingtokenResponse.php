<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class GetTenantDingtokenResponse extends Model
{
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 钉钉企业授权token
    /**
     * @var string
     */
    public $accessToken;

    // 钉钉企业授权应用ID
    /**
     * @var string
     */
    public $agentId;

    // 钉钉企业ID
    /**
     * @var string
     */
    public $corpId;

    // 创建时间，ISO8601格式
    /**
     * @var string
     */
    public $createTime;

    // 前端授权ticket
    /**
     * @var string
     */
    public $jsTicket;

    // 最近一次修改时间，ISO8601格式
    /**
     * @var string
     */
    public $updateTime;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'accessToken' => 'access_token',
        'agentId'     => 'agent_id',
        'corpId'      => 'corp_id',
        'createTime'  => 'create_time',
        'jsTicket'    => 'js_ticket',
        'updateTime'  => 'update_time',
    ];

    public function validate()
    {
        Model::validateRequired('accessToken', $this->accessToken, true);
        Model::validateRequired('agentId', $this->agentId, true);
        Model::validateRequired('corpId', $this->corpId, true);
        Model::validateRequired('jsTicket', $this->jsTicket, true);
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
        if (null !== $this->accessToken) {
            $res['access_token'] = $this->accessToken;
        }
        if (null !== $this->agentId) {
            $res['agent_id'] = $this->agentId;
        }
        if (null !== $this->corpId) {
            $res['corp_id'] = $this->corpId;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->jsTicket) {
            $res['js_ticket'] = $this->jsTicket;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetTenantDingtokenResponse
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
        if (isset($map['access_token'])) {
            $model->accessToken = $map['access_token'];
        }
        if (isset($map['agent_id'])) {
            $model->agentId = $map['agent_id'];
        }
        if (isset($map['corp_id'])) {
            $model->corpId = $map['corp_id'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['js_ticket'])) {
            $model->jsTicket = $map['js_ticket'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }

        return $model;
    }
}
