<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class DefinInnerChannelNotifyResult extends Model
{
    // 请求编号
    /**
     * @example aaaa
     *
     * @var string
     */
    public $requestId;

    // 业务响应Json
    /**
     * @example {"a":"b"}
     *
     * @var string
     */
    public $bizResponse;
    protected $_name = [
        'requestId'   => 'request_id',
        'bizResponse' => 'biz_response',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('bizResponse', $this->bizResponse, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->bizResponse) {
            $res['biz_response'] = $this->bizResponse;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DefinInnerChannelNotifyResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['biz_response'])) {
            $model->bizResponse = $map['biz_response'];
        }

        return $model;
    }
}
