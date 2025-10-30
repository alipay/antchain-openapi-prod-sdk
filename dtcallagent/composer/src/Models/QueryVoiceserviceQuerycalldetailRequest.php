<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTCALLAGENT\Models;

use AlibabaCloud\Tea\Model;

class QueryVoiceserviceQuerycalldetailRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 分配的租户id
    /**
     * @var string
     */
    public $tenantId;

    // 分配的业务code
    /**
     * @var string
     */
    public $instanceCode;

    // 通话的唯一识别 ID。调用外呼接口发起通话后，返回参数中会携带 CallId。
    /**
     * @var string
     */
    public $callId;

    // 通话发生的时间。格式为 Unix 时间戳，单位：毫秒。
    /**
     * @var string
     */
    public $queryDate;
    protected $_name = [
        'authToken'    => 'auth_token',
        'tenantId'     => 'tenant_id',
        'instanceCode' => 'instance_code',
        'callId'       => 'call_id',
        'queryDate'    => 'query_date',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('instanceCode', $this->instanceCode, true);
        Model::validateRequired('callId', $this->callId, true);
        Model::validateRequired('queryDate', $this->queryDate, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->instanceCode) {
            $res['instance_code'] = $this->instanceCode;
        }
        if (null !== $this->callId) {
            $res['call_id'] = $this->callId;
        }
        if (null !== $this->queryDate) {
            $res['query_date'] = $this->queryDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryVoiceserviceQuerycalldetailRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['instance_code'])) {
            $model->instanceCode = $map['instance_code'];
        }
        if (isset($map['call_id'])) {
            $model->callId = $map['call_id'];
        }
        if (isset($map['query_date'])) {
            $model->queryDate = $map['query_date'];
        }

        return $model;
    }
}
