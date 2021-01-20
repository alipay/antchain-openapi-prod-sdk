<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class DescribeRmsTracetreeRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'traceId' => 'trace_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DescribeRmsTracetreeRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['trace_id'])){
            $model->traceId = $map['trace_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // trace_id
    /**
     * @var string
     */
    public $traceId;

}
