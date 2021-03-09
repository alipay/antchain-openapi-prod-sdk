<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class IaasErrorInfo extends Model
{
    // error_code
    /**
     * @example error_code
     *
     * @var string
     */
    public $errorCode;

    // error_message
    /**
     * @example error_message
     *
     * @var string
     */
    public $errorMessage;

    // status_code
    /**
     * @example
     *
     * @var int
     */
    public $statusCode;

    // host_id
    /**
     * @example host_id
     *
     * @var string
     */
    public $hostId;

    // requestId
    /**
     * @example requestId
     *
     * @var string
     */
    public $requestId;
    protected $_name = [
        'errorCode'    => 'error_code',
        'errorMessage' => 'error_message',
        'statusCode'   => 'status_code',
        'hostId'       => 'host_id',
        'requestId'    => 'request_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->errorMessage) {
            $res['error_message'] = $this->errorMessage;
        }
        if (null !== $this->statusCode) {
            $res['status_code'] = $this->statusCode;
        }
        if (null !== $this->hostId) {
            $res['host_id'] = $this->hostId;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IaasErrorInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['error_message'])) {
            $model->errorMessage = $map['error_message'];
        }
        if (isset($map['status_code'])) {
            $model->statusCode = $map['status_code'];
        }
        if (isset($map['host_id'])) {
            $model->hostId = $map['host_id'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }

        return $model;
    }
}
