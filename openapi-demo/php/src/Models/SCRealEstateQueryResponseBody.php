<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class SCRealEstateQueryResponseBody extends Model
{
    // cost
    /**
     * @example 1234
     *
     * @var int
     */
    public $cost;

    // response_status
    /**
     * @example response_status
     *
     * @var string
     */
    public $responseStatus;

    // response_code
    /**
     * @example 200
     *
     * @var string
     */
    public $responseCode;

    // request_id
    /**
     * @example request_id
     *
     * @var string
     */
    public $requestId;

    // payload
    /**
     * @example
     *
     * @var SCRealEstateQueryResponsePayload
     */
    public $payload;
    protected $_name = [
        'cost'           => 'cost',
        'responseStatus' => 'response_status',
        'responseCode'   => 'response_code',
        'requestId'      => 'request_id',
        'payload'        => 'payload',
    ];

    public function validate()
    {
        Model::validateRequired('cost', $this->cost, true);
        Model::validateRequired('responseStatus', $this->responseStatus, true);
        Model::validateRequired('responseCode', $this->responseCode, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('payload', $this->payload, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cost) {
            $res['cost'] = $this->cost;
        }
        if (null !== $this->responseStatus) {
            $res['response_status'] = $this->responseStatus;
        }
        if (null !== $this->responseCode) {
            $res['response_code'] = $this->responseCode;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->payload) {
            $res['payload'] = null !== $this->payload ? $this->payload->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SCRealEstateQueryResponseBody
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cost'])) {
            $model->cost = $map['cost'];
        }
        if (isset($map['response_status'])) {
            $model->responseStatus = $map['response_status'];
        }
        if (isset($map['response_code'])) {
            $model->responseCode = $map['response_code'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['payload'])) {
            $model->payload = SCRealEstateQueryResponsePayload::fromMap($map['payload']);
        }

        return $model;
    }
}
