<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GATEWAYX\Models;

use AlibabaCloud\Tea\Model;

class QueryMessageFailedRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 消息事件编码
    /**
     * @var string
     */
    public $msgKey;

    // 消费方id，例如appId，tenantId 只支持单个传入
    /**
     * @var string
     */
    public $consumerId;

    // 消费者类型，例如TENANT, APP
    /**
     * @var string
     */
    public $consumerType;

    // 每页条数，最大支持100条
    /**
     * @var string
     */
    public $pageSize;

    // 第几页
    /**
     * @var string
     */
    public $pageNum;
    protected $_name = [
        'authToken'    => 'auth_token',
        'msgKey'       => 'msg_key',
        'consumerId'   => 'consumer_id',
        'consumerType' => 'consumer_type',
        'pageSize'     => 'page_size',
        'pageNum'      => 'page_num',
    ];

    public function validate()
    {
        Model::validateRequired('msgKey', $this->msgKey, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('pageNum', $this->pageNum, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->msgKey) {
            $res['msg_key'] = $this->msgKey;
        }
        if (null !== $this->consumerId) {
            $res['consumer_id'] = $this->consumerId;
        }
        if (null !== $this->consumerType) {
            $res['consumer_type'] = $this->consumerType;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMessageFailedRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['msg_key'])) {
            $model->msgKey = $map['msg_key'];
        }
        if (isset($map['consumer_id'])) {
            $model->consumerId = $map['consumer_id'];
        }
        if (isset($map['consumer_type'])) {
            $model->consumerType = $map['consumer_type'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }

        return $model;
    }
}
