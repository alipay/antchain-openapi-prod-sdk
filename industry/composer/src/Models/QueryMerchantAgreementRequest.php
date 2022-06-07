<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INDUSTRY\Models;

use AlibabaCloud\Tea\Model;

class QueryMerchantAgreementRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 签约时的请求单据号
    /**
     * @var string
     */
    public $requestId;

    // 业务来源场景码，由中台分配给业务方
    /**
     * @var string
     */
    public $source;

    // 渠道场景码, 由中台分配给业务方
    /**
     * @var string
     */
    public $channel;
    protected $_name = [
        'authToken' => 'auth_token',
        'requestId' => 'request_id',
        'source'    => 'source',
        'channel'   => 'channel',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('channel', $this->channel, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMerchantAgreementRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }

        return $model;
    }
}
